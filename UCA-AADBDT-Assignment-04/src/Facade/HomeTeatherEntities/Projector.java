package Facade.HomeTeatherEntities;

public class Projector extends Device {
    private static final String DEVICE_NAME = "Projector";

    public Projector() {
        super(DEVICE_NAME);
    }

    public void setInputDevice(OutputDevice device) {
        System.out.println("Projector input set to : " + device.getName());
    }
}
