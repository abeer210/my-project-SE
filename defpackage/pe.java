package defpackage;

import android.graphics.Color;
import defpackage.qf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pe  reason: default package */
/* compiled from: GradientColorParser */
public class pe implements nf<ed> {
    private int a;

    public pe(int i) {
        this.a = i;
    }

    private void b(ed edVar, List<Float> list) {
        int i = this.a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < edVar.c(); i3++) {
                int i4 = edVar.a()[i3];
                edVar.a()[i3] = Color.argb(c((double) edVar.b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    private int c(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr[i2];
            double d4 = dArr[i];
            if (dArr[i] >= d) {
                d2 = zf.i(dArr2[i2], dArr2[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public ed a(qf qfVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = qfVar.y() == qf.b.BEGIN_ARRAY;
        if (z) {
            qfVar.c();
        }
        while (qfVar.o()) {
            arrayList.add(Float.valueOf((float) qfVar.r()));
        }
        if (z) {
            qfVar.k();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        ed edVar = new ed(fArr, iArr);
        b(edVar, arrayList);
        return edVar;
    }
}
