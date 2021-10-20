package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: qr2  reason: default package */
/* compiled from: FilterFactory */
public final class qr2 {
    public static final qr2 b = new qr2();
    private final Map<ar2, pr2> a = new HashMap();

    private qr2() {
        rr2 rr2 = new rr2();
        nr2 nr2 = new nr2();
        lr2 lr2 = new lr2();
        tr2 tr2 = new tr2();
        kr2 kr2 = new kr2();
        ir2 ir2 = new ir2();
        vr2 vr2 = new vr2();
        mr2 mr2 = new mr2();
        this.a.put(ar2.K, rr2);
        this.a.put(ar2.L, rr2);
        this.a.put(ar2.A, nr2);
        this.a.put(ar2.B, nr2);
        this.a.put(ar2.m, lr2);
        this.a.put(ar2.n, lr2);
        this.a.put(ar2.X, tr2);
        this.a.put(ar2.Y, tr2);
        this.a.put(ar2.e, kr2);
        this.a.put(ar2.f, kr2);
        this.a.put(ar2.g, ir2);
        this.a.put(ar2.h, ir2);
        this.a.put(ar2.q0, vr2);
        this.a.put(ar2.r0, vr2);
        this.a.put(ar2.z, mr2);
    }

    public pr2 a(ar2 ar2) throws IOException {
        pr2 pr2 = this.a.get(ar2);
        if (pr2 != null) {
            return pr2;
        }
        throw new IOException(C0201.m82(8614) + ar2);
    }
}
