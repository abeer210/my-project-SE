package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class e {
    private final ArrayList<b> a = new ArrayList<>();
    private b b = null;
    public ValueAnimator c = null;
    private final Animator.AnimatorListener d = new a();

    /* compiled from: StateListAnimator */
    class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.c == animator) {
                eVar.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: StateListAnimator */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.b;
        this.c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }
}
