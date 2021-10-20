package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import defpackage.vn;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: vn  reason: default package */
/* compiled from: BaseRequestOptions */
public abstract class vn<T extends vn<T>> implements Cloneable {
    private boolean A;
    private boolean B = true;
    private boolean C;
    private int a;
    private float b = 1.0f;
    private vh c = vh.c;
    private g d = g.NORMAL;
    private Drawable e;
    private int f;
    private Drawable g;
    private int h;
    private boolean i = true;
    private int j = -1;
    private int k = -1;
    private com.bumptech.glide.load.g l = to.c();
    private boolean m;
    private boolean n = true;
    private Drawable o;
    private int p;
    private i q = new i();
    private Map<Class<?>, m<?>> u = new wo();
    private Class<?> v = Object.class;
    private boolean w;
    private Resources.Theme x;
    private boolean y;
    private boolean z;

    private boolean J(int i2) {
        return K(this.a, i2);
    }

    private static boolean K(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private T U(el elVar, m<Bitmap> mVar) {
        return Z(elVar, mVar, false);
    }

    private T Z(el elVar, m<Bitmap> mVar, boolean z2) {
        T t;
        if (z2) {
            t = j0(elVar, mVar);
        } else {
            t = V(elVar, mVar);
        }
        t.B = true;
        return t;
    }

    private T a0() {
        return this;
    }

    private T b0() {
        if (!this.w) {
            a0();
            return this;
        }
        throw new IllegalStateException(C0201.m82(12989));
    }

    public final Map<Class<?>, m<?>> B() {
        return this.u;
    }

    public final boolean C() {
        return this.C;
    }

    public final boolean D() {
        return this.z;
    }

    public final boolean F() {
        return this.i;
    }

    public final boolean G() {
        return J(8);
    }

    public boolean I() {
        return this.B;
    }

    public final boolean L() {
        return this.n;
    }

    public final boolean M() {
        return this.m;
    }

    public final boolean N() {
        return J(2048);
    }

    public final boolean O() {
        return fp.r(this.k, this.j);
    }

    public T P() {
        this.w = true;
        a0();
        return this;
    }

    public T Q(boolean z2) {
        if (this.y) {
            return (T) clone().Q(z2);
        }
        this.A = z2;
        this.a |= 524288;
        b0();
        return this;
    }

    public T R() {
        return V(el.c, new bl());
    }

    public T S() {
        return U(el.b, new cl());
    }

    public T T() {
        return U(el.a, new jl());
    }

    public final T V(el elVar, m<Bitmap> mVar) {
        if (this.y) {
            return (T) clone().V(elVar, mVar);
        }
        f(elVar);
        return i0(mVar, false);
    }

    public T W(int i2, int i3) {
        if (this.y) {
            return (T) clone().W(i2, i3);
        }
        this.k = i2;
        this.j = i3;
        this.a |= 512;
        b0();
        return this;
    }

    public T X(Drawable drawable) {
        if (this.y) {
            return (T) clone().X(drawable);
        }
        this.g = drawable;
        int i2 = this.a | 64;
        this.a = i2;
        this.h = 0;
        this.a = i2 & -129;
        b0();
        return this;
    }

    public T Y(g gVar) {
        if (this.y) {
            return (T) clone().Y(gVar);
        }
        ep.d(gVar);
        this.d = gVar;
        this.a |= 8;
        b0();
        return this;
    }

    public T a(vn<?> vnVar) {
        if (this.y) {
            return (T) clone().a(vnVar);
        }
        if (K(vnVar.a, 2)) {
            this.b = vnVar.b;
        }
        if (K(vnVar.a, 262144)) {
            this.z = vnVar.z;
        }
        if (K(vnVar.a, 1048576)) {
            this.C = vnVar.C;
        }
        if (K(vnVar.a, 4)) {
            this.c = vnVar.c;
        }
        if (K(vnVar.a, 8)) {
            this.d = vnVar.d;
        }
        if (K(vnVar.a, 16)) {
            this.e = vnVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (K(vnVar.a, 32)) {
            this.f = vnVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (K(vnVar.a, 64)) {
            this.g = vnVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (K(vnVar.a, 128)) {
            this.h = vnVar.h;
            this.g = null;
            this.a &= -65;
        }
        if (K(vnVar.a, 256)) {
            this.i = vnVar.i;
        }
        if (K(vnVar.a, 512)) {
            this.k = vnVar.k;
            this.j = vnVar.j;
        }
        if (K(vnVar.a, 1024)) {
            this.l = vnVar.l;
        }
        if (K(vnVar.a, 4096)) {
            this.v = vnVar.v;
        }
        if (K(vnVar.a, 8192)) {
            this.o = vnVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (K(vnVar.a, 16384)) {
            this.p = vnVar.p;
            this.o = null;
            this.a &= -8193;
        }
        if (K(vnVar.a, 32768)) {
            this.x = vnVar.x;
        }
        if (K(vnVar.a, 65536)) {
            this.n = vnVar.n;
        }
        if (K(vnVar.a, 131072)) {
            this.m = vnVar.m;
        }
        if (K(vnVar.a, 2048)) {
            this.u.putAll(vnVar.u);
            this.B = vnVar.B;
        }
        if (K(vnVar.a, 524288)) {
            this.A = vnVar.A;
        }
        if (!this.n) {
            this.u.clear();
            int i2 = this.a & -2049;
            this.a = i2;
            this.m = false;
            this.a = i2 & -131073;
            this.B = true;
        }
        this.a |= vnVar.a;
        this.q.d(vnVar.q);
        b0();
        return this;
    }

    public T b() {
        if (!this.w || this.y) {
            this.y = true;
            return P();
        }
        throw new IllegalStateException(C0201.m82(12990));
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t = (T) ((vn) super.clone());
            i iVar = new i();
            t.q = iVar;
            iVar.d(this.q);
            wo woVar = new wo();
            t.u = woVar;
            woVar.putAll(this.u);
            t.w = false;
            t.y = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public <Y> T c0(h<Y> hVar, Y y2) {
        if (this.y) {
            return (T) clone().c0(hVar, y2);
        }
        ep.d(hVar);
        ep.d(y2);
        this.q.e(hVar, y2);
        b0();
        return this;
    }

    public T d(Class<?> cls) {
        if (this.y) {
            return (T) clone().d(cls);
        }
        ep.d(cls);
        this.v = cls;
        this.a |= 4096;
        b0();
        return this;
    }

    public T d0(com.bumptech.glide.load.g gVar) {
        if (this.y) {
            return (T) clone().d0(gVar);
        }
        ep.d(gVar);
        this.l = gVar;
        this.a |= 1024;
        b0();
        return this;
    }

    public T e(vh vhVar) {
        if (this.y) {
            return (T) clone().e(vhVar);
        }
        ep.d(vhVar);
        this.c = vhVar;
        this.a |= 4;
        b0();
        return this;
    }

    public T e0(float f2) {
        if (this.y) {
            return (T) clone().e0(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException(C0201.m82(12991));
        }
        this.b = f2;
        this.a |= 2;
        b0();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vn)) {
            return false;
        }
        vn vnVar = (vn) obj;
        if (Float.compare(vnVar.b, this.b) == 0 && this.f == vnVar.f && fp.c(this.e, vnVar.e) && this.h == vnVar.h && fp.c(this.g, vnVar.g) && this.p == vnVar.p && fp.c(this.o, vnVar.o) && this.i == vnVar.i && this.j == vnVar.j && this.k == vnVar.k && this.m == vnVar.m && this.n == vnVar.n && this.z == vnVar.z && this.A == vnVar.A && this.c.equals(vnVar.c) && this.d == vnVar.d && this.q.equals(vnVar.q) && this.u.equals(vnVar.u) && this.v.equals(vnVar.v) && fp.c(this.l, vnVar.l) && fp.c(this.x, vnVar.x)) {
            return true;
        }
        return false;
    }

    public T f(el elVar) {
        ep.d(elVar);
        return c0((h<Y>) el.f, elVar);
    }

    public T f0(boolean z2) {
        if (this.y) {
            return (T) clone().f0(true);
        }
        this.i = !z2;
        this.a |= 256;
        b0();
        return this;
    }

    public final vh g() {
        return this.c;
    }

    public T h0(m<Bitmap> mVar) {
        return i0(mVar, true);
    }

    public int hashCode() {
        return fp.m(this.x, fp.m(this.l, fp.m(this.v, fp.m(this.u, fp.m(this.q, fp.m(this.d, fp.m(this.c, fp.n(this.A, fp.n(this.z, fp.n(this.n, fp.n(this.m, fp.l(this.k, fp.l(this.j, fp.n(this.i, fp.m(this.o, fp.l(this.p, fp.m(this.g, fp.l(this.h, fp.m(this.e, fp.l(this.f, fp.j(this.b)))))))))))))))))))));
    }

    public final int i() {
        return this.f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bumptech.glide.load.m<android.graphics.Bitmap> */
    /* JADX WARN: Multi-variable type inference failed */
    public T i0(m<Bitmap> mVar, boolean z2) {
        if (this.y) {
            return (T) clone().i0(mVar, z2);
        }
        hl hlVar = new hl(mVar, z2);
        l0(Bitmap.class, mVar, z2);
        l0(Drawable.class, hlVar, z2);
        hlVar.c();
        l0(BitmapDrawable.class, hlVar, z2);
        l0(gm.class, new jm(mVar), z2);
        b0();
        return this;
    }

    public final Drawable j() {
        return this.e;
    }

    public final T j0(el elVar, m<Bitmap> mVar) {
        if (this.y) {
            return (T) clone().j0(elVar, mVar);
        }
        f(elVar);
        return h0(mVar);
    }

    public final Drawable l() {
        return this.o;
    }

    public <Y> T l0(Class<Y> cls, m<Y> mVar, boolean z2) {
        if (this.y) {
            return (T) clone().l0(cls, mVar, z2);
        }
        ep.d(cls);
        ep.d(mVar);
        this.u.put(cls, mVar);
        int i2 = this.a | 2048;
        this.a = i2;
        this.n = true;
        int i3 = i2 | 65536;
        this.a = i3;
        this.B = false;
        if (z2) {
            this.a = i3 | 131072;
            this.m = true;
        }
        b0();
        return this;
    }

    public final int m() {
        return this.p;
    }

    public T m0(boolean z2) {
        if (this.y) {
            return (T) clone().m0(z2);
        }
        this.C = z2;
        this.a |= 1048576;
        b0();
        return this;
    }

    public final boolean n() {
        return this.A;
    }

    public final i o() {
        return this.q;
    }

    public final int q() {
        return this.j;
    }

    public final int s() {
        return this.k;
    }

    public final Drawable t() {
        return this.g;
    }

    public final int u() {
        return this.h;
    }

    public final g v() {
        return this.d;
    }

    public final Class<?> w() {
        return this.v;
    }

    public final com.bumptech.glide.load.g x() {
        return this.l;
    }

    public final float y() {
        return this.b;
    }

    public final Resources.Theme z() {
        return this.x;
    }
}
