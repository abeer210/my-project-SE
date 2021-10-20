package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* compiled from: FloatingActionButtonImpl */
public class b {
    public static final TimeInterpolator F = yv1.c;
    public static final int[] G = {16842919, 16842910};
    public static final int[] H = {16843623, 16842908, 16842910};
    public static final int[] I = {16842908, 16842910};
    public static final int[] J = {16843623, 16842910};
    public static final int[] K = {16842910};
    public static final int[] L = new int[0];
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private ViewTreeObserver.OnPreDrawListener E;
    public vx1 a;
    public rx1 b;
    public Drawable c;
    public a d;
    public Drawable e;
    public boolean f;
    public boolean g = true;
    public float h;
    public float i;
    public float j;
    public int k;
    private final com.google.android.material.internal.e l;
    private fw1 m;
    private fw1 n;
    private Animator o;
    private fw1 p;
    private fw1 q;
    private float r;
    private float s = 1.0f;
    private int t;
    private int u = 0;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    public final FloatingActionButton y;
    public final kx1 z;

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public class a extends AnimatorListenerAdapter {
        private boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ j c;

        public a(boolean z, j jVar) {
            this.b = z;
            this.c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            if (!this.a) {
                b.this.y.b(this.b ? 8 : 4, this.b);
                j jVar = this.c;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.b);
            b.this.u = 1;
            b.this.o = animator;
            this.a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    public class C0069b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ j b;

        public C0069b(boolean z, j jVar) {
            this.a = z;
            this.b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            j jVar = this.b;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            b.this.y.b(0, this.a);
            b.this.u = 2;
            b.this.o = animator;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public class c extends ew1 {
        public c() {
        }

        @Override // defpackage.ew1
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            b.this.s = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public class d implements TypeEvaluator<Float> {
        public FloatEvaluator a = new FloatEvaluator();

        public d(b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        public boolean onPreDraw() {
            b.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class f extends l {
        public f(b bVar) {
            super(bVar, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class g extends l {
        public g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.i;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class h extends l {
        public h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            b bVar = b.this;
            return bVar.h + bVar.j;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public interface i {
        void a();

        void b();
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl */
    public interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    private class k extends l {
        public k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        public float a() {
            return b.this.h;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        private l() {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            b.this.c0((float) ((int) this.c));
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                rx1 rx1 = b.this.b;
                this.b = rx1 == null ? 0.0f : rx1.v();
                this.c = a();
                this.a = true;
            }
            b bVar = b.this;
            float f = this.b;
            bVar.c0((float) ((int) (f + ((this.c - f) * valueAnimator.getAnimatedFraction()))));
        }

        public /* synthetic */ l(b bVar, a aVar) {
            this();
        }
    }

    public b(FloatingActionButton floatingActionButton, kx1 kx1) {
        this.y = floatingActionButton;
        this.z = kx1;
        com.google.android.material.internal.e eVar = new com.google.android.material.internal.e();
        this.l = eVar;
        eVar.a(G, i(new h()));
        this.l.a(H, i(new g()));
        this.l.a(I, i(new g()));
        this.l.a(J, i(new g()));
        this.l.a(K, i(new k()));
        this.l.a(L, i(new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean W() {
        return k3.O(this.y) && !this.y.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d(this));
        }
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.t;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.t;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private AnimatorSet h(fw1 fw1, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        fw1.e(C0201.m82(1749)).a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        String r1 = C0201.m82(1750);
        fw1.e(r1).a(ofFloat2);
        d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        fw1.e(r1).a(ofFloat3);
        d0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new dw1(), new c(), new Matrix(this.D));
        fw1.e(C0201.m82(1751)).a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        zv1.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private fw1 k() {
        if (this.n == null) {
            this.n = fw1.c(this.y.getContext(), mv1.design_fab_hide_motion_spec);
        }
        fw1 fw1 = this.n;
        androidx.core.util.g.c(fw1);
        return fw1;
    }

    private fw1 l() {
        if (this.m == null) {
            this.m = fw1.c(this.y.getContext(), mv1.design_fab_show_motion_spec);
        }
        fw1 fw1 = this.m;
        androidx.core.util.g.c(fw1);
        return fw1;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public void A() {
    }

    public void B() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    public void C(int[] iArr) {
        this.l.d(iArr);
    }

    public void D(float f2, float f3, float f4) {
        b0();
        c0(f2);
    }

    public void E(Rect rect) {
        androidx.core.util.g.d(this.e, C0201.m82(1752));
        if (V()) {
            this.z.c(new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.z.c(this.e);
    }

    public void F() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            Z();
        }
    }

    public void G() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void H() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public boolean I() {
        return true;
    }

    public void J(ColorStateList colorStateList) {
        rx1 rx1 = this.b;
        if (rx1 != null) {
            rx1.setTintList(colorStateList);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(colorStateList);
            throw null;
        }
    }

    public void K(PorterDuff.Mode mode) {
        rx1 rx1 = this.b;
        if (rx1 != null) {
            rx1.setTintMode(mode);
        }
    }

    public final void L(float f2) {
        if (this.h != f2) {
            this.h = f2;
            D(f2, this.i, this.j);
        }
    }

    public void M(boolean z2) {
        this.f = z2;
    }

    public final void N(fw1 fw1) {
        this.q = fw1;
    }

    public final void O(float f2) {
        if (this.i != f2) {
            this.i = f2;
            D(this.h, f2, this.j);
        }
    }

    public final void P(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    public final void Q(float f2) {
        if (this.j != f2) {
            this.j = f2;
            D(this.h, this.i, f2);
        }
    }

    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, ix1.d(colorStateList));
        }
    }

    public void S(boolean z2) {
        this.g = z2;
        b0();
    }

    public final void T(vx1 vx1) {
        this.a = vx1;
        rx1 rx1 = this.b;
        if (rx1 != null) {
            rx1.setShapeAppearanceModel(vx1);
        }
        Drawable drawable = this.c;
        if (drawable instanceof yx1) {
            ((yx1) drawable).setShapeAppearanceModel(vx1);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.b(vx1);
            throw null;
        }
    }

    public final void U(fw1 fw1) {
        this.p = fw1;
    }

    public boolean V() {
        return true;
    }

    public final boolean X() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    public void Y(j jVar, boolean z2) {
        if (!x()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (W()) {
                if (this.y.getVisibility() != 0) {
                    this.y.setAlpha(0.0f);
                    this.y.setScaleY(0.0f);
                    this.y.setScaleX(0.0f);
                    P(0.0f);
                }
                fw1 fw1 = this.p;
                if (fw1 == null) {
                    fw1 = l();
                }
                AnimatorSet h2 = h(fw1, 1.0f, 1.0f, 1.0f);
                h2.addListener(new C0069b(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.b(0, z2);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            P(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public void Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.y.getLayerType() != 1) {
                    this.y.setLayerType(1, null);
                }
            } else if (this.y.getLayerType() != 0) {
                this.y.setLayerType(0, null);
            }
        }
        rx1 rx1 = this.b;
        if (rx1 != null) {
            rx1.Z((int) this.r);
        }
    }

    public final void a0() {
        P(this.s);
    }

    public final void b0() {
        Rect rect = this.A;
        r(rect);
        E(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void c0(float f2) {
        rx1 rx1 = this.b;
        if (rx1 != null) {
            rx1.U(f2);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    public void f(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    public final Drawable j() {
        return this.e;
    }

    public float m() {
        return this.h;
    }

    public boolean n() {
        return this.f;
    }

    public final fw1 o() {
        return this.q;
    }

    public float p() {
        return this.i;
    }

    public void r(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float m2 = this.g ? m() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public float s() {
        return this.j;
    }

    public final vx1 t() {
        return this.a;
    }

    public final fw1 u() {
        return this.p;
    }

    public void v(j jVar, boolean z2) {
        if (!w()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (W()) {
                fw1 fw1 = this.q;
                if (fw1 == null) {
                    fw1 = k();
                }
                AnimatorSet h2 = h(fw1, 0.0f, 0.0f, 0.0f);
                h2.addListener(new a(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.b(z2 ? 8 : 4, z2);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    public boolean w() {
        if (this.y.getVisibility() == 0) {
            if (this.u == 1) {
                return true;
            }
            return false;
        } else if (this.u != 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean x() {
        if (this.y.getVisibility() != 0) {
            if (this.u == 2) {
                return true;
            }
            return false;
        } else if (this.u != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void y() {
        this.l.c();
    }

    public void z() {
        rx1 rx1 = this.b;
        if (rx1 != null) {
            sx1.f(this.y, rx1);
        }
        if (I()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
