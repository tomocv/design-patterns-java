package Facade.HomeTeatherEntities;

public class TheaterLights extends Device {
    private static final String DEVICE_NAME = "Theater lights";
    private boolean isDimmed = false;

    public TheaterLights() {
        super(DEVICE_NAME);
        turnOn();
    }
    public void dim() {
        if (!isOn) {
            turnOn();
        }
        System.out.println("Dimming lights...");
        isDimmed = true;
    }

    public void setNormal() {
        if (isDimmed) {
            System.out.println("Lights back to normal!");
            isDimmed = false;
        } else {
            System.out.println("Lights already OK!");
        }
    }

}
