package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: fu0  reason: default package */
public abstract class fu0 implements Serializable, Iterable<Byte> {
    public static final fu0 b = new mu0(mv0.b);
    private static final ju0 c = (zt0.b() ? new nu0(null) : new hu0(null));
    private int a = 0;

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(C0201.m82(10540));
            sb.append(i);
            sb.append(C0201.m82(10541));
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append(C0201.m82(10536));
            sb2.append(i);
            sb2.append(C0201.m82(10537));
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append(C0201.m82(10538));
            sb3.append(i2);
            sb3.append(C0201.m82(10539));
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static fu0 i(byte[] bArr, int i, int i2) {
        return new mu0(c.a(bArr, i, i2));
    }

    public static fu0 j(String str) {
        return new mu0(str.getBytes(mv0.a));
    }

    public static ku0 l(int i) {
        return new ku0(i, null);
    }

    public abstract int a(int i, int i2, int i3);

    public abstract fu0 b(int i, int i2);

    public abstract String c(Charset charset);

    public abstract void d(eu0 eu0) throws IOException;

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public final int f() {
        return this.a;
    }

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
        return new gu0(this);
    }

    public abstract byte k(int i);

    public final String o() {
        return size() == 0 ? C0201.m82(10542) : c(mv0.a);
    }

    public abstract int size();

    public final String toString() {
        return String.format(C0201.m82(10543), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
