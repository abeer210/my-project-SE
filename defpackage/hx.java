package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: hx  reason: default package */
/* compiled from: QuickTimeAtomHandler */
public class hx extends mq<kx> {
    private lx c = new lx(this);

    public hx(wr wrVar) {
        super(wrVar);
    }

    @Override // defpackage.mq
    public kx b() {
        return new kx();
    }

    @Override // defpackage.mq
    public mq c(ox oxVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (oxVar.b.equals(C0201.m82(21255))) {
                new tx(nrVar, oxVar).a(this.b);
            } else if (oxVar.b.equals(C0201.m82(21256))) {
                new px(nrVar, oxVar).a(this.b);
            } else if (oxVar.b.equals(C0201.m82(21257))) {
                return this.c.a(new rx(nrVar, oxVar).a(), this.a);
            } else if (oxVar.b.equals(C0201.m82(21258))) {
                new sx(nrVar, oxVar);
            }
        } else if (oxVar.b.equals(C0201.m82(21259))) {
            this.b.a(C0201.m82(21260));
        }
        return this;
    }

    @Override // defpackage.mq
    public boolean e(ox oxVar) {
        return oxVar.b.equals(C0201.m82(21261)) || oxVar.b.equals(C0201.m82(21262)) || oxVar.b.equals(C0201.m82(21263)) || oxVar.b.equals(C0201.m82(21264));
    }

    @Override // defpackage.mq
    public boolean f(ox oxVar) {
        return oxVar.b.equals(C0201.m82(21265)) || oxVar.b.equals(C0201.m82(21266)) || oxVar.b.equals(C0201.m82(21267)) || oxVar.b.equals(C0201.m82(21268)) || oxVar.b.equals(C0201.m82(21269));
    }
}
