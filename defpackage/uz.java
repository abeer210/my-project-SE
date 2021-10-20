package defpackage;

import java.io.IOException;

/* renamed from: uz  reason: default package */
/* compiled from: VideoMediaHeaderBox */
public class uz extends mz {
    public int e;
    public int[] f;

    public uz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        this.e = orVar.p();
        this.f = new int[]{orVar.p(), orVar.p(), orVar.p()};
    }

    public void a(k00 k00) {
        k00.K(112, this.f);
        k00.J(111, this.e);
    }
}
