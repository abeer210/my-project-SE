package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: x0  reason: default package */
/* compiled from: SimpleArrayMap */
public class x0<K, V> {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public int[] a;
    public Object[] b;
    public int c;

    public x0() {
        this.a = t0.a;
        this.b = t0.c;
        this.c = 0;
    }

    private void a(int i) {
        if (i == 8) {
            synchronized (x0.class) {
                if (f != null) {
                    Object[] objArr = f;
                    this.b = objArr;
                    f = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (x0.class) {
                if (d != null) {
                    Object[] objArr2 = d;
                    this.b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[(i << 1)];
    }

    private static int b(int[] iArr, int i, int i2) {
        try {
            return t0.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (x0.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (x0.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public void c(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            a(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.b, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.a;
            Object[] objArr = this.b;
            this.a = t0.a;
            this.b = t0.c;
            this.c = 0;
            d(iArr, objArr, i);
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.a, i2, i);
        if (b2 < 0 || obj.equals(this.b[b2 << 1])) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (obj.equals(this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && this.a[i4] == i) {
            if (obj.equals(this.b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (size() != x0Var.size()) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                try {
                    K i2 = i(i);
                    V m = m(i);
                    Object obj2 = x0Var.get(i2);
                    if (m == null) {
                        if (obj2 != null || !x0Var.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.c; i3++) {
                try {
                    K i4 = i(i3);
                    V m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int b2 = b(this.a, i, 0);
        if (b2 < 0 || this.b[b2 << 1] == null) {
            return b2;
        }
        int i2 = b2 + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b2 - 1;
        while (i3 >= 0 && this.a[i3] == 0) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.b[(f2 << 1) + 1] : v;
    }

    public int h(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public K i(int i) {
        return (K) this.b[i << 1];
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: x0<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void j(x0<? extends K, ? extends V> x0Var) {
        int i = x0Var.c;
        c(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(x0Var.i(i2), x0Var.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(x0Var.a, 0, this.a, 0, i);
            System.arraycopy(x0Var.b, 0, this.b, 0, i << 1);
            this.c = i;
        }
    }

    public V k(int i) {
        Object[] objArr = this.b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.c;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.a, objArr, i3);
            this.a = t0.a;
            this.b = t0.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.a;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.b;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.a;
                Object[] objArr4 = this.b;
                a(i6);
                if (i3 == this.c) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.a, 0, i);
                        System.arraycopy(objArr4, 0, this.b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.a, i, i11);
                        System.arraycopy(objArr4, i10 << 1, this.b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.c) {
            this.c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V m(int i) {
        return (V) this.b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.c;
        if (k == null) {
            i2 = g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.b;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.a.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.a;
            Object[] objArr2 = this.b;
            a(i6);
            if (i3 == this.c) {
                int[] iArr2 = this.a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.b, 0, objArr2.length);
                }
                d(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.c - i5) << 1);
        }
        int i8 = this.c;
        if (i3 == i8) {
            int[] iArr4 = this.a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.b;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f2 = f(k);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public int size() {
        return this.c;
    }

    public String toString() {
        if (isEmpty()) {
            return C0201.m82(12992);
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(C0201.m82(12993));
            }
            K i2 = i(i);
            String r3 = C0201.m82(12994);
            if (i2 != this) {
                sb.append((Object) i2);
            } else {
                sb.append(r3);
            }
            sb.append('=');
            V m = m(i);
            if (m != this) {
                sb.append((Object) m);
            } else {
                sb.append(r3);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(f2);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f2 = f(k);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        l(f2, v2);
        return true;
    }

    public x0(int i) {
        if (i == 0) {
            this.a = t0.a;
            this.b = t0.c;
        } else {
            a(i);
        }
        this.c = 0;
    }

    public x0(x0<K, V> x0Var) {
        this();
        if (x0Var != null) {
            j(x0Var);
        }
    }
}
