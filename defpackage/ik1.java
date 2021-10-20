package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: ik1  reason: default package */
public class ik1 extends hk1 {
    public final byte[] d;

    public ik1(byte[] bArr) {
        if (bArr != null) {
            this.d = bArr;
            return;
        }
        throw null;
    }

    @Override // defpackage.bk1
    public final int a(int i, int i2, int i3) {
        return nl1.c(i, this.d, t(), i3);
    }

    @Override // defpackage.bk1
    public final String b(Charset charset) {
        return new String(this.d, t(), size(), charset);
    }

    @Override // defpackage.bk1
    public final void c(ak1 ak1) throws IOException {
        ak1.a(this.d, t(), size());
    }

    @Override // defpackage.bk1
    public void d(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.d, 0, bArr, 0, i3);
    }

    @Override // defpackage.bk1
    public byte e(int i) {
        return this.d[i];
    }

    @Override // defpackage.bk1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bk1) || size() != ((bk1) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ik1)) {
            return obj.equals(this);
        }
        ik1 ik1 = (ik1) obj;
        int p = p();
        int p2 = ik1.p();
        if (p == 0 || p2 == 0 || p == p2) {
            return s(ik1, 0, size());
        }
        return false;
    }

    @Override // defpackage.bk1
    public final bk1 j(int i, int i2) {
        int g = bk1.g(0, i2, size());
        if (g == 0) {
            return bk1.b;
        }
        return new ek1(this.d, t(), g);
    }

    @Override // defpackage.bk1
    public final boolean o() {
        int t = t();
        return jo1.h(this.d, t, size() + t);
    }

    public final boolean s(bk1 bk1, int i, int i2) {
        if (i2 > bk1.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append(C0201.m82(5822));
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > bk1.size()) {
            int size2 = bk1.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(C0201.m82(5820));
            sb2.append(i2);
            sb2.append(C0201.m82(5821));
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(bk1 instanceof ik1)) {
            return bk1.j(0, i2).equals(j(0, i2));
        } else {
            ik1 ik1 = (ik1) bk1;
            byte[] bArr = this.d;
            byte[] bArr2 = ik1.d;
            int t = t() + i2;
            int t2 = t();
            int t3 = ik1.t();
            while (t2 < t) {
                if (bArr[t2] != bArr2[t3]) {
                    return false;
                }
                t2++;
                t3++;
            }
            return true;
        }
    }

    @Override // defpackage.bk1
    public int size() {
        return this.d.length;
    }

    public int t() {
        return 0;
    }
}
