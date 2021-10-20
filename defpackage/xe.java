package defpackage;

import android.graphics.Rect;
import defpackage.qf;
import defpackage.wd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: xe  reason: default package */
/* compiled from: LottieCompositionMoshiParser */
public class xe {
    private static final qf.a a = qf.a.a(C0201.m82(17126), C0201.m82(17127), C0201.m82(17128), C0201.m82(17129), C0201.m82(17130), C0201.m82(17131), C0201.m82(17132), C0201.m82(17133), C0201.m82(17134), C0201.m82(17135), C0201.m82(17136));
    public static qf.a b = qf.a.a(C0201.m82(17137), C0201.m82(17138), C0201.m82(17139), C0201.m82(17140), C0201.m82(17141), C0201.m82(17142));
    private static final qf.a c = qf.a.a(C0201.m82(17143));
    private static final qf.a d = qf.a.a(C0201.m82(17144), C0201.m82(17145), C0201.m82(17146));

    public static ea a(qf qfVar) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        qf qfVar2 = qfVar;
        float e = ag.e();
        u0<wd> u0Var = new u0<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        y0<ic> y0Var = new y0<>();
        ea eaVar = new ea();
        qfVar.h();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (qfVar.o()) {
            switch (qfVar2.A(a)) {
                case 0:
                    i = qfVar.s();
                    continue;
                    qfVar2 = qfVar;
                case 1:
                    i2 = qfVar.s();
                    continue;
                    qfVar2 = qfVar;
                case 2:
                    f = (float) qfVar.r();
                    continue;
                    qfVar2 = qfVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) qfVar.r()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) qfVar.r();
                    break;
                case 5:
                    String[] split = qfVar.w().split(C0201.m82(17147));
                    if (!ag.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        eaVar.a(C0201.m82(17148));
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(qfVar2, eaVar, arrayList2, u0Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(qfVar2, eaVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(qfVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(qfVar2, eaVar, y0Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(qfVar2, eaVar, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    qfVar.B();
                    qfVar.D();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            qfVar2 = qfVar;
        }
        eaVar.r(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, u0Var, hashMap2, hashMap3, y0Var, hashMap4, arrayList3);
        return eaVar;
    }

    private static void b(qf qfVar, ea eaVar, Map<String, List<wd>> map, Map<String, ha> map2) throws IOException {
        qfVar.c();
        while (qfVar.o()) {
            ArrayList arrayList = new ArrayList();
            u0 u0Var = new u0();
            qfVar.h();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (qfVar.o()) {
                int A = qfVar.A(b);
                if (A == 0) {
                    str = qfVar.w();
                } else if (A == 1) {
                    qfVar.c();
                    while (qfVar.o()) {
                        wd b2 = we.b(qfVar, eaVar);
                        u0Var.m(b2.b(), b2);
                        arrayList.add(b2);
                    }
                    qfVar.k();
                } else if (A == 2) {
                    i = qfVar.s();
                } else if (A == 3) {
                    i2 = qfVar.s();
                } else if (A == 4) {
                    str2 = qfVar.w();
                } else if (A != 5) {
                    qfVar.B();
                    qfVar.D();
                } else {
                    str3 = qfVar.w();
                }
            }
            qfVar.m();
            if (str2 != null) {
                ha haVar = new ha(i, i2, str, str2, str3);
                map2.put(haVar.d(), haVar);
            } else {
                map.put(str, arrayList);
            }
        }
        qfVar.k();
    }

    private static void c(qf qfVar, ea eaVar, y0<ic> y0Var) throws IOException {
        qfVar.c();
        while (qfVar.o()) {
            ic a2 = ne.a(qfVar, eaVar);
            y0Var.l(a2.hashCode(), a2);
        }
        qfVar.k();
    }

    private static void d(qf qfVar, Map<String, hc> map) throws IOException {
        qfVar.h();
        while (qfVar.o()) {
            if (qfVar.A(c) != 0) {
                qfVar.B();
                qfVar.D();
            } else {
                qfVar.c();
                while (qfVar.o()) {
                    hc a2 = oe.a(qfVar);
                    map.put(a2.b(), a2);
                }
                qfVar.k();
            }
        }
        qfVar.m();
    }

    private static void e(qf qfVar, ea eaVar, List<wd> list, u0<wd> u0Var) throws IOException {
        qfVar.c();
        int i = 0;
        while (qfVar.o()) {
            wd b2 = we.b(qfVar, eaVar);
            if (b2.d() == wd.a.IMAGE) {
                i++;
            }
            list.add(b2);
            u0Var.m(b2.b(), b2);
            if (i > 4) {
                wf.c(C0201.m82(17149) + i + C0201.m82(17150));
            }
        }
        qfVar.k();
    }

    private static void f(qf qfVar, ea eaVar, List<mc> list) throws IOException {
        qfVar.c();
        while (qfVar.o()) {
            String str = null;
            qfVar.h();
            float f = 0.0f;
            float f2 = 0.0f;
            while (qfVar.o()) {
                int A = qfVar.A(d);
                if (A == 0) {
                    str = qfVar.w();
                } else if (A == 1) {
                    f = (float) qfVar.r();
                } else if (A != 2) {
                    qfVar.B();
                    qfVar.D();
                } else {
                    f2 = (float) qfVar.r();
                }
            }
            qfVar.m();
            list.add(new mc(str, f, f2));
        }
        qfVar.k();
    }
}
