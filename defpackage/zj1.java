package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: zj1  reason: default package */
public final class zj1 extends uj1<Boolean> implements rl1<Boolean>, en1, RandomAccess {
    private boolean[] b;
    private int c;

    static {
        new zj1().h();
    }

    public zj1() {
        this(new boolean[10], 0);
    }

    private final void c(int i, boolean z) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        boolean[] zArr = this.b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
            this.b = zArr2;
        }
        this.b[i] = z;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(4865));
        sb.append(i);
        sb.append(C0201.m82(4866));
        sb.append(i2);
        return sb.toString();
    }

    /* Return type fixed from 'rl1' to match base method */
    @Override // defpackage.rl1
    public final /* synthetic */ rl1<Boolean> C0(int i) {
        if (i >= this.c) {
            return new zj1(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        c(i, ((Boolean) obj).booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, defpackage.uj1
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        nl1.a(collection);
        if (!(collection instanceof zj1)) {
            return super.addAll(collection);
        }
        zj1 zj1 = (zj1) collection;
        int i = zj1.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (C0188.f24 - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.b;
            if (i3 > zArr.length) {
                this.b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zj1.b, 0, this.b, this.c, zj1.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(boolean z) {
        c(this.c, z);
    }

    @Override // defpackage.uj1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj1)) {
            return super.equals(obj);
        }
        zj1 zj1 = (zj1) obj;
        if (this.c != zj1.c) {
            return false;
        }
        boolean[] zArr = zj1.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Boolean.valueOf(this.b[i]);
    }

    @Override // defpackage.uj1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + nl1.h(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.List, defpackage.uj1
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.b[i]))) {
                boolean[] zArr = this.b;
                System.arraycopy(zArr, i + 1, zArr, i, this.c - i);
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
            boolean[] zArr = this.b;
            System.arraycopy(zArr, i2, zArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(4867));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        d(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.c;
    }

    private zj1(boolean[] zArr, int i) {
        this.b = zArr;
        this.c = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
