package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: tk1  reason: default package */
public final class tk1 extends uj1<Double> implements rl1<Double>, en1, RandomAccess {
    private double[] b;
    private int c;

    static {
        new tk1().h();
    }

    public tk1() {
        this(new double[10], 0);
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(5774));
        sb.append(i);
        sb.append(C0201.m82(5775));
        sb.append(i2);
        return sb.toString();
    }

    private final void e(int i, double d) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(c(i));
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

    /* Return type fixed from 'rl1' to match base method */
    @Override // defpackage.rl1
    public final /* synthetic */ rl1<Double> C0(int i) {
        if (i >= this.c) {
            return new tk1(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        e(i, ((Double) obj).doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, defpackage.uj1
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        nl1.a(collection);
        if (!(collection instanceof tk1)) {
            return super.addAll(collection);
        }
        tk1 tk1 = (tk1) collection;
        int i = tk1.c;
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
            System.arraycopy(tk1.b, 0, this.b, this.c, tk1.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(double d) {
        e(this.c, d);
    }

    @Override // defpackage.uj1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk1)) {
            return super.equals(obj);
        }
        tk1 tk1 = (tk1) obj;
        if (this.c != tk1.c) {
            return false;
        }
        double[] dArr = tk1.b;
        for (int i = 0; i < this.c; i++) {
            if (Double.doubleToLongBits(this.b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.b[i]);
    }

    @Override // defpackage.uj1
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + nl1.j(Double.doubleToLongBits(this.b[i2]));
        }
        return i;
    }

    @Override // java.util.List, defpackage.uj1
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
        throw new IndexOutOfBoundsException(C0201.m82(5776));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        b(i);
        double[] dArr = this.b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.c;
    }

    private tk1(double[] dArr, int i) {
        this.b = dArr;
        this.c = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
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
}
