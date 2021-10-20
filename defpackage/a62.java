package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.gms.maps.model.c0;
import com.google.android.gms.maps.model.z;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: a62  reason: default package */
/* compiled from: HeatmapTileProvider */
public class a62 implements c0 {
    private static final int[] k;
    private static final float[] l;
    public static final z52 m;
    private e62<b62> b;
    private Collection<b62> c;
    private x52 d;
    private int e;
    private z52 f;
    private int[] g;
    private double[] h;
    private double i;
    private double[] j;

    /* renamed from: a62$b */
    /* compiled from: HeatmapTileProvider */
    public static class b {
        private Collection<b62> a;
        private int b = 20;
        private z52 c = a62.m;
        private double d = 0.7d;

        public a62 e() {
            if (this.a != null) {
                return new a62(this);
            }
            throw new IllegalStateException(C0201.m82(31198));
        }

        public b f(z52 z52) {
            this.c = z52;
            return this;
        }

        public b g(double d2) {
            this.d = d2;
            if (d2 >= 0.0d && d2 <= 1.0d) {
                return this;
            }
            throw new IllegalArgumentException(C0201.m82(31199));
        }

        public b h(int i) {
            this.b = i;
            if (i >= 10 && i <= 50) {
                return this;
            }
            throw new IllegalArgumentException(C0201.m82(31200));
        }

        public b i(Collection<b62> collection) {
            this.a = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            throw new IllegalArgumentException(C0201.m82(31201));
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        k = iArr;
        float[] fArr = {0.2f, 1.0f};
        l = fArr;
        m = new z52(iArr, fArr);
    }

