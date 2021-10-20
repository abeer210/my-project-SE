package defpackage;

import defpackage.qf;
import java.io.IOException;

/* renamed from: gf  reason: default package */
/* compiled from: ScaleXYParser */
public class gf implements nf<eg> {
    public static final gf a = new gf();

    private gf() {
    }

    /* renamed from: b */
    public eg a(qf qfVar, float f) throws IOException {
        boolean z = qfVar.y() == qf.b.BEGIN_ARRAY;
        if (z) {
            qfVar.c();
        }
        float r = (float) qfVar.r();
        float r2 = (float) qfVar.r();
        while (qfVar.o()) {
            qfVar.D();
        }
        if (z) {
            qfVar.k();
        }
        return new eg((r / 100.0f) * f, (r2 / 100.0f) * f);
    }
}
