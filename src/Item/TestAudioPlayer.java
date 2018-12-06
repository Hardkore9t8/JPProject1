/**@Author Naldo Ash
 * Create a driver class for AudioPlayer that will test to see whether we can instantiate occurrences of it, use
 * the media controls and print out their details to the console.
 */
package Item;

public class TestAudioPlayer {

    public static void main(String[] args) {
        AudioPlayer player1 = new AudioPlayer("test", "Sony");
        System.out.println(player1.toString());

        player1.next();
        player1.play();
        player1.previous();
        player1.stop();
    }
}
