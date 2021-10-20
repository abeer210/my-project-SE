package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import vigqyno.C0201;

/* renamed from: tf  reason: default package */
/* compiled from: BaseLottieAnimator */
public abstract class tf extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> a = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> b = new CopyOnWriteArraySet();

    public void a() {
        for (Animator.AnimatorListener animatorListener : this.b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public void b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void c() {
        for (Animator.AnimatorListener animatorListener : this.b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    public void d(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void e() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException(C0201.m82(7805));
    }

    public void removeAllListeners() {
        this.b.clear();
    }

    public void removeAllUpdateListeners() {
        this.a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException(C0201.m82(7807));
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException(C0201.m82(7808));
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException(C0201.m82(7806));
    }
}
