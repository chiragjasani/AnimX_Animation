package com.animX.animationlib.library.animx_linear;


import com.animX.animationlib.library.Animx_BaseEasingMethod;

public class Linear extends Animx_BaseEasingMethod {
    public Linear(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*t/d + b;
    }
}
