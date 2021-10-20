package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: l81  reason: default package */
public class l81 extends i81 {
    public final byte[] d;

    public l81(byte[] bArr) {
        if (bArr != null) {
            this.d = bArr;
            return;
        }
        throw null;
    }

    @Override // defpackage.c81
    public final int a(int i, int i2, int i3) {
        return m91.c(i, this.d, s(), i3);
    }

    @Override // defpackage.c81
    public final c81 b(int i, int i2) {
        int i3 = c81.i(0, i2, size());
        if (i3 == 0) {
            return c81.b;
        }
        return new e81(this.d, s(), i3);
    }

    @Override // defpackage.c81
    public final String c(Charset charset) {
        return new String(this.d, s(), size(), charset);
    }

    @Override // defpackage.c81
    public final void d(z71 z71) throws IOException {
        z71.a(this.d, s(), size());
    }

    @Override // defpackage.c81
    public byte e(int i) {
        return this.d[i];
    }

    @Override // defpackage.c81
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c81) || size() != ((c81) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return obj.equals(this);
        }
        l81 l81 = (l81) obj;
        int q = q();
        int q2 = l81.q();
        if (q == 0 || q2 == 0 || q == q2) {
            return r(l81, 0, size());
        }
        return false;
    }

    @Override // defpackage.c81
    public byte f(int i) {
        return this.d[i];
    }

    @Override // defpackage.c81
    public final boolean p() {
        int s = s();
        return nc1.h(this.d, s, size() + s);
    }

    public final boolean r(c81 c81, int i, int i2) {
        if (i2 > c81.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append(C0201.m82(29146));
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > c81.size()) {
            int size2 = c81.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(C0201.m82(29144));
            sb2.append(i2);
            sb2.append(C0201.m82(29145));
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(c81 instanceof l81)) {
            return c81.b(0, i2).equals(b(0, i2));
        } else {
            l81 l81 = (l81) c81;
            byte[] bArr = this.d;
            byte[] bArr2 = l81.d;
            int s = s() + i2;
            int s2 = s();
            int s3 = l81.s();
            while (s2 < s) {
                if (bArr[s2] != bArr2[s3]) {
                    return false;
                }
                s2++;
                s3++;
            }
            return true;
        }
    }

    public int s() {
        return 0;
    }

    @Override // defpackage.c81
    public int size() {
        return this.d.length;
    }
}