    public static Bitmap a(double[][] dArr, int[] iArr, double d2) {
        int i2 = iArr[iArr.length - 1];
        double length = (double) (iArr.length - 1);
        Double.isNaN(length);
        double d3 = length / d2;
        int length2 = dArr.length;
        int[] iArr2 = new int[(length2 * length2)];
        for (int i3 = 0; i3 < length2; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                double d4 = dArr[i4][i3];
                int i5 = (i3 * length2) + i4;
                int i6 = (int) (d4 * d3);
                if (d4 == 0.0d) {
                    iArr2[i5] = 0;
                } else if (i6 < iArr.length) {
                    iArr2[i5] = iArr[i6];
                } else {
                    iArr2[i5] = i2;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    private static z b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new z(512, 512, byteArrayOutputStream.toByteArray());
    }

    public static double[][] c(double[][] dArr, double[] dArr2) {
        double length = (double) dArr2.length;
        Double.isNaN(length);
        int floor = (int) Math.floor(length / 2.0d);
        int length2 = dArr.length;
        int i2 = length2 - (floor * 2);
        int i3 = 1;
        int i4 = (floor + i2) - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length2;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, iArr);
        int i5 = 0;
        while (true) {
            double d2 = 0.0d;
            if (i5 >= length2) {
                break;
            }
            int i6 = 0;
            while (i6 < length2) {
                double d3 = dArr[i5][i6];
                if (d3 != d2) {
                    int i7 = i5 + floor;
                    if (i4 < i7) {
                        i7 = i4;
                    }
                    int i8 = i7 + 1;
                    int i9 = i5 - floor;
                    for (int i10 = floor > i9 ? floor : i9; i10 < i8; i10++) {
                        double[] dArr4 = dArr3[i10];
                        dArr4[i6] = dArr4[i6] + (dArr2[i10 - i9] * d3);
                    }
                }
                i6++;
                d2 = 0.0d;
            }
            i5++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i2;
        iArr2[0] = i2;
        double[][] dArr5 = (double[][]) Array.newInstance(double.class, iArr2);
        int i11 = floor;
        while (i11 < i4 + 1) {
            int i12 = 0;
            while (i12 < length2) {
                double d4 = dArr3[i11][i12];
                if (d4 != 0.0d) {
                    int i13 = i12 + floor;
                    if (i4 < i13) {
                        i13 = i4;
                    }
                    int i14 = i13 + i3;
                    int i15 = i12 - floor;
                    for (int i16 = floor > i15 ? floor : i15; i16 < i14; i16++) {
                        double[] dArr6 = dArr5[i11 - floor];
                        int i17 = i16 - floor;
                        dArr6[i17] = dArr6[i17] + (dArr2[i16 - i15] * d4);
                    }
                }
                i12++;
                i3 = 1;
            }
            i11++;
            i3 = 1;
        }
        return dArr5;
    }

    public static double[] d(int i2, double d2) {
        double[] dArr = new double[((i2 * 2) + 1)];
        for (int i3 = -i2; i3 <= i2; i3++) {
            double d3 = (double) ((-i3) * i3);
            Double.isNaN(d3);
            dArr[i3 + i2] = Math.exp(d3 / ((2.0d * d2) * d2));
        }
        return dArr;
    }

    public static x52 e(Collection<b62> collection) {
        Iterator<b62> it = collection.iterator();
        b62 next = it.next();
        double d2 = next.a().a;
        double d3 = next.a().a;
        double d4 = d2;
        double d5 = d3;
        double d6 = next.a().b;
        double d7 = next.a().b;
        while (it.hasNext()) {
            b62 next2 = it.next();
            double d8 = next2.a().a;
            double d9 = next2.a().b;
            if (d8 < d4) {
                d4 = d8;
            }
            if (d8 > d5) {
                d5 = d8;
            }
            if (d9 < d6) {
                d6 = d9;
            }
            if (d9 > d7) {
                d7 = d9;
            }
        }
        return new x52(d4, d5, d6, d7);
    }

    private double[] f(int i2) {
        int i3;
        double[] dArr = new double[22];
        int i4 = 5;
        while (true) {
            if (i4 >= 11) {
                break;
            }
            dArr[i4] = g(this.c, this.d, i2, (int) (Math.pow(2.0d, (double) (i4 - 3)) * 1280.0d));
            if (i4 == 5) {
                for (int i5 = 0; i5 < i4; i5++) {
                    dArr[i5] = dArr[i4];
                }
            }
            i4++;
        }
        for (i3 = 11; i3 < 22; i3++) {
            dArr[i3] = dArr[10];
        }
        return dArr;
    }

    public static double g(Collection<b62> collection, x52 x52, int i2, int i3) {
        double d2 = x52.a;
        double d3 = x52.c;
        double d4 = x52.b;
        double d5 = d3 - d2;
        double d6 = x52.d - d4;
        if (d5 <= d6) {
            d5 = d6;
        }
        double d7 = (double) (i3 / (i2 * 2));
        Double.isNaN(d7);
        double d8 = (double) ((int) (d7 + 0.5d));
        Double.isNaN(d8);
        double d9 = d8 / d5;
        u0 u0Var = new u0();
        double d10 = 0.0d;
        for (b62 b62 : collection) {
            double d11 = b62.a().a;
            int i4 = (int) ((b62.a().b - d4) * d9);
            long j2 = (long) ((int) ((d11 - d2) * d9));
            u0 u0Var2 = (u0) u0Var.g(j2);
            if (u0Var2 == null) {
                u0Var2 = new u0();
                u0Var.m(j2, u0Var2);
            }
            long j3 = (long) i4;
            Double d12 = (Double) u0Var2.g(j3);
            if (d12 == null) {
                d12 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d12.doubleValue() + b62.b());
            u0Var2.m(j3, valueOf);
            if (valueOf.doubleValue() > d10) {
                d10 = valueOf.doubleValue();
            }
        }
        return d10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c0  */
    @Override // com.google.android.gms.maps.model.c0
    public z getTile(int i2, int i3, int i4) {
        double d2;
        x52 x52;
        x52 x522;
        double d3;
        double pow = 1.0d / Math.pow(2.0d, (double) i4);
        int i5 = this.e;
        double d4 = (double) i5;
        Double.isNaN(d4);
        double d5 = (d4 * pow) / 512.0d;
        double d6 = (double) ((i5 * 2) + 512);
        Double.isNaN(d6);
        double d7 = ((2.0d * d5) + pow) / d6;
        double d8 = (double) i2;
        Double.isNaN(d8);
        double d9 = (d8 * pow) - d5;
        double d10 = (double) (i2 + 1);
        Double.isNaN(d10);
        double d11 = (d10 * pow) + d5;
        double d12 = (double) i3;
        Double.isNaN(d12);
        double d13 = (d12 * pow) - d5;
        double d14 = (double) (i3 + 1);
        Double.isNaN(d14);
        double d15 = (d14 * pow) + d5;
        Collection<b62> arrayList = new ArrayList<>();
        if (d9 < 0.0d) {
            d3 = -1.0d;
            arrayList = this.b.c(new x52(d9 + 1.0d, 1.0d, d13, d15));
        } else {
            d3 = 1.0d;
            if (d11 > 1.0d) {
                arrayList = this.b.c(new x52(0.0d, d11 - 1.0d, d13, d15));
            } else {
                d2 = 0.0d;
                x52 = new x52(d9, d11, d13, d15);
                x522 = this.d;
                if (x52.e(new x52(x522.a - d5, x522.c + d5, x522.b - d5, x522.d + d5))) {
                    return c0.a;
                }
                Collection<b62> c2 = this.b.c(x52);
                if (c2.isEmpty()) {
                    return c0.a;
                }
                int i6 = this.e;
                int[] iArr = new int[2];
                iArr[1] = (i6 * 2) + 512;
                iArr[0] = (i6 * 2) + 512;
                double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
                for (b62 b62 : c2) {
                    y52 a2 = b62.a();
                    int i7 = (int) ((a2.b - d13) / d7);
                    double[] dArr2 = dArr[(int) ((a2.a - d9) / d7)];
                    dArr2[i7] = dArr2[i7] + b62.b();
                }
                for (b62 b622 : arrayList) {
                    y52 a3 = b622.a();
                    int i8 = (int) ((a3.b - d13) / d7);
                    double[] dArr3 = dArr[(int) (((a3.a + d2) - d9) / d7)];
                    dArr3[i8] = dArr3[i8] + b622.b();
                }
                return b(a(c(dArr, this.h), this.g, this.j[i4]));
            }
        }
        d2 = d3;
        x52 = new x52(d9, d11, d13, d15);
        x522 = this.d;
        if (x52.e(new x52(x522.a - d5, x522.c + d5, x522.b - d5, x522.d + d5))) {
        }
    }

    public void h(z52 z52) {
        this.f = z52;
        this.g = z52.b(this.i);
    }

    public void i(double d2) {
        this.i = d2;
        h(this.f);
    }

    public void j(int i2) {
        this.e = i2;
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.h = d(i2, d2 / 3.0d);
        this.j = f(this.e);
    }

    public void k(Collection<b62> collection) {
        this.c = collection;
        if (!collection.isEmpty()) {
            x52 e2 = e(this.c);
            this.d = e2;
            this.b = new e62<>(e2);
            for (b62 b62 : this.c) {
                this.b.a(b62);
            }
            this.j = f(this.e);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(24707));
    }

    private a62(b bVar) {
        this.c = bVar.a;
        this.e = bVar.b;
        this.f = bVar.c;
        this.i = bVar.d;
        int i2 = this.e;
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.h = d(i2, d2 / 3.0d);
        h(this.f);
        k(this.c);
    }
}
