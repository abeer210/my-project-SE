package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: mu0  reason: default package */
public class mu0 extends lu0 {
    public final byte[] d;

    public mu0(byte[] bArr) {
        this.d = bArr;
    }

    @Override // defpackage.fu0
    public final int a(int i, int i2, int i3) {
        return mv0.c(i, this.d, q(), i3);
    }

    @Override // defpackage.fu0
    public final fu0 b(int i, int i2) {
        int g = fu0.g(0, i2, size());
        return g == 0 ? fu0.b : new iu0(this.d, q(), g);
    }

    @Override // defpackage.fu0
    public final String c(Charset charset) {
        return new String(this.d, q(), size(), charset);
    }

    @Override // defpackage.fu0
    public final void d(eu0 eu0) throws IOException {
        eu0.a(this.d, q(), size());
    }

    @Override // defpackage.fu0
    public final boolean e() {
        int q = q();
        return jy0.i(this.d, q, size() + q);
    }

    @Override // defpackage.fu0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fu0) || size() != ((fu0) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof mu0)) {
            return obj.equals(this);
        }
        mu0 mu0 = (mu0) obj;
        int f = f();
        int f2 = mu0.f();
        if (f == 0 || f2 == 0 || f == f2) {
            return p(mu0, 0, size());
        }
        return false;
    }

    @Override // defpackage.fu0
    public byte k(int i) {
        return this.d[i];
    }

    public final boolean p(fu0 fu0, int i, int i2) {
        if (i2 > fu0.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append(C0201.m82(4726));
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > fu0.size()) {
            int size2 = fu0.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append(C0201.m82(4724));
            sb2.append(i2);
            sb2.append(C0201.m82(4725));
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(fu0 instanceof mu0)) {
            return fu0.b(0, i2).equals(b(0, i2));
        } else {
            mu0 mu0 = (mu0) fu0;
            byte[] bArr = this.d;
            byte[] bArr2 = mu0.d;
            int q = q() + i2;
            int q2 = q();
            int q3 = mu0.q();
            while (q2 < q) {
                if (bArr[q2] != bArr2[q3]) {
                    return false;
                }
                q2++;
                q3++;
            }
            return true;
        }
    }

    public int q() {
        return 0;
    }

    @Override // defpackage.fu0
    public int size() {
        return this.d.length;
    }
}
