package defpackage;

import vigqyno.C0201;

/* renamed from: i92  reason: default package */
/* compiled from: AI01393xDecoder */
public final class i92 extends m92 {
    public i92(b72 b72) {
        super(b72);
    }

    @Override // defpackage.o92
    public String d() throws o62, k62 {
        if (c().g() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f = b().f(48, 2);
            sb.append(C0201.m82(13668));
            sb.append(f);
            sb.append(')');
            int f2 = b().f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(b().c(60, null).b());
            return sb.toString();
        }
        throw o62.a();
    }
}
