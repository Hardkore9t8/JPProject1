package Item;

public class MoviePlayer extends Product implements MultimediaControl {

    Screen screen;
    MonitorType monitorType;

    public MoviePlayer(String name) {
        super(name);
        screen = new Screen("4096 x 2160 pixels", 100, 100);
        monitorType = MonitorType.LCD;
    }

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
