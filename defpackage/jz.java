package defpackage;

import java.io.IOException;

/* renamed from: jz  reason: default package */
/* compiled from: AudioSampleEntry */
public class jz extends rz {
    public int e;
    public int f;
    public long g;

    public jz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        orVar.t(8);
        this.e = orVar.p();
        this.f = orVar.e();
        orVar.t(2);
        orVar.t(2);
        this.g = orVar.q();
    }

    public void a(e00 e00) {
        e00.J(102, this.e);
        e00.J(103, this.f);
        e00.L(104, this.g);
    }
}
