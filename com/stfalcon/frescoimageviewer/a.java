package com.stfalcon.frescoimageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewConfiguration;
import vigqyno.C0201;

/* compiled from: AnimationUtils */
public final class a {

    /* renamed from: com.stfalcon.frescoimageviewer.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationUtils */
    static class C0127a extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;

        public C0127a(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setVisibility(8);
        }
    }

    public static void a(View view) {
        boolean z = view.getVisibility() == 0;
        float f = 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (z) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0201.m82(26598), f2, f);
        ofFloat.setDuration((long) ViewConfiguration.getDoubleTapTimeout());
        if (z) {
            ofFloat.addListener(new C0127a(view));
        } else {
            view.setVisibility(0);
        }
        ofFloat.start();
    }
}
