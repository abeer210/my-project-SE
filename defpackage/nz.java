package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: nz  reason: default package */
/* compiled from: HandlerBox */
public class nz extends mz {
    public String e;

    public nz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        orVar.t(4);
        this.e = orVar.m(4);
        orVar.t(12);
        orVar.j(((int) this.a) - 32, Charset.defaultCharset());
    }

    public String a() {
        return this.e;
    }
}
