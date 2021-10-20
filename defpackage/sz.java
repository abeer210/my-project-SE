package defpackage;

import java.io.IOException;

/* renamed from: sz  reason: default package */
/* compiled from: SoundMediaHeaderBox */
public class sz extends mz {
    public int e;

    public sz(or orVar, kz kzVar) throws IOException {
        super(orVar, kzVar);
        this.e = orVar.e();
        orVar.t(2);
    }

    public void a(e00 e00) {
        int i = this.e;
        double d = (double) (-65536 & i);
        double d2 = (double) (i & 65535);
        double pow = Math.pow(2.0d, 4.0d);
        Double.isNaN(d2);
        Double.isNaN(d);
        e00.F(105, d + (d2 / pow));
    }
}
