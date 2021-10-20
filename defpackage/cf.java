package defpackage;

import android.graphics.PointF;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: cf  reason: default package */
/* compiled from: PointFParser */
public class cf implements nf<PointF> {
    public static final cf a = new cf();

    private cf() {
    }

    /* renamed from: b */
    public PointF a(qf qfVar, float f) throws IOException {
        qf.b y = qfVar.y();
        if (y == qf.b.BEGIN_ARRAY) {
            return te.e(qfVar, f);
        }
        if (y == qf.b.BEGIN_OBJECT) {
            return te.e(qfVar, f);
        }
        if (y == qf.b.NUMBER) {
            PointF pointF = new PointF(((float) qfVar.r()) * f, ((float) qfVar.r()) * f);
            while (qfVar.o()) {
                qfVar.D();
            }
            return pointF;
        }
        throw new IllegalArgumentException(C0201.m82(7886) + y);
    }
}
