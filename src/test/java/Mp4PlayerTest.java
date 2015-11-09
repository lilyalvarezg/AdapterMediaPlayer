import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by Lily on 05/11/2015.
 */
public class Mp4PlayerTest {
    Mp4Player mp4;
    @Before
    public void setUp(){
        mp4= new Mp4Player();
    }
    @Test
    public void playMp4Test(){
        assertEquals(mp4.playMp4("Inolvidable"), "Playing MP4...Song: Inolvidable");
    }
    @Test
    public void playVLCTest(){
        assertNull(mp4.playVlc("Good-Bye"));
    }
}
