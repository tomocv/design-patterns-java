package Facade;

import Facade.HomeTeatherEntities.*;
import Facade.model.CD;
import Facade.model.Game;
import Facade.model.Movie;

public class HomeTheatreSystem implements HomeTheaterInterface{
    private OutputDevice inputDevice;

    private Amplifier amplifier = new Amplifier();
    private DvdPlayer dvdPlayer = new DvdPlayer();
    private PopcornPopper popcornPopper = new PopcornPopper();
    private Projector projector = new Projector();
    private Screen screen = new Screen();
    private TheaterLights theaterLights = new TheaterLights();
    private Playstation playstation = new Playstation();

    public HomeTheatreSystem(){
    }

    public void watchMovie(Movie movie) {
        inputDevice = dvdPlayer;
        popcornPopper.turnOn();
        popcornPopper.makePopcorn();

        theaterLights.dim();
        screen.turnOn();

        projector.turnOn();
        projector.setInputDevice(inputDevice);

        amplifier.turnOn();
        amplifier.setInputDevice(inputDevice);

        dvdPlayer.turnOn();
        dvdPlayer.startMovie(movie);
    }

    public void playMusic(CD cd) {
        inputDevice = dvdPlayer;
        amplifier.turnOn();
        amplifier.setInputDevice(inputDevice);

        dvdPlayer.turnOn();
        dvdPlayer.playMusic(cd);
    }

    public void playVideoGame(Game game) {
        inputDevice = playstation;

        theaterLights.dim();
        screen.turnOn();

        projector.turnOn();
        projector.setInputDevice(inputDevice);
        amplifier.turnOn();
        amplifier.setInputDevice(inputDevice);
        playstation.turnOn();
        playstation.playGame(game);
    }

    public void reset() {
        inputDevice.stop();
        dvdPlayer.turnOff();
        playstation.turnOff();
        amplifier.turnOff();
        projector.turnOff();
        popcornPopper.turnOff();
        screen.turnOff();
        theaterLights.setNormal();
    }
}
