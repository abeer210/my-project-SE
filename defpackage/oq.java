package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: oq  reason: default package */
/* compiled from: QuickTimeReader */
public class oq {
    public static void a(InputStream inputStream, mq mqVar) {
        pr prVar = new pr(inputStream);
        prVar.s(true);
        b(prVar, -1, mqVar);
    }

    private static void b(pr prVar, long j, mq mqVar) {
        while (true) {
            if (j != -1) {
                try {
                    if (prVar.l() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    mqVar.a(e.getMessage());
                    return;
                }
            }
            ox oxVar = new ox(prVar);
            if (mqVar.f(oxVar)) {
                b(prVar, (oxVar.a + prVar.l()) - 8, mqVar.d(oxVar));
            } else if (mqVar.e(oxVar)) {
                mqVar = mqVar.c(oxVar, prVar.d(((int) oxVar.a) - 8));
            } else if (oxVar.a > 1) {
                prVar.t(oxVar.a - 8);
            } else if (oxVar.a == -1) {
                return;
            }
        }
    }
}
