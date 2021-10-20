package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: zf  reason: default package */
/* compiled from: MiscUtils */
public class zf {
    private static PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static boolean d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    private static int e(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int f(float f, float f2) {
        return g((int) f, (int) f2);
    }

    private static int g(int i, int i2) {
        return i - (i2 * e(i, i2));
    }

    public static void h(nd ndVar, Path path) {
        path.reset();
        PointF b = ndVar.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        for (int i = 0; i < ndVar.a().size(); i++) {
            fc fcVar = ndVar.a().get(i);
            PointF a2 = fcVar.a();
            PointF b2 = fcVar.b();
            PointF c = fcVar.c();
            if (!a2.equals(a) || !b2.equals(c)) {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            a.set(c.x, c.y);
        }
        if (ndVar.d()) {
            path.close();
        }
    }

    public static double i(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float j(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int k(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static void l(jc jcVar, int i, List<jc> list, jc jcVar2, eb ebVar) {
        if (jcVar.c(ebVar.getName(), i)) {
            list.add(jcVar2.a(ebVar.getName()).i(ebVar));
        }
    }
}
