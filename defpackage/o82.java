package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: o82  reason: default package */
/* compiled from: OneDReader */
public abstract class o82 implements r62 {
    private t62 d(h62 h62, Map<j62, ?> map) throws o62 {
        int i;
        Map<j62, ?> map2;
        EnumMap enumMap = map;
        int d = h62.d();
        int c = h62.c();
        b72 b72 = new b72(d);
        char c2 = 0;
        int i2 = 1;
        boolean z = enumMap != null && enumMap.containsKey(j62.TRY_HARDER);
        int max = Math.max(1, c >> (z ? 8 : 5));
        int i3 = z ? c : 15;
        int i4 = c / 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            int i7 = i6 / 2;
            if (!((i5 & 1) == 0)) {
                i7 = -i7;
            }
            int i8 = (i7 * max) + i4;
            if (i8 < 0 || i8 >= c) {
                break;
            }
            try {
                b72 = h62.b(i8, b72);
                int i9 = 0;
                while (i9 < 2) {
                    if (i9 == i2) {
                        b72.l();
                        if (enumMap != null && enumMap.containsKey(j62.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(j62.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(j62.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        t62 c3 = c(i8, b72, enumMap);
                        if (i9 == i2) {
                            c3.h(u62.ORIENTATION, 180);
                            v62[] e = c3.e();
                            if (e != null) {
                                map2 = enumMap;
                                float f = (float) d;
                                try {
                                    i = d;
                                } catch (s62 unused) {
                                    i = d;
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i2 = 1;
                                }
                                try {
                                    e[0] = new v62((f - e[c2].c()) - 1.0f, e[c2].d());
                                    try {
                                        e[1] = new v62((f - e[1].c()) - 1.0f, e[1].d());
                                    } catch (s62 unused2) {
                                        continue;
                                    }
                                } catch (s62 unused3) {
                                    i9++;
                                    enumMap = map2;
                                    d = i;
                                    c2 = 0;
                                    i2 = 1;
                                }
                            }
                        }
                        return c3;
                    } catch (s62 unused4) {
                        map2 = enumMap;
                        i = d;
                        i9++;
                        enumMap = map2;
                        d = i;
                        c2 = 0;
                        i2 = 1;
                    }
                }
                continue;
            } catch (o62 unused5) {
            }
            i5 = i6;
            d = d;
            c2 = 0;
            i2 = 1;
        }
        throw o62.a();
    }

    public static float e(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void f(b72 b72, int i, int[] iArr) throws o62 {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int g = b72.g();
        if (i < g) {
            boolean z = !b72.c(i);
            while (i < g) {
                if (b72.c(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != g) {
                throw o62.a();
            }
            return;
        }
        throw o62.a();
    }

    public static void g(b72 b72, int i, int[] iArr) throws o62 {
        int length = iArr.length;
        boolean c = b72.c(i);
        while (i > 0 && length >= 0) {
            i--;
            if (b72.c(i) != c) {
                length--;
                c = !c;
            }
        }
        if (length < 0) {
            f(b72, i + 1, iArr);
            return;
        }
        throw o62.a();
    }

    @Override // defpackage.r62
    public void a() {
    }

    @Override // defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, k62 {
        try {
            return d(h62, map);
        } catch (o62 e) {
            if (!(map != null && map.containsKey(j62.TRY_HARDER)) || !h62.e()) {
                throw e;
            }
            h62 f = h62.f();
            t62 d = d(f, map);
            Map<u62, Object> d2 = d.d();
            int i = 270;
            if (d2 != null && d2.containsKey(u62.ORIENTATION)) {
                i = (((Integer) d2.get(u62.ORIENTATION)).intValue() + 270) % 360;
            }
            d.h(u62.ORIENTATION, Integer.valueOf(i));
            v62[] e2 = d.e();
            if (e2 != null) {
                int c = f.c();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new v62((((float) c) - e2[i2].d()) - 1.0f, e2[i2].c());
                }
            }
            return d;
        }
    }

    public abstract t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, i62, k62;
}
