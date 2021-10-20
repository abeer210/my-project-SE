package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: ew0  reason: default package */
public final class ew0 extends yt0<Long> implements pv0<Long>, RandomAccess {
    private long[] b;
    private int c;

    static {
        new ew0().L0();
    }

    public ew0() {
        this(new long[10], 0);
    }

    private ew0(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(28264));
        sb.append(i);
        sb.append(C0201.m82(28265));
        sb.append(i2);
        return sb.toString();
    }

    private final void d(int i, long j) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        long[] jArr = this.b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
            this.b = jArr2;
        }
        this.b[i] = j;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    /* Return type fixed from 'pv0' to match base method */
    @Override // defpackage.pv0
    public final /* synthetic */ pv0<Long> B0(int i) {
        if (i >= this.c) {
            return new ew0(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        d(i, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, defpackage.yt0, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        mv0.a(collection);
        if (!(collection instanceof ew0)) {
            return super.addAll(collection);
        }
        ew0 ew0 = (ew0) collection;
        int i = ew0.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (C0188.f24 - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.b;
            if (i3 > jArr.length) {
                this.b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(ew0.b, 0, this.b, this.c, ew0.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void e(long j) {
        d(this.c, j);
    }

    @Override // defpackage.yt0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return super.equals(obj);
        }
        ew0 ew0 = (ew0) obj;
        if (this.c != ew0.c) {
            return false;
        }
        long[] jArr = ew0.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        b(i);
        return this.b[i];
    }

    @Override // defpackage.yt0
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + mv0.j(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.List, defpackage.yt0
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.b[i]))) {
                long[] jArr = this.b;
                System.arraycopy(jArr, i + 1, jArr, i, this.c - i);
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
            long[] jArr = this.b;
            System.arraycopy(jArr, i2, jArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(28266));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        b(i);
        long[] jArr = this.b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.c;
    }
}
