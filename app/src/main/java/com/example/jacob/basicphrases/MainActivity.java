package com.example.jacob.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    SparseIntArray soundMap = createSoundMap();

    public void playSound(View view) {
        Log.i("phrases", view.getResources().getResourceName(view.getId()));

        int soundId = this.soundMap.get(view.getId());

        MediaPlayer player = MediaPlayer.create(this, soundId);
        player.start();
    }

    private SparseIntArray createSoundMap() {
        SparseIntArray soundMap = new SparseIntArray();

        soundMap.put(R.id.doYouSpeakEnglish, R.raw.doyouspeakenglish);
        soundMap.put(R.id.goodEvening, R.raw.goodevening);
        soundMap.put(R.id.hello, R.raw.hello);
        soundMap.put(R.id.howAreYou, R.raw.howareyou);
        soundMap.put(R.id.iLiveIn, R.raw.ilivein);
        soundMap.put(R.id.myNameIs, R.raw.mynameis);
        soundMap.put(R.id.please, R.raw.please);
        soundMap.put(R.id.welcome, R.raw.welcome);

        return soundMap;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
