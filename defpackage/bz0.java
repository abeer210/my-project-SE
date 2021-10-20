package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bz0  reason: default package */
public final class bz0 implements Cloneable {
    private zy0<?, ?> a;
    private Object b;
    private List<Object> c = new ArrayList();

    private final byte[] a() throws IOException {
        byte[] bArr = new byte[c()];
        b(wy0.q(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final bz0 clone() {
        Object clone;
        bz0 bz0 = new bz0();
        try {
            bz0.a = this.a;
            if (this.c == null) {
                bz0.c = null;
            } else {
                bz0.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof dz0) {
                    clone = (dz0) ((dz0) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    clone = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        bz0.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        clone = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        clone = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        clone = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        clone = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        clone = ((double[]) this.b).clone();
                    } else if (this.b instanceof dz0[]) {
                        dz0[] dz0Arr = (dz0[]) this.b;
                        dz0[] dz0Arr2 = new dz0[dz0Arr.length];
                        bz0.b = dz0Arr2;
                        while (i < dz0Arr.length) {
                            dz0Arr2[i] = (dz0) dz0Arr[i].clone();
                            i++;
                        }
                    }
                }
                bz0.b = clone;
            }
            return bz0;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(wy0 wy0) throws IOException {
        if (this.b == null) {
            Iterator<Object> it = this.c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final int c() {
        if (this.b == null) {
            Iterator<Object> it = this.c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bz0)) {
            return false;
        }
        bz0 bz0 = (bz0) obj;
        if (this.b == null || bz0.b == null) {
            List<Object> list2 = this.c;
            if (list2 != null && (list = bz0.c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(a(), bz0.a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            zy0<?, ?> zy0 = this.a;
            if (zy0 != bz0.a) {
                return false;
            }
            if (!zy0.a.isArray()) {
                return this.b.equals(bz0.b);
            }
            Object obj2 = this.b;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) bz0.b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) bz0.b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) bz0.b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) bz0.b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) bz0.b) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) bz0.b) : Arrays.deepEquals((Object[]) obj2, (Object[]) bz0.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
