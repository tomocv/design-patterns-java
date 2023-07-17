package ObjectPool;

public interface ObjectProvider {
    Object acquire() throws NoMoreObjectsException;
    void release(Object o);
}
