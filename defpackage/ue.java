package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.qf;
import java.io.IOException;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* renamed from: ue  reason: default package */
/* compiled from: KeyframeParser */
public class ue {
    private static final Interpolator a = new LinearInterpolator();
    private static y0<WeakReference<Interpolator>> b;
    public static qf.a c = qf.a.a(C0201.m82(10030), C0201.m82(10031), C0201.m82(10032), C0201.m82(10033), C0201.m82(10034), C0201.m82(10035), C0201.m82(10036), C0201.m82(10037));
    public static final String d = null;

    static {
        C0201.m83(ue.class, 29);
    }

    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> e;
        synchronized (ue.class) {
            e = e().e(i);
        }
        return e;
    }

    public static <T> bg<T> b(qf qfVar, ea eaVar, float f, nf<T> nfVar, boolean z) throws IOException {
        if (z) {
            return c(eaVar, qfVar, f, nfVar);
        }
        return d(qfVar, f, nfVar);
    }

    private static <T> bg<T> c(ea eaVar, qf qfVar, float f, nf<T> nfVar) throws IOException {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        qfVar.h();
        Interpolator interpolator3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (qfVar.o()) {
            switch (qfVar.A(c)) {
                case 0:
                    f2 = (float) qfVar.r();
                    break;
                case 1:
                    t3 = nfVar.a(qfVar, f);
                    break;
                case 2:
                    t2 = nfVar.a(qfVar, f);
                    break;
                case 3:
                    pointF = te.e(qfVar, f);
                    break;
                case 4:
                    pointF2 = te.e(qfVar, f);
                    break;
                case 5:
                    if (qfVar.s() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF4 = te.e(qfVar, f);
                    break;
                case 7:
                    pointF3 = te.e(qfVar, f);
                    break;
                default:
                    qfVar.D();
                    break;
            }
        }
        qfVar.m();
        if (z) {
            interpolator = a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = a;
            } else {
                float f3 = -f;
                pointF.x = zf.b(pointF.x, f3, f);
                pointF.y = zf.b(pointF.y, -100.0f, 100.0f);
                pointF2.x = zf.b(pointF2.x, f3, f);
                float b2 = zf.b(pointF2.y, -100.0f, 100.0f);
                pointF2.y = b2;
                int i = ag.i(pointF.x, pointF.y, pointF2.x, b2);
                WeakReference<Interpolator> a2 = a(i);
                if (a2 != null) {
                    interpolator3 = a2.get();
                }
                if (a2 == null || interpolator3 == null) {
                    pointF.x /= f;
                    pointF.y /= f;
                    float f4 = pointF2.x / f;
                    pointF2.x = f4;
                    float f5 = pointF2.y / f;
                    pointF2.y = f5;
                    try {
                        interpolator2 = b4.a(pointF.x, pointF.y, f4, f5);
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage().equals(d)) {
                            interpolator2 = b4.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                        } else {
                            interpolator2 = new LinearInterpolator();
                        }
                    }
                    interpolator3 = interpolator2;
                    try {
                        f(i, new WeakReference(interpolator3));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                interpolator = interpolator3;
            }
            t = t2;
        }
        bg<T> bgVar = new bg<>(eaVar, t3, t, interpolator, f2, null);
        bgVar.m = pointF4;
        bgVar.n = pointF3;
        return bgVar;
    }

    private static <T> bg<T> d(qf qfVar, float f, nf<T> nfVar) throws IOException {
        return new bg<>(nfVar.a(qfVar, f));
    }

    private static y0<WeakReference<Interpolator>> e() {
        if (b == null) {
            b = new y0<>();
        }
        return b;
    }

    private static void f(int i, WeakReference<Interpolator> weakReference) {
        synchronized (ue.class) {
            b.l(i, weakReference);
        }
    }
}
