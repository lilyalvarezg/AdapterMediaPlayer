import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by Lily on 05/11/2015.
 */
public class VlcPlayerTest {
        VlcPlayer vlc;
      @Before
        public void setUp(){
          vlc= new VlcPlayer();
      }
    @Test
    public void playVlcTest(){
        assertEquals(vlc.playVlc("That's how you know"), "Playing VLC...Song: That's how you know");
    }
    @Test
    public void playMP4Test(){
        assertNull(vlc.playMp4("Hello"));
    }

}
