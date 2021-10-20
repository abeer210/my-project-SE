package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import vigqyno.C0201;

/* renamed from: gw1  reason: default package */
/* compiled from: MotionTiming */
public class gw1 {
    private long a = 0;
    private long b = 300;
    private TimeInterpolator c = null;
    private int d = 0;
    private int e = 1;

    public gw1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static gw1 b(ValueAnimator valueAnimator) {
        gw1 gw1 = new gw1(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        gw1.d = valueAnimator.getRepeatCount();
        gw1.e = valueAnimator.getRepeatMode();
        return gw1;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return yv1.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return yv1.c;
        }
        return interpolator instanceof DecelerateInterpolator ? yv1.d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : yv1.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw1)) {
            return false;
        }
        gw1 gw1 = (gw1) obj;
        if (c() == gw1.c() && d() == gw1.d() && g() == gw1.g() && h() == gw1.h()) {
            return e().getClass().equals(gw1.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + gw1.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(13146) + c() + C0201.m82(13147) + d() + C0201.m82(13148) + e().getClass() + C0201.m82(13149) + g() + C0201.m82(13150) + h() + C0201.m82(13151);
    }

    public gw1(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
