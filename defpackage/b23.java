package defpackage;

import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: b23  reason: default package */
/* compiled from: DEROctetStringParser */
public class b23 implements r03 {
    private t23 a;

    public b23(t23 t23) {
        this.a = t23;
    }

    @Override // defpackage.r03
    public InputStream a() {
        return this.a;
    }

    @Override // defpackage.g03
    public u03 b() {
        try {
            return d();
        } catch (IOException e) {
            throw new t03(C0201.m82(7980) + e.getMessage(), e);
        }
    }

    @Override // defpackage.u23
    public u03 d() throws IOException {
        return new a23(this.a.h());
    }
}
