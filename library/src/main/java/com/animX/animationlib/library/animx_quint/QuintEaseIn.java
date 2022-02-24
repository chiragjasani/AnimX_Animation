package com.animX.animationlib.library.animx_quint;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class QuintEaseIn extends Animx_BaseEasingMethod {
    public QuintEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t*t*t*t + b;
    }
}
