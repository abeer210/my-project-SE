package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: bk1  reason: default package */
public abstract class bk1 implements Serializable, Iterable<Byte> {
    public static final bk1 b = new ik1(nl1.b);
    private static final fk1 c = (vj1.a() ? new jk1(null) : new dk1(null));
    private int a = 0;

    public static gk1 f(int i) {
        return new gk1(i, null);
    }

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(C0201.m82(16148));
            sb.append(i);
            sb.append(C0201.m82(16149));
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append(C0201.m82(16144));
            sb2.append(i);
            sb2.append(C0201.m82(16145));
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append(C0201.m82(16146));
            sb3.append(i2);
            sb3.append(C0201.m82(16147));
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static bk1 i(byte[] bArr, int i, int i2) {
        g(i, i + i2, bArr.length);
        return new ik1(c.a(bArr, i, i2));
    }

    public static bk1 k(byte[] bArr, int i, int i2) {
        return new ek1(bArr, i, i2);
    }

    public static bk1 q(byte[] bArr) {
        return new ik1(bArr);
    }

    public static bk1 r(String str) {
        return new ik1(str.getBytes(nl1.a));
    }

    public abstract int a(int i, int i2, int i3);

    public abstract String b(Charset charset);

    public abstract void c(ak1 ak1) throws IOException;

    public abstract void d(byte[] bArr, int i, int i2, int i3);

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new ck1(this);
    }

    public abstract bk1 j(int i, int i2);

    public final String l() {
        return size() == 0 ? C0201.m82(16150) : b(nl1.a);
    }

    public abstract boolean o();

    public final int p() {
        return this.a;
    }

    public abstract int size();

    public final String toString() {
        return String.format(C0201.m82(16151), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
