package com.google.android.play.core.assetpacks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

public final class o1 {
    private static final gy1 d = new gy1(C0201.m82(1152));
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    private final l1 a;
    private final b0 b;
    private final i0 c;

    static {
        C0201.m83(o1.class, 2);
    }

    public o1(l1 l1Var, b0 b0Var, i0 i0Var) {
        this.a = l1Var;
        this.b = b0Var;
        this.c = i0Var;
    }

    private final boolean b(i1 i1Var, j1 j1Var) {
        b0 b0Var = this.b;
        h1 h1Var = i1Var.c;
        return b0Var.w(h1Var.a, i1Var.b, h1Var.b, j1Var.a).exists();
    }

    private static boolean c(j1 j1Var) {
        int i2 = j1Var.f;
        return i2 == 1 || i2 == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x040f, code lost:
        if (r0 != null) goto L_0x0411;
     */
    public final n1 a() {
        char c2;
        n1 n1Var;
        int i2;
        q0 q0Var;
        int i3;
        try {
            this.a.b();
            ArrayList arrayList = new ArrayList();
            for (i1 i1Var : this.a.k().values()) {
                if (v1.h(i1Var.c.c)) {
                    arrayList.add(i1Var);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    c2 = 0;
                    if (!it.hasNext()) {
                        n1Var = null;
                        break;
                    }
                    i1 i1Var2 = (i1) it.next();
                    try {
                        b0 b0Var = this.b;
                        h1 h1Var = i1Var2.c;
                        if (b0Var.r(h1Var.a, i1Var2.b, h1Var.b) == i1Var2.c.e.size()) {
                            d.c(f, Integer.valueOf(i1Var2.a), i1Var2.c.a);
                            int i4 = i1Var2.a;
                            h1 h1Var2 = i1Var2.c;
                            n1Var = new b2(i4, h1Var2.a, i1Var2.b, h1Var2.b);
                            break;
                        }
                    } catch (IOException e2) {
                        throw new t0(String.format(m, Integer.valueOf(i1Var2.a), i1Var2.c.a), e2, i1Var2.a);
                    }
                }
                if (n1Var == null) {
                    Iterator it2 = arrayList.iterator();
                    loop2:
                    while (true) {
                        i2 = 3;
                        if (!it2.hasNext()) {
                            n1Var = null;
                            break;
                        }
                        i1 i1Var3 = (i1) it2.next();
                        if (v1.h(i1Var3.c.c)) {
                            for (j1 j1Var : i1Var3.c.e) {
                                b0 b0Var2 = this.b;
                                h1 h1Var3 = i1Var3.c;
                                if (b0Var2.k(h1Var3.a, i1Var3.b, h1Var3.b, j1Var.a).exists()) {
                                    d.c(e, Integer.valueOf(i1Var3.a), i1Var3.c.a, j1Var.a);
                                    int i5 = i1Var3.a;
                                    h1 h1Var4 = i1Var3.c;
                                    n1Var = new y1(i5, h1Var4.a, i1Var3.b, h1Var4.b, j1Var.a);
                                    break loop2;
                                }
                            }
                            continue;
                        }
                    }
                    if (n1Var == null) {
                        Iterator it3 = arrayList.iterator();
                        loop4:
                        while (true) {
                            if (!it3.hasNext()) {
                                n1Var = null;
                                break;
                            }
                            i1 i1Var4 = (i1) it3.next();
                            if (v1.h(i1Var4.c.c)) {
                                for (j1 j1Var2 : i1Var4.c.e) {
                                    b0 b0Var3 = this.b;
                                    h1 h1Var5 = i1Var4.c;
                                    if (new l2(b0Var3, h1Var5.a, i1Var4.b, h1Var5.b, j1Var2.a).m()) {
                                        b0 b0Var4 = this.b;
                                        h1 h1Var6 = i1Var4.c;
                                        if (b0Var4.c(h1Var6.a, i1Var4.b, h1Var6.b, j1Var2.a).exists()) {
                                            d.c(j, Integer.valueOf(i1Var4.a), i1Var4.c.a, j1Var2.a);
                                            int i6 = i1Var4.a;
                                            h1 h1Var7 = i1Var4.c;
                                            String str = h1Var7.a;
                                            int i7 = i1Var4.b;
                                            long j2 = h1Var7.b;
                                            String str2 = j1Var2.a;
                                            String str3 = j1Var2.b;
                                            long j3 = j1Var2.c;
                                            n1Var = new o2(i6, str, i7, j2, str2, str3);
                                            break loop4;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        if (n1Var == null) {
                            Iterator it4 = arrayList.iterator();
                            loop6:
                            while (true) {
                                if (!it4.hasNext()) {
                                    q0Var = null;
                                    break;
                                }
                                i1 i1Var5 = (i1) it4.next();
                                if (v1.h(i1Var5.c.c)) {
                                    for (j1 j1Var3 : i1Var5.c.e) {
                                        if (!c(j1Var3)) {
                                            b0 b0Var5 = this.b;
                                            h1 h1Var8 = i1Var5.c;
                                            try {
                                                i3 = new l2(b0Var5, h1Var8.a, i1Var5.b, h1Var8.b, j1Var3.a).l();
                                            } catch (IOException e3) {
                                                d.e(h, e3);
                                                i3 = 0;
                                            }
                                            if (i3 != -1 && j1Var3.d.get(i3).a) {
                                                d.c(g, Integer.valueOf(j1Var3.e), Integer.valueOf(i1Var5.a), i1Var5.c.a, j1Var3.a, Integer.valueOf(i3));
                                                InputStream a2 = this.c.a(i1Var5.a, i1Var5.c.a, j1Var3.a, i3);
                                                int i8 = i1Var5.a;
                                                h1 h1Var9 = i1Var5.c;
                                                String str4 = h1Var9.a;
                                                int i9 = i1Var5.b;
                                                long j4 = h1Var9.b;
                                                String str5 = j1Var3.a;
                                                int i10 = j1Var3.e;
                                                int size = j1Var3.d.size();
                                                h1 h1Var10 = i1Var5.c;
                                                q0Var = new q0(i8, str4, i9, j4, str5, i10, i3, size, h1Var10.d, h1Var10.c, a2);
                                                break loop6;
                                            }
                                            c2 = 0;
                                            i2 = 3;
                                        } else if (b(i1Var5, j1Var3)) {
                                            gy1 gy1 = d;
                                            Object[] objArr = new Object[i2];
                                            objArr[c2] = Integer.valueOf(i1Var5.a);
                                            objArr[1] = i1Var5.c.a;
                                            objArr[2] = j1Var3.a;
                                            gy1.c(k, objArr);
                                            try {
                                                b0 b0Var6 = this.b;
                                                h1 h1Var11 = i1Var5.c;
                                                FileInputStream fileInputStream = new FileInputStream(b0Var6.w(h1Var11.a, i1Var5.b, h1Var11.b, j1Var3.a));
                                                int i11 = i1Var5.a;
                                                h1 h1Var12 = i1Var5.c;
                                                q0Var = new q0(i11, h1Var12.a, i1Var5.b, h1Var12.b, j1Var3.a, 0, 0, 1, h1Var12.d, h1Var12.c, fileInputStream);
                                                break loop6;
                                            } catch (FileNotFoundException e4) {
                                                throw new t0(String.format(i, Integer.valueOf(i1Var5.a), i1Var5.c.a, j1Var3.a), e4, i1Var5.a);
                                            }
                                        }
                                    }
                                    continue;
                                }
                            }
                            if (q0Var == null) {
                                Iterator it5 = arrayList.iterator();
                                loop8:
                                while (true) {
                                    if (!it5.hasNext()) {
                                        n1Var = null;
                                        break;
                                    }
                                    i1 i1Var6 = (i1) it5.next();
                                    if (v1.h(i1Var6.c.c)) {
                                        for (j1 j1Var4 : i1Var6.c.e) {
                                            if (c(j1Var4) && j1Var4.d.get(0).a && !b(i1Var6, j1Var4)) {
                                                d.c(l, Integer.valueOf(j1Var4.f), Integer.valueOf(i1Var6.a), i1Var6.c.a, j1Var4.a);
                                                InputStream a3 = this.c.a(i1Var6.a, i1Var6.c.a, j1Var4.a, 0);
                                                int i12 = i1Var6.a;
                                                String str6 = i1Var6.c.a;
                                                n1Var = new h2(i12, str6, this.b.u(str6), this.b.x(i1Var6.c.a), i1Var6.b, i1Var6.c.b, j1Var4.f, j1Var4.a, j1Var4.c, a3);
                                                break loop8;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                this.a.f();
                                return q0Var;
                            }
                        }
                    }
                }
                return n1Var;
            }
            this.a.f();
            return null;
        } finally {
            this.a.f();
        }
    }
}
