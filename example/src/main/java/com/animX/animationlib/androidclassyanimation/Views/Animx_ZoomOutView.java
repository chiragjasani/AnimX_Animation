package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_ZoomOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_zoom_out_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.zoom_out)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomOut, 2000, 0, true);
        } else if (v.getId() == (R.id.zoom_out_down)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutDown, 2000, 0, true, 100);
        } else if (v.getId() == (R.id.zoom_out_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutLeft, 2000, 0, true, 100);
        } else if (v.getId() == (R.id.zoom_out_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutRight, 2000, 0, true, 100);
        } else if (v.getId() == (R.id.zoom_out_up)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.ZoomOutUp, 2000, 0, true, 100);
        }
    }

}
