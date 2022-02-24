package com.animX.animationlib.library.animx_fading_out;

import android.view.View;


import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class FadingOutRight extends Animx_BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final float horizontalCenter = mHorizontalCenter;
        final float verticalCenter = mVerticalCenter;

        int distance = (int) mSlideLength;
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 0),
                ObjectAnimator.ofFloat(target,"translationX",0,distance),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}