package com.example.maest.mediaplayback;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;//This is MediaPlayer class inside the feature Media Playback.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Obviously, this activates and displays the UI.
    }
    public void playButton (View v){//Triggers when play button is clicked.
        mPlayer = MediaPlayer.create(this, R.raw.pop);//Create and set the default music in raw resource into mPlayer.
        mPlayer.start();//No need to call prepare(), create() does that for you. Now the music starts playing.
    }
    public void stopButton (View v) {//Triggers when stop button is clicked
        if(mPlayer!=null && mPlayer.isPlaying()){//If music is playing already
            mPlayer.stop();//Stop playing the music
        }
    }
}
