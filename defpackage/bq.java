package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bq  reason: default package */
/* compiled from: Mp4Reader */
public class bq {
    public static void a(InputStream inputStream, zp zpVar) {
        pr prVar = new pr(inputStream);
        prVar.s(true);
        b(prVar, -1, zpVar);
    }

    private static void b(pr prVar, long j, zp zpVar) {
        while (true) {
            if (j != -1) {
                try {
                    if (prVar.l() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    zpVar.a(e.getMessage());
                    return;
                }
            }
            kz kzVar = new kz(prVar);
            if (zpVar.f(kzVar)) {
                b(prVar, (kzVar.a + prVar.l()) - 8, zpVar.d(kzVar));
            } else if (zpVar.e(kzVar)) {
                zpVar = zpVar.c(kzVar, prVar.d(((int) kzVar.a) - 8));
            } else if (kzVar.c != null) {
                prVar.t(kzVar.a - 24);
            } else if (kzVar.a > 1) {
                prVar.t(kzVar.a - 8);
            } else if (kzVar.a == -1) {
                return;
            }
        }
    }
}
