package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: t13  reason: default package */
/* compiled from: DERExternalParser */
public class t13 implements g03, u23 {
    private z03 a;

    public t13(z03 z03) {
        this.a = z03;
    }

    @Override // defpackage.g03
    public u03 b() {
        String r0 = C0201.m82(34332);
        try {
            return d();
        } catch (IOException e) {
            throw new t03(r0, e);
        } catch (IllegalArgumentException e2) {
            throw new t03(r0, e2);
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        try {
            return new s13(this.a.d());
        } catch (IllegalArgumentException e) {
            throw new j03(e.getMessage(), e);
        }
    }
}
