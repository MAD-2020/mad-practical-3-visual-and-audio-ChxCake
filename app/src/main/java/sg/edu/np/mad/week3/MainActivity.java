package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.widget.VideoView;
import android.net.Uri;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer media =MediaPlayer.create(this,
                R.raw.baby_laughing);
        media.start();;

        VideoView rabbidvideo = findViewById(R.id.rabbidvideo);
        rabbidvideo.setVideoURI(
                Uri.parse("android.resource://"+getPackageName() + "/" + R.raw.rabbid)

        );
        rabbidvideo.start();
    }
}
