/**
 * Created by Lily on 05/11/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public String playVlc(String file) {
        String pV= "Playing VLC...Song: "+file;
        System.out.println(pV);
        return pV;
    }

    public String playMp4(String file) {
        return null;
    }
}
