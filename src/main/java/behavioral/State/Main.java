package behavioral.State;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.play();   // "Starting the player."
        player.pause();  // "Pausing the player."
        player.play();   // "Resuming the player."
        player.stop();   // "Stopping the player."
        player.pause();  // "Cannot pause. The player is stopped."
    }
}
