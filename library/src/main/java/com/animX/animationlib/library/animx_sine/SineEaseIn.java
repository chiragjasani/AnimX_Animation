package com.animX.animationlib.library.animx_sine;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class SineEaseIn extends Animx_BaseEasingMethod {

    public SineEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c * (float)Math.cos(t/d * (Math.PI/2)) + c + b;
    }
}
