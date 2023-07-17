package Facade.HomeTeatherEntities;

public class PopcornPopper extends Device {
    private static final String DEVICE_NAME = "Popcorn popper";

    public PopcornPopper() {
        super(DEVICE_NAME);
    }

    public void makePopcorn() {
        if (!isOn) {
            turnOn();
        }
        System.out.println("Popping popcorn...");
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Popcorn ready!");
    }
}
