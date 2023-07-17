package Facade.HomeTeatherEntities;

import Facade.model.Game;

public class Playstation extends Device implements OutputDevice {
    private static final String DEVICE_NAME = "Playstation";

    public Playstation() {
        super(DEVICE_NAME);
    }

    @Override
    public String getName() {
        return DEVICE_NAME;
    }

    @Override
    public void stop() {
        System.out.println(DEVICE_NAME + " stopped.");
    }

    public void playGame(Game game) {
        System.out.println(DEVICE_NAME + " is running " + game.getName());
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
