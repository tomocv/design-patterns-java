package proxy;

public class DefaultUserRepository implements UserRepository {

    @Override
    public void updateAllBornAfter(int year) {
        if (System.currentTimeMillis() % 2 == 0) throw new DeadlockException();
    }
}
