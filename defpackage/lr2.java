package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: lr2  reason: default package */
/* compiled from: CCITTFaxFilter */
public final class lr2 extends pr2 {
    private void c(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((bArr[i] ^ -1) & 255);
        }
    }

    @Override // defpackage.pr2
    public or2 a(InputStream inputStream, OutputStream outputStream, vq2 vq2, int i) throws IOException {
        int i2;
        byte[] bArr;
        or2 or2 = new or2(new vq2());
        or2.a().r(vq2);
        vq2 b = pr2.b(vq2, i);
        int t0 = b.t0(ar2.v, 1728);
        int t02 = b.t0(ar2.p0, 0);
        int u0 = vq2.u0(ar2.O, ar2.N, 0);
        if (t02 <= 0 || u0 <= 0) {
            i2 = Math.max(t02, u0);
        } else {
            i2 = Math.min(t02, u0);
        }
        int t03 = b.t0(ar2.T, 0);
        boolean H = b.H(ar2.G, false);
        int i3 = ((t0 + 7) / 8) * i2;
        if (t03 == 0) {
            yr2 yr2 = new yr2(new xr2(inputStream, t0, i2, H));
            bArr = bs2.c(yr2);
            yr2.close();
        } else {
            as2 as2 = new as2(1, t0, i2);
            byte[] c = bs2.c(inputStream);
            byte[] bArr2 = new byte[i3];
            if (t03 > 0) {
                as2.b(bArr2, c, 0, i2, 0);
            } else {
                as2.e(bArr2, c, 0, i2, 0, H);
            }
            bArr = bArr2;
        }
        if (!b.H(ar2.k, false)) {
            c(bArr);
        }
        if (!vq2.x(ar2.u)) {
            or2.a().q1(ar2.u, ar2.D.x());
        }
        outputStream.write(bArr);
        return new or2(vq2);
    }
}
