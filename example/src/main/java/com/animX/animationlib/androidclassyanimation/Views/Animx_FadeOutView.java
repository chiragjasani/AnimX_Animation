package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_FadeOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_fade_out_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.fade_out)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeOut, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_out_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeOutDown, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_out_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeOutLeft, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_out_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeOutRight, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.fade_out_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FadeOutUp, 1000, 0, true, 100);
        }

    }
}
