/**
 * Created by Lily on 05/11/2015.
 */
public class AdapterPatternDemo {

    public static void main(String[] args){
        AudioPlayer audioPlayer= new AudioPlayer();

        audioPlayer.play("Five More Hours", "MP3");
        audioPlayer.play("Nota de Amor", "MP3");
        System.out.println("");

        audioPlayer.play("Querido Tommy", "MP4");
        audioPlayer.play("Stay With Me", "MP4");
        System.out.println("");

        audioPlayer.play("Don't Kill The Magic", "VLC");
        audioPlayer.play("Blown Away", "VLC");
        System.out.println("");
    }
}
