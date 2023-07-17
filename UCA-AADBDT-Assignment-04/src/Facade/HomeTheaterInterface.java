package Facade;

import Facade.model.CD;
import Facade.model.Game;
import Facade.model.Movie;

public interface HomeTheaterInterface {
    void watchMovie(Movie movie) throws InterruptedException;
    void playMusic(CD cd) throws InterruptedException;
    void playVideoGame(Game game) throws InterruptedException;
    void reset() throws InterruptedException;
}
