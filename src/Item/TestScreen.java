/**@Author Naldo Ash
 * Create a Driver class for Screen that tests the functionality of the screen class
 */
package Item;

public class TestScreen {

    public static void main(String[] args) {
        Screen myScreen = new Screen("Sony", 100, 200);
        myScreen.getRefreshRate();
        myScreen.getResolution();
        myScreen.getResponseTime();
        System.out.println(myScreen);

    }
}
