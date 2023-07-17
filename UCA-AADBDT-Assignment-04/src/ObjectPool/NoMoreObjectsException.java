package ObjectPool;

public class NoMoreObjectsException extends Exception {
    public NoMoreObjectsException() {
        super("No more objects to acquire");
    }
}
