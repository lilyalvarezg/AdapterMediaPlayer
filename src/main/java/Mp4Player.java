/**
 * Created by Lily on 05/11/2015.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public String playVlc(String file) {
        //System.out.println("Playing VLC file");
        return null;
    }

    public String playMp4(String file) {
        String pM= "Playing MP4...Song: "+ file;
        System.out.println(pM);
        return pM;
    }
}
