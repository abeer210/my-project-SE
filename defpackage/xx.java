package defpackage;

import java.io.IOException;

/* renamed from: xx  reason: default package */
/* compiled from: SoundInformationMediaHeaderAtom */
public class xx extends qx {
    public int c;

    public xx(or orVar, ox oxVar) throws IOException {
        super(orVar, oxVar);
        this.c = orVar.e();
        orVar.t(2);
    }

    public void a(ly lyVar) {
        int i = this.c;
        double d = (double) (-65536 & i);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        lyVar.F(773, d + (d2 / pow));
    }
}
