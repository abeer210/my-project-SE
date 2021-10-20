package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: iv1  reason: default package */
public class iv1 implements hv1 {
    private di1[] a;
    private Point[] b;
    private List<gv1> c;
    private Rect d;

    public iv1(SparseArray<di1> sparseArray) {
        this.a = new di1[sparseArray.size()];
        int i = 0;
        while (true) {
            di1[] di1Arr = this.a;
            if (i < di1Arr.length) {
                di1Arr[i] = sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.hv1
    public Rect a() {
        if (this.d == null) {
            this.d = lv1.a(this);
        }
        return this.d;
    }

    @Override // defpackage.hv1
    public Point[] b() {
        iv1 iv1;
        di1[] di1Arr;
        iv1 iv12 = this;
        if (iv12.b == null) {
            char c2 = 0;
            if (iv12.a.length == 0) {
                iv12.b = new Point[0];
            } else {
                int i = C0188.f23;
                int i2 = C0188.f23;
                int i3 = C0188.f24;
                int i4 = C0188.f24;
                int i5 = 0;
                while (true) {
                    di1Arr = iv12.a;
                    if (i5 >= di1Arr.length) {
                        break;
                    }
                    qp1 qp1 = di1Arr[i5].b;
                    qp1 qp12 = di1Arr[c2].b;
                    double sin = Math.sin(Math.toRadians((double) qp12.e));
                    double cos = Math.cos(Math.toRadians((double) qp12.e));
                    Point[] pointArr = new Point[4];
                    pointArr[c2] = new Point(qp1.a, qp1.b);
                    pointArr[c2].offset(-qp12.a, -qp12.b);
                    double d2 = (double) pointArr[c2].x;
                    Double.isNaN(d2);
                    double d3 = (double) pointArr[c2].y;
                    Double.isNaN(d3);
                    int i6 = (int) ((d2 * cos) + (d3 * sin));
                    double d4 = (double) (-pointArr[0].x);
                    Double.isNaN(d4);
                    double d5 = d4 * sin;
                    double d6 = (double) pointArr[0].y;
                    Double.isNaN(d6);
                    int i7 = (int) (d5 + (d6 * cos));
                    pointArr[0].x = i6;
                    pointArr[0].y = i7;
                    pointArr[1] = new Point(qp1.c + i6, i7);
                    pointArr[2] = new Point(qp1.c + i6, qp1.d + i7);
                    pointArr[3] = new Point(i6, i7 + qp1.d);
                    i2 = i2;
                    for (int i8 = 0; i8 < 4; i8++) {
                        Point point = pointArr[i8];
                        i3 = Math.min(i3, point.x);
                        i = Math.max(i, point.x);
                        i4 = Math.min(i4, point.y);
                        i2 = Math.max(i2, point.y);
                    }
                    i5++;
                    c2 = 0;
                    iv12 = this;
                }
                qp1 qp13 = di1Arr[0].b;
                int i9 = qp13.a;
                int i10 = qp13.b;
                double sin2 = Math.sin(Math.toRadians((double) qp13.e));
                double cos2 = Math.cos(Math.toRadians((double) qp13.e));
                Point[] pointArr2 = {new Point(i3, i4), new Point(i, i4), new Point(i, i2), new Point(i3, i2)};
                for (int i11 = 0; i11 < 4; i11++) {
                    double d7 = (double) pointArr2[i11].x;
                    Double.isNaN(d7);
                    double d8 = (double) pointArr2[i11].y;
                    Double.isNaN(d8);
                    int i12 = (int) ((d7 * cos2) - (d8 * sin2));
                    double d9 = (double) pointArr2[i11].x;
                    Double.isNaN(d9);
                    double d10 = (double) pointArr2[i11].y;
                    Double.isNaN(d10);
                    pointArr2[i11].x = i12;
                    pointArr2[i11].y = (int) ((d9 * sin2) + (d10 * cos2));
                    pointArr2[i11].offset(i9, i10);
                }
                iv1 = this;
                iv1.b = pointArr2;
                return iv1.b;
            }
        }
        iv1 = iv12;
        return iv1.b;
    }

    @Override // defpackage.hv1
    public List<? extends hv1> getComponents() {
        if (this.a.length == 0) {
            return new ArrayList(0);
        }
        if (this.c == null) {
            this.c = new ArrayList(this.a.length);
            for (di1 di1 : this.a) {
                this.c.add(new gv1(di1));
            }
        }
        return this.c;
    }

    @Override // defpackage.hv1
    public String getValue() {
        di1[] di1Arr = this.a;
        if (di1Arr.length == 0) {
            return C0201.m82(31065);
        }
        StringBuilder sb = new StringBuilder(di1Arr[0].e);
        for (int i = 1; i < this.a.length; i++) {
            sb.append(C0201.m82(31066));
            sb.append(this.a[i].e);
        }
        return sb.toString();
    }
}
