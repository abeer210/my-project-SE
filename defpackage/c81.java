package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: c81  reason: default package */
public abstract class c81 implements Serializable, Iterable<Byte> {
    public static final c81 b = new l81(m91.b);
    private static final h81 c = (v71.b() ? new k81(null) : new f81(null));
    private int a = 0;

    public static j81 g(int i) {
        return new j81(i, null);
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(C0201.m82(14380));
            sb.append(i);
            sb.append(C0201.m82(14381));
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append(C0201.m82(14376));
            sb2.append(i);
            sb2.append(C0201.m82(14377));
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append(C0201.m82(14378));
            sb3.append(i2);
            sb3.append(C0201.m82(14379));
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static c81 j(byte[] bArr, int i, int i2) {
        i(i, i + i2, bArr.length);
        return new l81(c.a(bArr, i, i2));
    }

    public static c81 k(String str) {
        return new l81(str.getBytes(m91.a));
    }

    public static c81 l(byte[] bArr) {
        return new l81(bArr);
    }

    public abstract int a(int i, int i2, int i3);

    public abstract c81 b(int i, int i2);

    public abstract String c(Charset charset);

    public abstract void d(z71 z71) throws IOException;

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i);

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
        return new b81(this);
    }

    public final String o() {
        return size() == 0 ? C0201.m82(14382) : c(m91.a);
    }

    public abstract boolean p();

    public final int q() {
        return this.a;
    }

    public abstract int size();

    public final String toString() {
        return String.format(C0201.m82(14383), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
