package defpackage;

import android.graphics.Color;
import java.util.HashMap;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: z52  reason: default package */
/* compiled from: Gradient */
public class z52 {
    public final int a;
    public int[] b;
    public float[] c;

    /* access modifiers changed from: private */
    /* renamed from: z52$b */
    /* compiled from: Gradient */
    public class b {
        private final int a;
        private final int b;
        private final float c;

        private b(z52 z52, int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }
    }

    public z52(int[] iArr, float[] fArr) {
        this(iArr, fArr, C0188.f18);
    }

    private HashMap<Integer, b> a() {
        HashMap<Integer, b> hashMap = new HashMap<>();
        if (this.c[0] != 0.0f) {
            hashMap.put(0, new b(Color.argb(0, Color.red(this.b[0]), Color.green(this.b[0]), Color.blue(this.b[0])), this.b[0], ((float) this.a) * this.c[0]));
        }
        for (int i = 1; i < this.b.length; i++) {
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf((int) (((float) this.a) * this.c[i2]));
            int[] iArr = this.b;
            int i3 = iArr[i2];
            int i4 = iArr[i];
            float[] fArr = this.c;
            hashMap.put(valueOf, new b(i3, i4, (fArr[i] - fArr[i2]) * ((float) this.a)));
        }
        float[] fArr2 = this.c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (((float) this.a) * fArr2[length]));
            int[] iArr2 = this.b;
            hashMap.put(valueOf2, new b(iArr2[length], iArr2[length], ((float) this.a) * (1.0f - this.c[length])));
        }
        return hashMap;
    }

    public static int c(int i, int i2, float f) {
        int alpha = (int) ((((float) (Color.alpha(i2) - Color.alpha(i))) * f) + ((float) Color.alpha(i)));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    public int[] b(double d) {
        HashMap<Integer, b> a2 = a();
        int[] iArr = new int[this.a];
        b bVar = a2.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            if (a2.containsKey(Integer.valueOf(i2))) {
                bVar = a2.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = c(bVar.a, bVar.b, ((float) (i2 - i)) / bVar.c);
        }
        if (d != 1.0d) {
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = iArr[i3];
                double alpha = (double) Color.alpha(i4);
                Double.isNaN(alpha);
                iArr[i3] = Color.argb((int) (alpha * d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }

    public z52(int[] iArr, float[] fArr, int i) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException(C0201.m82(35008));
        } else if (iArr.length != 0) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] <= fArr[i2 - 1]) {
                    throw new IllegalArgumentException(C0201.m82(35006));
                }
            }
            this.a = i;
            int[] iArr2 = new int[iArr.length];
            this.b = iArr2;
            this.c = new float[fArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
        } else {
            throw new IllegalArgumentException(C0201.m82(35007));
        }
    }
}
