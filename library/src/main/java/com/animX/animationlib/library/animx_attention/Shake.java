package com.animX.animationlib.library.animx_attention;


import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class Shake extends Animx_BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "translationX", 0, 25, -25, 25, -25,15, -15, 6, -6, 0),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}