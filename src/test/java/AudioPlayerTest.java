import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 05/11/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;
    @Before
    public void setUp(){
        audioPlayer= new AudioPlayer();
    }
    @Test
    public void playTest(){
        assertEquals(audioPlayer.play("Rise Up", "MP3"), "Playing MP3...Song: Rise Up");
    }
}
