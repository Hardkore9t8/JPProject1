package Item;

public class testMoviePlayer {

    public static void main(String[] args) {
        MoviePlayer mov = new MoviePlayer("LG");
        System.out.println(mov.toString());
        System.out.println(mov.screen);
        System.out.println(mov.getName());

        mov.next();
        mov.play();
        mov.previous();
        mov.stop();
    }
}
