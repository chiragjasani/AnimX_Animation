package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_RotationInView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_rotation_in_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.rotate_in)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateIn, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_in_down_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateInDownLeft, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_in_down_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateInDownRight, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_in_up_left)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateInUpLeft, 1000, 0, false, 100);
        } else if (v.getId() == (R.id.rotate_in_up_right)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RotateInUpRight, 1000, 0, false, 100);
        }

    }
}
