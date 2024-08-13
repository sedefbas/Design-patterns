package behavioral.State;

class StoppedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Starting the player.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Cannot pause. The player is stopped.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped.");
    }
}