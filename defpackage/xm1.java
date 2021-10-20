package defpackage;

import defpackage.kl1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import vigqyno.C0201;

/* renamed from: xm1  reason: default package */
public final class xm1<T> implements in1<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = ho1.y();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final tm1 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final an1 m;
    private final cm1 n;
    private final bo1<?, ?> o;
    private final xk1<?> p;
    private final om1 q;

    private xm1(int[] iArr, Object[] objArr, int i2, int i3, tm1 tm1, boolean z, boolean z2, int[] iArr2, int i4, int i5, an1 an1, cm1 cm1, bo1<?, ?> bo1, xk1<?> xk1, om1 om1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.g = tm1 instanceof kl1;
        this.h = z;
        this.f = xk1 != null && xk1.j(tm1);
        this.i = false;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = an1;
        this.n = cm1;
        this.o = bo1;
        this.p = xk1;
        this.e = tm1;
        this.q = om1;
    }

    private final void A(T t, T t2, int i2) {
        int E = E(i2);
        int i3 = this.a[i2];
        long j2 = (long) (E & 1048575);
        if (u(t2, i3, i2)) {
            Object L = ho1.L(t, j2);
            Object L2 = ho1.L(t2, j2);
            if (L != null && L2 != null) {
                ho1.g(t, j2, nl1.d(L, L2));
                y(t, i3, i2);
            } else if (L2 != null) {
                ho1.g(t, j2, L2);
                y(t, i3, i2);
            }
        }
    }

    private final in1 B(int i2) {
        int i3 = (i2 / 3) << 1;
        in1 in1 = (in1) this.b[i3];
        if (in1 != null) {
            return in1;
        }
        in1<T> a2 = fn1.b().a((Class) this.b[i3 + 1]);
        this.b[i3] = a2;
        return a2;
    }

    private final Object C(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    private final ql1 D(int i2) {
        return (ql1) this.b[((i2 / 3) << 1) + 1];
    }

    private final int E(int i2) {
        return this.a[i2 + 1];
    }

    private final int F(int i2) {
        return this.a[i2 + 2];
    }

    private static boolean G(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final int H(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return P(i2, 0);
    }

    private final boolean I(T t, T t2, int i2) {
        return t(t, i2) == t(t2, i2);
    }

    private static <E> List<E> J(Object obj, long j2) {
        return (List) ho1.L(obj, j2);
    }

    private static <T> double K(T t, long j2) {
        return ((Double) ho1.L(t, j2)).doubleValue();
    }

    private static <T> float L(T t, long j2) {
        return ((Float) ho1.L(t, j2)).floatValue();
    }

    private static <T> int M(T t, long j2) {
        return ((Integer) ho1.L(t, j2)).intValue();
    }

    private static <T> long N(T t, long j2) {
        return ((Long) ho1.L(t, j2)).longValue();
    }

    private static <T> boolean O(T t, long j2) {
        return ((Boolean) ho1.L(t, j2)).booleanValue();
    }

    private final int P(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static <UT, UB> int j(bo1<UT, UB> bo1, T t) {
        return bo1.p(bo1.q(t));
    }

    public static <T> xm1<T> k(Class<T> cls, rm1 rm1, an1 an1, cm1 cm1, bo1<?, ?> bo1, xk1<?> xk1, om1 om1) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        gn1 gn1;
        int i12;
        Class<?> cls2;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        Field field;
        int i18;
        char charAt;
        int i19;
        Field field2;
        Field field3;
        int i20;
        char charAt2;
        int i21;
        char charAt3;
        int i22;
        char charAt4;
        int i23;
        int i24;
        char charAt5;
        int i25;
        char charAt6;
        int i26;
        char charAt7;
        int i27;
        char charAt8;
        int i28;
        char charAt9;
        int i29;
        char charAt10;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        char charAt14;
        if (rm1 instanceof gn1) {
            gn1 gn12 = (gn1) rm1;
            int i33 = 0;
            boolean z2 = gn12.b() == kl1.f.j;
            String d2 = gn12.d();
            int length = d2.length();
            int charAt15 = d2.charAt(0);
            if (charAt15 >= 55296) {
                int i34 = charAt15 & 8191;
                int i35 = 1;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt14 = d2.charAt(i35);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i34 |= (charAt14 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt15 = i34 | (charAt14 << i36);
            } else {
                i2 = 1;
            }
            int i37 = i2 + 1;
            int charAt16 = d2.charAt(i2);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i32 = i37 + 1;
                    charAt13 = d2.charAt(i37);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i38 |= (charAt13 & 8191) << i39;
                    i39 += 13;
                    i37 = i32;
                }
                charAt16 = i38 | (charAt13 << i39);
                i37 = i32;
            }
            if (charAt16 == 0) {
                iArr = r;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i40 = i37 + 1;
                int charAt17 = d2.charAt(i37);
                if (charAt17 >= 55296) {
                    int i41 = charAt17 & 8191;
                    int i42 = 13;
                    while (true) {
                        i31 = i40 + 1;
                        charAt12 = d2.charAt(i40);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i41 |= (charAt12 & 8191) << i42;
                        i42 += 13;
                        i40 = i31;
                    }
                    charAt17 = i41 | (charAt12 << i42);
                    i40 = i31;
                }
                int i43 = i40 + 1;
                int charAt18 = d2.charAt(i40);
                if (charAt18 >= 55296) {
                    int i44 = charAt18 & 8191;
                    int i45 = 13;
                    while (true) {
                        i30 = i43 + 1;
                        charAt11 = d2.charAt(i43);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i44 |= (charAt11 & 8191) << i45;
                        i45 += 13;
                        i43 = i30;
                    }
                    charAt18 = i44 | (charAt11 << i45);
                    i43 = i30;
                }
                int i46 = i43 + 1;
                i6 = d2.charAt(i43);
                if (i6 >= 55296) {
                    int i47 = i6 & 8191;
                    int i48 = 13;
                    while (true) {
                        i29 = i46 + 1;
                        charAt10 = d2.charAt(i46);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i47 |= (charAt10 & 8191) << i48;
                        i48 += 13;
                        i46 = i29;
                    }
                    i6 = i47 | (charAt10 << i48);
                    i46 = i29;
                }
                int i49 = i46 + 1;
                int charAt19 = d2.charAt(i46);
                if (charAt19 >= 55296) {
                    int i50 = charAt19 & 8191;
                    int i51 = 13;
                    while (true) {
                        i28 = i49 + 1;
                        charAt9 = d2.charAt(i49);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i50 |= (charAt9 & 8191) << i51;
                        i51 += 13;
                        i49 = i28;
                    }
                    charAt19 = i50 | (charAt9 << i51);
                    i49 = i28;
                }
                int i52 = i49 + 1;
                i4 = d2.charAt(i49);
                if (i4 >= 55296) {
                    int i53 = i4 & 8191;
                    int i54 = 13;
                    while (true) {
                        i27 = i52 + 1;
                        charAt8 = d2.charAt(i52);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i53 |= (charAt8 & 8191) << i54;
                        i54 += 13;
                        i52 = i27;
                    }
                    i4 = i53 | (charAt8 << i54);
                    i52 = i27;
                }
                int i55 = i52 + 1;
                int charAt20 = d2.charAt(i52);
                if (charAt20 >= 55296) {
                    int i56 = charAt20 & 8191;
                    int i57 = 13;
                    while (true) {
                        i26 = i55 + 1;
                        charAt7 = d2.charAt(i55);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i56 |= (charAt7 & 8191) << i57;
                        i57 += 13;
                        i55 = i26;
                    }
                    charAt20 = i56 | (charAt7 << i57);
                    i55 = i26;
                }
                int i58 = i55 + 1;
                int charAt21 = d2.charAt(i55);
                if (charAt21 >= 55296) {
                    int i59 = charAt21 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i25 = i60 + 1;
                        charAt6 = d2.charAt(i60);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i59 |= (charAt6 & 8191) << i61;
                        i61 += 13;
                        i60 = i25;
                    }
                    charAt21 = i59 | (charAt6 << i61);
                    i23 = i25;
                } else {
                    i23 = i58;
                }
                int i62 = i23 + 1;
                int charAt22 = d2.charAt(i23);
                if (charAt22 >= 55296) {
                    int i63 = charAt22 & 8191;
                    int i64 = i62;
                    int i65 = 13;
                    while (true) {
                        i24 = i64 + 1;
                        charAt5 = d2.charAt(i64);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i63 |= (charAt5 & 8191) << i65;
                        i65 += 13;
                        i64 = i24;
                    }
                    charAt22 = i63 | (charAt5 << i65);
                    i62 = i24;
                }
                int i66 = (charAt17 << 1) + charAt18;
                i7 = charAt19;
                i5 = i66;
                i3 = charAt22;
                i33 = charAt17;
                i37 = i62;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                i8 = charAt20;
            }
            Unsafe unsafe = s;
            Object[] e2 = gn12.e();
            Class<?> cls3 = gn12.a().getClass();
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i67 = i3 + i8;
            int i68 = i3;
            int i69 = i37;
            int i70 = i67;
            int i71 = 0;
            int i72 = 0;
            while (i69 < length) {
                int i73 = i69 + 1;
                int charAt23 = d2.charAt(i69);
                if (charAt23 >= 55296) {
                    int i74 = charAt23 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i22 = i75 + 1;
                        charAt4 = d2.charAt(i75);
                        i9 = i3;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i74 |= (charAt4 & 8191) << i76;
                        i76 += 13;
                        i75 = i22;
                        i3 = i9;
                    }
                    charAt23 = i74 | (charAt4 << i76);
                    i10 = i22;
                } else {
                    i9 = i3;
                    i10 = i73;
                }
                int i77 = i10 + 1;
                int charAt24 = d2.charAt(i10);
                if (charAt24 >= 55296) {
                    int i78 = charAt24 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i21 = i79 + 1;
                        charAt3 = d2.charAt(i79);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        i78 |= (charAt3 & 8191) << i80;
                        i80 += 13;
                        i79 = i21;
                        z2 = z;
                    }
                    charAt24 = i78 | (charAt3 << i80);
                    i11 = i21;
                } else {
                    z = z2;
                    i11 = i77;
                }
                int i81 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr[i71] = i72;
                    i71++;
                }
                if (i81 >= 51) {
                    int i82 = i11 + 1;
                    int charAt25 = d2.charAt(i11);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i83 = charAt25 & 8191;
                        int i84 = 13;
                        while (true) {
                            i20 = i82 + 1;
                            charAt2 = d2.charAt(i82);
                            if (charAt2 < c2) {
                                break;
                            }
                            i83 |= (charAt2 & 8191) << i84;
                            i84 += 13;
                            i82 = i20;
                            c2 = 55296;
                        }
                        charAt25 = i83 | (charAt2 << i84);
                        i82 = i20;
                    }
                    int i85 = i81 - 51;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    } else if (i85 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i72 / 3) << 1) + 1] = e2[i5];
                        i5++;
                    }
                    int i86 = charAt25 << 1;
                    Object obj = e2[i86];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = n(cls3, (String) obj);
                        e2[i86] = field2;
                    }
                    gn1 = gn12;
                    i15 = (int) unsafe.objectFieldOffset(field2);
                    int i87 = i86 + 1;
                    Object obj2 = e2[i87];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = n(cls3, (String) obj2);
                        e2[i87] = field3;
                    }
                    cls2 = cls3;
                    i12 = i5;
                    i11 = i82;
                    str = d2;
                    i13 = 0;
                    i14 = (int) unsafe.objectFieldOffset(field3);
                    i16 = i33;
                } else {
                    gn1 = gn12;
                    int i88 = i5 + 1;
                    Field n2 = n(cls3, (String) e2[i5]);
                    if (i81 == 9 || i81 == 17) {
                        i17 = 1;
                        objArr[((i72 / 3) << 1) + 1] = n2.getType();
                    } else {
                        if (i81 == 27 || i81 == 49) {
                            i17 = 1;
                            i19 = i88 + 1;
                            objArr[((i72 / 3) << 1) + 1] = e2[i88];
                        } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i17 = 1;
                            if ((charAt15 & 1) == 1) {
                                i19 = i88 + 1;
                                objArr[((i72 / 3) << 1) + 1] = e2[i88];
                            }
                        } else {
                            if (i81 == 50) {
                                int i89 = i68 + 1;
                                iArr[i68] = i72;
                                int i90 = (i72 / 3) << 1;
                                int i91 = i88 + 1;
                                objArr[i90] = e2[i88];
                                if ((charAt24 & 2048) != 0) {
                                    i88 = i91 + 1;
                                    objArr[i90 + 1] = e2[i91];
                                    i68 = i89;
                                } else {
                                    i88 = i91;
                                    i17 = 1;
                                    i68 = i89;
                                }
                            }
                            i17 = 1;
                        }
                        i88 = i19;
                    }
                    i15 = (int) unsafe.objectFieldOffset(n2);
                    if ((charAt15 & 1) != i17 || i81 > 17) {
                        i12 = i88;
                        i16 = i33;
                        cls2 = cls3;
                        str = d2;
                        i14 = 0;
                        i13 = 0;
                    } else {
                        int i92 = i11 + 1;
                        str = d2;
                        int charAt26 = str.charAt(i11);
                        if (charAt26 >= 55296) {
                            int i93 = charAt26 & 8191;
                            int i94 = 13;
                            while (true) {
                                i18 = i92 + 1;
                                charAt = str.charAt(i92);
                                if (charAt < 55296) {
                                    break;
                                }
                                i93 |= (charAt & 8191) << i94;
                                i94 += 13;
                                i92 = i18;
                            }
                            charAt26 = i93 | (charAt << i94);
                            i92 = i18;
                        }
                        int i95 = (i33 << 1) + (charAt26 / 32);
                        Object obj3 = e2[i95];
                        i12 = i88;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = n(cls3, (String) obj3);
                            e2[i95] = field;
                        }
                        i16 = i33;
                        cls2 = cls3;
                        i14 = (int) unsafe.objectFieldOffset(field);
                        i13 = charAt26 % 32;
                        i11 = i92;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = i15;
                        i70++;
                    }
                }
                int i96 = i72 + 1;
                iArr2[i72] = charAt23;
                int i97 = i96 + 1;
                iArr2[i96] = i15 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 << 20);
                i72 = i97 + 1;
                iArr2[i97] = (i13 << 20) | i14;
                i33 = i16;
                d2 = str;
                i69 = i11;
                cls3 = cls2;
                i7 = i7;
                length = length;
                i3 = i9;
                z2 = z;
                i6 = i6;
                i5 = i12;
                gn12 = gn1;
            }
            return new xm1<>(iArr2, objArr, i6, i7, gn12.a(), z2, false, iArr, i3, i67, an1, cm1, bo1, xk1, om1);
        }
        ((wn1) rm1).b();
        throw null;
    }

    private final <K, V, UT, UB> UB l(int i2, int i3, Map<K, V> map, ql1 ql1, UB ub, bo1<UT, UB> bo1) {
        lm1<?, ?> f2 = this.q.f(C(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!ql1.a(next.getValue().intValue())) {
                if (ub == null) {
                    ub = bo1.n();
                }
                gk1 f3 = bk1.f(km1.a(f2, next.getKey(), next.getValue()));
                try {
                    km1.b(f3.b(), f2, next.getKey(), next.getValue());
                    bo1.b(ub, i3, f3.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB m(Object obj, int i2, UB ub, bo1<UT, UB> bo1) {
        ql1 D;
        int i3 = this.a[i2];
        Object L = ho1.L(obj, (long) (E(i2) & 1048575));
        return (L == null || (D = D(i2)) == null) ? ub : (UB) l(i2, i3, (Map<K, V>) this.q.c(L), D, ub, bo1);
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append(C0201.m82(21448));
            sb.append(str);
            sb.append(C0201.m82(21449));
            sb.append(name);
            sb.append(C0201.m82(21450));
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void o(int i2, Object obj, xo1 xo1) throws IOException {
        if (obj instanceof String) {
            xo1.C(i2, (String) obj);
        } else {
            xo1.K(i2, (bk1) obj);
        }
    }

    private static <UT, UB> void p(bo1<UT, UB> bo1, T t, xo1 xo1) throws IOException {
        bo1.d(bo1.q(t), xo1);
    }

    private final <K, V> void q(xo1 xo1, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            xo1.D(i2, this.q.f(C(i3)), this.q.h(obj));
        }
    }

    private final void r(Object obj, int i2, hn1 hn1) throws IOException {
        if (G(i2)) {
            ho1.g(obj, (long) (i2 & 1048575), hn1.r());
        } else if (this.g) {
            ho1.g(obj, (long) (i2 & 1048575), hn1.k());
        } else {
            ho1.g(obj, (long) (i2 & 1048575), hn1.u());
        }
    }

    private final void s(T t, T t2, int i2) {
        long E = (long) (E(i2) & 1048575);
        if (t(t2, i2)) {
            Object L = ho1.L(t, E);
            Object L2 = ho1.L(t2, E);
            if (L != null && L2 != null) {
                ho1.g(t, E, nl1.d(L, L2));
                x(t, i2);
            } else if (L2 != null) {
                ho1.g(t, E, L2);
                x(t, i2);
            }
        }
    }

    private final boolean t(T t, int i2) {
        if (this.h) {
            int E = E(i2);
            long j2 = (long) (E & 1048575);
            switch ((E & 267386880) >>> 20) {
                case 0:
                    return ho1.K(t, j2) != 0.0d;
                case 1:
                    return ho1.J(t, j2) != 0.0f;
                case 2:
                    return ho1.H(t, j2) != 0;
                case 3:
                    return ho1.H(t, j2) != 0;
                case 4:
                    return ho1.F(t, j2) != 0;
                case 5:
                    return ho1.H(t, j2) != 0;
                case 6:
                    return ho1.F(t, j2) != 0;
                case 7:
                    return ho1.I(t, j2);
                case 8:
                    Object L = ho1.L(t, j2);
                    if (L instanceof String) {
                        return !((String) L).isEmpty();
                    }
                    if (L instanceof bk1) {
                        return !bk1.b.equals(L);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return ho1.L(t, j2) != null;
                case 10:
                    return !bk1.b.equals(ho1.L(t, j2));
                case 11:
                    return ho1.F(t, j2) != 0;
                case 12:
                    return ho1.F(t, j2) != 0;
                case 13:
                    return ho1.F(t, j2) != 0;
                case 14:
                    return ho1.H(t, j2) != 0;
                case 15:
                    return ho1.F(t, j2) != 0;
                case 16:
                    return ho1.H(t, j2) != 0;
                case 17:
                    return ho1.L(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int F = F(i2);
            return (ho1.F(t, (long) (F & 1048575)) & (1 << (F >>> 20))) != 0;
        }
    }

    private final boolean u(T t, int i2, int i3) {
        return ho1.F(t, (long) (F(i3) & 1048575)) == i2;
    }

    private final boolean v(T t, int i2, int i3, int i4) {
        if (this.h) {
            return t(t, i2);
        }
        return (i3 & i4) != 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: in1 */
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean w(Object obj, int i2, in1 in1) {
        return in1.c(ho1.L(obj, (long) (i2 & 1048575)));
    }

    private final void x(T t, int i2) {
        if (!this.h) {
            int F = F(i2);
            long j2 = (long) (F & 1048575);
            ho1.n(t, j2, ho1.F(t, j2) | (1 << (F >>> 20)));
        }
    }

    private final void y(T t, int i2, int i3) {
        ho1.n(t, (long) (F(i3) & 1048575), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    private final void z(T t, xo1 xo1) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        int i3;
        int i4;
        if (this.f) {
            bl1<?> g2 = this.p.g(t);
            if (!g2.b()) {
                it = g2.e();
                entry = it.next();
                int i5 = -1;
                length = this.a.length;
                Unsafe unsafe = s;
                int i6 = 0;
                for (i2 = 0; i2 < length; i2 = i3 + 3) {
                    int E = E(i2);
                    int[] iArr = this.a;
                    int i7 = iArr[i2];
                    int i8 = (267386880 & E) >>> 20;
                    if (this.h || i8 > 17) {
                        i3 = i2;
                        i4 = 0;
                    } else {
                        int i9 = iArr[i2 + 2];
                        int i10 = i9 & 1048575;
                        i3 = i2;
                        if (i10 != i5) {
                            i6 = unsafe.getInt(t, (long) i10);
                            i5 = i10;
                        }
                        i4 = 1 << (i9 >>> 20);
                    }
                    while (entry != null && this.p.a(entry) <= i7) {
                        this.p.f(xo1, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    long j2 = (long) (E & 1048575);
                    switch (i8) {
                        case 0:
                            if ((i4 & i6) != 0) {
                                xo1.p(i7, ho1.K(t, j2));
                                continue;
                            }
                        case 1:
                            if ((i4 & i6) != 0) {
                                xo1.q(i7, ho1.J(t, j2));
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i4 & i6) != 0) {
                                xo1.l(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i4 & i6) != 0) {
                                xo1.o(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i4 & i6) != 0) {
                                xo1.z(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i4 & i6) != 0) {
                                xo1.g(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i4 & i6) != 0) {
                                xo1.G(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i4 & i6) != 0) {
                                xo1.f(i7, ho1.I(t, j2));
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i4 & i6) != 0) {
                                o(i7, unsafe.getObject(t, j2), xo1);
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i4 & i6) != 0) {
                                xo1.B(i7, unsafe.getObject(t, j2), B(i3));
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i4 & i6) != 0) {
                                xo1.K(i7, (bk1) unsafe.getObject(t, j2));
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i4 & i6) != 0) {
                                xo1.s(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i4 & i6) != 0) {
                                xo1.O(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i4 & i6) != 0) {
                                xo1.M(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i4 & i6) != 0) {
                                xo1.a(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i4 & i6) != 0) {
                                xo1.N(i7, unsafe.getInt(t, j2));
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i4 & i6) != 0) {
                                xo1.c(i7, unsafe.getLong(t, j2));
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i4 & i6) != 0) {
                                xo1.E(i7, unsafe.getObject(t, j2), B(i3));
                            } else {
                                continue;
                            }
                        case 18:
                            kn1.f(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 19:
                            kn1.l(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 20:
                            kn1.p(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 21:
                            kn1.s(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 22:
                            kn1.D(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 23:
                            kn1.v(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 24:
                            kn1.H(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 25:
                            kn1.K(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 26:
                            kn1.d(this.a[i3], (List) unsafe.getObject(t, j2), xo1);
                            break;
                        case 27:
                            kn1.e(this.a[i3], (List) unsafe.getObject(t, j2), xo1, B(i3));
                            break;
                        case 28:
                            kn1.j(this.a[i3], (List) unsafe.getObject(t, j2), xo1);
                            break;
                        case 29:
                            kn1.E(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 30:
                            kn1.J(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 31:
                            kn1.I(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 32:
                            kn1.w(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 33:
                            kn1.F(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 34:
                            kn1.u(this.a[i3], (List) unsafe.getObject(t, j2), xo1, false);
                            continue;
                        case 35:
                            kn1.f(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 36:
                            kn1.l(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 37:
                            kn1.p(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 38:
                            kn1.s(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 39:
                            kn1.D(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 40:
                            kn1.v(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 41:
                            kn1.H(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 42:
                            kn1.K(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 43:
                            kn1.E(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 44:
                            kn1.J(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 45:
                            kn1.I(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 46:
                            kn1.w(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 47:
                            kn1.F(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 48:
                            kn1.u(this.a[i3], (List) unsafe.getObject(t, j2), xo1, true);
                            break;
                        case 49:
                            kn1.k(this.a[i3], (List) unsafe.getObject(t, j2), xo1, B(i3));
                            break;
                        case 50:
                            q(xo1, i7, unsafe.getObject(t, j2), i3);
                            break;
                        case 51:
                            if (u(t, i7, i3)) {
                                xo1.p(i7, K(t, j2));
                                break;
                            }
                            break;
                        case 52:
                            if (u(t, i7, i3)) {
                                xo1.q(i7, L(t, j2));
                                break;
                            }
                            break;
                        case 53:
                            if (u(t, i7, i3)) {
                                xo1.l(i7, N(t, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (u(t, i7, i3)) {
                                xo1.o(i7, N(t, j2));
                                break;
                            }
                            break;
                        case 55:
                            if (u(t, i7, i3)) {
                                xo1.z(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (u(t, i7, i3)) {
                                xo1.g(i7, N(t, j2));
                                break;
                            }
                            break;
                        case 57:
                            if (u(t, i7, i3)) {
                                xo1.G(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 58:
                            if (u(t, i7, i3)) {
                                xo1.f(i7, O(t, j2));
                                break;
                            }
                            break;
                        case 59:
                            if (u(t, i7, i3)) {
                                o(i7, unsafe.getObject(t, j2), xo1);
                                break;
                            }
                            break;
                        case 60:
                            if (u(t, i7, i3)) {
                                xo1.B(i7, unsafe.getObject(t, j2), B(i3));
                                break;
                            }
                            break;
                        case 61:
                            if (u(t, i7, i3)) {
                                xo1.K(i7, (bk1) unsafe.getObject(t, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (u(t, i7, i3)) {
                                xo1.s(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (u(t, i7, i3)) {
                                xo1.O(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (u(t, i7, i3)) {
                                xo1.M(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 65:
                            if (u(t, i7, i3)) {
                                xo1.a(i7, N(t, j2));
                                break;
                            }
                            break;
                        case 66:
                            if (u(t, i7, i3)) {
                                xo1.N(i7, M(t, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (u(t, i7, i3)) {
                                xo1.c(i7, N(t, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (u(t, i7, i3)) {
                                xo1.E(i7, unsafe.getObject(t, j2), B(i3));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.p.f(xo1, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                p(this.o, t, xo1);
            }
        }
        it = null;
        entry = null;
        int i52 = -1;
        length = this.a.length;
        Unsafe unsafe2 = s;
        int i62 = 0;
        while (i2 < length) {
        }
        while (entry != null) {
        }
        p(this.o, t, xo1);
    }

    @Override // defpackage.in1
    public final void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                int E = E(i2);
                long j2 = (long) (1048575 & E);
                int i3 = this.a[i2];
                switch ((E & 267386880) >>> 20) {
                    case 0:
                        if (t(t2, i2)) {
                            ho1.d(t, j2, ho1.K(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (t(t2, i2)) {
                            ho1.e(t, j2, ho1.J(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (t(t2, i2)) {
                            ho1.f(t, j2, ho1.H(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (t(t2, i2)) {
                            ho1.f(t, j2, ho1.H(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (t(t2, i2)) {
                            ho1.f(t, j2, ho1.H(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (t(t2, i2)) {
                            ho1.h(t, j2, ho1.I(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (t(t2, i2)) {
                            ho1.g(t, j2, ho1.L(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        s(t, t2, i2);
                        break;
                    case 10:
                        if (t(t2, i2)) {
                            ho1.g(t, j2, ho1.L(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (t(t2, i2)) {
                            ho1.f(t, j2, ho1.H(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (t(t2, i2)) {
                            ho1.n(t, j2, ho1.F(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (t(t2, i2)) {
                            ho1.f(t, j2, ho1.H(t2, j2));
                            x(t, i2);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        s(t, t2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.b(t, t2, j2);
                        break;
                    case 50:
                        kn1.h(this.q, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (u(t2, i3, i2)) {
                            ho1.g(t, j2, ho1.L(t2, j2));
                            y(t, i3, i2);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        A(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (u(t2, i3, i2)) {
                            ho1.g(t, j2, ho1.L(t2, j2));
                            y(t, i3, i2);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        A(t, t2, i2);
                        break;
                }
            }
            if (!this.h) {
                kn1.i(this.o, t, t2);
                if (this.f) {
                    kn1.g(this.p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.in1
    public final void b(T t) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long E = (long) (E(this.j[i3]) & 1048575);
            Object L = ho1.L(t, E);
            if (L != null) {
                ho1.g(t, E, this.q.b(L));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.c(t, (long) this.j[i2]);
            i2++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.i(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [in1] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [in1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.in1
    public final boolean c(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.k) {
                return !this.f || this.p.g(t).d();
            }
            int i6 = this.j[i4];
            int i7 = this.a[i6];
            int E = E(i6);
            if (!this.h) {
                int i8 = this.a[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = s.getInt(t, (long) i9);
                    i3 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & E) != 0) && !v(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & E) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (u(t, i7, i6) && !w(t, E, B(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            Map<?, ?> h2 = this.q.h(ho1.L(t, (long) (E & 1048575)));
                            if (!h2.isEmpty()) {
                                if (this.q.f(C(i6)).c.b() == wo1.MESSAGE) {
                                    in1<T> in1 = 0;
                                    Iterator<?> it = h2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (in1 == null) {
                                            in1 = fn1.b().a(next.getClass());
                                        }
                                        boolean c2 = in1.c(next);
                                        in1 = in1;
                                        if (!c2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) ho1.L(t, (long) (E & 1048575));
                if (!list.isEmpty()) {
                    ?? B = B(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!B.c(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (v(t, i6, i5, i2) && !w(t, E, B(i6))) {
                return false;
            }
            i4++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (defpackage.kn1.t(defpackage.ho1.L(r10, r6), defpackage.ho1.L(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (defpackage.ho1.H(r10, r6) == defpackage.ho1.H(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (defpackage.ho1.H(r10, r6) == defpackage.ho1.H(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (defpackage.kn1.t(defpackage.ho1.L(r10, r6), defpackage.ho1.L(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (defpackage.kn1.t(defpackage.ho1.L(r10, r6), defpackage.ho1.L(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (defpackage.kn1.t(defpackage.ho1.L(r10, r6), defpackage.ho1.L(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (defpackage.ho1.I(r10, r6) == defpackage.ho1.I(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (defpackage.ho1.H(r10, r6) == defpackage.ho1.H(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (defpackage.ho1.F(r10, r6) == defpackage.ho1.F(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (defpackage.ho1.H(r10, r6) == defpackage.ho1.H(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (defpackage.ho1.H(r10, r6) == defpackage.ho1.H(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.ho1.J(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.ho1.J(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.ho1.K(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.ho1.K(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.kn1.t(defpackage.ho1.L(r10, r6), defpackage.ho1.L(r11, r6)) != false) goto L_0x01c2;
     */
    @Override // defpackage.in1
    public final boolean d(T t, T t2) {
        int length = this.a.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int E = E(i2);
                long j2 = (long) (E & 1048575);
                switch ((E & 267386880) >>> 20) {
                    case 0:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (I(t, t2, i2)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = kn1.t(ho1.L(t, j2), ho1.L(t2, j2));
                        break;
                    case 50:
                        z = kn1.t(ho1.L(t, j2), ho1.L(t2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long F = (long) (F(i2) & 1048575);
                        if (ho1.F(t, F) == ho1.F(t2, F)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i2 += 3;
            } else if (!this.o.q(t).equals(this.o.q(t2))) {
                return false;
            } else {
                if (this.f) {
                    return this.p.g(t).equals(this.p.g(t2));
                }
                return true;
            }
        }
    }

    @Override // defpackage.in1
    public final T e() {
        return (T) this.m.a(this.e);
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.instructions.IndexInsnNode.isSame(IndexInsnNode.java:36)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    @Override // defpackage.in1
    public final void f(T r13, defpackage.hn1 r14, defpackage.wk1 r15) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1646
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm1.f(java.lang.Object, hn1, wk1):void");
    }

    @Override // defpackage.in1
    public final int g(T t) {
        int i2;
        int i3;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int E = E(i5);
            int i6 = this.a[i5];
            long j2 = (long) (1048575 & E);
            int i7 = 37;
            switch ((E & 267386880) >>> 20) {
                case 0:
                    i3 = i4 * 53;
                    i2 = nl1.j(Double.doubleToLongBits(ho1.K(t, j2)));
                    i4 = i3 + i2;
                    break;
                case 1:
                    i3 = i4 * 53;
                    i2 = Float.floatToIntBits(ho1.J(t, j2));
                    i4 = i3 + i2;
                    break;
                case 2:
                    i3 = i4 * 53;
                    i2 = nl1.j(ho1.H(t, j2));
                    i4 = i3 + i2;
                    break;
                case 3:
                    i3 = i4 * 53;
                    i2 = nl1.j(ho1.H(t, j2));
                    i4 = i3 + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 5:
                    i3 = i4 * 53;
                    i2 = nl1.j(ho1.H(t, j2));
                    i4 = i3 + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    i2 = nl1.h(ho1.I(t, j2));
                    i4 = i3 + i2;
                    break;
                case 8:
                    i3 = i4 * 53;
                    i2 = ((String) ho1.L(t, j2)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 9:
                    Object L = ho1.L(t, j2);
                    if (L != null) {
                        i7 = L.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i3 = i4 * 53;
                    i2 = ho1.L(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 12:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 13:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 14:
                    i3 = i4 * 53;
                    i2 = nl1.j(ho1.H(t, j2));
                    i4 = i3 + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    i2 = ho1.F(t, j2);
                    i4 = i3 + i2;
                    break;
                case 16:
                    i3 = i4 * 53;
                    i2 = nl1.j(ho1.H(t, j2));
                    i4 = i3 + i2;
                    break;
                case 17:
                    Object L2 = ho1.L(t, j2);
                    if (L2 != null) {
                        i7 = L2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i4 * 53;
                    i2 = ho1.L(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 50:
                    i3 = i4 * 53;
                    i2 = ho1.L(t, j2).hashCode();
                    i4 = i3 + i2;
                    break;
                case 51:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(Double.doubleToLongBits(K(t, j2)));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = Float.floatToIntBits(L(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(N(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(N(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(N(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.h(O(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = ((String) ho1.L(t, j2)).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = ho1.L(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = ho1.L(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(N(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = M(t, j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = nl1.j(N(t, j2));
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(t, i6, i5)) {
                        i3 = i4 * 53;
                        i2 = ho1.L(t, j2).hashCode();
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.o.q(t).hashCode();
        return this.f ? (hashCode * 53) + this.p.g(t).hashCode() : hashCode;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.in1
    public final int h(T t) {
        int i2;
        int i3;
        long j2;
        int i4;
        int T;
        int i5;
        int i6;
        int i7;
        int i8;
        int A;
        int i9;
        int i10;
        int i11;
        int i12 = 267386880;
        if (this.h) {
            Unsafe unsafe = s;
            int i13 = 0;
            int i14 = 0;
            while (i13 < this.a.length) {
                int E = E(i13);
                int i15 = (E & i12) >>> 20;
                int i16 = this.a[i13];
                long j3 = (long) (E & 1048575);
                int i17 = (i15 < el1.DOUBLE_LIST_PACKED.b() || i15 > el1.SINT64_LIST_PACKED.b()) ? 0 : this.a[i13 + 2] & 1048575;
                switch (i15) {
                    case 0:
                        if (t(t, i13)) {
                            A = qk1.A(i16, 0.0d);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 1:
                        if (t(t, i13)) {
                            A = qk1.B(i16, 0.0f);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 2:
                        if (t(t, i13)) {
                            A = qk1.X(i16, ho1.H(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 3:
                        if (t(t, i13)) {
                            A = qk1.d0(i16, ho1.H(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 4:
                        if (t(t, i13)) {
                            A = qk1.x0(i16, ho1.F(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 5:
                        if (t(t, i13)) {
                            A = qk1.o0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 6:
                        if (t(t, i13)) {
                            A = qk1.E0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 7:
                        if (t(t, i13)) {
                            A = qk1.T(i16, true);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 8:
                        if (t(t, i13)) {
                            Object L = ho1.L(t, j3);
                            if (L instanceof bk1) {
                                A = qk1.Q(i16, (bk1) L);
                                break;
                            } else {
                                A = qk1.E(i16, (String) L);
                                break;
                            }
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 9:
                        if (t(t, i13)) {
                            A = kn1.m(i16, ho1.L(t, j3), B(i13));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 10:
                        if (t(t, i13)) {
                            A = qk1.Q(i16, (bk1) ho1.L(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 11:
                        if (t(t, i13)) {
                            A = qk1.A0(i16, ho1.F(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 12:
                        if (t(t, i13)) {
                            A = qk1.J0(i16, ho1.F(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 13:
                        if (t(t, i13)) {
                            A = qk1.G0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 14:
                        if (t(t, i13)) {
                            A = qk1.s0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 15:
                        if (t(t, i13)) {
                            A = qk1.C0(i16, ho1.F(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 16:
                        if (t(t, i13)) {
                            A = qk1.i0(i16, ho1.H(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 17:
                        if (t(t, i13)) {
                            A = qk1.S(i16, (tm1) ho1.L(t, j3), B(i13));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 18:
                        A = kn1.Z(i16, J(t, j3), false);
                        break;
                    case 19:
                        A = kn1.X(i16, J(t, j3), false);
                        break;
                    case 20:
                        A = kn1.L(i16, J(t, j3), false);
                        break;
                    case 21:
                        A = kn1.M(i16, J(t, j3), false);
                        break;
                    case 22:
                        A = kn1.R(i16, J(t, j3), false);
                        break;
                    case 23:
                        A = kn1.Z(i16, J(t, j3), false);
                        break;
                    case 24:
                        A = kn1.X(i16, J(t, j3), false);
                        break;
                    case 25:
                        A = kn1.b0(i16, J(t, j3), false);
                        break;
                    case 26:
                        A = kn1.n(i16, J(t, j3));
                        break;
                    case 27:
                        A = kn1.o(i16, J(t, j3), B(i13));
                        break;
                    case 28:
                        A = kn1.q(i16, J(t, j3));
                        break;
                    case 29:
                        A = kn1.T(i16, J(t, j3), false);
                        break;
                    case 30:
                        A = kn1.P(i16, J(t, j3), false);
                        break;
                    case 31:
                        A = kn1.X(i16, J(t, j3), false);
                        break;
                    case 32:
                        A = kn1.Z(i16, J(t, j3), false);
                        break;
                    case 33:
                        A = kn1.V(i16, J(t, j3), false);
                        break;
                    case 34:
                        A = kn1.N(i16, J(t, j3), false);
                        break;
                    case 35:
                        i10 = kn1.d0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 36:
                        i10 = kn1.c0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 37:
                        i10 = kn1.O((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 38:
                        i10 = kn1.Q((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 39:
                        i10 = kn1.W((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 40:
                        i10 = kn1.d0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 41:
                        i10 = kn1.c0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 42:
                        i10 = kn1.e0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 43:
                        i10 = kn1.Y((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 44:
                        i10 = kn1.U((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 45:
                        i10 = kn1.c0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 46:
                        i10 = kn1.d0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 47:
                        i10 = kn1.a0((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 48:
                        i10 = kn1.S((List) unsafe.getObject(t, j3));
                        if (i10 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, (long) i17, i10);
                            }
                            i11 = qk1.u(i16);
                            i9 = qk1.w(i10);
                            A = i11 + i9 + i10;
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 49:
                        A = kn1.r(i16, J(t, j3), B(i13));
                        break;
                    case 50:
                        A = this.q.d(i16, ho1.L(t, j3), C(i13));
                        break;
                    case 51:
                        if (u(t, i16, i13)) {
                            A = qk1.A(i16, 0.0d);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 52:
                        if (u(t, i16, i13)) {
                            A = qk1.B(i16, 0.0f);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 53:
                        if (u(t, i16, i13)) {
                            A = qk1.X(i16, N(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 54:
                        if (u(t, i16, i13)) {
                            A = qk1.d0(i16, N(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 55:
                        if (u(t, i16, i13)) {
                            A = qk1.x0(i16, M(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 56:
                        if (u(t, i16, i13)) {
                            A = qk1.o0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 57:
                        if (u(t, i16, i13)) {
                            A = qk1.E0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 58:
                        if (u(t, i16, i13)) {
                            A = qk1.T(i16, true);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 59:
                        if (u(t, i16, i13)) {
                            Object L2 = ho1.L(t, j3);
                            if (L2 instanceof bk1) {
                                A = qk1.Q(i16, (bk1) L2);
                                break;
                            } else {
                                A = qk1.E(i16, (String) L2);
                                break;
                            }
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 60:
                        if (u(t, i16, i13)) {
                            A = kn1.m(i16, ho1.L(t, j3), B(i13));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 61:
                        if (u(t, i16, i13)) {
                            A = qk1.Q(i16, (bk1) ho1.L(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 62:
                        if (u(t, i16, i13)) {
                            A = qk1.A0(i16, M(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 63:
                        if (u(t, i16, i13)) {
                            A = qk1.J0(i16, M(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 64:
                        if (u(t, i16, i13)) {
                            A = qk1.G0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 65:
                        if (u(t, i16, i13)) {
                            A = qk1.s0(i16, 0);
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 66:
                        if (u(t, i16, i13)) {
                            A = qk1.C0(i16, M(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 67:
                        if (u(t, i16, i13)) {
                            A = qk1.i0(i16, N(t, j3));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    case 68:
                        if (u(t, i16, i13)) {
                            A = qk1.S(i16, (tm1) ho1.L(t, j3), B(i13));
                            break;
                        } else {
                            continue;
                            i13 += 3;
                            i12 = 267386880;
                        }
                    default:
                        i13 += 3;
                        i12 = 267386880;
                }
                i14 += A;
                i13 += 3;
                i12 = 267386880;
            }
            return i14 + j(this.o, t);
        }
        Unsafe unsafe2 = s;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < this.a.length; i21 += 3) {
            int E2 = E(i21);
            int[] iArr = this.a;
            int i22 = iArr[i21];
            int i23 = (E2 & 267386880) >>> 20;
            if (i23 <= 17) {
                int i24 = iArr[i21 + 2];
                int i25 = i24 & 1048575;
                i2 = 1 << (i24 >>> 20);
                if (i25 != i18) {
                    i20 = unsafe2.getInt(t, (long) i25);
                    i18 = i25;
                }
                i3 = i24;
            } else {
                i3 = (!this.i || i23 < el1.DOUBLE_LIST_PACKED.b() || i23 > el1.SINT64_LIST_PACKED.b()) ? 0 : this.a[i21 + 2] & 1048575;
                i2 = 0;
            }
            long j4 = (long) (E2 & 1048575);
            switch (i23) {
                case 0:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i19 += qk1.A(i22, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i19 += qk1.B(i22, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i4 = qk1.X(i22, unsafe2.getLong(t, j4));
                        i19 += i4;
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i4 = qk1.d0(i22, unsafe2.getLong(t, j4));
                        i19 += i4;
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i4 = qk1.x0(i22, unsafe2.getInt(t, j4));
                        i19 += i4;
                    }
                    break;
                case 5:
                    j2 = 0;
                    if ((i20 & i2) != 0) {
                        i4 = qk1.o0(i22, 0);
                        i19 += i4;
                    }
                    break;
                case 6:
                    if ((i20 & i2) != 0) {
                        i19 += qk1.E0(i22, 0);
                        j2 = 0;
                        break;
                    }
                    j2 = 0;
                case 7:
                    if ((i20 & i2) != 0) {
                        T = qk1.T(i22, true);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 8:
                    if ((i20 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j4);
                        if (object instanceof bk1) {
                            T = qk1.Q(i22, (bk1) object);
                        } else {
                            T = qk1.E(i22, (String) object);
                        }
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 9:
                    if ((i20 & i2) != 0) {
                        T = kn1.m(i22, unsafe2.getObject(t, j4), B(i21));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 10:
                    if ((i20 & i2) != 0) {
                        T = qk1.Q(i22, (bk1) unsafe2.getObject(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 11:
                    if ((i20 & i2) != 0) {
                        T = qk1.A0(i22, unsafe2.getInt(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 12:
                    if ((i20 & i2) != 0) {
                        T = qk1.J0(i22, unsafe2.getInt(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 13:
                    if ((i20 & i2) != 0) {
                        i5 = qk1.G0(i22, 0);
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 14:
                    if ((i20 & i2) != 0) {
                        T = qk1.s0(i22, 0);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 15:
                    if ((i20 & i2) != 0) {
                        T = qk1.C0(i22, unsafe2.getInt(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 16:
                    if ((i20 & i2) != 0) {
                        T = qk1.i0(i22, unsafe2.getLong(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 17:
                    if ((i20 & i2) != 0) {
                        T = qk1.S(i22, (tm1) unsafe2.getObject(t, j4), B(i21));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 18:
                    T = kn1.Z(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 19:
                    T = kn1.X(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 20:
                    T = kn1.L(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 21:
                    T = kn1.M(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 22:
                    T = kn1.R(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 23:
                    T = kn1.Z(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 24:
                    T = kn1.X(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 25:
                    T = kn1.b0(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 26:
                    T = kn1.n(i22, (List) unsafe2.getObject(t, j4));
                    i19 += T;
                    j2 = 0;
                    break;
                case 27:
                    T = kn1.o(i22, (List) unsafe2.getObject(t, j4), B(i21));
                    i19 += T;
                    j2 = 0;
                    break;
                case 28:
                    T = kn1.q(i22, (List) unsafe2.getObject(t, j4));
                    i19 += T;
                    j2 = 0;
                    break;
                case 29:
                    T = kn1.T(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 30:
                    T = kn1.P(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 31:
                    T = kn1.X(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 32:
                    T = kn1.Z(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 33:
                    T = kn1.V(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 34:
                    T = kn1.N(i22, (List) unsafe2.getObject(t, j4), false);
                    i19 += T;
                    j2 = 0;
                    break;
                case 35:
                    i8 = kn1.d0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 36:
                    i8 = kn1.c0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 37:
                    i8 = kn1.O((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 38:
                    i8 = kn1.Q((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 39:
                    i8 = kn1.W((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 40:
                    i8 = kn1.d0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 41:
                    i8 = kn1.c0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 42:
                    i8 = kn1.e0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 43:
                    i8 = kn1.Y((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 44:
                    i8 = kn1.U((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 45:
                    i8 = kn1.c0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 46:
                    i8 = kn1.d0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 47:
                    i8 = kn1.a0((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 48:
                    i8 = kn1.S((List) unsafe2.getObject(t, j4));
                    if (i8 > 0) {
                        if (this.i) {
                            unsafe2.putInt(t, (long) i3, i8);
                        }
                        i7 = qk1.u(i22);
                        i6 = qk1.w(i8);
                        i5 = i7 + i6 + i8;
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 49:
                    T = kn1.r(i22, (List) unsafe2.getObject(t, j4), B(i21));
                    i19 += T;
                    j2 = 0;
                    break;
                case 50:
                    T = this.q.d(i22, unsafe2.getObject(t, j4), C(i21));
                    i19 += T;
                    j2 = 0;
                    break;
                case 51:
                    if (u(t, i22, i21)) {
                        T = qk1.A(i22, 0.0d);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 52:
                    if (u(t, i22, i21)) {
                        i5 = qk1.B(i22, 0.0f);
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 53:
                    if (u(t, i22, i21)) {
                        T = qk1.X(i22, N(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 54:
                    if (u(t, i22, i21)) {
                        T = qk1.d0(i22, N(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 55:
                    if (u(t, i22, i21)) {
                        T = qk1.x0(i22, M(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 56:
                    if (u(t, i22, i21)) {
                        T = qk1.o0(i22, 0);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 57:
                    if (u(t, i22, i21)) {
                        i5 = qk1.E0(i22, 0);
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 58:
                    if (u(t, i22, i21)) {
                        T = qk1.T(i22, true);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 59:
                    if (u(t, i22, i21)) {
                        Object object2 = unsafe2.getObject(t, j4);
                        if (object2 instanceof bk1) {
                            T = qk1.Q(i22, (bk1) object2);
                        } else {
                            T = qk1.E(i22, (String) object2);
                        }
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 60:
                    if (u(t, i22, i21)) {
                        T = kn1.m(i22, unsafe2.getObject(t, j4), B(i21));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 61:
                    if (u(t, i22, i21)) {
                        T = qk1.Q(i22, (bk1) unsafe2.getObject(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 62:
                    if (u(t, i22, i21)) {
                        T = qk1.A0(i22, M(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 63:
                    if (u(t, i22, i21)) {
                        T = qk1.J0(i22, M(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 64:
                    if (u(t, i22, i21)) {
                        i5 = qk1.G0(i22, 0);
                        i19 += i5;
                    }
                    j2 = 0;
                    break;
                case 65:
                    if (u(t, i22, i21)) {
                        T = qk1.s0(i22, 0);
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 66:
                    if (u(t, i22, i21)) {
                        T = qk1.C0(i22, M(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 67:
                    if (u(t, i22, i21)) {
                        T = qk1.i0(i22, N(t, j4));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                case 68:
                    if (u(t, i22, i21)) {
                        T = qk1.S(i22, (tm1) unsafe2.getObject(t, j4), B(i21));
                        i19 += T;
                    }
                    j2 = 0;
                    break;
                default:
                    j2 = 0;
                    break;
            }
        }
        int j5 = i19 + j(this.o, t);
        return this.f ? j5 + this.p.g(t).t() : j5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a26  */
    @Override // defpackage.in1
    public final void i(T t, xo1 xo1) throws IOException {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        Map.Entry<?, Object> entry2;
        Iterator<Map.Entry<?, Object>> it2;
        int length2;
        if (xo1.F() == kl1.f.l) {
            p(this.o, t, xo1);
            if (this.f) {
                bl1<?> g2 = this.p.g(t);
                if (!g2.b()) {
                    it2 = g2.a();
                    entry2 = it2.next();
                    for (length2 = this.a.length - 3; length2 >= 0; length2 -= 3) {
                        int E = E(length2);
                        int i3 = this.a[length2];
                        while (entry2 != null && this.p.a(entry2) > i3) {
                            this.p.f(xo1, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((E & 267386880) >>> 20) {
                            case 0:
                                if (t(t, length2)) {
                                    xo1.p(i3, ho1.K(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (t(t, length2)) {
                                    xo1.q(i3, ho1.J(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (t(t, length2)) {
                                    xo1.l(i3, ho1.H(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (t(t, length2)) {
                                    xo1.o(i3, ho1.H(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (t(t, length2)) {
                                    xo1.z(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (t(t, length2)) {
                                    xo1.g(i3, ho1.H(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (t(t, length2)) {
                                    xo1.G(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (t(t, length2)) {
                                    xo1.f(i3, ho1.I(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (t(t, length2)) {
                                    o(i3, ho1.L(t, (long) (E & 1048575)), xo1);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (t(t, length2)) {
                                    xo1.B(i3, ho1.L(t, (long) (E & 1048575)), B(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (t(t, length2)) {
                                    xo1.K(i3, (bk1) ho1.L(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (t(t, length2)) {
                                    xo1.s(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (t(t, length2)) {
                                    xo1.O(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (t(t, length2)) {
                                    xo1.M(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (t(t, length2)) {
                                    xo1.a(i3, ho1.H(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (t(t, length2)) {
                                    xo1.N(i3, ho1.F(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (t(t, length2)) {
                                    xo1.c(i3, ho1.H(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (t(t, length2)) {
                                    xo1.E(i3, ho1.L(t, (long) (E & 1048575)), B(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                kn1.f(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 19:
                                kn1.l(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 20:
                                kn1.p(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 21:
                                kn1.s(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 22:
                                kn1.D(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 23:
                                kn1.v(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 24:
                                kn1.H(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 25:
                                kn1.K(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 26:
                                kn1.d(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1);
                                break;
                            case 27:
                                kn1.e(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, B(length2));
                                break;
                            case 28:
                                kn1.j(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1);
                                break;
                            case 29:
                                kn1.E(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 30:
                                kn1.J(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 31:
                                kn1.I(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 32:
                                kn1.w(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 33:
                                kn1.F(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 34:
                                kn1.u(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, false);
                                break;
                            case 35:
                                kn1.f(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 36:
                                kn1.l(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 37:
                                kn1.p(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 38:
                                kn1.s(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 39:
                                kn1.D(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 40:
                                kn1.v(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 41:
                                kn1.H(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 42:
                                kn1.K(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 43:
                                kn1.E(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 44:
                                kn1.J(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 45:
                                kn1.I(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 46:
                                kn1.w(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 47:
                                kn1.F(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 48:
                                kn1.u(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, true);
                                break;
                            case 49:
                                kn1.k(this.a[length2], (List) ho1.L(t, (long) (E & 1048575)), xo1, B(length2));
                                break;
                            case 50:
                                q(xo1, i3, ho1.L(t, (long) (E & 1048575)), length2);
                                break;
                            case 51:
                                if (u(t, i3, length2)) {
                                    xo1.p(i3, K(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (u(t, i3, length2)) {
                                    xo1.q(i3, L(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (u(t, i3, length2)) {
                                    xo1.l(i3, N(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (u(t, i3, length2)) {
                                    xo1.o(i3, N(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (u(t, i3, length2)) {
                                    xo1.z(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (u(t, i3, length2)) {
                                    xo1.g(i3, N(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (u(t, i3, length2)) {
                                    xo1.G(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (u(t, i3, length2)) {
                                    xo1.f(i3, O(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (u(t, i3, length2)) {
                                    o(i3, ho1.L(t, (long) (E & 1048575)), xo1);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (u(t, i3, length2)) {
                                    xo1.B(i3, ho1.L(t, (long) (E & 1048575)), B(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (u(t, i3, length2)) {
                                    xo1.K(i3, (bk1) ho1.L(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (u(t, i3, length2)) {
                                    xo1.s(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (u(t, i3, length2)) {
                                    xo1.O(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (u(t, i3, length2)) {
                                    xo1.M(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (u(t, i3, length2)) {
                                    xo1.a(i3, N(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (u(t, i3, length2)) {
                                    xo1.N(i3, M(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (u(t, i3, length2)) {
                                    xo1.c(i3, N(t, (long) (E & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (u(t, i3, length2)) {
                                    xo1.E(i3, ho1.L(t, (long) (E & 1048575)), B(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.p.f(xo1, entry2);
                        entry2 = it2.hasNext() ? it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
        } else if (this.h) {
            if (this.f) {
                bl1<?> g3 = this.p.g(t);
                if (!g3.b()) {
                    it = g3.e();
                    entry = it.next();
                    length = this.a.length;
                    for (i2 = 0; i2 < length; i2 += 3) {
                        int E2 = E(i2);
                        int i4 = this.a[i2];
                        while (entry != null && this.p.a(entry) <= i4) {
                            this.p.f(xo1, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((E2 & 267386880) >>> 20) {
                            case 0:
                                if (t(t, i2)) {
                                    xo1.p(i4, ho1.K(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (t(t, i2)) {
                                    xo1.q(i4, ho1.J(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (t(t, i2)) {
                                    xo1.l(i4, ho1.H(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (t(t, i2)) {
                                    xo1.o(i4, ho1.H(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (t(t, i2)) {
                                    xo1.z(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (t(t, i2)) {
                                    xo1.g(i4, ho1.H(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (t(t, i2)) {
                                    xo1.G(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (t(t, i2)) {
                                    xo1.f(i4, ho1.I(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (t(t, i2)) {
                                    o(i4, ho1.L(t, (long) (E2 & 1048575)), xo1);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (t(t, i2)) {
                                    xo1.B(i4, ho1.L(t, (long) (E2 & 1048575)), B(i2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (t(t, i2)) {
                                    xo1.K(i4, (bk1) ho1.L(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (t(t, i2)) {
                                    xo1.s(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (t(t, i2)) {
                                    xo1.O(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (t(t, i2)) {
                                    xo1.M(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (t(t, i2)) {
                                    xo1.a(i4, ho1.H(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (t(t, i2)) {
                                    xo1.N(i4, ho1.F(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (t(t, i2)) {
                                    xo1.c(i4, ho1.H(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (t(t, i2)) {
                                    xo1.E(i4, ho1.L(t, (long) (E2 & 1048575)), B(i2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                kn1.f(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 19:
                                kn1.l(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 20:
                                kn1.p(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 21:
                                kn1.s(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 22:
                                kn1.D(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 23:
                                kn1.v(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 24:
                                kn1.H(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 25:
                                kn1.K(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 26:
                                kn1.d(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1);
                                break;
                            case 27:
                                kn1.e(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, B(i2));
                                break;
                            case 28:
                                kn1.j(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1);
                                break;
                            case 29:
                                kn1.E(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 30:
                                kn1.J(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 31:
                                kn1.I(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 32:
                                kn1.w(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 33:
                                kn1.F(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 34:
                                kn1.u(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, false);
                                break;
                            case 35:
                                kn1.f(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 36:
                                kn1.l(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 37:
                                kn1.p(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 38:
                                kn1.s(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 39:
                                kn1.D(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 40:
                                kn1.v(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 41:
                                kn1.H(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 42:
                                kn1.K(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 43:
                                kn1.E(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 44:
                                kn1.J(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 45:
                                kn1.I(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 46:
                                kn1.w(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 47:
                                kn1.F(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 48:
                                kn1.u(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, true);
                                break;
                            case 49:
                                kn1.k(this.a[i2], (List) ho1.L(t, (long) (E2 & 1048575)), xo1, B(i2));
                                break;
                            case 50:
                                q(xo1, i4, ho1.L(t, (long) (E2 & 1048575)), i2);
                                break;
                            case 51:
                                if (u(t, i4, i2)) {
                                    xo1.p(i4, K(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (u(t, i4, i2)) {
                                    xo1.q(i4, L(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (u(t, i4, i2)) {
                                    xo1.l(i4, N(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (u(t, i4, i2)) {
                                    xo1.o(i4, N(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (u(t, i4, i2)) {
                                    xo1.z(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (u(t, i4, i2)) {
                                    xo1.g(i4, N(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (u(t, i4, i2)) {
                                    xo1.G(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (u(t, i4, i2)) {
                                    xo1.f(i4, O(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (u(t, i4, i2)) {
                                    o(i4, ho1.L(t, (long) (E2 & 1048575)), xo1);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (u(t, i4, i2)) {
                                    xo1.B(i4, ho1.L(t, (long) (E2 & 1048575)), B(i2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (u(t, i4, i2)) {
                                    xo1.K(i4, (bk1) ho1.L(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (u(t, i4, i2)) {
                                    xo1.s(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (u(t, i4, i2)) {
                                    xo1.O(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (u(t, i4, i2)) {
                                    xo1.M(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (u(t, i4, i2)) {
                                    xo1.a(i4, N(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (u(t, i4, i2)) {
                                    xo1.N(i4, M(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (u(t, i4, i2)) {
                                    xo1.c(i4, N(t, (long) (E2 & 1048575)));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (u(t, i4, i2)) {
                                    xo1.E(i4, ho1.L(t, (long) (E2 & 1048575)), B(i2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.p.f(xo1, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    p(this.o, t, xo1);
                }
            }
            it = null;
            entry = null;
            length = this.a.length;
            while (i2 < length) {
            }
            while (entry != null) {
            }
            p(this.o, t, xo1);
        } else {
            z(t, xo1);
        }
    }
}
