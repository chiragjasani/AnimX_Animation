package com.animX.animationlib.library.animx_quad;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class QuadEaseIn extends Animx_BaseEasingMethod {
    public QuadEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t + b;
    }
}
