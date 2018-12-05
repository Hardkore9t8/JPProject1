package Item;

public class testMultimediaControl {

    public static void main(String[] args) {
        AudioPlayer player1 = new AudioPlayer("CD", "Sony");
        MoviePlayer player2 = new MoviePlayer("Sony");
        System.out.println("Audio Player is");
        player1.play();
        System.out.println("Movie Player is");
        player2.play();
    }

}
