package com.tekman.drump;

import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class PlayActivity extends AppCompatActivity {

    int colorBackgroundNum = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_play);

        final MediaPlayer music1 = MediaPlayer.create(this, R.raw.music_01_64k);
        final MediaPlayer rythm1 = MediaPlayer.create(this, R.raw.rythm_01_64k);

        Button buttonMusic = findViewById(R.id.button_music);
        buttonMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music1.isPlaying() == false)
                {
                    music1.start();
                } else
                {
                    music1.pause();
                }
            }
        });
        Button buttonRythm = findViewById(R.id.button_rythm);
        buttonRythm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rythm1.isPlaying() == false)
                {
                    rythm1.start();
                } else
                {
                    rythm1.pause();
                }
            }
        });
    }





    public void rightCrash(View view)
    {
        final MediaPlayer soundRightCrash = MediaPlayer.create(this, R.raw.right_crash_01_64k);
        soundRightCrash.start();
    }

    public void bass(View view)
    {
        final MediaPlayer soundBass = MediaPlayer.create(this, R.raw.bass_01_64k);
        soundBass.start();
    }

    public void snare(View view)
    {
        final MediaPlayer soundSnare = MediaPlayer.create(this, R.raw.snare_01_64k);
        soundSnare.start();
    }

    public void tambourine(View view)
    {
        final MediaPlayer soundTambourine = MediaPlayer.create(this, R.raw.tambourine_01_64k);
        soundTambourine.start();
    }

    public void leftCrash(View view)
    {
        final MediaPlayer soundLeftCrash = MediaPlayer.create(this, R.raw.left_crash_01_64k);
        soundLeftCrash.start();
    }

    public void closedHat(View view)
    {
        final MediaPlayer soundClosedHat = MediaPlayer.create(this, R.raw.closed_hat_01_64k);
        soundClosedHat.start();
    }

    public void lowTom(View view)
    {
        final MediaPlayer soundLowTom = MediaPlayer.create(this, R.raw.low_tom_01_trim_64k);
        soundLowTom.start();
    }



    public void changeColor(View view)
    {
        final MediaPlayer soundFuzzyBeep = MediaPlayer.create(this, R.raw.fuzzy_beep);
        soundFuzzyBeep.start();
        ConstraintLayout constraintLayout = findViewById(R.id.layout_constraint);
        switch (colorBackgroundNum)
        {
            case 1:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundYellow));
                colorBackgroundNum++;
                break;
            case 2:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundGreen));
                colorBackgroundNum++;
                break;
            case 3:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundPurple));
                colorBackgroundNum++;
                break;
            case 4:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundPink));
                colorBackgroundNum++;
                break;
            case 5:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundRed));
                colorBackgroundNum++;
                break;
            case 6:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundCyan));
                colorBackgroundNum++;
                break;
            case 7:
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.BackgroundGray));
                colorBackgroundNum = 1;
                break;
        }
    }


    public void playMusic(View view)
    {
    }
}
