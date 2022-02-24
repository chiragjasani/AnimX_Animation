package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_FlipView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_flip_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.flip_in_x_axis)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FlipInX, 1000, 0, false);
        } else if (v.getId() == (R.id.flip_in_y_axis)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FlipInY, 1000, 0, false);
        } else if (v.getId() == (R.id.flip_out_x_axis)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FlipOutX, 1000, 0, true);
        } else if (v.getId() == (R.id.flip_out_y_axis)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.FlipOutY, 1000, 0, true);
        }


    }
}
