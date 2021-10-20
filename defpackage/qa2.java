package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: qa2  reason: default package */
/* compiled from: QRCodeReader */
public class qa2 implements r62 {
    private static final v62[] b = new v62[0];
    private final va2 a = new va2();

    private static c72 d(c72 c72) throws o62 {
        int[] j = c72.j();
        int[] e = c72.e();
        if (j == null || e == null) {
            throw o62.a();
        }
        float e2 = e(j, c72);
        int i = j[1];
        int i2 = e[1];
        int i3 = j[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            throw o62.a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < c72.l()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / e2);
            int round2 = Math.round(((float) (i5 + 1)) / e2);
            if (round <= 0 || round2 <= 0) {
                throw o62.a();
            } else if (round2 == round) {
                int i6 = (int) (e2 / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * e2)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw o62.a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * e2)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw o62.a();
                    }
                }
                c72 c722 = new c72(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * e2)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (c72.d(((int) (((float) i13) * e2)) + i8, i12)) {
                            c722.n(i13, i11);
                        }
                    }
                }
                return c722;
            } else {
                throw o62.a();
            }
        } else {
            throw o62.a();
        }
    }

    private static float e(int[] iArr, c72 c72) throws o62 {
        int g = c72.g();
        int l = c72.l();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < l && i2 < g) {
            if (z != c72.d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != l && i2 != g) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw o62.a();
    }

    @Override // defpackage.r62
    public void a() {
    }

    @Override // defpackage.r62
    public final t62 b(h62 h62, Map<j62, ?> map) throws o62, i62, k62 {
        v62[] v62Arr;
        f72 f72;
        if (map == null || !map.containsKey(j62.PURE_BARCODE)) {
            h72 e = new db2(h62.a()).e(map);
            f72 b2 = this.a.b(e.a(), map);
            v62Arr = e.b();
            f72 = b2;
        } else {
            f72 = this.a.b(d(h62.a()), map);
            v62Arr = b;
        }
        if (f72.d() instanceof za2) {
            ((za2) f72.d()).a(v62Arr);
        }
        t62 t62 = new t62(f72.h(), f72.e(), v62Arr, f62.QR_CODE);
        List<byte[]> a2 = f72.a();
        if (a2 != null) {
            t62.h(u62.BYTE_SEGMENTS, a2);
        }
        String b3 = f72.b();
        if (b3 != null) {
            t62.h(u62.ERROR_CORRECTION_LEVEL, b3);
        }
        if (f72.i()) {
            t62.h(u62.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(f72.g()));
            t62.h(u62.STRUCTURED_APPEND_PARITY, Integer.valueOf(f72.f()));
        }
        return t62;
    }

    public t62 c(h62 h62) throws o62, i62, k62 {
        return b(h62, null);
    }
}
