package com.animX.animationlib.library;

import com.animX.animationlib.library.animx_special.in.DropOut;
import com.animX.animationlib.library.animx_special.in.Landing;
import com.animX.animationlib.library.animx_attention.Bounce;
import com.animX.animationlib.library.animx_attention.Flash;
import com.animX.animationlib.library.animx_attention.Pulse;
import com.animX.animationlib.library.animx_attention.RubberBand;
import com.animX.animationlib.library.animx_attention.Shake;
import com.animX.animationlib.library.animx_attention.Standup;
import com.animX.animationlib.library.animx_attention.Swing;
import com.animX.animationlib.library.animx_attention.Tada;
import com.animX.animationlib.library.animx_attention.Wave;
import com.animX.animationlib.library.animx_attention.Wobble;
import com.animX.animationlib.library.animx_attention.ShakeBand;
import com.animX.animationlib.library.animx_bouncing_in.BounceIn;
import com.animX.animationlib.library.animx_bouncing_in.BounceInDown;
import com.animX.animationlib.library.animx_bouncing_in.BounceInLeft;
import com.animX.animationlib.library.animx_bouncing_in.BounceInRight;
import com.animX.animationlib.library.animx_bouncing_in.BounceInUp;
import com.animX.animationlib.library.animx_fading_in.FadingIn;
import com.animX.animationlib.library.animx_fading_in.FadingInDown;
import com.animX.animationlib.library.animx_fading_in.FadingInLeft;
import com.animX.animationlib.library.animx_fading_in.FadingInRight;
import com.animX.animationlib.library.animx_fading_in.FadingInUp;
import com.animX.animationlib.library.animx_fading_out.FadingOut;
import com.animX.animationlib.library.animx_fading_out.FadingOutDown;
import com.animX.animationlib.library.animx_fading_out.FadingOutLeft;
import com.animX.animationlib.library.animx_fading_out.FadingOutRight;
import com.animX.animationlib.library.animx_fading_out.FadingOutUp;
import com.animX.animationlib.library.animx_Flips.FlipInXaxis;
import com.animX.animationlib.library.animx_Flips.FlipInYaxis;
import com.animX.animationlib.library.animx_Flips.FlipOutXaxis;
import com.animX.animationlib.library.animx_Flips.FlipOutYaxis;
import com.animX.animationlib.library.animx_rotation_in.RotateIn;
import com.animX.animationlib.library.animx_rotation_in.RotateInDownLeft;
import com.animX.animationlib.library.animx_rotation_in.RotateInDownRight;
import com.animX.animationlib.library.animx_rotation_in.RotateInUpLeft;
import com.animX.animationlib.library.animx_rotation_in.RotateInUpRight;
import com.animX.animationlib.library.animx_rotation_out.RotateOut;
import com.animX.animationlib.library.animx_rotation_out.RotateOutDownLeft;
import com.animX.animationlib.library.animx_rotation_out.RotateOutDownRight;
import com.animX.animationlib.library.animx_rotation_out.RotateOutUpLeft;
import com.animX.animationlib.library.animx_rotation_out.RotateOutUpRight;
import com.animX.animationlib.library.animx_sliders.SlideInDown;
import com.animX.animationlib.library.animx_sliders.SlideInLeft;
import com.animX.animationlib.library.animx_sliders.SlideInRight;
import com.animX.animationlib.library.animx_sliders.SlideInUp;
import com.animX.animationlib.library.animx_sliders.SlideOutDown;
import com.animX.animationlib.library.animx_sliders.SlideOutLeft;
import com.animX.animationlib.library.animx_sliders.SlideOutRight;
import com.animX.animationlib.library.animx_sliders.SlideOutUp;
import com.animX.animationlib.library.animx_zoom_in.ZoomIn;
import com.animX.animationlib.library.animx_zoom_in.ZoomInRubberBand;
import com.animX.animationlib.library.animx_zoom_in.ZoomInDown;
import com.animX.animationlib.library.animx_zoom_in.ZoomInLeft;
import com.animX.animationlib.library.animx_zoom_in.ZoomInRight;
import com.animX.animationlib.library.animx_zoom_in.ZoomInUp;
import com.animX.animationlib.library.animx_zoom_out.ZoomOut;
import com.animX.animationlib.library.animx_zoom_out.ZoomOutDown;
import com.animX.animationlib.library.animx_zoom_out.ZoomOutLeft;
import com.animX.animationlib.library.animx_zoom_out.ZoomOutRight;
import com.animX.animationlib.library.animx_zoom_out.ZoomOutUp;
import com.animX.animationlib.library.animx_special.Hinge;
import com.animX.animationlib.library.animx_special.RollIn;
import com.animX.animationlib.library.animx_special.RollOut;

