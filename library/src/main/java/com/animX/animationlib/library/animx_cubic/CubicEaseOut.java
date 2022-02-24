package com.animX.animationlib.library.animx_cubic;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class CubicEaseOut extends Animx_BaseEasingMethod {

    public CubicEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t + 1) + b;
    }
}
