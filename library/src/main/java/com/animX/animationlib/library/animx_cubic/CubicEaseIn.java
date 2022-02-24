package com.animX.animationlib.library.animx_cubic;

import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class CubicEaseIn extends Animx_BaseEasingMethod {

    public CubicEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t*t + b;
    }
}
