package Item;

public class testScreen {

    public static void main(String[] args) {
        Screen myScreen = new Screen("Sony", 100, 200);
        myScreen.getRefreshRate();
        myScreen.getResolution();
        myScreen.getResponseTime();
        System.out.println(myScreen);

    }
}
