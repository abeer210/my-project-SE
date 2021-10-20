package defpackage;

import java.util.Map;

/* renamed from: a82  reason: default package */
/* compiled from: MaxiCodeReader */
public final class a82 implements r62 {
    private static final v62[] b = new v62[0];
    private final d82 a = new d82();

    private static c72 c(c72 c72) throws o62 {
        int[] f = c72.f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            c72 c722 = new c72(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (c72.d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c722.n(i7, i5);
                    }
                }
            }
            return c722;
        }
        throw o62.a();
    }

    @Override // defpackage.r62
    public void a() {
    }

    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, i62, k62 {
        if (map == null || !map.containsKey(j62.PURE_BARCODE)) {
            throw o62.a();
        }
        f72 b2 = this.a.b(c(h62.a()), map);
        t62 t62 = new t62(b2.h(), b2.e(), b, f62.MAXICODE);
        String b3 = b2.b();
        if (b3 != null) {
            t62.h(u62.ERROR_CORRECTION_LEVEL, b3);
        }
        return t62;
    }
}
