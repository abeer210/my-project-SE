package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import vigqyno.C0201;

/* renamed from: d6  reason: default package */
/* compiled from: Slide */
public class d6 extends c7 {
    private static final TimeInterpolator P = new DecelerateInterpolator();
    private static final TimeInterpolator Q = new AccelerateInterpolator();
    private static final g R = new a();
    private static final g S = new b();
    private static final g T = new c();
    private static final g U = new d();
    private static final g V = new e();
    private static final g W = new f();
    private g O = W;

    /* renamed from: d6$a */
    /* compiled from: Slide */
    static class a extends h {
        public a() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: d6$b */
    /* compiled from: Slide */
    static class b extends h {
        public b() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (k3.w(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: d6$c */
    /* compiled from: Slide */
    static class c extends i {
        public c() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: d6$d */
    /* compiled from: Slide */
    static class d extends h {
        public d() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: d6$e */
    /* compiled from: Slide */
    static class e extends h {
        public e() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (k3.w(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: d6$f */
    /* compiled from: Slide */
    static class f extends i {
        public f() {
            super(null);
        }

        @Override // defpackage.d6.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d6$g */
    /* compiled from: Slide */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* renamed from: d6$h */
    /* compiled from: Slide */
    private static abstract class h implements g {
        private h() {
        }

        @Override // defpackage.d6.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* renamed from: d6$i */
    /* compiled from: Slide */
    private static abstract class i implements g {
        private i() {
        }

        @Override // defpackage.d6.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public d6(int i2) {
        w0(i2);
    }

    private void l0(k6 k6Var) {
        int[] iArr = new int[2];
        k6Var.b.getLocationOnScreen(iArr);
        k6Var.a.put(C0201.m82(7213), iArr);
    }

    @Override // defpackage.e6, defpackage.c7
    public void f(k6 k6Var) {
        super.f(k6Var);
        l0(k6Var);
    }

    @Override // defpackage.e6, defpackage.c7
    public void j(k6 k6Var) {
        super.j(k6Var);
        l0(k6Var);
    }

    @Override // defpackage.c7
    public Animator n0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        if (k6Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) k6Var2.a.get(C0201.m82(7214));
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return m6.a(view, k6Var2, iArr[0], iArr[1], this.O.b(viewGroup, view), this.O.a(viewGroup, view), translationX, translationY, P, this);
    }

    @Override // defpackage.c7
    public Animator p0(ViewGroup viewGroup, View view, k6 k6Var, k6 k6Var2) {
        if (k6Var == null) {
            return null;
        }
        int[] iArr = (int[]) k6Var.a.get(C0201.m82(7215));
        return m6.a(view, k6Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.O.b(viewGroup, view), this.O.a(viewGroup, view), Q, this);
    }

    public void w0(int i2) {
        if (i2 == 3) {
            this.O = R;
        } else if (i2 == 5) {
            this.O = U;
        } else if (i2 == 48) {
            this.O = T;
        } else if (i2 == 80) {
            this.O = W;
        } else if (i2 == 8388611) {
            this.O = S;
        } else if (i2 == 8388613) {
            this.O = V;
        } else {
            throw new IllegalArgumentException(C0201.m82(7216));
        }
        c6 c6Var = new c6();
        c6Var.j(i2);
        f0(c6Var);
    }
}
