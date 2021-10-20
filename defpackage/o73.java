package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: o73  reason: default package */
/* compiled from: DefaultSecretKeySizeProvider */
public class o73 implements u73 {
    public static final u73 a = new o73();
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(new p03(C0201.m82(70)), ib3.a(128));
        hashMap.put(d43.j, ib3.a(192));
        hashMap.put(d43.Q, ib3.a(192));
        hashMap.put(d43.j, ib3.a(192));
        hashMap.put(a43.j, ib3.a(128));
        hashMap.put(a43.n, ib3.a(192));
        hashMap.put(a43.r, ib3.a(256));
        hashMap.put(a43.l, ib3.a(128));
        hashMap.put(a43.p, ib3.a(192));
        hashMap.put(a43.t, ib3.a(256));
        hashMap.put(a43.m, ib3.a(128));
        hashMap.put(a43.q, ib3.a(192));
        hashMap.put(a43.u, ib3.a(256));
        hashMap.put(a43.k, ib3.a(128));
        hashMap.put(a43.o, ib3.a(192));
        hashMap.put(a43.s, ib3.a(256));
        hashMap.put(b43.a, ib3.a(128));
        hashMap.put(b43.b, ib3.a(192));
        hashMap.put(b43.c, ib3.a(256));
        hashMap.put(b43.d, ib3.a(128));
        hashMap.put(b43.e, ib3.a(192));
        hashMap.put(b43.f, ib3.a(256));
        hashMap.put(z33.a, ib3.a(128));
        hashMap.put(c43.a, ib3.a(64));
        hashMap.put(x33.c, ib3.a(256));
        b = Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.u73
    public int a(o43 o43) {
        int b2 = b(o43.g());
        if (b2 > 0) {
            return b2;
        }
        return -1;
    }

    public int b(p03 p03) {
        Integer num = (Integer) b.get(p03);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
