package com.animX.animationlib.library.animx_zoom_in;

/**
 * Created by hacker_ratty on 1/30/2016.
 */

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;


public class ZoomInRubberBand extends Animx_BaseViewAnimator {
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

                ObjectAnimator.ofFloat(target, "scaleX", .2f, .5f, .75f, 0.5f, 1.15f, 1),
                ObjectAnimator.ofFloat(target, "scaleY", .2f, .5f, 0.25f, 1.0f, 0.85f, 1),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),

                ObjectAnimator.ofFloat(target, "pivotX", horizontalCenter, horizontalCenter),
                ObjectAnimator.ofFloat(target, "pivotY", verticalCenter, verticalCenter)
        );
    }
}

