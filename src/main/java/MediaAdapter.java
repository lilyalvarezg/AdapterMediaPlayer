/**
 * Created by Lily on 05/11/2015.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String TypeOfAudio){
        if(TypeOfAudio=="MP4"){
            advancedMediaPlayer= new Mp4Player();
        } else if(TypeOfAudio=="VLC") {
            advancedMediaPlayer = new VlcPlayer();
        }
    }
    public String play(String file, String TypeOfAudio) {
        if(TypeOfAudio=="MP4"){
            return advancedMediaPlayer.playMp4(file);
        }else if(TypeOfAudio=="VLC"){
           return advancedMediaPlayer.playVlc(file);
        }
        return file;
    }
}
