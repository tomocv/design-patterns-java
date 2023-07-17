package proxy;

public class Demo {
    private static void someFunction(UserRepository repo) {
        repo.updateAllBornAfter(2000);
    }

    public static void main(String[] args) {
//        UserRepository repo = new DefaultUserRepository();
//        someFunction(repo);

        UserRepository repository = RepositoryFactory.createUserRepository();
        for (int i = 1; i<= 10; i++) {
            try {
                System.out.println(i + ": calling user repository function...");
                someFunction(repository);
                System.out.println(i+ ": GOOD! No deadlock exception");
            } catch (DeadlockException e) {
                System.out.println(i + ": BAD: deadlock exception was thrown: " + e);
            }
            System.out.println();
        }
    }
}
