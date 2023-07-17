package ObjectPool;

public class Demo {

    private static final int NUMBER_OF_OBJECTS = 2; // toggle value 2 or 10

    public static void main(String[] args) throws NoMoreObjectsException {
        // Make 2 objects at most
        LimitedObjectProvider objectProvider = new LimitedObjectProvider(NUMBER_OF_OBJECTS);

        // o1 is created
        Object o1 = objectProvider.acquire();
        System.out.println(o1);

        // o2 is created
        Object o2 = objectProvider.acquire();
        System.out.println(o2);

        // o3 cannot be created - no more objects available
        try {
            Object o3 = objectProvider.acquire();
            System.out.println(o3);
        } catch (NoMoreObjectsException ex) {
            System.out.println(ex.getMessage());
        }

        objectProvider.release(o1);

        Object o4 = objectProvider.acquire();

        System.out.println(o4);
    }
}
