package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import defpackage.qf;
import defpackage.wd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: we  reason: default package */
/* compiled from: LayerParser */
public class we {
    private static final qf.a a = qf.a.a(C0201.m82(14435), C0201.m82(14436), C0201.m82(14437), C0201.m82(14438), C0201.m82(14439), C0201.m82(14440), C0201.m82(14441), C0201.m82(14442), C0201.m82(14443), C0201.m82(14444), C0201.m82(14445), C0201.m82(14446), C0201.m82(14447), C0201.m82(14448), C0201.m82(14449), C0201.m82(14450), C0201.m82(14451), C0201.m82(14452), C0201.m82(14453), C0201.m82(14454), C0201.m82(14455), C0201.m82(14456), C0201.m82(14457));
    private static final qf.a b = qf.a.a(C0201.m82(14458), C0201.m82(14459));
    private static final qf.a c = qf.a.a(C0201.m82(14460));

    public static wd a(ea eaVar) {
        Rect b2 = eaVar.b();
        return new wd(Collections.emptyList(), eaVar, C0201.m82(14461), -1, wd.a.PRE_COMP, -1, null, Collections.emptyList(), new zc(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), wd.b.NONE, null, false);
    }

    public static wd b(qf qfVar, ea eaVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        wd.b bVar = wd.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        qfVar.h();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        wd.b bVar2 = bVar;
        wd.a aVar = null;
        String str = null;
        zc zcVar = null;
        xc xcVar = null;
        yc ycVar = null;
        pc pcVar = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String r13 = C0201.m82(14462);
        while (qfVar.o()) {
            switch (qfVar.A(a)) {
                case 0:
                    r13 = qfVar.w();
                    break;
                case 1:
                    j2 = (long) qfVar.s();
                    break;
                case 2:
                    str = qfVar.w();
                    break;
                case 3:
                    int s = qfVar.s();
                    if (s >= wd.a.UNKNOWN.ordinal()) {
                        aVar = wd.a.UNKNOWN;
                        break;
                    } else {
                        aVar = wd.a.values()[s];
                        break;
                    }
                case 4:
                    j = (long) qfVar.s();
                    break;
                case 5:
                    i = (int) (((float) qfVar.s()) * ag.e());
                    break;
                case 6:
                    i2 = (int) (((float) qfVar.s()) * ag.e());
                    break;
                case 7:
                    i3 = Color.parseColor(qfVar.w());
                    break;
                case 8:
                    zcVar = ge.g(qfVar, eaVar);
                    break;
                case 9:
                    bVar2 = wd.b.values()[qfVar.s()];
                    eaVar.q(1);
                    break;
                case 10:
                    qfVar.c();
                    while (qfVar.o()) {
                        arrayList3.add(ye.a(qfVar, eaVar));
                    }
                    eaVar.q(arrayList3.size());
                    qfVar.k();
                    break;
                case 11:
                    qfVar.c();
                    while (qfVar.o()) {
                        dd a2 = ke.a(qfVar, eaVar);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    qfVar.k();
                    break;
                case 12:
                    qfVar.h();
                    while (qfVar.o()) {
                        int A = qfVar.A(b);
                        if (A == 0) {
                            xcVar = he.d(qfVar, eaVar);
                        } else if (A != 1) {
                            qfVar.B();
                            qfVar.D();
                        } else {
                            qfVar.c();
                            if (qfVar.o()) {
                                ycVar = fe.a(qfVar, eaVar);
                            }
                            while (qfVar.o()) {
                                qfVar.D();
                            }
                            qfVar.k();
                        }
                    }
                    qfVar.m();
                    break;
                case 13:
                    qfVar.c();
                    ArrayList arrayList5 = new ArrayList();
                    while (qfVar.o()) {
                        qfVar.h();
                        while (qfVar.o()) {
                            if (qfVar.A(c) != 0) {
                                qfVar.B();
                                qfVar.D();
                            } else {
                                arrayList5.add(qfVar.w());
                            }
                        }
                        qfVar.m();
                    }
                    qfVar.k();
                    eaVar.a(C0201.m82(14463) + arrayList5);
                    break;
                case 14:
                    f3 = (float) qfVar.r();
                    break;
                case 15:
                    f4 = (float) qfVar.r();
                    break;
                case 16:
                    i4 = (int) (((float) qfVar.s()) * ag.e());
                    break;
                case 17:
                    i5 = (int) (((float) qfVar.s()) * ag.e());
                    break;
                case 18:
                    f = (float) qfVar.r();
                    break;
                case 19:
                    f2 = (float) qfVar.r();
                    break;
                case 20:
                    pcVar = he.f(qfVar, eaVar, false);
                    break;
                case 21:
                    str2 = qfVar.w();
                    break;
                case 22:
                    z = qfVar.p();
                    break;
                default:
                    qfVar.B();
                    qfVar.D();
                    break;
            }
        }
        qfVar.m();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new bg(eaVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f5)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= 0.0f) {
            f6 = eaVar.f();
        }
        arrayList2.add(new bg(eaVar, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList2.add(new bg(eaVar, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (r13.endsWith(C0201.m82(14464)) || C0201.m82(14465).equals(str2)) {
            eaVar.a(C0201.m82(14466));
        }
        return new wd(arrayList4, eaVar, r13, j2, aVar, j, str, arrayList, zcVar, i, i2, i3, f3, f4, i4, i5, xcVar, ycVar, arrayList2, bVar2, pcVar, z);
    }
}
