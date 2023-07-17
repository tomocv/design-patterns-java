package proxy;

public class RetryableUserRepository implements UserRepository {

    private UserRepository userRepository;
    private int retryCount;

    public RetryableUserRepository(UserRepository userRepository, int retryCount) {
        this.userRepository = userRepository;
        this.retryCount = retryCount;
    }

    @Override
    public void updateAllBornAfter(int year) {
        int retryCounter = retryCount;

        while (retryCounter-- > 0) {
            try {
                userRepository.updateAllBornAfter(year);
            } catch (DeadlockException exception) {
                if (retryCounter == 0) {
                    System.out.println("Out of retries - re-throwing DeadlockException");
                    throw exception;
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Retrying deadlock exception, remainig entires = " + retryCounter);
            }
        }
    }
}
