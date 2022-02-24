package com.animX.animationlib.library.animx_back;

import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class BackEaseOut extends Animx_BaseEasingMethod {

    private float s = 1.70158f;

    public BackEaseOut(float duration) {
        super(duration);
    }

    public BackEaseOut(float duration, float back){
        this(duration);
        s = back;
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*((s+1)*t + s) + 1) + b;
    }
}
