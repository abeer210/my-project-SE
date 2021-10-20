package defpackage;

import vigqyno.C0201;

/* renamed from: u0  reason: default package */
/* compiled from: LongSparseArray */
public class u0<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private long[] b;
    private Object[] c;
    private int d;

    public u0() {
        this(10);
    }

    private void f() {
        int i = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public void a(long j, E e2) {
        int i = this.d;
        if (i == 0 || j > this.b[i - 1]) {
            if (this.a && this.d >= this.b.length) {
                f();
            }
            int i2 = this.d;
            if (i2 >= this.b.length) {
                int f = t0.f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = jArr;
                this.c = objArr;
            }
            this.b[i2] = j;
            this.c[i2] = e2;
            this.d = i2 + 1;
            return;
        }
        m(j, e2);
    }

    public void b() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* renamed from: c */
    public u0<E> clone() {
        try {
            u0<E> u0Var = (u0) super.clone();
            u0Var.b = (long[]) this.b.clone();
            u0Var.c = (Object[]) this.c.clone();
            return u0Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean d(long j) {
        return j(j) >= 0;
    }

    @Deprecated
    public void e(long j) {
        n(j);
    }

    public E g(long j) {
        return i(j, null);
    }

    public E i(long j, E e2) {
        int b2 = t0.b(this.b, this.d, j);
        if (b2 >= 0) {
            Object[] objArr = this.c;
            if (objArr[b2] != e) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public int j(long j) {
        if (this.a) {
            f();
        }
        return t0.b(this.b, this.d, j);
    }

    public long l(int i) {
        if (this.a) {
            f();
        }
        return this.b[i];
    }

    public void m(long j, E e2) {
        int b2 = t0.b(this.b, this.d, j);
        if (b2 >= 0) {
            this.c[b2] = e2;
            return;
        }
        int i = b2 ^ -1;
        if (i < this.d) {
            Object[] objArr = this.c;
            if (objArr[i] == e) {
                this.b[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.a && this.d >= this.b.length) {
            f();
            i = t0.b(this.b, this.d, j) ^ -1;
        }
        int i2 = this.d;
        if (i2 >= this.b.length) {
            int f = t0.f(i2 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i3 = this.d;
        if (i3 - i != 0) {
            long[] jArr3 = this.b;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i4, this.d - i);
        }
        this.b[i] = j;
        this.c[i] = e2;
        this.d++;
    }

    public void n(long j) {
        Object[] objArr;
        Object obj;
        int b2 = t0.b(this.b, this.d, j);
        if (b2 >= 0 && (objArr = this.c)[b2] != (obj = e)) {
            objArr[b2] = obj;
            this.a = true;
        }
    }

    public void o(int i) {
        Object[] objArr = this.c;
        Object obj = objArr[i];
        Object obj2 = e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public int q() {
        if (this.a) {
            f();
        }
        return this.d;
    }

    public E s(int i) {
        if (this.a) {
            f();
        }
        return (E) this.c[i];
    }

    public String toString() {
        if (q() <= 0) {
            return C0201.m82(5790);
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(C0201.m82(5791));
            }
            sb.append(l(i));
            sb.append('=');
            E s = s(i);
            if (s != this) {
                sb.append((Object) s);
            } else {
                sb.append(C0201.m82(5792));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public u0(int i) {
        this.a = false;
        if (i == 0) {
            this.b = t0.b;
            this.c = t0.c;
            return;
        }
        int f = t0.f(i);
        this.b = new long[f];
        this.c = new Object[f];
    }
}
