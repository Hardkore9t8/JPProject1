/**
 * Naldo Ash Create an enum called ItemType that will store the following information.
 */
package Item;

public enum ItemType {

    AUDIO_MOBILE("AM"),
    AUDIO("AU"),
    VISUAL("VI"),
    VISUAL_MOBILE("VM");

    public final String code;

    /**
     * This constructor for Item type takes a string argument.
     *
     * @param code should be one of the above code types
     */
    ItemType(String code) {
        this.code = code;


    }
}
