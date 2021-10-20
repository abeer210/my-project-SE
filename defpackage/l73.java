package defpackage;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: l73  reason: default package */
/* compiled from: BouncyCastleProvider */
public final class l73 extends Provider implements c73 {
    private static String a;
    private static final Map b = new HashMap();
    private static final String[] c = {C0201.m82(21987), C0201.m82(21988), C0201.m82(21989), C0201.m82(21990)};
    private static final String[] d = {C0201.m82(21991), C0201.m82(21992)};
    private static final String[] e = {C0201.m82(21993), C0201.m82(21994), C0201.m82(21995), C0201.m82(21996), C0201.m82(21997), C0201.m82(21998), C0201.m82(21999), C0201.m82(22000), C0201.m82(22001), C0201.m82(22002), C0201.m82(22003), C0201.m82(22004), C0201.m82(22005), C0201.m82(22006), C0201.m82(22007), C0201.m82(22008), C0201.m82(22009), C0201.m82(22010), C0201.m82(22011), C0201.m82(22012), C0201.m82(22013), C0201.m82(22014), C0201.m82(22015), C0201.m82(22016), C0201.m82(22017), C0201.m82(22018), C0201.m82(22019), C0201.m82(22020), C0201.m82(22021), C0201.m82(22022), C0201.m82(22023), C0201.m82(22024), C0201.m82(22025), C0201.m82(22026), C0201.m82(22027), C0201.m82(22028)};
    private static final String[] f = {C0201.m82(22029), C0201.m82(22030)};
    private static final String[] g = {C0201.m82(22031), C0201.m82(22032), C0201.m82(22033), C0201.m82(22034), C0201.m82(22035), C0201.m82(22036), C0201.m82(22037), C0201.m82(22038), C0201.m82(22039)};
    private static final String[] h = {C0201.m82(22040), C0201.m82(22041), C0201.m82(22042), C0201.m82(22043), C0201.m82(22044), C0201.m82(22045), C0201.m82(22046), C0201.m82(22047), C0201.m82(22048), C0201.m82(22049), C0201.m82(22050), C0201.m82(22051), C0201.m82(22052), C0201.m82(22053), C0201.m82(22054), C0201.m82(22055), C0201.m82(22056), C0201.m82(22057), C0201.m82(22058), C0201.m82(22059), C0201.m82(22060)};
    private static final String[] i = {C0201.m82(22061), C0201.m82(22062), C0201.m82(22063)};
    private static final String[] j = {C0201.m82(22064)};

    /* renamed from: l73$a */
    /* compiled from: BouncyCastleProvider */
    class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            l73.this.e();
            return null;
        }
    }

    static {
        C0201.m83(l73.class, 711);
        new m73();
    }

    public l73() {
        super(C0201.m82(22065), 1.58d, a);
        AccessController.doPrivileged(new a());
    }

    private void c(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            Class a2 = e73.a(l73.class, str + strArr[i2] + C0201.m82(22066));
            if (a2 != null) {
                try {
                    ((f73) a2.newInstance()).a(this);
                } catch (Exception e2) {
                    throw new InternalError(C0201.m82(22067) + str + strArr[i2] + C0201.m82(22068) + e2);
                }
            }
        }
    }

    private void d() {
        b(c83.e, new la3());
        b(c83.f, new fa3());
        b(c83.g, new sa3());
        b(c83.h, new ta3());
        b(c83.c, new ba3());
        b(c83.d, new aa3());
        b(c83.a, new ia3());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        c(C0201.m82(22069), h);
        String[] strArr = c;
        String r1 = C0201.m82(22070);
        c(r1, strArr);
        c(r1, d);
        c(r1, e);
        String[] strArr2 = f;
        String r12 = C0201.m82(22071);
        c(r12, strArr2);
        c(r12, g);
        c(C0201.m82(22072), i);
        c(C0201.m82(22073), j);
        d();
        put(C0201.m82(22074), C0201.m82(22075));
        put(C0201.m82(22076), C0201.m82(22077));
        put(C0201.m82(22078), C0201.m82(22079));
        put(C0201.m82(22080), C0201.m82(22081));
        put(C0201.m82(22082), C0201.m82(22083));
        put(C0201.m82(22084), C0201.m82(22085));
        put(C0201.m82(22086), C0201.m82(22087));
        put(C0201.m82(22088), C0201.m82(22089));
        put(C0201.m82(22090), C0201.m82(22091));
        put(C0201.m82(22092), C0201.m82(22093));
        put(C0201.m82(22094), C0201.m82(22095));
        put(C0201.m82(22096), C0201.m82(22097));
        put(C0201.m82(22098), C0201.m82(22099));
        put(C0201.m82(22100), C0201.m82(22101));
        put(C0201.m82(22102), C0201.m82(22103));
        put(C0201.m82(22104), C0201.m82(22105));
        put(C0201.m82(22106), C0201.m82(22107));
        String r0 = C0201.m82(22108);
        String r13 = C0201.m82(22109);
        put(r0, r13);
        String r02 = C0201.m82(22110);
        String r2 = C0201.m82(22111);
        put(r02, r2);
        put(C0201.m82(22112), r13);
        put(C0201.m82(22113), r2);
        put(C0201.m82(22114), C0201.m82(22115));
        put(C0201.m82(22116), C0201.m82(22117));
        put(C0201.m82(22118), C0201.m82(22119));
        put(C0201.m82(22120), C0201.m82(22121));
    }

    public void b(p03 p03, g73 g73) {
        synchronized (b) {
            b.put(p03, g73);
        }
    }
}
