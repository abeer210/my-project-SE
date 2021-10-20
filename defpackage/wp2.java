package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.wp2;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: wp2  reason: default package */
/* compiled from: GestureHandler */
public class wp2<T extends wp2> {
    private static short A;
    private static int x;
    private static MotionEvent.PointerProperties[] y;
    private static MotionEvent.PointerCoords[] z;
    private final int[] a = new int[x];
    private int b = 0;
    private int c;
    private View d;
    private int e = 0;
    private float f;
    private float g;
    private boolean h;
    private boolean i = true;
    private float[] j;
    private short k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private int q = 0;
    private yp2 r;
    private dq2<T> s;
    private xp2 t;
    public int u;
    public boolean v;
    public boolean w;

    /* renamed from: wp2$a */
    /* compiled from: GestureHandler */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            wp2.this.d();
        }
    }

    static {
        C0201.m83(wp2.class, 313);
    }

    private boolean A(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.b) {
            return true;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                return false;
            }
            if (iArr[i2] != -1 && iArr[i2] != i2) {
                return true;
            }
            i2++;
        }
    }

    private MotionEvent b(MotionEvent motionEvent) {
        int i2;
        if (!A(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 2;
        int i4 = 5;
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            if (this.a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.b == 1) {
                    i4 = 0;
                }
                i3 = i4;
            }
            i2 = actionIndex;
            actionMasked = i3;
        } else {
            int i5 = 6;
            if (actionMasked == 1 || actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (this.a[motionEvent.getPointerId(actionIndex2)] != -1) {
                    if (this.b == 1) {
                        i5 = 1;
                    }
                    i2 = actionIndex2;
                    actionMasked = i5;
                } else {
                    i2 = actionIndex2;
                    actionMasked = 2;
                }
            } else {
                i2 = -1;
            }
        }
        v(this.b);
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        int pointerCount = motionEvent.getPointerCount();
        int i6 = actionMasked;
        int i7 = 0;
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int pointerId = motionEvent.getPointerId(i8);
            if (this.a[pointerId] != -1) {
                motionEvent.getPointerProperties(i8, y[i7]);
                y[i7].id = this.a[pointerId];
                motionEvent.getPointerCoords(i8, z[i7]);
                if (i8 == i2) {
                    i6 |= i7 << 8;
                }
                i7++;
            }
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i6, i7, y, z, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        motionEvent.setLocation(x2, y2);
        obtain.setLocation(x2, y2);
        return obtain;
    }

    private int i() {
        int i2 = 0;
        while (i2 < this.b) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i3 < iArr.length && iArr[i3] != i2) {
                    i3++;
                }
            }
            if (i3 == this.a.length) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private static boolean u(float f2) {
        return !Float.isNaN(f2);
    }

    private static void v(int i2) {
        if (y == null) {
            int i3 = x;
            y = new MotionEvent.PointerProperties[i3];
            z = new MotionEvent.PointerCoords[i3];
        }
        while (i2 > 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = y;
            int i4 = i2 - 1;
            if (pointerPropertiesArr[i4] == null) {
                pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
                z[i4] = new MotionEvent.PointerCoords();
                i2--;
            } else {
                return;
            }
        }
    }

    private void z(int i2) {
        UiThreadUtil.assertOnUiThread();
        int i3 = this.e;
        if (i3 != i2) {
            this.e = i2;
            if (i2 == 4) {
                short s2 = A;
                A = (short) (s2 + 1);
                this.k = s2;
            }
            this.r.r(this, i2, i3);
            E(i2, i3);
        }
    }

    public void B() {
    }

    public void C(MotionEvent motionEvent) {
        z(1);
    }

    public void D() {
    }

    public void E(int i2, int i3) {
    }

    public final void F(View view, yp2 yp2) {
        if (this.d == null && this.r == null) {
            Arrays.fill(this.a, -1);
            this.b = 0;
            this.e = 0;
            this.d = view;
            this.r = yp2;
            return;
        }
        throw new IllegalStateException(C0201.m82(35244));
    }

    public final void G() {
        this.d = null;
        this.r = null;
        Arrays.fill(this.a, -1);
        this.b = 0;
        D();
    }

    public T H(boolean z2) {
        if (this.d != null) {
            UiThreadUtil.runOnUiThread(new a());
        }
        this.i = z2;
        return this;
    }

    public T I(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.j == null) {
            this.j = new float[6];
        }
        float[] fArr = this.j;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        if (u(f6) && u(f2) && u(f4)) {
            throw new IllegalArgumentException(C0201.m82(35245));
        } else if (u(f6) && !u(f2) && !u(f4)) {
            throw new IllegalArgumentException(C0201.m82(35246));
        } else if (u(f7) && u(f5) && u(f3)) {
            throw new IllegalArgumentException(C0201.m82(35247));
        } else if (!u(f7) || u(f5) || u(f3)) {
            return this;
        } else {
            throw new IllegalArgumentException(C0201.m82(35248));
        }
    }

    public T J(xp2 xp2) {
        this.t = xp2;
        return this;
    }

    public wp2 K(dq2<T> dq2) {
        this.s = dq2;
        return this;
    }

    public T L(boolean z2) {
        this.p = z2;
        return this;
    }

    public void M(int i2) {
        this.c = i2;
    }

    public boolean N(wp2 wp2) {
        xp2 xp2;
        if (wp2 == this || (xp2 = this.t) == null) {
            return false;
        }
        return xp2.a(this, wp2);
    }

    public boolean O(wp2 wp2) {
        if (wp2 == this) {
            return true;
        }
        xp2 xp2 = this.t;
        if (xp2 != null) {
            return xp2.b(this, wp2);
        }
        return false;
    }

    public boolean P(wp2 wp2) {
        xp2 xp2;
        if (wp2 == this || (xp2 = this.t) == null) {
            return false;
        }
        return xp2.d(this, wp2);
    }

    public boolean Q(wp2 wp2) {
        xp2 xp2;
        if (wp2 == this || (xp2 = this.t) == null) {
            return false;
        }
        return xp2.c(this, wp2);
    }

    public void R(int i2) {
        int[] iArr = this.a;
        if (iArr[i2] == -1) {
            iArr[i2] = i();
            this.b++;
        }
    }

    public void S(int i2) {
        int[] iArr = this.a;
        if (iArr[i2] != -1) {
            iArr[i2] = -1;
            this.b--;
        }
    }

    public boolean T() {
        int i2;
        return (!this.i || (i2 = this.e) == 1 || i2 == 3 || i2 == 5 || this.b <= 0) ? false : true;
    }

    public final void a() {
        int i2 = this.e;
        if (i2 == 0 || i2 == 2) {
            z(4);
        }
    }

    public final void c() {
        if (this.e == 0) {
            z(2);
        }
    }

    public final void d() {
        int i2 = this.e;
        if (i2 == 4 || i2 == 0 || i2 == 2) {
            B();
            z(3);
        }
    }

    public void e(int i2, int i3) {
        dq2<T> dq2 = this.s;
        if (dq2 != null) {
            dq2.a(this, i2, i3);
        }
    }

    public void f(MotionEvent motionEvent) {
        dq2<T> dq2 = this.s;
        if (dq2 != null) {
            dq2.b(this, motionEvent);
        }
    }

    public final void g() {
        int i2 = this.e;
        if (i2 == 2 || i2 == 4) {
            z(5);
        }
    }

    public final void h() {
        int i2 = this.e;
        if (i2 == 4 || i2 == 0 || i2 == 2) {
            z(1);
        }
    }

    public short j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.m;
    }

    public float m() {
        return this.l - this.n;
    }

    public float n() {
        return this.m - this.o;
    }

    public int o() {
        return this.q;
    }

    public int p() {
        return this.e;
    }

    public int q() {
        return this.c;
    }

    public View r() {
        return this.d;
    }

    public final void s(MotionEvent motionEvent) {
        int i2;
        if (this.i && (i2 = this.e) != 3 && i2 != 1 && i2 != 5 && this.b >= 1) {
            MotionEvent b2 = b(motionEvent);
            this.f = b2.getX();
            this.g = b2.getY();
            this.q = b2.getPointerCount();
            boolean y2 = y(this.d, this.f, this.g);
            this.h = y2;
            if (!this.p || y2) {
                this.l = aq2.a(b2, true);
                this.m = aq2.b(b2, true);
                this.n = b2.getRawX() - b2.getX();
                this.o = b2.getRawY() - b2.getY();
                C(b2);
                if (b2 != motionEvent) {
                    b2.recycle();
                    return;
                }
                return;
            }
            int i3 = this.e;
            if (i3 == 4) {
                d();
            } else if (i3 == 2) {
                h();
            }
        }
    }

    public boolean t(wp2 wp2) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                return false;
            }
            if (iArr[i2] != -1 && wp2.a[i2] != -1) {
                return true;
            }
            i2++;
        }
    }

    public String toString() {
        View view = this.d;
        String simpleName = view == null ? null : view.getClass().getSimpleName();
        return getClass().getSimpleName() + C0201.m82(35249) + this.c + C0201.m82(35250) + simpleName;
    }

    public boolean w() {
        return this.i;
    }

    public boolean x() {
        return this.h;
    }

    public boolean y(View view, float f2, float f3) {
        float f4;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float[] fArr = this.j;
        float f5 = 0.0f;
        if (fArr != null) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = fArr[3];
            float f10 = u(f6) ? 0.0f - f6 : 0.0f;
            if (u(f7)) {
                f5 = 0.0f - f7;
            }
            if (u(f8)) {
                width += f8;
            }
            if (u(f9)) {
                height += f9;
            }
            float[] fArr2 = this.j;
            float f11 = fArr2[4];
            float f12 = fArr2[5];
            if (u(f11)) {
                if (!u(f6)) {
                    f10 = width - f11;
                } else if (!u(f8)) {
                    width = f11 + f10;
                }
            }
            if (u(f12)) {
                if (!u(f7)) {
                    f5 = height - f12;
                } else if (!u(f9)) {
                    height = f5 + f12;
                }
            }
            f4 = f5;
            f5 = f10;
        } else {
            f4 = 0.0f;
        }
        if (f2 < f5 || f2 > width || f3 < f4 || f3 > height) {
            return false;
        }
        return true;
    }
}
