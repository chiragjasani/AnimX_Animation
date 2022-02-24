package com.animX.animationlib.library.animx_circ;

import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class CircEaseOut extends Animx_BaseEasingMethod {

    public CircEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c * (float)Math.sqrt(1 - (t=t/d-1)*t) + b;
    }
}
