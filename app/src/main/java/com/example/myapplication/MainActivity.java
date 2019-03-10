package com.example.myapplication;

import android.drm.DrmStore;
import android.media.AudioManager;
import android.media.SoundPool;
import android.print.PrinterId;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     // Helpfull constants
    private  final int NR_OF_SIMULTANOUS_SOUNDS=7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool mSoundPoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPoll = new SoundPool(NR_OF_SIMULTANOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        mASoundId = mSoundPoll.load(getApplicationContext(), R.raw.note6_a,1);
        mBSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note7_b,1);
        mCSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPoll.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPoll.load(getApplicationContext(), R.raw.note5_g, 1);
    }
    public void playC(View v){
      mSoundPoll.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        mSoundPoll.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View v){
        mSoundPoll.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View v){
      mSoundPoll.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View v){
       mSoundPoll.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View v){
       mSoundPoll.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View v){
       mSoundPoll.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
