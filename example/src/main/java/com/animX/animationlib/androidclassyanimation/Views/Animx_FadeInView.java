package com.animX.animationlib.androidclassyanimation.Views;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class Animx_FadeInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_fade_in_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.fade_in)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeIn, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_in_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeInDown, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_in_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeInLeft, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_in_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeInRight, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_in_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeInUp, 1000, 0, true, 100);
        }

    }
}
