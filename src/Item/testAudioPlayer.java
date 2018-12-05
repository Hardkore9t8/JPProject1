package Item;

public class testAudioPlayer {

    public static void main(String[] args) {
        AudioPlayer player1 = new AudioPlayer("test", "Sony");
        System.out.println(player1.toString());
/**
 *
 */

        player1.next();
        player1.play();
        player1.previous();
        player1.stop();
    }
}
