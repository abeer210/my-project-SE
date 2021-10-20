package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: yp2  reason: default package */
/* compiled from: GestureHandlerOrchestrator */
public class yp2 {
    private static final PointF o = new PointF();
    private static final float[] p = new float[2];
    private static final Matrix q = new Matrix();
    private static final float[] r = new float[2];
    private static final Comparator<wp2> s = new a();
    private final ViewGroup a;
    private final zp2 b;
    private final kq2 c;
    private final wp2[] d = new wp2[20];
    private final wp2[] e = new wp2[20];
    private final wp2[] f = new wp2[20];
    private final wp2[] g = new wp2[20];
    private int h = 0;
    private int i = 0;
    private boolean j = false;
    private int k = 0;
    private boolean l = false;
    private int m = 0;
    private float n = 0.0f;

    /* renamed from: yp2$a */
    /* compiled from: GestureHandlerOrchestrator */
    static class a implements Comparator<wp2> {
        /* renamed from: a */
        public int compare(wp2 wp2, wp2 wp22) {
            if ((wp2.v && wp22.v) || (wp2.w && wp22.w)) {
                return Integer.signum(wp22.u - wp2.u);
            }
            if (wp2.v) {
                return -1;
            }
            if (wp22.v) {
                return 1;
            }
            if (wp2.w) {
                return -1;
            }
            if (wp22.w) {
                return 1;
            }
            return 0;
        }
    }

    public yp2(ViewGroup viewGroup, zp2 zp2, kq2 kq2) {
        this.a = viewGroup;
        this.b = zp2;
        this.c = kq2;
    }

