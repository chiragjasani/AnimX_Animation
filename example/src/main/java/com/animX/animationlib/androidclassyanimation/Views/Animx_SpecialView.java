package com.animX.animationlib.androidclassyanimation.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.animX.animationlib.androidclassyanimation.R;
import com.animX.animationlib.library.AnimationType;
import com.animX.animationlib.library.Animx_StartSmartAnimation;

public class Animx_SpecialView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animx_activity_special_view);
    }

    public void animationStart(View v) {

        if (v.getId() == (R.id.drop_out)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.DropOut, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.landing)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Landing, 2000, 0, true, 100);
        } else if (v.getId() == (R.id.hinge)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.Hinge, 2000, 0, true, 100);
        } else if (v.getId() == (R.id.roll_in)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RollIn, 2000, 0, false, 100);
        } else if (v.getId() == (R.id.roll_out)) {
            Animx_StartSmartAnimation.startAnimation(v, AnimationType.RollOut, 2000, 0, true, 100);
        }
    }
}
