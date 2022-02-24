package com.animX.animationlib.library.animx_attention;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.animX.animationlib.library.Animx_BaseViewAnimator;


public class Standup extends Animx_BaseViewAnimator {
    @Override
    public void prepare(View target) {

        final int startingAlpha;

        if(mAlpha){
            startingAlpha = 0;
        }
        else {
            startingAlpha = 1;
        }

        float x = (target.getWidth() - target.getPaddingLeft() - target.getPaddingRight())/2
                + target.getPaddingLeft();
        float y = target.getHeight() - target.getPaddingBottom();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"pivotX",x,x,x,x,x),
                ObjectAnimator.ofFloat(target,"pivotY",y,y,y,y,y),
                ObjectAnimator.ofFloat(target,"alpha",startingAlpha,1),
                ObjectAnimator.ofFloat(target,"rotationX",55,-30,15,-15,0)
        );
    }
}