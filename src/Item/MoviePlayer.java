/**@Author Naldo Ash
 * Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 * Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
 * Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.
 * Create a toString method that calls the product toString, displays the monitor and the screen details.
 */
package Item;

public class MoviePlayer extends Product implements MultimediaControl {

    Screen screen;
    MonitorType monitorType;
/**Constructor that takes one arguments of type String called name. This constructor has static implements **/
    public MoviePlayer(String name) {
        super(name);
        screen = new Screen("4096 x 2160 pixels", 100, 100);
        monitorType = MonitorType.LCD;
    }
/**Constructor that take three agruments of type String, Screen, and MonitorType.  This constructor can be set by the user**/
    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Forward");
    }

    @Override
    public String toString() {
        return "Screen: " + screen + "\n" +
                "Monitor Type: " + monitorType;
    }
}
