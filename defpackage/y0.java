package defpackage;

import vigqyno.C0201;

/* renamed from: y0  reason: default package */
/* compiled from: SparseArrayCompat */
public class y0<E> implements Cloneable {
    private static final Object e = new Object();
    private boolean a;
    private int[] b;
    private Object[] c;
    private int d;

    public y0() {
        this(10);
    }

    private void d() {
        int i = this.d;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public void a(int i, E e2) {
        int i2 = this.d;
        if (i2 == 0 || i > this.b[i2 - 1]) {
            if (this.a && this.d >= this.b.length) {
                d();
            }
            int i3 = this.d;
            if (i3 >= this.b.length) {
                int e3 = t0.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = iArr;
                this.c = objArr;
            }
            this.b[i3] = i;
            this.c[i3] = e2;
            this.d = i3 + 1;
            return;
        }
        l(i, e2);
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
    public y0<E> clone() {
        try {
            y0<E> y0Var = (y0) super.clone();
            y0Var.b = (int[]) this.b.clone();
            y0Var.c = (Object[]) this.c.clone();
            return y0Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(int i) {
        return f(i, null);
    }

    public E f(int i, E e2) {
        int a2 = t0.a(this.b, this.d, i);
        if (a2 >= 0) {
            Object[] objArr = this.c;
            if (objArr[a2] != e) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int g(int i) {
        if (this.a) {
            d();
        }
        return t0.a(this.b, this.d, i);
    }

    public int i(E e2) {
        if (this.a) {
            d();
        }
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int j(int i) {
        if (this.a) {
            d();
        }
        return this.b[i];
    }

    public void l(int i, E e2) {
        int a2 = t0.a(this.b, this.d, i);
        if (a2 >= 0) {
            this.c[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 < this.d) {
            Object[] objArr = this.c;
            if (objArr[i2] == e) {
                this.b[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.a && this.d >= this.b.length) {
            d();
            i2 = t0.a(this.b, this.d, i) ^ -1;
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int e3 = t0.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = iArr;
            this.c = objArr2;
        }
        int i4 = this.d;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.b;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i2, objArr4, i5, this.d - i2);
        }
        this.b[i2] = i;
        this.c[i2] = e2;
        this.d++;
    }

    public void m(int i) {
        Object[] objArr;
        Object obj;
        int a2 = t0.a(this.b, this.d, i);
        if (a2 >= 0 && (objArr = this.c)[a2] != (obj = e)) {
            objArr[a2] = obj;
            this.a = true;
        }
    }

    public int n() {
        if (this.a) {
            d();
        }
        return this.d;
    }

    public E o(int i) {
        if (this.a) {
            d();
        }
        return (E) this.c[i];
    }

    public String toString() {
        if (n() <= 0) {
            return C0201.m82(15241);
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(C0201.m82(15242));
            }
            sb.append(j(i));
            sb.append('=');
            E o = o(i);
            if (o != this) {
                sb.append((Object) o);
            } else {
                sb.append(C0201.m82(15243));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public y0(int i) {
        this.a = false;
        if (i == 0) {
            this.b = t0.a;
            this.c = t0.c;
            return;
        }
        int e2 = t0.e(i);
        this.b = new int[e2];
        this.c = new Object[e2];
    }
}
