package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z53  reason: default package */
/* compiled from: PasswordRecipientInformation */
public class z53 extends c63 {
    public static Map h = new HashMap();
    public static Map i;
    private s33 g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put(d53.b, ib3.a(8));
        i.put(d53.e, ib3.a(16));
        i.put(d53.f, ib3.a(16));
        i.put(d53.g, ib3.a(16));
        h.put(d53.b, ib3.a(192));
        h.put(d53.e, ib3.a(128));
        h.put(d53.f, ib3.a(192));
        h.put(d53.g, ib3.a(256));
    }

    public z53(s33 s33, o43 o43, k53 k53, c53 c53) {
        super(s33.l(), o43, k53, c53);
        this.g = s33;
        this.a = new y53();
    }

    @Override // defpackage.c63
    public e63 d(a63 a63) throws h53, IOException {
        x53 x53 = (x53) a63;
        o43 i2 = o43.i(o43.i(this.g.l()).k());
        return x53.f(i2, this.c, x53.c(x53.d(), e(), ((Integer) h.get(i2.g())).intValue()), this.g.g().s());
    }

    public o43 e() {
        return this.g.k();
    }
}
