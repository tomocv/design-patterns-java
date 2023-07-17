package Facade.HomeTeatherEntities;

public class Screen extends Device {
    private static final String DEVICE_NAME = "Screen";

    public Screen() {
        super(DEVICE_NAME);
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            switchState();
            down();
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            switchState();
            up();
        }
    }

    public void down() {
        System.out.println("Lowering screen....");
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Screen now lowered");
    }

    public void up() {
        System.out.println("Rolling screen up....");
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Screen now rolled up.");
    }
}
