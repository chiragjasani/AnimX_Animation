package com.animX.animationlib.androidclassyanimation.Views;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class Animx_BounceInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_bounce_in_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.bounce_in)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.BounceIn, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.bounce_in_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.BounceInDown, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.bounce_in_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.BounceInLeft, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.bounce_in_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.BounceInRight, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.bounce_in_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.BounceInUp, 1000, 0, true, 100);
        }

    }
}
