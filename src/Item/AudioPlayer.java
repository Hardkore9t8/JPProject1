/**@Author Naldo Ash
 * We require a concrete class that will allow us to capture the details of an audio player. Create a class
 * called AudioPlayer that is a subclass of Product and implements the MultimediaControl interface.
 * The class will have 2 fields
 *  String audioSpecification
 *  ItemType mediaType
 * Create a constructor that will take in 2 parameters – name and audioSpecification.
 * The constructor should call its parents constructor and also setup the media type
 * Implement the methods from the MultimediaControl interface by simply writing the action to the console.
 * E.g. in play System.out.println("Playing"); Normally we would have code that would instruct the media
 * player to play, but we will simply display a message.
 * Create a toString method that will display the superclasses toString method, but also add rows for Audio
 * Spec and Type.
 */
package Item;

public class AudioPlayer extends Product implements MultimediaControl {

    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer(String audioSpecification, String name) {
        super(name);
        this.audioSpecification = audioSpecification;
        mediaType = ItemType.AUDIO;
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
        return super.toString() + "\n" +
                "Audio Specification: " + audioSpecification + "\n" +
                "Media Type: " + mediaType;
    }
}
