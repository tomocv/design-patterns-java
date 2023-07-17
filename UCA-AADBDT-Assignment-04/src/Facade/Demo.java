package Facade;

import Facade.model.CD;
import Facade.model.Game;
import Facade.model.Movie;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        HomeTheatreSystem homeTheatreSystem = new HomeTheatreSystem();

        System.out.println("START WATCHING MOVIE:");
        homeTheatreSystem.watchMovie(new Movie("Aviator"));

        System.out.println("\nSTOP WATCHING MOVIE:");
        homeTheatreSystem.reset();

        System.out.println("\nSTART PLAYING GAME:");
        homeTheatreSystem.playVideoGame(new Game("Diablo"));

        System.out.println("\nSTOP PLAYING GAME:");
        homeTheatreSystem.reset();

        System.out.println("\nSTART PLAYING MUSIC:");
        homeTheatreSystem.playMusic(new CD("Linkin Park - Hybrid Theory"));

        System.out.println("\nSTOP PLAYING MUSIC:");
        homeTheatreSystem.reset();

    }
}
