package com.animX.animationlib.library.animx_bounce;

import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class BounceEaseIn extends Animx_BaseEasingMethod {

    private BounceEaseOut mBounceEaseOut;

    public BounceEaseIn(float duration){
        super(duration);
        mBounceEaseOut = new BounceEaseOut(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c - mBounceEaseOut.calculate(d-t, 0, c, d) + b;
    }
}
