package defpackage;

import android.os.AsyncTask;

/* renamed from: lz2  reason: default package */
/* compiled from: BarCodeScannerAsyncTask */
public class lz2 extends AsyncTask<Void, Void, t62> {
    private byte[] a;
    private int b;
    private int c;
    private mz2 d;
    private final n62 e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private float m;

    public lz2(mz2 mz2, n62 n62, byte[] bArr, int i2, int i3, boolean z, float f2, float f3, float f4, float f5, int i4, int i5, float f6) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.d = mz2;
        this.e = n62;
        this.f = z;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = i4;
        this.l = i5;
        this.m = f6;
    }

    private h62 b(byte[] bArr, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        p62 p62;
        if (this.f) {
            p62 = new p62(bArr, i2, i3, i4, i5, i6, i7, false);
        } else {
            p62 = new p62(bArr, i2, i3, 0, 0, i2, i3, false);
        }
        if (z) {
            return new h62(new k72(p62.e()));
        }
        return new h62(new k72(p62));
    }

    private byte[] d(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < i3; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                bArr2[(((i5 * i3) + i3) - i4) - 1] = bArr[(i4 * i2) + i5];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public t62 doInBackground(Void... voidArr) {
        t62 d2;
        if (isCancelled() || this.d == null) {
            return null;
        }
        int i2 = (int) (((float) this.l) / this.m);
        int i3 = this.k;
        float f2 = (float) i2;
        float f3 = this.g;
        int i4 = this.b;
        int i5 = (int) (f3 * ((float) i4));
        int i6 = this.c;
        int i7 = (int) (((((float) ((i2 - i3) / 2)) + (this.h * ((float) i3))) / f2) * ((float) i6));
        int i8 = (int) (this.i * ((float) i4));
        int i9 = (int) (((this.j * ((float) i3)) / f2) * ((float) i6));
        try {
            return this.e.d(b(this.a, i4, i6, false, i5, i7, i8, i9));
        } catch (o62 unused) {
            byte[] d3 = d(this.a, this.b, this.c);
            int i10 = this.c;
            try {
                d2 = this.e.d(b(d3, i10, this.b, false, (i10 - i9) - i7, i5, i9, i8));
            } catch (o62 unused2) {
                byte[] bArr = this.a;
                int i11 = this.b;
                int i12 = this.c;
                try {
                    d2 = this.e.d(b(bArr, i11, i12, true, (i11 - i8) - i5, (i12 - i9) - i7, i8, i9));
                } catch (o62 unused3) {
                    byte[] d4 = d(this.a, this.b, this.c);
                    int i13 = this.c;
                    int i14 = this.b;
                    try {
                        d2 = this.e.d(b(d4, i13, i14, true, i7, (i14 - i8) - i5, i9, i8));
                    } catch (o62 unused4) {
                        return null;
                    }
                }
            }
            return d2;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public void onPostExecute(t62 t62) {
        super.onPostExecute(t62);
        if (t62 != null) {
            this.d.d(t62, this.b, this.c, this.a);
        }
        this.d.g();
    }
}
