package com.animX.animationlib.library.animx_quad;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class QuadEaseOut extends Animx_BaseEasingMethod {
    public QuadEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c *(t/=d)*(t-2) + b;
    }
}
