package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_RotationOutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_rotation_out_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.rotate_out)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateOut, 1000, 0, true, 100);
        } else if (v.getId() == (R.id.rotate_out_down_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateOutDownLeft, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_out_down_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateOutDownRight, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_out_up_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateOutUpLeft, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_out_up_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateOutUpRight, 1000, 0, false, 100);
        }

    }
}
