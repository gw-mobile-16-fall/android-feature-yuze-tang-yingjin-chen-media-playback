package com.example.maest.mediaplayback;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playButton (View v){
        mPlayer = MediaPlayer.create(this, R.raw.pop);
        mPlayer.start();// no need to call prepare(); create() does that for you
    }
    public void stopButton (View v) {

        if(mPlayer!=null && mPlayer.isPlaying()){//If music is playing already
            mPlayer.stop();//Stop playing the music
        }
    }
}
