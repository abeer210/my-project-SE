package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: y62  reason: default package */
/* compiled from: AztecReader */
public final class y62 implements r62 {
    @Override // defpackage.r62
    public void a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, k62 {
        v62[] v62Arr;
        k62 k62;
        o62 e;
        List<byte[]> a;
        String b;
        w62 w62;
        v62[] v62Arr2;
        k62 e2;
        a72 a72 = new a72(h62.a());
        f72 f72 = null;
        try {
            x62 a2 = a72.a(false);
            v62Arr2 = a2.b();
            try {
                v62Arr = v62Arr2;
                k62 = null;
                f72 = new z62().c(a2);
                e = null;
            } catch (o62 e3) {
                e = e3;
                v62Arr = v62Arr2;
                k62 = null;
                if (f72 == null) {
                }
                while (r11 < r0) {
                }
                t62 t62 = new t62(f72.h(), f72.e(), f72.c(), v62Arr, f62.AZTEC, System.currentTimeMillis());
                a = f72.a();
                if (a != null) {
                }
                b = f72.b();
                if (b != null) {
                }
                return t62;
            } catch (k62 e4) {
                e2 = e4;
                v62Arr = v62Arr2;
                k62 = e2;
                e = null;
                if (f72 == null) {
                }
                while (r11 < r0) {
                }
                t62 t622 = new t62(f72.h(), f72.e(), f72.c(), v62Arr, f62.AZTEC, System.currentTimeMillis());
                a = f72.a();
                if (a != null) {
                }
                b = f72.b();
                if (b != null) {
                }
                return t622;
            }
        } catch (o62 e5) {
            e = e5;
            v62Arr2 = null;
            v62Arr = v62Arr2;
            k62 = null;
            if (f72 == null) {
            }
            while (r11 < r0) {
            }
            t62 t6222 = new t62(f72.h(), f72.e(), f72.c(), v62Arr, f62.AZTEC, System.currentTimeMillis());
            a = f72.a();
            if (a != null) {
            }
            b = f72.b();
            if (b != null) {
            }
            return t6222;
        } catch (k62 e6) {
            e2 = e6;
            v62Arr2 = null;
            v62Arr = v62Arr2;
            k62 = e2;
            e = null;
            if (f72 == null) {
            }
            while (r11 < r0) {
            }
            t62 t62222 = new t62(f72.h(), f72.e(), f72.c(), v62Arr, f62.AZTEC, System.currentTimeMillis());
            a = f72.a();
            if (a != null) {
            }
            b = f72.b();
            if (b != null) {
            }
            return t62222;
        }
        if (f72 == null) {
            try {
                x62 a3 = a72.a(true);
                v62Arr = a3.b();
                f72 = new z62().c(a3);
            } catch (k62 | o62 e7) {
                if (e != null) {
                    throw e;
                } else if (k62 != null) {
                    throw k62;
                } else {
                    throw e7;
                }
            }
        }
        if (!(map == null || (w62 = (w62) map.get(j62.NEED_RESULT_POINT_CALLBACK)) == null)) {
            for (v62 v62 : v62Arr) {
                w62.a(v62);
            }
        }
        t62 t622222 = new t62(f72.h(), f72.e(), f72.c(), v62Arr, f62.AZTEC, System.currentTimeMillis());
        a = f72.a();
        if (a != null) {
            t622222.h(u62.BYTE_SEGMENTS, a);
        }
        b = f72.b();
        if (b != null) {
            t622222.h(u62.ERROR_CORRECTION_LEVEL, b);
        }
        return t622222;
    }
}
