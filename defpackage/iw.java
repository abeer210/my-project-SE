package defpackage;

import java.io.IOException;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: iw  reason: default package */
/* compiled from: IccReader */
public class iw implements wp {
    public static String e(int i) {
        return new String(new byte[]{(byte) ((-16777216 & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)});
    }

    private void f(tr trVar, int i, kr krVar) throws IOException {
        int h = krVar.h(i);
        if (h != 0) {
            trVar.R(i, e(h));
        }
    }

    private void g(hw hwVar, int i, kr krVar) throws IOException {
        int s = krVar.s(i);
        int s2 = krVar.s(i + 2);
        int s3 = krVar.s(i + 4);
        int s4 = krVar.s(i + 6);
        int s5 = krVar.s(i + 8);
        int s6 = krVar.s(i + 10);
        if (!hr.a(s, s2 - 1, s3) || !hr.b(s4, s5, s6)) {
            hwVar.a(String.format(C0201.m82(23763), Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5), Integer.valueOf(s6)));
            return;
        }
        hwVar.R(i, String.format(C0201.m82(23762), Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5), Integer.valueOf(s6)));
    }

    private void h(tr trVar, int i, kr krVar) throws IOException {
        int h = krVar.h(i);
        if (h != 0) {
            trVar.J(i, h);
        }
    }

    private void i(tr trVar, int i, kr krVar) throws IOException {
        long i2 = krVar.i(i);
        if (i2 != 0) {
            trVar.L(i, i2);
        }
    }

    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        byte[] bArr = null;
        for (byte[] bArr2 : iterable) {
            if (bArr2.length >= 11) {
                if (C0201.m82(23764).equalsIgnoreCase(new String(bArr2, 0, 11))) {
                    if (bArr == null) {
                        bArr = new byte[(bArr2.length - 14)];
                        System.arraycopy(bArr2, 14, bArr, 0, bArr2.length - 14);
                    } else {
                        byte[] bArr3 = new byte[((bArr.length + bArr2.length) - 14)];
                        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                        System.arraycopy(bArr2, 14, bArr3, bArr.length, bArr2.length - 14);
                        bArr = bArr3;
                    }
                }
            }
        }
        if (bArr != null) {
            c(new br(bArr), wrVar);
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APP2);
    }

    public void c(kr krVar, wr wrVar) {
        d(krVar, wrVar, null);
    }

    public void d(kr krVar, wr wrVar, tr trVar) {
        hw hwVar = new hw();
        if (trVar != null) {
            hwVar.O(trVar);
        }
        try {
            hwVar.J(0, krVar.h(0));
            f(hwVar, 4, krVar);
            h(hwVar, 8, krVar);
            f(hwVar, 12, krVar);
            f(hwVar, 16, krVar);
            f(hwVar, 20, krVar);
            g(hwVar, 24, krVar);
            f(hwVar, 36, krVar);
            f(hwVar, 40, krVar);
            h(hwVar, 44, krVar);
            f(hwVar, 48, krVar);
            int h = krVar.h(52);
            if (h != 0) {
                if (h <= 538976288) {
                    hwVar.J(52, h);
                } else {
                    hwVar.R(52, e(h));
                }
            }
            h(hwVar, 64, krVar);
            i(hwVar, 56, krVar);
            hwVar.M(68, new float[]{krVar.o(68), krVar.o(72), krVar.o(76)});
            int h2 = krVar.h(128);
            hwVar.J(128, h2);
            for (int i = 0; i < h2; i++) {
                int i2 = (i * 12) + 132;
                hwVar.C(krVar.h(i2), krVar.c(krVar.h(i2 + 4), krVar.h(i2 + 8)));
            }
        } catch (IOException e) {
            hwVar.a(C0201.m82(23765) + e.getMessage());
        }
        wrVar.a(hwVar);
    }
}
