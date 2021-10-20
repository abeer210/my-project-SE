package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import vigqyno.C0201;

/* renamed from: jq  reason: default package */
/* compiled from: PngMetadataReader */
public class jq {
    private static Set<gq> a;
    private static Charset b = fr.b;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;

    static {
        C0201.m83(jq.class, 79);
        HashSet hashSet = new HashSet();
        hashSet.add(gq.d);
        hashSet.add(gq.e);
        hashSet.add(gq.m);
        hashSet.add(gq.g);
        hashSet.add(gq.k);
        hashSet.add(gq.h);
        hashSet.add(gq.i);
        hashSet.add(gq.l);
        hashSet.add(gq.q);
        hashSet.add(gq.r);
        hashSet.add(gq.p);
        hashSet.add(gq.o);
        hashSet.add(gq.n);
        hashSet.add(gq.j);
        a = Collections.unmodifiableSet(hashSet);
    }

    private static void a(wr wrVar, eq eqVar) throws kq, IOException {
        byte[] bArr;
        byte[] bArr2;
        gq b2 = eqVar.b();
        byte[] a2 = eqVar.a();
        if (b2.equals(gq.d)) {
            iq iqVar = new iq(a2);
            c10 c10 = new c10(gq.d);
            c10.J(1, iqVar.f());
            c10.J(2, iqVar.e());
            c10.J(3, iqVar.a());
            c10.J(4, iqVar.b().e());
            c10.J(5, iqVar.c() & 255);
            c10.J(6, iqVar.d());
            c10.J(7, iqVar.g());
            wrVar.a(c10);
        } else if (b2.equals(gq.e)) {
            c10 c102 = new c10(gq.e);
            c102.J(8, a2.length / 3);
            wrVar.a(c102);
        } else if (b2.equals(gq.m)) {
            c10 c103 = new c10(gq.m);
            c103.J(9, 1);
            wrVar.a(c103);
        } else if (b2.equals(gq.k)) {
            byte b3 = a2[0];
            c10 c104 = new c10(gq.k);
            c104.J(10, b3);
            wrVar.a(c104);
        } else if (b2.equals(gq.g)) {
            dq dqVar = new dq(a2);
            a10 a10 = new a10();
            a10.J(1, dqVar.g());
            a10.J(2, dqVar.h());
            a10.J(3, dqVar.e());
            a10.J(4, dqVar.f());
            a10.J(5, dqVar.c());
            a10.J(6, dqVar.d());
            a10.J(7, dqVar.a());
            a10.J(8, dqVar.b());
            wrVar.a(a10);
        } else if (b2.equals(gq.h)) {
            int a3 = cr.a(a2);
            new nr(a2).f();
            c10 c105 = new c10(gq.h);
            double d2 = (double) a3;
            Double.isNaN(d2);
            c105.F(11, d2 / 100000.0d);
            wrVar.a(c105);
        } else {
            boolean equals = b2.equals(gq.i);
            String str = e;
            if (equals) {
                nr nrVar = new nr(a2);
                byte[] i2 = nrVar.i(80);
                c10 c106 = new c10(gq.i);
                c106.T(12, new yr(i2, b));
                if (nrVar.h() == 0) {
                    try {
                        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(nrVar.d(a2.length - ((i2.length + 1) + 1))));
                        new iw().d(new lr(inflaterInputStream), wrVar, c106);
                        inflaterInputStream.close();
                    } catch (ZipException e2) {
                        c106.a(String.format(j, e2.getMessage()));
                        wrVar.a(c106);
                    }
                } else {
                    c106.a(str);
                }
                wrVar.a(c106);
            } else if (b2.equals(gq.l)) {
                c10 c107 = new c10(gq.l);
                c107.C(15, a2);
                wrVar.a(c107);
            } else if (b2.equals(gq.q)) {
                nr nrVar2 = new nr(a2);
                yr k = nrVar2.k(80, b);
                String yrVar = k.toString();
                yr k2 = nrVar2.k(a2.length - (k.a().length + 1), b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jr(yrVar, k2));
                c10 c108 = new c10(gq.q);
                c108.M(13, arrayList);
                wrVar.a(c108);
            } else {
                boolean equals2 = b2.equals(gq.r);
                String str2 = c;
                if (equals2) {
                    nr nrVar3 = new nr(a2);
                    yr k3 = nrVar3.k(80, b);
                    String yrVar2 = k3.toString();
                    byte h2 = nrVar3.h();
                    int length = a2.length - ((k3.a().length + 1) + 1);
                    if (h2 == 0) {
                        try {
                            bArr2 = qr.a(new InflaterInputStream(new ByteArrayInputStream(a2, a2.length - length, length)));
                        } catch (ZipException e3) {
                            c10 c109 = new c10(gq.r);
                            c109.a(String.format(i, yrVar2, e3.getMessage()));
                            wrVar.a(c109);
                        }
                    } else {
                        c10 c1010 = new c10(gq.r);
                        c1010.a(str);
                        wrVar.a(c1010);
                        bArr2 = null;
                    }
                    if (bArr2 == null) {
                        return;
                    }
                    if (yrVar2.equals(str2)) {
                        new m10().f(bArr2, wrVar);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new jr(yrVar2, new yr(bArr2, b)));
                    c10 c1011 = new c10(gq.r);
                    c1011.M(13, arrayList2);
                    wrVar.a(c1011);
                } else if (b2.equals(gq.p)) {
                    nr nrVar4 = new nr(a2);
                    yr k4 = nrVar4.k(80, b);
                    String yrVar3 = k4.toString();
                    byte h3 = nrVar4.h();
                    byte h4 = nrVar4.h();
                    int length2 = a2.length - (((((((k4.a().length + 1) + 1) + 1) + nrVar4.i(a2.length).length) + 1) + nrVar4.i(a2.length).length) + 1);
                    if (h3 == 0) {
                        bArr = nrVar4.i(length2);
                    } else {
                        if (h3 != 1) {
                            c10 c1012 = new c10(gq.p);
                            c1012.a(d);
                            wrVar.a(c1012);
                        } else if (h4 == 0) {
                            try {
                                bArr = qr.a(new InflaterInputStream(new ByteArrayInputStream(a2, a2.length - length2, length2)));
                            } catch (ZipException e4) {
                                c10 c1013 = new c10(gq.p);
                                c1013.a(String.format(f, yrVar3, e4.getMessage()));
                                wrVar.a(c1013);
                            }
                        } else {
                            c10 c1014 = new c10(gq.p);
                            c1014.a(str);
                            wrVar.a(c1014);
                        }
                        bArr = null;
                    }
                    if (bArr == null) {
                        return;
                    }
                    if (yrVar3.equals(str2)) {
                        new m10().f(bArr, wrVar);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new jr(yrVar3, new yr(bArr, b)));
                    c10 c1015 = new c10(gq.p);
                    c1015.M(13, arrayList3);
                    wrVar.a(c1015);
                } else if (b2.equals(gq.o)) {
                    nr nrVar5 = new nr(a2);
                    int p = nrVar5.p();
                    short r = nrVar5.r();
                    short r2 = nrVar5.r();
                    short r3 = nrVar5.r();
                    short r4 = nrVar5.r();
                    short r5 = nrVar5.r();
                    c10 c1016 = new c10(gq.o);
                    if (!hr.a(p, r - 1, r2) || !hr.b(r3, r4, r5)) {
                        c1016.a(String.format(h, Integer.valueOf(p), Integer.valueOf(r), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)));
                    } else {
                        c1016.R(14, String.format(g, Integer.valueOf(p), Integer.valueOf(r), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)));
                    }
                    wrVar.a(c1016);
                } else if (b2.equals(gq.n)) {
                    nr nrVar6 = new nr(a2);
                    int f2 = nrVar6.f();
                    int f3 = nrVar6.f();
                    byte h5 = nrVar6.h();
                    c10 c1017 = new c10(gq.n);
                    c1017.J(16, f2);
                    c1017.J(17, f3);
                    c1017.J(18, h5);
                    wrVar.a(c1017);
                } else if (b2.equals(gq.j)) {
                    c10 c1018 = new c10(gq.j);
                    c1018.C(19, a2);
                    wrVar.a(c1018);
                }
            }
        }
    }

    public static wr b(InputStream inputStream) throws kq, IOException {
        Iterable<eq> a2 = new fq().a(new pr(inputStream), a);
        wr wrVar = new wr();
        for (eq eqVar : a2) {
            try {
                a(wrVar, eqVar);
            } catch (Exception e2) {
                e2.printStackTrace(System.err);
            }
        }
        return wrVar;
    }
}
