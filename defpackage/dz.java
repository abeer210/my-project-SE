package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dz  reason: default package */
/* compiled from: Mp4BoxHandler */
public class dz extends zp<gz> {
    private hz c = new hz(this);

    public dz(wr wrVar) {
        super(wrVar);
    }

    private void g(or orVar, kz kzVar) throws IOException {
        new lz(orVar, kzVar).a(this.b);
    }

    private void h(or orVar, kz kzVar) throws IOException {
        new pz(orVar, kzVar);
    }

    private void i(or orVar, kz kzVar) throws IOException {
        new qz(orVar, kzVar).a(this.b);
    }

    @Override // defpackage.zp
    public gz b() {
        return new gz();
    }

    @Override // defpackage.zp
    public zp c(kz kzVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (kzVar.b.equals(C0201.m82(11568))) {
                i(nrVar, kzVar);
            } else if (kzVar.b.equals(C0201.m82(11569))) {
                g(nrVar, kzVar);
            } else if (kzVar.b.equals(C0201.m82(11570))) {
                return this.c.a(new nz(nrVar, kzVar), this.a);
            } else if (kzVar.b.equals(C0201.m82(11571))) {
                h(nrVar, kzVar);
            }
        } else if (kzVar.b.equals(C0201.m82(11572))) {
            this.b.a(C0201.m82(11573));
        }
        return this;
    }

    @Override // defpackage.zp
    public boolean e(kz kzVar) {
        return kzVar.b.equals(C0201.m82(11574)) || kzVar.b.equals(C0201.m82(11575)) || kzVar.b.equals(C0201.m82(11576)) || kzVar.b.equals(C0201.m82(11577));
    }

    @Override // defpackage.zp
    public boolean f(kz kzVar) {
        return kzVar.b.equals(C0201.m82(11578)) || kzVar.b.equals(C0201.m82(11579)) || kzVar.b.equals(C0201.m82(11580)) || kzVar.b.equals(C0201.m82(11581));
    }
}
