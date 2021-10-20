package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: s0  reason: default package */
/* compiled from: ArraySet */
public final class s0<E> implements Collection<E>, Set<E> {
    private static final int[] e = new int[0];
    private static final Object[] f = new Object[0];
    private static Object[] g;
    private static int h;
    private static Object[] i;
    private static int j;
    private int[] a;
    public Object[] b;
    public int c;
    private w0<E, E> d;

    /* access modifiers changed from: package-private */
    /* renamed from: s0$a */
    /* compiled from: ArraySet */
    public class a extends w0<E, E> {
        public a() {
        }

        @Override // defpackage.w0
        public void a() {
            s0.this.clear();
        }

        @Override // defpackage.w0
        public Object b(int i, int i2) {
            return s0.this.b[i];
        }

        @Override // defpackage.w0
        public Map<E, E> c() {
            throw new UnsupportedOperationException(C0201.m82(7465));
        }

        @Override // defpackage.w0
        public int d() {
            return s0.this.c;
        }

        @Override // defpackage.w0
        public int e(Object obj) {
            return s0.this.indexOf(obj);
        }

        @Override // defpackage.w0
        public int f(Object obj) {
            return s0.this.indexOf(obj);
        }

        @Override // defpackage.w0
        public void g(E e, E e2) {
            s0.this.add(e);
        }

        @Override // defpackage.w0
        public void h(int i) {
            s0.this.g(i);
        }

        @Override // defpackage.w0
        public E i(int i, E e) {
            throw new UnsupportedOperationException(C0201.m82(7466));
        }
    }

    public s0() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (s0.class) {
                if (i != null) {
                    Object[] objArr = i;
                    this.b = objArr;
                    i = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (s0.class) {
                if (g != null) {
                    Object[] objArr2 = g;
                    this.b = objArr2;
                    g = (Object[]) objArr2[0];
                    this.a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    h--;
                    return;
                }
            }
        }
        this.a = new int[i2];
        this.b = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (s0.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (s0.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        }
    }

    private w0<E, E> d() {
        if (this.d == null) {
            this.d = new a();
        }
        return this.d;
    }

    private int e(Object obj, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = t0.a(this.a, i3, i2);
        if (a2 < 0 || obj.equals(this.b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.a[i4] == i2) {
            if (obj.equals(this.b[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.a[i5] == i2) {
            if (obj.equals(this.b[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    private int f() {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = t0.a(this.a, i2, 0);
        if (a2 < 0 || this.b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.a[i3] == 0) {
            if (this.b[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.a[i4] == 0) {
            if (this.b[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = e(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.c;
        if (i5 >= this.a.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.a;
            Object[] objArr = this.b;
            a(i6);
            int[] iArr2 = this.a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.b, 0, objArr.length);
            }
            c(iArr, objArr, this.c);
        }
        int i7 = this.c;
        if (i4 < i7) {
            int[] iArr3 = this.a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.c - i4);
        }
        this.a[i4] = i2;
        this.b[i4] = e2;
        this.c++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: s0<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public void b(int i2) {
        int[] iArr = this.a;
        if (iArr.length < i2) {
            Object[] objArr = this.b;
            a(i2);
            int i3 = this.c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i3);
                System.arraycopy(objArr, 0, this.b, 0, this.c);
            }
            c(iArr, objArr, this.c);
        }
    }

    public void clear() {
        int i2 = this.c;
        if (i2 != 0) {
            c(this.a, this.b, i2);
            this.a = e;
            this.b = f;
            this.c = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.c; i2++) {
                try {
                    if (!set.contains(i(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i2) {
        Object[] objArr = this.b;
        E e2 = (E) objArr[i2];
        int i3 = this.c;
        if (i3 <= 1) {
            c(this.a, objArr, i3);
            this.a = e;
            this.b = f;
            this.c = 0;
        } else {
            int[] iArr = this.a;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.c - 1;
                this.c = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.a;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.c - i2);
                }
                this.b[this.c] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.a;
                Object[] objArr3 = this.b;
                a(i4);
                this.c--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.a, 0, i2);
                    System.arraycopy(objArr3, 0, this.b, 0, i2);
                }
                int i7 = this.c;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.a, i2, i7 - i2);
                    System.arraycopy(objArr3, i8, this.b, i2, this.c - i2);
                }
            }
        }
        return e2;
    }

    public int hashCode() {
        int[] iArr = this.a;
        int i2 = this.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public E i(int i2) {
        return (E) this.b[i2];
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.b[i2])) {
                g(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.c;
    }

    public Object[] toArray() {
        int i2 = this.c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.b, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return C0201.m82(1460);
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(C0201.m82(1461));
            }
            E i3 = i(i2);
            if (i3 != this) {
                sb.append((Object) i3);
            } else {
                sb.append(C0201.m82(1462));
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public s0(int i2) {
        if (i2 == 0) {
            this.a = e;
            this.b = f;
        } else {
            a(i2);
        }
        this.c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.c));
        }
        System.arraycopy(this.b, 0, tArr, 0, this.c);
        int length = tArr.length;
        int i2 = this.c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
