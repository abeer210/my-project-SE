package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: p3  reason: default package */
/* compiled from: ViewPropertyAnimatorCompat */
public final class p3 {
    private WeakReference<View> a;
    public Runnable b = null;
    public Runnable c = null;
    public int d = -1;

    /* access modifiers changed from: package-private */
    /* renamed from: p3$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ q3 a;
        public final /* synthetic */ View b;

        public a(p3 p3Var, q3 q3Var, View view) {
            this.a = q3Var;
            this.b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ s3 a;
        public final /* synthetic */ View b;

        public b(p3 p3Var, s3 s3Var, View view) {
            this.a = s3Var;
            this.b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    public static class c implements q3 {
        public p3 a;
        public boolean b;

        public c(p3 p3Var) {
            this.a = p3Var;
        }

        @Override // defpackage.q3
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            q3 q3Var = tag instanceof q3 ? (q3) tag : null;
            if (q3Var != null) {
                q3Var.a(view);
            }
        }

        @Override // defpackage.q3
        public void b(View view) {
            int i = this.a.d;
            q3 q3Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                p3 p3Var = this.a;
                Runnable runnable = p3Var.c;
                if (runnable != null) {
                    p3Var.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof q3) {
                    q3Var = (q3) tag;
                }
                if (q3Var != null) {
                    q3Var.b(view);
                }
                this.b = true;
            }
        }

        @Override // defpackage.q3
        public void c(View view) {
            this.b = false;
            q3 q3Var = null;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            p3 p3Var = this.a;
            Runnable runnable = p3Var.b;
            if (runnable != null) {
                p3Var.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof q3) {
                q3Var = (q3) tag;
            }
            if (q3Var != null) {
                q3Var.c(view);
            }
        }
    }

    public p3(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, q3 q3Var) {
        if (q3Var != null) {
            view.animate().setListener(new a(this, q3Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public p3 a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public p3 d(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public p3 e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public p3 f(q3 q3Var) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, q3Var);
            } else {
                view.setTag(2113929216, q3Var);
                g(view, new c(this));
            }
        }
        return this;
    }

    public p3 h(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public p3 i(s3 s3Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (s3Var != null) {
                bVar = new b(this, s3Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public p3 k(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
