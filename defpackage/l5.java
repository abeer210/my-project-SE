package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: l5  reason: default package */
/* compiled from: ChangeTransform */
public class l5 extends e6 {
    private static final String[] P = {C0201.m82(25403), C0201.m82(25404), C0201.m82(25405)};
    private static final Property<e, float[]> Q = new a(float[].class, C0201.m82(25406));
    private static final Property<e, PointF> R = new b(PointF.class, C0201.m82(25407));
    private static final boolean S = (Build.VERSION.SDK_INT >= 21);
    public boolean M = true;
    private boolean N = true;
    private Matrix O = new Matrix();

    /* renamed from: l5$a */
    /* compiled from: ChangeTransform */
    static class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    /* renamed from: l5$b */
    /* compiled from: ChangeTransform */
    static class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l5$c */
    /* compiled from: ChangeTransform */
    public class c extends AnimatorListenerAdapter {
        private boolean a;
        private Matrix b = new Matrix();
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Matrix d;
        public final /* synthetic */ View e;
        public final /* synthetic */ f f;
        public final /* synthetic */ e g;

        public c(boolean z, Matrix matrix, View view, f fVar, e eVar) {
            this.c = z;
            this.d = matrix;
            this.e = view;
            this.f = fVar;
            this.g = eVar;
        }

        private void a(Matrix matrix) {
            this.b.set(matrix);
            this.e.setTag(z5.transition_transform, this.b);
            this.f.a(this.e);
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                if (!this.c || !l5.this.M) {
                    this.e.setTag(z5.transition_transform, null);
                    this.e.setTag(z5.parent_matrix, null);
                } else {
                    a(this.d);
                }
            }
            v6.f(this.e, null);
            this.f.a(this.e);
        }

        public void onAnimationPause(Animator animator) {
            a(this.g.a());
        }

