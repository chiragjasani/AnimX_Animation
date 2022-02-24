package com.animX.animationlib.library;

import com.animX.animationlib.library.animx_back.BackEaseIn;
import com.animX.animationlib.library.animx_back.BackEaseInOut;
import com.animX.animationlib.library.animx_back.BackEaseOut;
import com.animX.animationlib.library.animx_bounce.BounceEaseIn;
import com.animX.animationlib.library.animx_bounce.BounceEaseInOut;
import com.animX.animationlib.library.animx_bounce.BounceEaseOut;
import com.animX.animationlib.library.animx_circ.CircEaseIn;
import com.animX.animationlib.library.animx_circ.CircEaseInOut;
import com.animX.animationlib.library.animx_circ.CircEaseOut;
import com.animX.animationlib.library.animx_cubic.CubicEaseIn;
import com.animX.animationlib.library.animx_cubic.CubicEaseInOut;
import com.animX.animationlib.library.animx_cubic.CubicEaseOut;
import com.animX.animationlib.library.animx_elastic.ElasticEaseIn;
import com.animX.animationlib.library.animx_elastic.ElasticEaseOut;
import com.animX.animationlib.library.animx_expo.ExpoEaseIn;
import com.animX.animationlib.library.animx_expo.ExpoEaseInOut;
import com.animX.animationlib.library.animx_expo.ExpoEaseOut;
import com.animX.animationlib.library.animx_quad.QuadEaseIn;
import com.animX.animationlib.library.animx_quad.QuadEaseInOut;
import com.animX.animationlib.library.animx_quad.QuadEaseOut;
import com.animX.animationlib.library.animx_quint.QuintEaseIn;
import com.animX.animationlib.library.animx_quint.QuintEaseInOut;
import com.animX.animationlib.library.animx_quint.QuintEaseOut;
import com.animX.animationlib.library.animx_sine.SineEaseIn;
import com.animX.animationlib.library.animx_sine.SineEaseInOut;
import com.animX.animationlib.library.animx_sine.SineEaseOut;
import com.animX.animationlib.library.animx_linear.Linear;


public enum  Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public Animx_BaseEasingMethod getMethod(float duration) {
        try {
            return (Animx_BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
