package com.animX.animationlib.library.animx_zoom_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;

public class ZoomIn extends Animx_BaseViewAnimator {
    @Override
    public void prepare(View target) {
        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"scaleX",0.45f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.45f,1),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1)
        );
    }
}
