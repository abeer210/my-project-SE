package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: h91  reason: default package */
public final class h91 extends w71<Float> implements s91<Float>, ib1, RandomAccess {
    private float[] b;
    private int c;

    static {
        new h91(new float[0], 0).c0();
    }

    public h91() {
        this(new float[10], 0);
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(15726));
        sb.append(i);
        sb.append(C0201.m82(15727));
        sb.append(i2);
        return sb.toString();
    }

    private final void e(int i, float f) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i + 1, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = f;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    /* Return type fixed from 's91' to match base method */
    @Override // defpackage.s91
    public final /* synthetic */ s91<Float> Z0(int i) {
        if (i >= this.c) {
            return new h91(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        e(i, ((Float) obj).floatValue());
    }

    @Override // defpackage.w71, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        m91.a(collection);
        if (!(collection instanceof h91)) {
            return super.addAll(collection);
        }
        h91 h91 = (h91) collection;
        int i = h91.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (C0188.f24 - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.b;
            if (i3 > fArr.length) {
                this.b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(h91.b, 0, this.b, this.c, h91.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(float f) {
        e(this.c, f);
    }

    @Override // defpackage.w71
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h91)) {
            return super.equals(obj);
        }
        h91 h91 = (h91) obj;
        if (this.c != h91.c) {
            return false;
        }
        float[] fArr = h91.b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // defpackage.w71
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // defpackage.w71, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.b[i]))) {
                float[] fArr = this.b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.c - i) - 1);
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
            float[] fArr = this.b;
            System.arraycopy(fArr, i2, fArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(C0201.m82(15728));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.c;
    }

    private h91(float[] fArr, int i) {
        this.b = fArr;
        this.c = i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}
