package defpackage;

import vigqyno.C0201;

/* renamed from: t20  reason: default package */
/* compiled from: CookieProducer */
public class t20 {
    public String a(g30 g30, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(g30.b);
        String r1 = C0201.m82(31829);
        sb.append(r1);
        sb.append(g30.c);
        if (g30.e == i30.V2_AGENT_SPLITTING) {
            sb.append(C0201.m82(31830));
            sb.append(g30.d);
        }
        sb.append(r1);
        sb.append(str);
        sb.append(r1);
        sb.append(C0201.m82(31831));
        return sb.toString();
    }

    public String b(g30 g30) {
        boolean h = g30.h();
        String r1 = C0201.m82(31832);
        if (!h) {
            return r1 + C0201.m82(31833);
        } else if (!g30.g()) {
            return r1 + C0201.m82(31834);
        } else {
            return r1 + C0201.m82(31835) + g30.f;
        }
    }

    public String c(long j, long j2) {
        return j + C0201.m82(31836) + j2;
    }
}
