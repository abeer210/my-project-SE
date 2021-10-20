package org.reactnative.facedetector;

import android.content.Context;
import android.util.SparseArray;
import defpackage.ou1;
import vigqyno.C0201;

/* compiled from: RNFaceDetector */
public class b {
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    private ou1 a = null;
    private vz2 b;
    private ou1.a c = null;
    private int d = i;
    private int e = k;
    private float f = 0.15f;
    private int g = m;

    static {
        C0201.m83(b.class, 286);
    }

    public b(Context context) {
        ou1.a aVar = new ou1.a(context);
        this.c = aVar;
        aVar.d(this.f);
        this.c.e(this.g);
        this.c.c(this.e);
        this.c.b(this.d);
    }

    private void a() {
        this.a = this.c.a();
    }

    private void e() {
        ou1 ou1 = this.a;
        if (ou1 != null) {
            ou1.a();
            this.a = null;
        }
    }

    public SparseArray<nu1> b(a03 a03) {
        if (!a03.a().equals(this.b)) {
            e();
        }
        if (this.a == null) {
            a();
            this.b = a03.a();
        }
        return this.a.b(a03.b());
    }

    public boolean c() {
        if (this.a == null) {
            a();
        }
        return this.a.c();
    }

    public void d() {
        e();
        this.b = null;
    }

    public void f(int i2) {
        if (i2 != this.d) {
            d();
            this.c.b(i2);
            this.d = i2;
        }
    }

    public void g(int i2) {
        if (i2 != this.e) {
            d();
            this.c.c(i2);
            this.e = i2;
        }
    }

    public void h(int i2) {
        if (i2 != this.g) {
            d();
            this.c.e(i2);
            this.g = i2;
        }
    }

    public void i(boolean z) {
        d();
        this.c.f(z);
    }
}
