package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: lv0  reason: default package */
public final class lv0 extends yt0<Integer> implements pv0<Integer>, RandomAccess {
    private int[] b;
    private int c;

    static {
        new lv0().L0();
    }

    public lv0() {
        this(new int[10], 0);
    }

    private lv0(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(14176));
        sb.append(i);
        sb.append(C0201.m82(14177));
        sb.append(i2);
        return sb.toString();
    }

    private final void f(int i, int i2) {
        int i3;
        a();
        if (i < 0 || i > (i3 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
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

    /* Return type fixed from 'pv0' to match base method */
    @Override // defpackage.pv0
    public final /* synthetic */ pv0<Integer> B0(int i) {
        if (i >= this.c) {
            return new lv0(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        f(i, ((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, defpackage.yt0, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        mv0.a(collection);
        if (!(collection instanceof lv0)) {
            return super.addAll(collection);
        }
        lv0 lv0 = (lv0) collection;
        int i = lv0.c;
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
            System.arraycopy(lv0.b, 0, this.b, this.c, lv0.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int i) {
        d(i);
        return this.b[i];
    }

    public final void c(int i) {
        f(this.c, i);
    }

    @Override // defpackage.yt0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv0)) {
            return super.equals(obj);
        }
        lv0 lv0 = (lv0) obj;
        if (this.c != lv0.c) {
            return false;
        }
        int[] iArr = lv0.b;
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

    @Override // defpackage.yt0
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.List, defpackage.yt0
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Integer.valueOf(this.b[i]))) {
                int[] iArr = this.b;
                System.arraycopy(iArr, i + 1, iArr, i, this.c - i);
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
        throw new IndexOutOfBoundsException(C0201.m82(14178));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.c;
    }
}
