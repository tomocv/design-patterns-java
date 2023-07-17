package Facade.HomeTeatherEntities;

public class Amplifier extends Device {
    private static final String DEVICE_NAME = "Amplifier";
    public Amplifier() {
        super(DEVICE_NAME);
    }
    public void setInputDevice(OutputDevice device) {
        System.out.println("Amplifier set to : " + device.getName());
    }
}
