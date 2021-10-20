package defpackage;

import defpackage.gc;
import defpackage.qf;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: le  reason: default package */
/* compiled from: DocumentDataParser */
public class le implements nf<gc> {
    public static final le a = new le();
    private static final qf.a b = qf.a.a(C0201.m82(28975), C0201.m82(28976), C0201.m82(28977), C0201.m82(28978), C0201.m82(28979), C0201.m82(28980), C0201.m82(28981), C0201.m82(28982), C0201.m82(28983), C0201.m82(28984), C0201.m82(28985));

    private le() {
    }

    /* renamed from: b */
    public gc a(qf qfVar, float f) throws IOException {
        gc.a aVar = gc.a.CENTER;
        qfVar.h();
        gc.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (qfVar.o()) {
            switch (qfVar.A(b)) {
                case 0:
                    str = qfVar.w();
                    break;
                case 1:
                    str2 = qfVar.w();
                    break;
                case 2:
                    f2 = (float) qfVar.r();
                    break;
                case 3:
                    int s = qfVar.s();
                    if (s <= gc.a.CENTER.ordinal() && s >= 0) {
                        aVar2 = gc.a.values()[s];
                        break;
                    } else {
                        aVar2 = gc.a.CENTER;
                        break;
                    }
                case 4:
                    i = qfVar.s();
                    break;
                case 5:
                    f3 = (float) qfVar.r();
                    break;
                case 6:
                    f4 = (float) qfVar.r();
                    break;
                case 7:
                    i2 = te.d(qfVar);
                    break;
                case 8:
                    i3 = te.d(qfVar);
                    break;
                case 9:
                    f5 = (float) qfVar.r();
                    break;
                case 10:
                    z = qfVar.p();
                    break;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
        }
        qfVar.m();
        return new gc(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
