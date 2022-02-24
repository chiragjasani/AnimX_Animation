package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_ZoomInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_zoom_in_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.zoom_in)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomIn, 2000, 0, false);
        } else if (v.getId() == (R.id.zoom_in_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomInDown, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.zoom_in_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomInLeft, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.zoom_in_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomInRight, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.zoom_in_rubber_band)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomInRubberBand, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.zoom_in_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomInUp, 2000, 0, false, 100);
        }
    }
}
