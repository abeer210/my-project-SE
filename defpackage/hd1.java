package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: hd1  reason: default package */
public final class hd1 implements Cloneable {
    private fd1<?, ?> a;
    private Object b;
    private List<od1> c = new ArrayList();

    private final byte[] a() throws IOException {
        byte[] bArr = new byte[d()];
        b(ed1.r(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final hd1 clone() {
        hd1 hd1 = new hd1();
        try {
            hd1.a = this.a;
            if (this.c == null) {
                hd1.c = null;
            } else {
                hd1.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof md1) {
                    hd1.b = (md1) ((md1) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    hd1.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        hd1.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        hd1.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        hd1.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        hd1.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        hd1.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        hd1.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof md1[]) {
                        md1[] md1Arr = (md1[]) this.b;
                        md1[] md1Arr2 = new md1[md1Arr.length];
                        hd1.b = md1Arr2;
                        while (i < md1Arr.length) {
                            md1Arr2[i] = (md1) md1Arr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return hd1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(ed1 ed1) throws IOException {
        if (this.b == null) {
            for (od1 od1 : this.c) {
                ed1.n(od1.a);
                ed1.t(od1.b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final void c(od1 od1) throws IOException {
        List<od1> list = this.c;
        if (list != null) {
            list.add(od1);
            return;
        }
        Object obj = this.b;
        if (obj instanceof md1) {
            byte[] bArr = od1.b;
            bd1 h = bd1.h(bArr, 0, bArr.length);
            int l = h.l();
            if (l == bArr.length - ed1.h(l)) {
                md1 a2 = ((md1) this.b).a(h);
                this.a = this.a;
                this.b = a2;
                this.c = null;
                return;
            }
            throw jd1.a();
        } else if (obj instanceof md1[]) {
            Collections.singletonList(od1);
            throw new NoSuchMethodError();
        } else if (obj instanceof wa1) {
            Collections.singletonList(od1);
            throw new NoSuchMethodError();
        } else if (obj instanceof wa1[]) {
            Collections.singletonList(od1);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(od1);
            throw new NoSuchMethodError();
        }
    }

    public final int d() {
        if (this.b == null) {
            int i = 0;
            for (od1 od1 : this.c) {
                i += ed1.i(od1.a) + 0 + od1.b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<od1> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1 = (hd1) obj;
        if (this.b == null || hd1.b == null) {
            List<od1> list2 = this.c;
            if (list2 != null && (list = hd1.c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(a(), hd1.a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            fd1<?, ?> fd1 = this.a;
            if (fd1 != hd1.a) {
                return false;
            }
            if (!fd1.a.isArray()) {
                return this.b.equals(hd1.b);
            }
            Object obj2 = this.b;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) hd1.b);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) hd1.b);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) hd1.b);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) hd1.b);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) hd1.b);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) hd1.b);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) hd1.b);
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
