package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_SlidersView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_sliders_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.slide_in_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideInDown, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_in_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideInLeft, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_in_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideInRight, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_in_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideInUp, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_out_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideOutDown, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_out_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideOutRight, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_out_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideOutUp, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.slide_out_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.SlideOutLeft, 2000, 0, false, 100);
        }
    }
}
