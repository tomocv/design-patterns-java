package state;

import ui.Player;

public class PlayingState extends State {

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        player.setPlaying(false);
        return "Paused...";
    }

    @Override
    public String onNext() {
        return "Playing " + player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return "Playing " + player.previousTrack();
    }
}
