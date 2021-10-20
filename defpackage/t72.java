package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: t72  reason: default package */
/* compiled from: DataMatrixReader */
public final class t72 implements r62 {
    private static final v62[] b = new v62[0];
    private final x72 a = new x72();

    private static c72 c(c72 c72) throws o62 {
        int[] j = c72.j();
        int[] e = c72.e();
        if (j == null || e == null) {
            throw o62.a();
        }
        int d = d(j, c72);
        int i = j[1];
        int i2 = e[1];
        int i3 = j[0];
        int i4 = ((e[0] - i3) + 1) / d;
        int i5 = ((i2 - i) + 1) / d;
        if (i4 <= 0 || i5 <= 0) {
            throw o62.a();
        }
        int i6 = d / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        c72 c722 = new c72(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * d) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (c72.d((i11 * d) + i8, i10)) {
                    c722.n(i11, i9);
                }
            }
        }
        return c722;
    }

    private static int d(int[] iArr, c72 c72) throws o62 {
        int l = c72.l();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < l && c72.d(i, i2)) {
            i++;
        }
        if (i != l) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw o62.a();
        }
        throw o62.a();
    }

    @Override // defpackage.r62
    public void a() {
    }

    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, i62, k62 {
        v62[] v62Arr;
        f72 f72;
        if (map == null || !map.containsKey(j62.PURE_BARCODE)) {
            h72 c = new z72(h62.a()).c();
            f72 b2 = this.a.b(c.a());
            v62Arr = c.b();
            f72 = b2;
        } else {
            f72 = this.a.b(c(h62.a()));
            v62Arr = b;
        }
        t62 t62 = new t62(f72.h(), f72.e(), v62Arr, f62.DATA_MATRIX);
        List<byte[]> a2 = f72.a();
        if (a2 != null) {
            t62.h(u62.BYTE_SEGMENTS, a2);
        }
        String b3 = f72.b();
        if (b3 != null) {
            t62.h(u62.ERROR_CORRECTION_LEVEL, b3);
        }
        return t62;
    }
}
