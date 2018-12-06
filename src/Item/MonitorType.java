/**@Author Naldo Ash
 * The production facility will also create portable movie players. The main difference between these and
 * the audio players is that they contain screens.
 * Create an enum called MonitorType that will store LCD and LED
 */
package Item;

public enum MonitorType {
    LCD("LCD"),
    LED("LED");

    private final String code;

    /**
     * This constructor for Monitor type takes a string argument.
     *
     * @param code should be one of the above code types
     */
    MonitorType(String code) {
        this.code = code;
    }

    /**
     * This accessor returns the Item code
     */
    public String getCode() {
        return code;
    }
}


