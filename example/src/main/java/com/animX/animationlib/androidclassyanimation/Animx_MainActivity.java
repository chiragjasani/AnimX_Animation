package com.animX.animationlib.androidclassyanimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.Views.Animx_AttentionView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_BounceInView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_FadeInView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_FadeOutView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_FlipView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_RotationInView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_RotationOutView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_SlidersView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_SpecialView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_ZoomInView;
import com.animX.animationlib.androidclassyanimation.Views.Animx_ZoomOutView;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class Animx_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_main);

        /*
        this is for making a front page nimation
         */

        new Animx_StartSmartAnimation().startAnimation(findViewById(R.id.attention), AnimationType.FlipInY, 2000, 0, true);
        new Animx_StartSmartAnimation().startAnimation(findViewById(R.id.bounce_in), AnimationType.FlipInY, 2000, 200, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.fade_in), AnimationType.FlipInY, 2000, 400, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.fade_out), AnimationType.FlipInY, 2000, 600, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.flips), AnimationType.FlipInY, 2000, 800, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.rotation_in), AnimationType.FlipInY, 2000, 1000, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.rotation_out), AnimationType.FlipInY, 2000, 1200, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.sliders), AnimationType.FlipInY, 2000, 1400, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.special), AnimationType.FlipInY, 2000, 1600, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.zoom_in), AnimationType.FlipInY, 2000, 1800, true);
        Animx_StartSmartAnimation.startAnimation(findViewById(R.id.zoom_out), AnimationType.FlipInY, 2000, 2000, true);

    }

    public void showAnimation(View v) {

        Intent i = null;

        if (v.getId() == (R.id.attention)) {
            i = new Intent(Animx_MainActivity.this, Animx_AttentionView.class);
        } else if (v.getId() == (R.id.bounce_in)) {
            i = new Intent(Animx_MainActivity.this, Animx_BounceInView.class);
        } else if (v.getId() == (R.id.fade_in)) {
            i = new Intent(Animx_MainActivity.this, Animx_FadeInView.class);
        } else if (v.getId() == (R.id.fade_out)) {
            i = new Intent(Animx_MainActivity.this, Animx_FadeOutView.class);
        } else if (v.getId() == (R.id.flips)) {
            i = new Intent(Animx_MainActivity.this, Animx_FlipView.class);
        } else if (v.getId() == (R.id.rotation_in)) {
            i = new Intent(Animx_MainActivity.this, Animx_RotationInView.class);
        } else if (v.getId() == (R.id.rotation_out)) {
            i = new Intent(Animx_MainActivity.this, Animx_RotationOutView.class);
        } else if (v.getId() == (R.id.sliders)) {
            i = new Intent(Animx_MainActivity.this, Animx_SlidersView.class);
        } else if (v.getId() == (R.id.special)) {
            i = new Intent(Animx_MainActivity.this, Animx_SpecialView.class);
        } else if (v.getId() == (R.id.zoom_in)) {
            i = new Intent(Animx_MainActivity.this, Animx_ZoomInView.class);
        } else if (v.getId() == (R.id.zoom_out)) {
            i = new Intent(Animx_MainActivity.this, Animx_ZoomOutView.class);
        }

        startActivity(i);
    }


}
