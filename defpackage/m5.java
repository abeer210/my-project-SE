package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: m5  reason: default package */
/* compiled from: Fade */
public class m5 extends c7 {

    /* access modifiers changed from: package-private */
    /* renamed from: m5$a */
    /* compiled from: Fade */
    public class a extends f6 {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            v6.h(this.a, 1.0f);
            v6.a(this.a);
            e6Var.W(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m5$b */
    /* compiled from: Fade */
    public static class b extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        public b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            v6.h(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (k3.J(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public m5(int i) {
        v0(i);
    }

    private Animator w0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        v6.h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, v6.b, f2);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float x0(k6 k6Var, float f) {
        Float f2;
        return (k6Var == null || (f2 = (Float) k6Var.a.get(C0201.m82(27946))) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.e6, defpackage.c7
    public void j(k6 k6Var) {
        super.j(k6Var);
        k6Var.a.put(C0201.m82(27947), Float.valueOf(v6.c(k6Var.b)));
    }

    @Override // defpackage.c7
    public Animator n0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        float f = 0.0f;
        float x0 = x0(k6Var, 0.0f);
        if (x0 != 1.0f) {
            f = x0;
        }
        return w0(view, f, 1.0f);
    }

    @Override // defpackage.c7
    public Animator p0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        v6.e(view);
        return w0(view, x0(k6Var, 1.0f), 0.0f);
    }
}
