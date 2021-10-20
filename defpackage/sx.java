package defpackage;

import java.io.IOException;

/* renamed from: sx  reason: default package */
/* compiled from: MediaHeaderAtom */
public class sx extends qx {
    public long c;
    public long d;
    public long e;
    public long f;

    public sx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.q();
        this.d = orVar.q();
        this.e = orVar.q();
        this.f = orVar.q();
        orVar.p();
        orVar.p();
        lx.c = Long.valueOf(this.c);
        lx.d = Long.valueOf(this.d);
        lx.b = Long.valueOf(this.e);
        lx.e = Long.valueOf(this.f);
    }
}
