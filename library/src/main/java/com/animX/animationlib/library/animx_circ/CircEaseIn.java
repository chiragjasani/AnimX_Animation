package com.animX.animationlib.library.animx_circ;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class CircEaseIn extends Animx_BaseEasingMethod {

    public CircEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c * ((float)Math.sqrt(1 - (t/=d)*t) - 1) + b;
    }
}
