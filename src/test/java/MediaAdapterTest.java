import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 05/11/2015.
 */
public class MediaAdapterTest {
    private static MediaAdapter mediaAdapter;
    private static AdvancedMediaPlayer advancedMediaPlayer;

    @BeforeClass
    public static void setUp(){
        advancedMediaPlayer= new Mp4Player();
        mediaAdapter= new MediaAdapter("MP4");
    }
    @Test
    public void playTest(){
        assertEquals(mediaAdapter.play("Y yo","MP4"), advancedMediaPlayer.playMp4("Y yo"));
    }
}
