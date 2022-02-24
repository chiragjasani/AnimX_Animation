package com.animX.animationlib.library.animx_quint;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class QuintEaseOut extends Animx_BaseEasingMethod {
    public QuintEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t*t*t + 1) + b;
    }
}
