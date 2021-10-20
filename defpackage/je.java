package defpackage;

import android.graphics.Color;
import defpackage.qf;
import java.io.IOException;

/* renamed from: je  reason: default package */
/* compiled from: ColorParser */
public class je implements nf<Integer> {
    public static final je a = new je();

    private je() {
    }

    /* renamed from: b */
    public Integer a(qf qfVar, float f) throws IOException {
        boolean z = qfVar.y() == qf.b.BEGIN_ARRAY;
        if (z) {
            qfVar.c();
        }
        double r = qfVar.r();
        double r2 = qfVar.r();
        double r3 = qfVar.r();
        double r4 = qfVar.r();
        if (z) {
            qfVar.k();
        }
        if (r <= 1.0d && r2 <= 1.0d && r3 <= 1.0d) {
            r *= 255.0d;
            r2 *= 255.0d;
            r3 *= 255.0d;
            if (r4 <= 1.0d) {
                r4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) r4, (int) r, (int) r2, (int) r3));
    }
}
