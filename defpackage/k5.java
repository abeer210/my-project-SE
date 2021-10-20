package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: k5  reason: default package */
/* compiled from: ChangeBounds */
public class k5 extends e6 {
    private static final String[] P = {C0201.m82(23165), C0201.m82(23166), C0201.m82(23167), C0201.m82(23168), C0201.m82(23169)};
    private static final Property<Drawable, PointF> Q = new b(PointF.class, C0201.m82(23170));
    private static final Property<k, PointF> R;
    private static final Property<k, PointF> S;
    private static final Property<View, PointF> T;
    private static final Property<View, PointF> U;
    private static final Property<View, PointF> V = new g(PointF.class, C0201.m82(23173));
    private static a6 W = new a6();
    private int[] M = new int[2];
    private boolean N = false;
    private boolean O = false;

    /* renamed from: k5$a */
    /* compiled from: ChangeBounds */
    class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        public void onAnimationEnd(Animator animator) {
            v6.b(this.a).b(this.b);
            v6.h(this.c, this.d);
        }
    }

    /* renamed from: k5$b */
    /* compiled from: ChangeBounds */
    static class b extends Property<Drawable, PointF> {
        private Rect a = new Rect();

        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* renamed from: k5$c */
    /* compiled from: ChangeBounds */
    static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: k5$d */
    /* compiled from: ChangeBounds */
    static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: k5$e */
    /* compiled from: ChangeBounds */
    static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            v6.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: k5$f */
    /* compiled from: ChangeBounds */
    static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            v6.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: k5$g */
    /* compiled from: ChangeBounds */
    static class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            v6.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: k5$h */
    /* compiled from: ChangeBounds */
    class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds = this.a;

        public h(k kVar) {
            this.a = kVar;
        }
    }

    /* renamed from: k5$i */
    /* compiled from: ChangeBounds */
    class i extends AnimatorListenerAdapter {
        private boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                k3.n0(this.b, this.c);
                v6.g(this.b, this.d, this.e, this.f, this.g);
            }
        }
    }

    /* renamed from: k5$j */
    /* compiled from: ChangeBounds */
    class j extends f6 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void b(e6 e6Var) {
            q6.d(this.b, false);
        }

        @Override // defpackage.e6.f
        public void c(e6 e6Var) {
            if (!this.a) {
                q6.d(this.b, false);
            }
            e6Var.W(this);
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void d(e6 e6Var) {
            q6.d(this.b, false);
            this.a = true;
        }

        @Override // defpackage.f6, defpackage.e6.f
        public void e(e6 e6Var) {
            q6.d(this.b, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k5$k */
    /* compiled from: ChangeBounds */
    public static class k {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        public k(View view) {
            this.e = view;
        }

        private void b() {
            v6.g(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    static {
        String r2 = C0201.m82(23171);
        R = new c(PointF.class, r2);
        String r3 = C0201.m82(23172);
        S = new d(PointF.class, r3);
        T = new e(PointF.class, r3);
        U = new f(PointF.class, r2);
    }

    private void l0(k6 k6Var) {
        View view = k6Var.b;
        if (k3.O(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            k6Var.a.put(C0201.m82(23174), new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            k6Var.a.put(C0201.m82(23175), k6Var.b.getParent());
            if (this.O) {
                k6Var.b.getLocationInWindow(this.M);
                k6Var.a.put(C0201.m82(23176), Integer.valueOf(this.M[0]));
                k6Var.a.put(C0201.m82(23177), Integer.valueOf(this.M[1]));
            }
            if (this.N) {
                k6Var.a.put(C0201.m82(23178), k3.p(view));
            }
        }
    }

    private boolean m0(View view, View view2) {
        if (!this.O) {
            return true;
        }
        k6 x = x(view, true);
        if (x == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == x.b) {
            return true;
        }
        return false;
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
    }

    @Override // defpackage.e6
    public Animator o(ViewGroup viewGroup, k6 k6Var, k6 k6Var2) {
        int i2;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator2;
        if (k6Var == null || k6Var2 == null) {
            return null;
        }
        Map<String, Object> map = k6Var.a;
        Map<String, Object> map2 = k6Var2.a;
        String r5 = C0201.m82(23179);
        ViewGroup viewGroup2 = (ViewGroup) map.get(r5);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(r5);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = k6Var2.b;
        if (m0(viewGroup2, viewGroup3)) {
            Map<String, Object> map3 = k6Var.a;
            String r52 = C0201.m82(23180);
            Rect rect2 = (Rect) map3.get(r52);
            Rect rect3 = (Rect) k6Var2.a.get(r52);
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Map<String, Object> map4 = k6Var.a;
            String r9 = C0201.m82(23181);
            Rect rect4 = (Rect) map4.get(r9);
            Rect rect5 = (Rect) k6Var2.a.get(r9);
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            if (!this.N) {
                view = view2;
                v6.g(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        animator = v5.a(view, V, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = v5.a(kVar, R, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                        ObjectAnimator a3 = v5.a(kVar, S, z().a((float) i8, (float) i10, (float) i9, (float) i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a2, a3);
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    animator = v5.a(view, T, z().a((float) i8, (float) i10, (float) i9, (float) i11));
                } else {
                    animator = v5.a(view, U, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                }
            } else {
                view = view2;
                v6.g(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                if (i4 == i5 && i6 == i7) {
                    objectAnimator = null;
                } else {
                    objectAnimator = v5.a(view, V, z().a((float) i4, (float) i6, (float) i5, (float) i7));
                }
                if (rect4 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                if (!rect.equals(rect6)) {
                    k3.n0(view, rect);
                    a6 a6Var = W;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, C0201.m82(23182), a6Var, objArr);
                    ofObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = j6.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                q6.d(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        Map<String, Object> map5 = k6Var.a;
        String r3 = C0201.m82(23183);
        int intValue = ((Integer) map5.get(r3)).intValue();
        Map<String, Object> map6 = k6Var.a;
        String r4 = C0201.m82(23184);
        int intValue2 = ((Integer) map6.get(r4)).intValue();
        int intValue3 = ((Integer) k6Var2.a.get(r3)).intValue();
        int intValue4 = ((Integer) k6Var2.a.get(r4)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.M);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c2 = v6.c(view2);
        v6.h(view2, 0.0f);
        v6.b(viewGroup).a(bitmapDrawable);
        w5 z = z();
        int[] iArr = this.M;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, y5.a(Q, z.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c2));
        return ofPropertyValuesHolder;
    }
}
