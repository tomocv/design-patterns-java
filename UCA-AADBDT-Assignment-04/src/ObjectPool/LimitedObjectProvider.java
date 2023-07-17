package ObjectPool;

import java.util.HashSet;
import java.util.Set;

public class LimitedObjectProvider implements ObjectProvider {
    private int objectsCount;
    private Set<Object> availableObjects;
    private Set<Object> givenObjects;

    public LimitedObjectProvider(int objectsCount) {
        this.objectsCount = objectsCount;
        availableObjects = new HashSet<Object>();
        givenObjects = new HashSet<Object>();
    }

    @Override
    synchronized public Object acquire() throws NoMoreObjectsException {
        if (givenObjects.stream().count() >= objectsCount) {
            throw new NoMoreObjectsException();
        }

        var objectToReturn = availableObjects.stream().count() > 0 ? availableObjects.stream().findFirst() : new Object();
        givenObjects.add(objectToReturn);

        return objectToReturn;
    }

    @Override
    synchronized public void release(Object o) {
        if(!givenObjects.contains(o)) {
            throw new IllegalArgumentException("Cannot release object" + o + " since it was not created by this provider");
        }

        givenObjects.remove(o);
        availableObjects.add(o);

    }
}
