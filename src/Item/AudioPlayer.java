
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
