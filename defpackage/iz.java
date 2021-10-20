package defpackage;

import defpackage.zz;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import vigqyno.C0201;

/* renamed from: iz  reason: default package */
/* compiled from: Mp4MediaHandler */
public abstract class iz<T extends zz> extends zp<T> {
    public iz(wr wrVar) {
        super(wrVar);
        if (hz.c != null && hz.d != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((hz.c.longValue() * 1000) + time).toString();
            String date2 = new Date((hz.d.longValue() * 1000) + time).toString();
            String str = hz.f;
            ((zz) this.b).R(101, date);
            ((zz) this.b).R(102, date2);
            ((zz) this.b).R(104, str);
        }
    }

    @Override // defpackage.zp
    public zp c(kz kzVar, byte[] bArr) throws IOException {
        if (bArr != null) {
            nr nrVar = new nr(bArr);
            if (kzVar.b.equals(g())) {
                h(nrVar, kzVar);
            } else if (kzVar.b.equals(C0201.m82(23841))) {
                i(nrVar, kzVar);
            } else if (kzVar.b.equals(C0201.m82(23842))) {
                j(nrVar, kzVar);
            }
        }
        return this;
    }

    @Override // defpackage.zp
    public boolean e(kz kzVar) {
        return kzVar.b.equals(g()) || kzVar.b.equals(C0201.m82(23843)) || kzVar.b.equals(C0201.m82(23844));
    }

    @Override // defpackage.zp
    public boolean f(kz kzVar) {
        return kzVar.b.equals(C0201.m82(23845)) || kzVar.b.equals(C0201.m82(23846));
    }

    public abstract String g();

    public abstract void h(or orVar, kz kzVar) throws IOException;

    public abstract void i(or orVar, kz kzVar) throws IOException;

    public abstract void j(or orVar, kz kzVar) throws IOException;
}
