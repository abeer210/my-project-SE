package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: mq2  reason: default package */
/* compiled from: Scale */
public class mq2 extends c7 {

    /* access modifiers changed from: package-private */
    /* renamed from: mq2$a */
    /* compiled from: Scale */
    public class a extends f6 {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public a(View view, float f, float f2) {
            this.a = view;
            this.b = f;
            this.c = f2;
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            this.a.setScaleX(this.b);
            this.a.setScaleY(this.c);
            e6Var.W(this);
        }
    }

    private Animator w0(View view, float f, float f2, k6 k6Var) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float f3 = scaleX * f;
        float f4 = scaleX * f2;
        float f5 = f * scaleY;
        float f6 = f2 * scaleY;
        if (k6Var != null) {
            Float f7 = (Float) k6Var.a.get(C0201.m82(30772));
            Float f8 = (Float) k6Var.a.get(C0201.m82(30773));
            if (!(f7 == null || f7.floatValue() == scaleX)) {
                f3 = f7.floatValue();
            }
            if (!(f8 == null || f8.floatValue() == scaleY)) {
                f5 = f8.floatValue();
            }
        }
        view.setScaleX(f3);
        view.setScaleY(f5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f3, f4), ObjectAnimator.ofFloat(view, View.SCALE_Y, f5, f6));
        a(new a(view, scaleX, scaleY));
        return animatorSet;
    }

    @Override // defpackage.e6, defpackage.c7
    public void j(k6 k6Var) {
        super.j(k6Var);
        k6Var.a.put(C0201.m82(30774), Float.valueOf(k6Var.b.getScaleX()));
        k6Var.a.put(C0201.m82(30775), Float.valueOf(k6Var.b.getScaleY()));
    }

    @Override // defpackage.c7
    public Animator n0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        return w0(view, 0.0f, 1.0f, k6Var);
    }

    @Override // defpackage.c7
    public Animator p0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        return w0(view, 1.0f, 0.0f, k6Var);
    }
}