        public void onAnimationResume(Animator animator) {
            l5.p0(this.e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l5$d */
    /* compiled from: ChangeTransform */
    public static class d extends f6 {
        private View a;
        private p5 b;

        public d(View view, p5 p5Var) {
            this.a = view;
            this.b = p5Var;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void b(e6 e6Var) {
            this.b.setVisibility(4);
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            e6Var.W(this);
            t5.b(this.a);
            this.a.setTag(z5.transition_transform, null);
            this.a.setTag(z5.parent_matrix, null);
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void e(e6 e6Var) {
            this.b.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l5$e */
    /* compiled from: ChangeTransform */
    public static class e {
        private final Matrix a = new Matrix();
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        public e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            v6.f(this.b, this.a);
        }

        public Matrix a() {
            return this.a;
        }

        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l5$f */
    /* compiled from: ChangeTransform */
    public static class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = k3.E(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            l5.v0(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.a == this.a && fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float f2 = this.a;
            int i = 0;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.h;
            if (f9 != 0.0f) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    private void l0(k6 k6Var) {
        View view = k6Var.b;
        if (view.getVisibility() != 8) {
            k6Var.a.put(C0201.m82(25408), view.getParent());
            k6Var.a.put(C0201.m82(25409), new f(view));
            Matrix matrix = view.getMatrix();
            k6Var.a.put(C0201.m82(25410), (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.N) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                v6.j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                k6Var.a.put(C0201.m82(25411), matrix2);
                k6Var.a.put(C0201.m82(25412), view.getTag(z5.transition_transform));
                k6Var.a.put(C0201.m82(25413), view.getTag(z5.parent_matrix));
            }
        }
    }

    private void m0(ViewGroup viewGroup, k6 k6Var, k6 k6Var2) {
        View view = k6Var2.b;
        Matrix matrix = new Matrix((Matrix) k6Var2.a.get(C0201.m82(25414)));
        v6.k(viewGroup, matrix);
        p5 a2 = t5.a(view, viewGroup, matrix);
        if (a2 != null) {
            a2.a((ViewGroup) k6Var.a.get(C0201.m82(25415)), k6Var.b);
            e6 e6Var = this;
            while (true) {
                e6 e6Var2 = e6Var.u;
                if (e6Var2 == null) {
                    break;
                }
                e6Var = e6Var2;
            }
            e6Var.a(new d(view, a2));
            if (S) {
                View view2 = k6Var.b;
                if (view2 != k6Var2.b) {
                    v6.h(view2, 0.0f);
                }
                v6.h(view, 1.0f);
            }
        }
    }

    private ObjectAnimator n0(k6 k6Var, k6 k6Var2, boolean z) {
        Map<String, Object> map = k6Var.a;
        String r0 = C0201.m82(25416);
        Matrix matrix = (Matrix) map.get(r0);
        Matrix matrix2 = (Matrix) k6Var2.a.get(r0);
        if (matrix == null) {
            matrix = u5.a;
        }
        if (matrix2 == null) {
            matrix2 = u5.a;
        }
        if (matrix.equals(matrix2)) {
            return null;
        }
        f fVar = (f) k6Var2.a.get(C0201.m82(25417));
        View view = k6Var2.b;
        p0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(Q, new n5(new float[9]), fArr, fArr2), y5.a(R, z().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z, matrix2, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        h5.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    private boolean o0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (N(viewGroup) && N(viewGroup2)) {
            k6 x = x(viewGroup, true);
            if (x == null) {
                return false;
            }
        }
        z = false;
        return z;
    }

    public static void p0(View view) {
        v0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void r0(k6 k6Var, k6 k6Var2) {
        Map<String, Object> map = k6Var2.a;
        String r1 = C0201.m82(25418);
        Matrix matrix = (Matrix) map.get(r1);
        k6Var2.b.setTag(z5.parent_matrix, matrix);
        Matrix matrix2 = this.O;
        matrix2.reset();
        matrix.invert(matrix2);
        Map<String, Object> map2 = k6Var.a;
        String r2 = C0201.m82(25419);
        Matrix matrix3 = (Matrix) map2.get(r2);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            k6Var.a.put(r2, matrix3);
        }
        matrix3.postConcat((Matrix) k6Var.a.get(r1));
        matrix3.postConcat(matrix2);
    }

    public static void v0(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        k3.y0(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    @Override // defpackage.e6
    public String[] K() {
        return P;
    }

    @Override // defpackage.e6
    public void f(k6 k6Var) {
        l0(k6Var);
    }

    @Override // defpackage.e6
    public void j(k6 k6Var) {
        l0(k6Var);
        if (!S) {
            ((ViewGroup) k6Var.b.getParent()).startViewTransition(k6Var.b);
        }
    }

    @Override // defpackage.e6
    public Animator o(ViewGroup viewGroup, k6 k6Var, k6 k6Var2) {
        if (k6Var == null || k6Var2 == null) {
            return null;
        }
        Map<String, Object> map = k6Var.a;
        String r1 = C0201.m82(25420);
        if (!map.containsKey(r1) || !k6Var2.a.containsKey(r1)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) k6Var.a.get(r1);
        boolean z = this.N && !o0(viewGroup2, (ViewGroup) k6Var2.a.get(r1));
        Matrix matrix = (Matrix) k6Var.a.get(C0201.m82(25421));
        if (matrix != null) {
            k6Var.a.put(C0201.m82(25422), matrix);
        }
        Matrix matrix2 = (Matrix) k6Var.a.get(C0201.m82(25423));
        if (matrix2 != null) {
            k6Var.a.put(C0201.m82(25424), matrix2);
        }
        if (z) {
            r0(k6Var, k6Var2);
        }
        ObjectAnimator n0 = n0(k6Var, k6Var2, z);
        if (z && n0 != null && this.M) {
            m0(viewGroup, k6Var, k6Var2);
        } else if (!S) {
            viewGroup2.endViewTransition(k6Var.b);
        }
        return n0;
    }
}
