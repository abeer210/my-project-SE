package defpackage;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import vigqyno.C0201;

/* renamed from: x73  reason: default package */
/* compiled from: OperatorHelper */
public class x73 {
    private static final Map b = new HashMap();
    private static final Map c = new HashMap();
    private static final Map d = new HashMap();
    private static final Map e = new HashMap();
    private static final Map f = new HashMap();
    private j73 a;

    static {
        Map map = b;
        p03 p03 = new p03(C0201.m82(20134));
        String r2 = C0201.m82(20135);
        map.put(p03, r2);
        b.put(d43.f, C0201.m82(20136));
        b.put(d43.c, C0201.m82(20137));
        b.put(d43.d, C0201.m82(20138));
        b.put(d43.e, C0201.m82(20139));
        b.put(x33.d, C0201.m82(20140));
        b.put(x33.e, C0201.m82(20141));
        b.put(c33.d, C0201.m82(20142));
        b.put(c33.e, C0201.m82(20143));
        b.put(c33.f, C0201.m82(20144));
        b.put(c33.g, C0201.m82(20145));
        b.put(c33.h, C0201.m82(20146));
        b.put(c33.i, C0201.m82(20147));
        b.put(y33.i, C0201.m82(20148));
        b.put(y33.j, C0201.m82(20149));
        b.put(y33.k, C0201.m82(20150));
        b.put(y33.l, C0201.m82(20151));
        b.put(y33.m, C0201.m82(20152));
        b.put(new p03(C0201.m82(20153)), C0201.m82(20154));
        b.put(new p03(C0201.m82(20155)), C0201.m82(20156));
        Map map2 = b;
        p03 p032 = new p03(C0201.m82(20157));
        String r3 = C0201.m82(20158);
        map2.put(p032, r3);
        b.put(x43.e, C0201.m82(20159));
        b.put(x43.h, C0201.m82(20160));
        b.put(x43.i, C0201.m82(20161));
        b.put(x43.j, C0201.m82(20162));
        b.put(x43.k, C0201.m82(20163));
        b.put(c43.d, r2);
        b.put(c43.c, r3);
        b.put(a43.w, C0201.m82(20164));
        b.put(a43.x, C0201.m82(20165));
        b.put(c43.b, C0201.m82(20166));
        b.put(a43.f, C0201.m82(20167));
        b.put(a43.c, C0201.m82(20168));
        b.put(a43.d, C0201.m82(20169));
        b.put(a43.e, C0201.m82(20170));
        b.put(g43.c, C0201.m82(20171));
        b.put(g43.b, C0201.m82(20172));
        b.put(g43.d, C0201.m82(20173));
        c.put(d43.b, C0201.m82(20174));
        d.put(d43.Q, C0201.m82(20175));
        d.put(d43.R, C0201.m82(20176));
        Map map3 = d;
        p03 p033 = a43.k;
        String r22 = C0201.m82(20177);
        map3.put(p033, r22);
        d.put(a43.o, r22);
        d.put(a43.s, r22);
        Map map4 = d;
        p03 p034 = b43.d;
        String r23 = C0201.m82(20178);
        map4.put(p034, r23);
        d.put(b43.e, r23);
        d.put(b43.f, r23);
        d.put(z33.b, C0201.m82(20179));
        Map map5 = d;
        p03 p035 = d43.j;
        String r24 = C0201.m82(20180);
        map5.put(p035, r24);
        f.put(d43.Q, ib3.a(192));
        f.put(a43.k, ib3.a(128));
        f.put(a43.o, ib3.a(192));
        f.put(a43.s, ib3.a(256));
        f.put(b43.d, ib3.a(128));
        f.put(b43.e, ib3.a(192));
        f.put(b43.f, ib3.a(256));
        f.put(z33.b, ib3.a(128));
        f.put(d43.j, ib3.a(192));
        Map map6 = e;
        p03 p036 = a43.i;
        String r32 = C0201.m82(20181);
        map6.put(p036, r32);
        e.put(a43.j, r32);
        e.put(a43.n, r32);
        e.put(a43.r, r32);
        e.put(d43.j, r24);
        e.put(d43.k, C0201.m82(20182));
    }

    public x73(j73 j73) {
        this.a = j73;
    }

    public AlgorithmParameters a(o43 o43) throws s73 {
        if (o43.g().equals(d43.b)) {
            return null;
        }
        try {
            AlgorithmParameters c2 = this.a.c(o43.g().u());
            try {
                c2.init(o43.k().b().e());
                return c2;
            } catch (IOException e2) {
                throw new s73(C0201.m82(20183) + e2.getMessage(), e2);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e3) {
            throw new s73(C0201.m82(20184) + e3.getMessage(), e3);
        }
    }

    public Cipher b(p03 p03, Map map) throws s73 {
        String str = null;
        try {
            if (!map.isEmpty()) {
                str = (String) map.get(p03);
            }
            if (str == null) {
                str = (String) c.get(p03);
            }
            if (str != null) {
                try {
                    return this.a.a(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals(C0201.m82(20185))) {
                        try {
                            return this.a.a(C0201.m82(20186));
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.a.a(p03.u());
        } catch (GeneralSecurityException e2) {
            throw new s73(C0201.m82(20187) + e2.getMessage(), e2);
        }
    }

    public String c(p03 p03) {
        String str = (String) e.get(p03);
        if (str != null) {
            return str;
        }
        return p03.u();
    }
}
