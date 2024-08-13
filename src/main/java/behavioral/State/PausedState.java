package behavioral.State;

class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming the player.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopping the player.");
        player.setState(new StoppedState());
    }
}