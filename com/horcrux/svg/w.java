package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RNSVGMarkerPosition */
public class w {
    private static ArrayList<w> d;
    private static int e;
    private static u f;
    private static u g;
    private static u h;
    private static u i;
    private static boolean j;
    public x a;
    public u b;
    public double c;

    /* access modifiers changed from: package-private */
    /* compiled from: RNSVGMarkerPosition */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            int[] iArr = new int[f.values().length];
            b = iArr;
            try {
                iArr[f.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[f.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b[f.kCGPathElementMoveToPoint.ordinal()] = 3;
            b[f.kCGPathElementAddLineToPoint.ordinal()] = 4;
            b[f.kCGPathElementCloseSubpath.ordinal()] = 5;
            int[] iArr2 = new int[x.values().length];
            a = iArr2;
            iArr2[x.kStartMarker.ordinal()] = 1;
            a[x.kMidMarker.ordinal()] = 2;
            try {
                a[x.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private w(x xVar, u uVar, double d2) {
        this.a = xVar;
        this.b = uVar;
        this.c = d2;
    }

    private static double a(double d2, double d3) {
        if (Math.abs(d2 - d3) > 180.0d) {
            d2 += 360.0d;
        }
        return (d2 + d3) / 2.0d;
    }

    private static void b(c0 c0Var, u uVar, u uVar2, u uVar3) {
        c0Var.a = k(uVar2, uVar);
        c0Var.b = k(uVar3, uVar2);
        if (i(c0Var.a)) {
            c0Var.a = c0Var.b;
        } else if (i(c0Var.b)) {
            c0Var.b = c0Var.a;
        }
    }

    private static double c(x xVar) {
        double j2 = j(f(h));
        double j3 = j(f(i));
        int i2 = a.a[xVar.ordinal()];
        if (i2 == 1) {
            return j ? j3 + 180.0d : j3;
        }
        if (i2 == 2) {
            return a(j2, j3);
        }
        if (i2 != 3) {
            return 0.0d;
        }
        return j2;
    }

    private static c0 d(q qVar) {
        c0 c0Var = new c0();
        u[] uVarArr = qVar.b;
        int i2 = a.b[qVar.a.ordinal()];
        if (i2 == 1) {
            c0Var.c = uVarArr[2];
            c0Var.a = k(uVarArr[0], f);
            c0Var.b = k(uVarArr[2], uVarArr[1]);
            if (i(c0Var.a)) {
                b(c0Var, uVarArr[0], uVarArr[1], uVarArr[2]);
            } else if (i(c0Var.b)) {
                b(c0Var, f, uVarArr[0], uVarArr[1]);
            }
        } else if (i2 == 2) {
            c0Var.c = uVarArr[1];
            b(c0Var, f, uVarArr[0], uVarArr[1]);
        } else if (i2 == 3 || i2 == 4) {
            u uVar = uVarArr[0];
            c0Var.c = uVar;
            c0Var.a = k(uVar, f);
            c0Var.b = k(c0Var.c, f);
        } else if (i2 == 5) {
            u uVar2 = g;
            c0Var.c = uVar2;
            c0Var.a = k(uVar2, f);
            c0Var.b = k(c0Var.c, f);
        }
        return c0Var;
    }

    private static void e() {
        d.add(new w(x.kEndMarker, f, c(x.kEndMarker)));
    }

    private static double f(u uVar) {
        return Math.atan2(uVar.b, uVar.a);
    }

    private static void g(q qVar) {
        c0 d2 = d(qVar);
        i = d2.a;
        int i2 = e;
        if (i2 > 0) {
            x xVar = i2 == 1 ? x.kStartMarker : x.kMidMarker;
            d.add(new w(xVar, f, c(xVar)));
        }
        h = d2.b;
        f = d2.c;
        f fVar = qVar.a;
        if (fVar == f.kCGPathElementMoveToPoint) {
            g = qVar.b[0];
        } else if (fVar == f.kCGPathElementCloseSubpath) {
            g = new u(0.0d, 0.0d);
        }
        e++;
    }

    public static ArrayList<w> h(ArrayList<q> arrayList) {
        d = new ArrayList<>();
        e = 0;
        f = new u(0.0d, 0.0d);
        g = new u(0.0d, 0.0d);
        Iterator<q> it = arrayList.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        e();
        return d;
    }

    private static boolean i(u uVar) {
        return uVar.a == 0.0d && uVar.b == 0.0d;
    }

    private static double j(double d2) {
        return d2 * 57.29577951308232d;
    }

    private static u k(u uVar, u uVar2) {
        return new u(uVar2.a - uVar.a, uVar2.b - uVar.b);
    }
}
