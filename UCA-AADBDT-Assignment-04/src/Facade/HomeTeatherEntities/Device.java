package Facade.HomeTeatherEntities;

public class Device {
    String name;
    boolean isOn;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(name + " now turned on...");
        } else {
            System.out.println(name + " already turned on!");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(name + " now turned off...");
        } else {
            System.out.println(name + " already turned off!");
        }
    }

    public void switchState() {
        isOn = !isOn;
    }
}
