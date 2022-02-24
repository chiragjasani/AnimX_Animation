package com.animX.animationlib.library.animx_special;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class RollOut extends Animx_BaseViewAnimator {
    @Override
    public void prepare(View target) {
        int distance = (int) mSlideLength;
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,startingAlpha),
                ObjectAnimator.ofFloat(target,"translationX",0, distance),
                ObjectAnimator.ofFloat(target,"rotation",0,120)
        );
    }
}
