package com.animX.animationlib.library.animx_special;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class RollIn extends Animx_BaseViewAnimator {
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
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),
                ObjectAnimator.ofFloat(target,"translationX",-distance,0),
                ObjectAnimator.ofFloat(target,"rotation",-120,0)
        );
    }
}
