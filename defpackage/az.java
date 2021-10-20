package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: az  reason: default package */
/* compiled from: QuickTimeDirectoryHandler */
public class az extends nx {
    private String c;

    public az(wr wrVar) {
        super(wrVar);
    }

    @Override // defpackage.mq
    public mq c(ox oxVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (!oxVar.b.equals(C0201.m82(4661)) || this.c == null) {
                this.c = new String(nrVar.d(4));
            } else {
                g(bArr, nrVar);
            }
        } else if (cz.g.containsKey(oxVar.b)) {
            this.c = oxVar.b;
        } else {
            this.c = null;
        }
        return this;
    }

    @Override // defpackage.mq
    public boolean e(ox oxVar) {
        return oxVar.b.equals(C0201.m82(4662));
    }

    @Override // defpackage.mq
    public boolean f(ox oxVar) {
        return cz.g.containsKey(oxVar.b) || oxVar.b.equals(C0201.m82(4663));
    }

    public void g(byte[] bArr, nr nrVar) throws IOException {
        nrVar.t(8);
        this.b.R(cz.g.get(this.c).intValue(), new String(nrVar.d(bArr.length - 8)));
    }
}
