package defpackage;

import vigqyno.C0201;

/* renamed from: h92  reason: default package */
/* compiled from: AI01392xDecoder */
public final class h92 extends m92 {
    public h92(b72 b72) {
        super(b72);
    }

    @Override // defpackage.o92
    public String d() throws o62, k62 {
        if (c().g() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f = b().f(48, 2);
            sb.append(C0201.m82(15788));
            sb.append(f);
            sb.append(')');
            sb.append(b().c(50, null).b());
            return sb.toString();
        }
        throw o62.a();
    }
}
