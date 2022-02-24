package com.animX.animationlib.androidclassyanimation.Views;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class Animx_AttentionView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_attention_view);

    }


    public void animationStart(View v) {

        if (v.getId() == (R.id.bounce)) {
            Animx_StartSmartAnimation.startAnimation(findViewById(R.id.bounce), AnimationType.Bounce, 2000, 0, false);
        } else if (v.getId() == (R.id.flash)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Flash, 2000, 0, false);
        } else if (v.getId() == (R.id.pulse)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Pulse, 2000, 0, false);
        } else if (v.getId() == (R.id.rubber_band)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RubberBand, 2000, 0, false);
        } else if (v.getId() == (R.id.shake)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Shake, 2000, 0, false);
        } else if (v.getId() == (R.id.shake_band)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ShakeBand, 2000, 0, false);
        } else if (v.getId() == (R.id.stand_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.StandUp, 2000, 0, false);
        } else if (v.getId() == (R.id.swing)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Swing, 2000, 0, false);
        } else if (v.getId() == (R.id.tada)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Tada, 2000, 0, false);
        } else if (v.getId() == (R.id.wave)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Wave, 2000, 0, false);
        } else if (v.getId() == (R.id.wobble)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Wobble, 2000, 0, false);
        }
    }
}
