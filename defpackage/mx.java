package defpackage;

import defpackage.kx;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import vigqyno.C0201;

/* renamed from: mx  reason: default package */
/* compiled from: QuickTimeMediaHandler */
public abstract class mx<T extends kx> extends mq<T> {
    public mx(wr wrVar) {
        super(wrVar);
        if (lx.c != null && lx.d != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((lx.c.longValue() * 1000) + time).toString();
            String date2 = new Date((lx.d.longValue() * 1000) + time).toString();
            this.b.R(20481, date);
            this.b.R(20482, date2);
        }
    }

    @Override // defpackage.mq
    public /* bridge */ /* synthetic */ mq c(ox oxVar, byte[] bArr) throws IOException {
        h(oxVar, bArr);
        return this;
    }

    @Override // defpackage.mq
    public boolean e(ox oxVar) {
        return oxVar.b.equals(g()) || oxVar.b.equals(C0201.m82(32151)) || oxVar.b.equals(C0201.m82(32152));
    }

    @Override // defpackage.mq
    public boolean f(ox oxVar) {
        return oxVar.b.equals(C0201.m82(32153)) || oxVar.b.equals(C0201.m82(32154)) || oxVar.b.equals(C0201.m82(32155)) || oxVar.b.equals(C0201.m82(32156));
    }

    public abstract String g();

    public mx h(ox oxVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (oxVar.b.equals(g())) {
                i(nrVar, oxVar);
            } else if (oxVar.b.equals(C0201.m82(32157))) {
                j(nrVar, oxVar);
            } else if (oxVar.b.equals(C0201.m82(32158))) {
                k(nrVar, oxVar);
            }
        }
        return this;
    }

    public abstract void i(or orVar, ox oxVar) throws IOException;

    public abstract void j(or orVar, ox oxVar) throws IOException;

    public abstract void k(or orVar, ox oxVar) throws IOException;
}
