package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: uu0  reason: default package */
public final class uu0 extends yt0<Double> implements pv0<Double>, RandomAccess {
    private double[] b;
    private int c;

    static {
        new uu0().L0();
    }

    public uu0() {
        this(new double[10], 0);
    }

    private uu0(double[] dArr, int i) {
        this.b = dArr;
        this.c = i;
    }

    private final void c(int i, double d) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        double[] dArr = this.b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.b, i, dArr2, i + 1, this.c - i);
            this.b = dArr2;
        }
        this.b[i] = d;
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
        sb.append(C0201.m82(21619));
        sb.append(i);
        sb.append(C0201.m82(21620));
        sb.append(i2);
        return sb.toString();
    }

    /* Return type fixed from 'pv0' to match base method */
    @Override // defpackage.pv0
    public final /* synthetic */ pv0<Double> B0(int i) {
        if (i >= this.c) {
            return new uu0(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        c(i, ((Double) obj).doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, defpackage.yt0, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        mv0.a(collection);
        if (!(collection instanceof uu0)) {
            return super.addAll(collection);
        }
        uu0 uu0 = (uu0) collection;
        int i = uu0.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (C0188.f24 - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.b;
            if (i3 > dArr.length) {
                this.b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(uu0.b, 0, this.b, this.c, uu0.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(double d) {
        c(this.c, d);
    }

    @Override // defpackage.yt0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return super.equals(obj);
        }
        uu0 uu0 = (uu0) obj;
        if (this.c != uu0.c) {
            return false;
        }
        double[] dArr = uu0.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Double.valueOf(this.b[i]);
    }

    @Override // defpackage.yt0
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + mv0.j(Double.doubleToLongBits(this.b[i2]));
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
        double[] dArr = this.b;
        double d = dArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.List, defpackage.yt0
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Double.valueOf(this.b[i]))) {
                double[] dArr = this.b;
                System.arraycopy(dArr, i + 1, dArr, i, this.c - i);
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
            double[] dArr = this.b;
            System.arraycopy(dArr, i2, dArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(21621));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        d(i);
        double[] dArr = this.b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.c;
    }
}