public enum AnimationType {

    ShakeBand(ShakeBand.class),
    DropOut(DropOut.class),
    Landing(Landing.class),

    Flash(Flash.class),
    Pulse(Pulse.class),
    RubberBand(RubberBand.class),
    Shake(Shake.class),
    Swing(Swing.class),
    Wobble(Wobble.class),
    Bounce(Bounce.class),
    Tada(Tada.class),
    StandUp(Standup.class),
    Wave(Wave.class),

    Hinge(Hinge.class),
    RollIn(RollIn.class),
    RollOut(RollOut.class),

    BounceIn(BounceIn.class),
    BounceInDown(BounceInDown.class),
    BounceInLeft(BounceInLeft.class),
    BounceInRight(BounceInRight.class),
    BounceInUp(BounceInUp.class),

    FadeIn(FadingIn.class),
    FadeInUp(FadingInUp.class),
    FadeInDown(FadingInDown.class),
    FadeInLeft(FadingInLeft.class),
    FadeInRight(FadingInRight.class),

    FadeOut(FadingOut.class),
    FadeOutDown(FadingOutDown.class),
    FadeOutLeft(FadingOutLeft.class),
    FadeOutRight(FadingOutRight.class),
    FadeOutUp(FadingOutUp.class),

    FlipInX(FlipInXaxis.class),
    FlipOutX(FlipOutXaxis.class),
    FlipInY(FlipInYaxis.class),
    FlipOutY(FlipOutYaxis.class),
    RotateIn(RotateIn.class),
    RotateInDownLeft(RotateInDownLeft.class),
    RotateInDownRight(RotateInDownRight.class),
    RotateInUpLeft(RotateInUpLeft.class),
    RotateInUpRight(RotateInUpRight.class),

    RotateOut(RotateOut.class),
    RotateOutDownLeft(RotateOutDownLeft.class),
    RotateOutDownRight(RotateOutDownRight.class),
    RotateOutUpLeft(RotateOutUpLeft.class),
    RotateOutUpRight(RotateOutUpRight.class),

    SlideInLeft(SlideInLeft.class),
    SlideInRight(SlideInRight.class),
    SlideInUp(SlideInUp.class),
    SlideInDown(SlideInDown.class),

    SlideOutLeft(SlideOutLeft.class),
    SlideOutRight(SlideOutRight.class),
    SlideOutUp(SlideOutUp.class),
    SlideOutDown(SlideOutDown.class),

    ZoomIn(ZoomIn.class),
    ZoomInDown(ZoomInDown.class),
    ZoomInLeft(ZoomInLeft.class),
    ZoomInRight(ZoomInRight.class),
    ZoomInUp(ZoomInUp.class),
    ZoomInRubberBand(ZoomInRubberBand.class),

    ZoomOut(ZoomOut.class),
    ZoomOutDown(ZoomOutDown.class),
    ZoomOutLeft(ZoomOutLeft.class),
    ZoomOutRight(ZoomOutRight.class),
    ZoomOutUp(ZoomOutUp.class);



    private Class CreatingAnimation;

    private AnimationType(Class clazz) {
        CreatingAnimation = clazz;
    }

    public Animx_BaseViewAnimator getAnimator() {
        try {
            return (Animx_BaseViewAnimator) CreatingAnimation.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
