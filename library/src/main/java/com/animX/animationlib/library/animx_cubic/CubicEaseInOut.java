package com.animX.animationlib.library.animx_cubic;

import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class CubicEaseInOut extends Animx_BaseEasingMethod {

    public CubicEaseInOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        if ((t/=d/2) < 1)
            return c/2*t*t*t + b;

        return c/2*((t-=2)*t*t + 2) + b;
    }
}
