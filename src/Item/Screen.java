package Item;

public class Screen implements ScreenSpec {

    String resolution;
    int refreshrate;
    int responsetime;

    public Screen() {
    }

    public Screen(String resolution, int refreshrate, int responsetime) {
        this.resolution = resolution;
        this.refreshrate = refreshrate;
        this.responsetime = responsetime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }

    @Override
    public String toString() {
        String output = "Resolution: " + resolution + "\n" +
                "Refresh Rate: " + refreshrate + "\n" +
                "Response Time: " + responsetime;
        return output;
    }
}
