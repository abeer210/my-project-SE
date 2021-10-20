package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: ja1  reason: default package */
public final class ja1 extends w71<Long> implements t91, ib1, RandomAccess {
    private static final ja1 d;
    private long[] b;
    private int c;

    static {
        ja1 ja1 = new ja1(new long[0], 0);
        d = ja1;
        ja1.c0();
    }

    public ja1() {
        this(new long[10], 0);
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(19954));
        sb.append(i);
        sb.append(C0201.m82(19955));
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

    public static ja1 e() {
        return d;
    }

    @Override // defpackage.t91
    public final void N(long j) {
        d(this.c, j);
    }

    @Override // defpackage.t91
    /* renamed from: a0 */
    public final t91 Z0(int i) {
        if (i >= this.c) {
            return new ja1(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        d(i, ((Long) obj).longValue());
    }

    @Override // defpackage.w71, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        m91.a(collection);
        if (!(collection instanceof ja1)) {
            return super.addAll(collection);
        }
        ja1 ja1 = (ja1) collection;
        int i = ja1.c;
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
            System.arraycopy(ja1.b, 0, this.b, this.c, ja1.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // defpackage.w71
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja1)) {
            return super.equals(obj);
        }
        ja1 ja1 = (ja1) obj;
        if (this.c != ja1.c) {
            return false;
        }
        long[] jArr = ja1.b;
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

    @Override // defpackage.t91
    public final long getLong(int i) {
        b(i);
        return this.b[i];
    }

    @Override // defpackage.w71
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + m91.f(this.b[i2]);
        }
        return i;
    }

    @Override // defpackage.w71, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.b[i]))) {
                long[] jArr = this.b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.c - i) - 1);
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
        throw new IndexOutOfBoundsException(C0201.m82(19956));
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

    private ja1(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
        long[] jArr = this.b;
        long j = jArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
