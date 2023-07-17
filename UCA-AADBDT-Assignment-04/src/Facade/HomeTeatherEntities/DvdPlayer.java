package Facade.HomeTeatherEntities;

import Facade.model.CD;
import Facade.model.Movie;

public class DvdPlayer extends Device implements OutputDevice {
    private static final String DEVICE_NAME = "DVD player";

    public DvdPlayer() {
        super(DEVICE_NAME);
    }

    public String getName() {
        return DEVICE_NAME;
    }

    public void startMovie(Movie movie) {
        System.out.println(DEVICE_NAME + " playing " + movie.getName());
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void stop() {
        System.out.println(DEVICE_NAME + " stopped.");
    }

    public void playMusic(CD cd) {
        System.out.println(DEVICE_NAME + " playing " + cd.getName());
        try {
            // thread to sleep for 2000 milliseconds
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
