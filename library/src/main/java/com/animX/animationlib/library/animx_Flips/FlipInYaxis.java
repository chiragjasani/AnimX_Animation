package com.animX.animationlib.library.animx_Flips;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class FlipInYaxis extends Animx_BaseViewAnimator {
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
                ObjectAnimator.ofFloat(target, "rotationY", 90, -15, 15, 0),
                ObjectAnimator.ofFloat(target, "alpha", startingAlpha, 1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)

        );
    }
}