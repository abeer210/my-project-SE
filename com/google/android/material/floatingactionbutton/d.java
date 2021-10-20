package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* compiled from: MotionStrategy */
public interface d {
    void a();

    void b();

    fw1 c();

    boolean d();

    void e(fw1 fw1);

    AnimatorSet f();

    List<Animator.AnimatorListener> g();

    void h(ExtendedFloatingActionButton.d dVar);

    void onAnimationEnd();

    void onAnimationStart(Animator animator);
}
