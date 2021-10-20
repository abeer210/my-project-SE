package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: BasePool */
public abstract class a<V> implements o60<V> {
    private final Class<?> a = getClass();
    public final m60 b;
    public final g0 c;
    public final SparseArray<f<V>> d;
    public final Set<V> e;
    private boolean f;
    public final C0037a g;
    public final C0037a h;
    private final h0 i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    /* compiled from: BasePool */
    public static class C0037a {
        public int a;
        public int b;

        public void a(int i) {
            int i2;
            int i3 = this.b;
            if (i3 < i || (i2 = this.a) <= 0) {
                f60.H(C0201.m82(8237), C0201.m82(8238), Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(this.a));
                return;
            }
            this.a = i2 - 1;
            this.b = i3 - i;
        }

        public void b(int i) {
            this.a++;
            this.b += i;
        }
    }

    /* compiled from: BasePool */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super(C0201.m82(9112) + obj.toString());
        }
    }

    /* compiled from: BasePool */
    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super(C0201.m82(9062) + i + C0201.m82(9063) + i2 + C0201.m82(9064) + i3 + C0201.m82(9065) + i4);
        }
    }

    public a(m60 m60, g0 g0Var, h0 h0Var) {
        z50.g(m60);
        this.b = m60;
        z50.g(g0Var);
        this.c = g0Var;
        z50.g(h0Var);
        this.i = h0Var;
        this.d = new SparseArray<>();
        if (this.c.d) {
            m();
        } else {
            q(new SparseIntArray(0));
        }
        this.e = b60.b();
        this.h = new C0037a();
        this.g = new C0037a();
    }

    private synchronized void d() {
        boolean z;
        if (o()) {
            if (this.h.b != 0) {
                z = false;
                z50.i(z);
            }
        }
        z = true;
        z50.i(z);
    }

    private void e(SparseIntArray sparseIntArray) {
        this.d.clear();
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            int keyAt = sparseIntArray.keyAt(i2);
            this.d.put(keyAt, new f<>(k(keyAt), sparseIntArray.valueAt(i2), 0, this.c.d));
        }
    }

    private synchronized f<V> h(int i2) {
        return this.d.get(i2);
    }

    private synchronized void m() {
        SparseIntArray sparseIntArray = this.c.c;
        if (sparseIntArray != null) {
            e(sparseIntArray);
            this.f = false;
        } else {
            this.f = true;
        }
    }

    private synchronized void q(SparseIntArray sparseIntArray) {
        z50.g(sparseIntArray);
        this.d.clear();
        SparseIntArray sparseIntArray2 = this.c.c;
        if (sparseIntArray2 != null) {
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int keyAt = sparseIntArray2.keyAt(i2);
                this.d.put(keyAt, new f<>(k(keyAt), sparseIntArray2.valueAt(i2), sparseIntArray.get(keyAt, 0), this.c.d));
            }
            this.f = false;
        } else {
            this.f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void r() {
        if (f60.o(2)) {
            f60.t(this.a, C0201.m82(36803), Integer.valueOf(this.g.a), Integer.valueOf(this.g.b), Integer.valueOf(this.h.a), Integer.valueOf(this.h.b));
        }
    }

    @Override // defpackage.x60, defpackage.o60
    public void a(V v) {
        z50.g(v);
        int j = j(v);
        int k = k(j);
        synchronized (this) {
            f<V> h2 = h(j);
            if (!this.e.remove(v)) {
                f60.g(this.a, C0201.m82(36804), Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(j));
                f(v);
                this.i.e(k);
            } else {
                if (h2 != null && !h2.f() && !o()) {
                    if (p(v)) {
                        h2.h(v);
                        this.h.b(k);
                        this.g.a(k);
                        this.i.g(k);
                        if (f60.o(2)) {
                            f60.r(this.a, C0201.m82(36805), Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(j));
                        }
                    }
                }
                if (h2 != null) {
                    h2.b();
                }
                if (f60.o(2)) {
                    f60.r(this.a, C0201.m82(36806), Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(j));
                }
                f(v);
                this.g.a(k);
                this.i.e(k);
            }
            r();
        }
    }

    public abstract V b(int i2);

    public synchronized boolean c(int i2) {
        int i3 = this.c.a;
        if (i2 > i3 - this.g.b) {
            this.i.f();
            return false;
        }
        int i4 = this.c.b;
        if (i2 > i4 - (this.g.b + this.h.b)) {
            t(i4 - i2);
        }
        if (i2 <= i3 - (this.g.b + this.h.b)) {
            return true;
        }
        this.i.f();
        return false;
    }

    public abstract void f(V v);

    public synchronized f<V> g(int i2) {
        f<V> fVar = this.d.get(i2);
        if (fVar == null) {
            if (this.f) {
                if (f60.o(2)) {
                    f60.q(this.a, C0201.m82(36807), Integer.valueOf(i2));
                }
                f<V> s = s(i2);
                this.d.put(i2, s);
                return s;
            }
        }
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.g.a(r2);
        r4 = g(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r4 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        defpackage.e60.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        defpackage.z50.i(r6.e.add(r0));
        u();
        r6.i.a(r2);
        r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        if (defpackage.f60.o(2) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        defpackage.f60.r(r6.a, vigqyno.C0201.m82(36809), java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        return r0;
     */
    @Override // defpackage.o60
    public V get(int i2) {
        V l;
        d();
        int i3 = i(i2);
        synchronized (this) {
            f<V> g2 = g(i3);
            if (g2 == null || (l = l(g2)) == null) {
                int k = k(i3);
                if (c(k)) {
                    this.g.b(k);
                    if (g2 != null) {
                        g2.e();
                    }
                } else {
                    throw new c(this.c.a, this.g.b, this.h.b, k);
                }
            } else {
                z50.i(this.e.add(l));
                int j = j(l);
                int k2 = k(j);
                this.g.b(k2);
                this.h.a(k2);
                this.i.b(k2);
                r();
                if (f60.o(2)) {
                    f60.r(this.a, C0201.m82(36808), Integer.valueOf(System.identityHashCode(l)), Integer.valueOf(j));
                }
                return l;
            }
        }
    }

    public abstract int i(int i2);

    public abstract int j(V v);

    public abstract int k(int i2);

    public synchronized V l(f<V> fVar) {
        return fVar.c();
    }

    public void n() {
        this.b.a(this);
        this.i.c(this);
    }

    public synchronized boolean o() {
        boolean z;
        z = this.g.b + this.h.b > this.c.b;
        if (z) {
            this.i.d();
        }
        return z;
    }

    public boolean p(V v) {
        z50.g(v);
        return true;
    }

    public f<V> s(int i2) {
        return new f<>(k(i2), C0188.f24, 0, this.c.d);
    }

    public synchronized void t(int i2) {
        int min = Math.min((this.g.b + this.h.b) - i2, this.h.b);
        if (min > 0) {
            if (f60.o(2)) {
                f60.s(this.a, C0201.m82(36810), Integer.valueOf(i2), Integer.valueOf(this.g.b + this.h.b), Integer.valueOf(min));
            }
            r();
            for (int i3 = 0; i3 < this.d.size() && min > 0; i3++) {
                f<V> valueAt = this.d.valueAt(i3);
                while (min > 0) {
                    V g2 = valueAt.g();
                    if (g2 == null) {
                        break;
                    }
                    f(g2);
                    min -= valueAt.a;
                    this.h.a(valueAt.a);
                }
            }
            r();
            if (f60.o(2)) {
                f60.r(this.a, C0201.m82(36811), Integer.valueOf(i2), Integer.valueOf(this.g.b + this.h.b));
            }
        }
    }

    public synchronized void u() {
        if (o()) {
            t(this.c.b);
        }
    }
}
