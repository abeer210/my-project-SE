package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: o91  reason: default package */
public final class o91 extends w71<Integer> implements q91, ib1, RandomAccess {
    private static final o91 d;
    private int[] b;
    private int c;

    static {
        o91 o91 = new o91(new int[0], 0);
        d = o91;
        o91.c0();
    }

    public o91() {
        this(new int[10], 0);
    }

    private final void c(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(9917));
        sb.append(i);
        sb.append(C0201.m82(9918));
        sb.append(i2);
        return sb.toString();
    }

    private final void f(int i, int i2) {
        int i3;
        a();
        if (i < 0 || i > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        int[] iArr = this.b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = i2;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public static o91 g() {
        return d;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        f(i, ((Integer) obj).intValue());
    }

    @Override // defpackage.w71, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        m91.a(collection);
        if (!(collection instanceof o91)) {
            return super.addAll(collection);
        }
        o91 o91 = (o91) collection;
        int i = o91.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (C0188.f24 - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(o91.b, 0, this.b, this.c, o91.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int i) {
        c(i);
        return this.b[i];
    }

    public final void e(int i) {
        f(this.c, i);
    }

    @Override // defpackage.w71
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o91)) {
            return super.equals(obj);
        }
        o91 o91 = (o91) obj;
        if (this.c != o91.c) {
            return false;
        }
        int[] iArr = o91.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(b(i));
    }

    @Override // defpackage.w71
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // defpackage.w71, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Integer.valueOf(this.b[i]))) {
                int[] iArr = this.b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(9919));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        c(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.c;
    }

    @Override // defpackage.q91
    /* renamed from: z0 */
    public final q91 Z0(int i) {
        if (i >= this.c) {
            return new o91(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    private o91(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
