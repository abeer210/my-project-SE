package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: h13  reason: default package */
/* compiled from: BEROctetStringParser */
public class h13 implements r03 {
    private z03 a;

    public h13(z03 z03) {
        this.a = z03;
    }

    @Override // defpackage.r03
    public InputStream a() {
        return new o13(this.a);
    }

    @Override // defpackage.g03
    public u03 b() {
        try {
            return d();
        } catch (IOException e) {
            throw new t03(C0201.m82(36058) + e.getMessage(), e);
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        return new g13(sb3.b(a()));
    }
}
