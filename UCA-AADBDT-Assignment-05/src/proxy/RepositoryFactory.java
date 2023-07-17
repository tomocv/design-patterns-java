package proxy;

public class RepositoryFactory {
    public static UserRepository createUserRepository() {
        return new RetryableUserRepository(new DefaultUserRepository(), 10);
    }
}
