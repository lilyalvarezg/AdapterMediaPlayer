/**
 * Created by Lily on 05/11/2015.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public String play(String file, String TypeOfAudio) {
        if(TypeOfAudio=="MP3"){
            return "Playing MP3...Song: "+ file;
        }else if(TypeOfAudio=="MP4"| TypeOfAudio=="VLC"){
            mediaAdapter= new MediaAdapter(TypeOfAudio);
            mediaAdapter.play(file, TypeOfAudio);
        }
        return file;
    }
}
