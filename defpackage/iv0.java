package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: iv0  reason: default package */
public final class iv0 extends yt0<Float> implements pv0<Float>, RandomAccess {
    private float[] b;
    private int c;

    static {
        new iv0().L0();
    }

    public iv0() {
        this(new float[10], 0);
    }

    private iv0(float[] fArr, int i) {
        this.b = fArr;
        this.c = i;
    }

    private final void c(int i, float f) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(e(i));
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

    private final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(C0201.m82(31080));
        sb.append(i);
        sb.append(C0201.m82(31081));
        sb.append(i2);
        return sb.toString();
    }

    /* Return type fixed from 'pv0' to match base method */
    @Override // defpackage.pv0
    public final /* synthetic */ pv0<Float> B0(int i) {
        if (i >= this.c) {
            return new iv0(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        c(i, ((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, defpackage.yt0, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        mv0.a(collection);
        if (!(collection instanceof iv0)) {
            return super.addAll(collection);
        }
        iv0 iv0 = (iv0) collection;
        int i = iv0.c;
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
            System.arraycopy(iv0.b, 0, this.b, this.c, iv0.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(float f) {
        c(this.c, f);
    }

    @Override // defpackage.yt0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv0)) {
            return super.equals(obj);
        }
        iv0 iv0 = (iv0) obj;
        if (this.c != iv0.c) {
            return false;
        }
        float[] fArr = iv0.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Float.valueOf(this.b[i]);
    }

    @Override // defpackage.yt0
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.List, defpackage.yt0
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.b[i]))) {
                float[] fArr = this.b;
                System.arraycopy(fArr, i + 1, fArr, i, this.c - i);
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
        throw new IndexOutOfBoundsException(C0201.m82(31082));
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        d(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.c;
    }
}
