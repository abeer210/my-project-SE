package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import vigqyno.C0188;

/* renamed from: lv1  reason: default package */
public final class lv1 {
    public static Rect a(hv1 hv1) {
        Point[] b = hv1.b();
        int i = C0188.f23;
        int i2 = C0188.f23;
        int i3 = C0188.f24;
        int i4 = C0188.f24;
        for (Point point : b) {
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    public static Point[] b(qp1 qp1) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) qp1.e));
        double cos = Math.cos(Math.toRadians((double) qp1.e));
        pointArr[0] = new Point(qp1.a, qp1.b);
        double d = (double) qp1.a;
        int i = qp1.c;
        double d2 = (double) i;
        Double.isNaN(d2);
        Double.isNaN(d);
        double d3 = (double) qp1.b;
        double d4 = (double) i;
        Double.isNaN(d4);
        Double.isNaN(d3);
        pointArr[1] = new Point((int) (d + (d2 * cos)), (int) (d3 + (d4 * sin)));
        double d5 = (double) pointArr[1].x;
        int i2 = qp1.d;
        double d6 = (double) i2;
        Double.isNaN(d6);
        Double.isNaN(d5);
        int i3 = (int) (d5 - (d6 * sin));
        double d7 = (double) pointArr[1].y;
        double d8 = (double) i2;
        Double.isNaN(d8);
        Double.isNaN(d7);
        pointArr[2] = new Point(i3, (int) (d7 + (d8 * cos)));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
