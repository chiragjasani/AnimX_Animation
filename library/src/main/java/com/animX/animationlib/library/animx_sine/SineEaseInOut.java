package com.animX.animationlib.library.animx_sine;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class SineEaseInOut extends Animx_BaseEasingMethod {
    public SineEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return -c/2 * ((float)Math.cos(Math.PI*t/d) - 1) + b;
    }
}
