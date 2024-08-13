package behavioral.State;

class MediaPlayer {
    private State state;

    public MediaPlayer() {
        state = new StoppedState(); // Başlangıç durumu
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