    private static void A(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f2 + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f3 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = p;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = q;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f4 = fArr[0];
            scrollY = fArr[1];
            scrollX = f4;
        }
        pointF.set(scrollX, scrollY);
    }

    private boolean B(View view, float[] fArr, int i2) {
        gq2 a2 = this.c.a(view);
        if (a2 == gq2.NONE) {
            return false;
        }
        if (a2 == gq2.BOX_ONLY) {
            if (u(view, fArr, i2) || z(view, fArr)) {
                return true;
            }
            return false;
        } else if (a2 == gq2.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return k((ViewGroup) view, fArr, i2);
            }
            return false;
        } else if (a2 == gq2.AUTO) {
            boolean k2 = view instanceof ViewGroup ? k((ViewGroup) view, fArr, i2) : false;
            if (u(view, fArr, i2) || k2 || z(view, fArr)) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException(C0201.m82(21300) + a2.toString());
        }
    }

    private void C(wp2 wp2) {
        if (l(wp2)) {
            a(wp2);
            return;
        }
        q(wp2);
        wp2.w = false;
    }

    private void a(wp2 wp2) {
        int i2 = 0;
        while (true) {
            int i3 = this.i;
            if (i2 >= i3) {
                wp2[] wp2Arr = this.e;
                if (i3 < wp2Arr.length) {
                    this.i = i3 + 1;
                    wp2Arr[i3] = wp2;
                    wp2.w = true;
                    int i4 = this.m;
                    this.m = i4 + 1;
                    wp2.u = i4;
                    return;
                }
                throw new IllegalStateException(C0201.m82(21301));
            } else if (this.e[i2] != wp2) {
                i2++;
            } else {
                return;
            }
        }
    }

    private boolean b(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.n;
    }

    private static boolean c(wp2 wp2, wp2 wp22) {
        return wp2 == wp22 || wp2.O(wp22) || wp22.O(wp2);
    }

    private void d() {
        for (int i2 = this.i - 1; i2 >= 0; i2--) {
            this.e[i2].d();
        }
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f[i4] = this.d[i4];
        }
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            this.f[i5].d();
        }
    }

    private void e() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.i; i3++) {
            wp2[] wp2Arr = this.e;
            if (wp2Arr[i3].w) {
                wp2Arr[i2] = wp2Arr[i3];
                i2++;
            }
        }
        this.i = i2;
    }

    private void f() {
        boolean z = false;
        for (int i2 = this.h - 1; i2 >= 0; i2--) {
            wp2 wp2 = this.d[i2];
            if (n(wp2.p()) && !wp2.w) {
                this.d[i2] = null;
                wp2.G();
                wp2.v = false;
                wp2.w = false;
                wp2.u = C0188.f24;
                z = true;
            }
        }
        if (z) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.h; i4++) {
                wp2[] wp2Arr = this.d;
                if (wp2Arr[i4] != null) {
                    wp2Arr[i3] = wp2Arr[i4];
                    i3++;
                }
            }
            this.h = i3;
        }
        this.l = false;
    }

    private void g(wp2 wp2, MotionEvent motionEvent) {
        if (!p(wp2.r())) {
            wp2.d();
        } else if (wp2.T()) {
            int actionMasked = motionEvent.getActionMasked();
            if (!wp2.w || actionMasked != 2) {
                float[] fArr = r;
                i(wp2.r(), motionEvent, fArr);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                motionEvent.setLocation(fArr[0], fArr[1]);
                wp2.s(motionEvent);
                if (wp2.v) {
                    wp2.f(motionEvent);
                }
                motionEvent.setLocation(x, y);
                if (actionMasked == 1 || actionMasked == 6) {
                    wp2.S(motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
        }
    }

    private void i(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.a) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException(C0201.m82(21302));
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            i(viewGroup, motionEvent, fArr);
            PointF pointF = o;
            A(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    private void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        r[0] = motionEvent.getX(actionIndex);
        r[1] = motionEvent.getY(actionIndex);
        B(this.a, r, pointerId);
        k(this.a, r, pointerId);
    }

    private boolean k(ViewGroup viewGroup, float[] fArr, int i2) {
        boolean z;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View c2 = this.c.c(viewGroup, childCount);
            if (b(c2)) {
                PointF pointF = o;
                A(fArr[0], fArr[1], viewGroup, c2, pointF);
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (!m(c2) || o(fArr[0], fArr[1], c2)) {
                    z = B(c2, fArr, i2);
                } else {
                    z = false;
                }
                fArr[0] = f2;
                fArr[1] = f3;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean l(wp2 wp2) {
        for (int i2 = 0; i2 < this.h; i2++) {
            wp2 wp22 = this.d[i2];
            if (!n(wp22.p()) && y(wp2, wp22)) {
                return true;
            }
        }
        return false;
    }

    private boolean m(View view) {
        return !(view instanceof ViewGroup) || this.c.b((ViewGroup) view);
    }

    private static boolean n(int i2) {
        return i2 == 3 || i2 == 1 || i2 == 5;
    }

    private static boolean o(float f2, float f3, View view) {
        return f2 >= 0.0f && f2 <= ((float) view.getWidth()) && f3 >= 0.0f && f3 < ((float) view.getHeight());
    }

    private boolean p(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.a) {
            parent = parent.getParent();
        }
        if (parent == this.a) {
            return true;
        }
        return false;
    }

    private void q(wp2 wp2) {
        int p2 = wp2.p();
        wp2.w = false;
        wp2.v = true;
        int i2 = this.m;
        this.m = i2 + 1;
        wp2.u = i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.h; i4++) {
            wp2 wp22 = this.d[i4];
            if (x(wp22, wp2)) {
                this.g[i3] = wp22;
                i3++;
            }
        }
        for (int i5 = i3 - 1; i5 >= 0; i5--) {
            this.g[i5].d();
        }
        for (int i6 = this.i - 1; i6 >= 0; i6--) {
            wp2 wp23 = this.e[i6];
            if (x(wp23, wp2)) {
                wp23.d();
                wp23.w = false;
            }
        }
        e();
        wp2.e(4, 2);
        if (p2 != 4) {
            wp2.e(5, 4);
            if (p2 != 5) {
                wp2.e(0, 5);
            }
        }
    }

    private void t(wp2 wp2, View view) {
        int i2 = 0;
        while (true) {
            int i3 = this.h;
            if (i2 >= i3) {
                wp2[] wp2Arr = this.d;
                if (i3 < wp2Arr.length) {
                    this.h = i3 + 1;
                    wp2Arr[i3] = wp2;
                    wp2.v = false;
                    wp2.w = false;
                    wp2.u = C0188.f24;
                    wp2.F(view, this);
                    return;
                }
                throw new IllegalStateException(C0201.m82(21303));
            } else if (this.d[i2] != wp2) {
                i2++;
            } else {
                return;
            }
        }
    }

    private boolean u(View view, float[] fArr, int i2) {
        ArrayList<wp2> a2 = this.b.a(view);
        if (a2 == null) {
            return false;
        }
        int size = a2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            wp2 wp2 = a2.get(i3);
            if (wp2.w() && wp2.y(view, fArr[0], fArr[1])) {
                t(wp2, view);
                wp2.R(i2);
                z = true;
            }
        }
        return z;
    }

    private void v() {
        if (this.j || this.k != 0) {
            this.l = true;
        } else {
            f();
        }
    }

    private static boolean x(wp2 wp2, wp2 wp22) {
        if (!wp2.t(wp22) || c(wp2, wp22)) {
            return false;
        }
        if (wp2 == wp22) {
            return true;
        }
        if (wp2.w || wp2.p() == 4) {
            return wp2.N(wp22);
        }
        return true;
    }

    private static boolean y(wp2 wp2, wp2 wp22) {
        return wp2 != wp22 && (wp2.Q(wp22) || wp22.P(wp2));
    }

    private static boolean z(View view, float[] fArr) {
        if (!(!(view instanceof ViewGroup) || view.getBackground() != null) || !o(fArr[0], fArr[1], view)) {
            return false;
        }
        return true;
    }

    public void h(MotionEvent motionEvent) {
        int i2 = this.h;
        System.arraycopy(this.d, 0, this.f, 0, i2);
        Arrays.sort(this.f, 0, i2, s);
        for (int i3 = 0; i3 < i2; i3++) {
            g(this.f[i3], motionEvent);
        }
    }

    public void r(wp2 wp2, int i2, int i3) {
        this.k++;
        if (n(i2)) {
            for (int i4 = 0; i4 < this.i; i4++) {
                wp2 wp22 = this.e[i4];
                if (y(wp22, wp2)) {
                    if (i2 == 5) {
                        wp22.d();
                        wp22.w = false;
                    } else {
                        C(wp22);
                    }
                }
            }
            e();
        }
        if (i2 == 4) {
            C(wp2);
        } else if (i3 != 4 && i3 != 5) {
            wp2.e(i2, i3);
        } else if (wp2.v) {
            wp2.e(i2, i3);
        }
        this.k--;
        v();
    }

    public boolean s(MotionEvent motionEvent) {
        this.j = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            j(motionEvent);
        } else if (actionMasked == 3) {
            d();
        }
        h(motionEvent);
        this.j = false;
        if (this.l && this.k == 0) {
            f();
        }
        return true;
    }

    public void w(float f2) {
        this.n = f2;
    }
}
