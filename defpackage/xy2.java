package defpackage;

import android.content.Context;
import android.util.SparseArray;
import defpackage.xt1;
import vigqyno.C0201;

/* renamed from: xy2  reason: default package */
/* compiled from: RNBarcodeDetector */
public class xy2 {
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    private xt1 a = null;
    private vz2 b;
    private xt1.a c;
    private int d = 0;

    static {
        C0201.m83(xy2.class, 594);
    }

    public xy2(Context context) {
        xt1.a aVar = new xt1.a(context);
        aVar.b(this.d);
        this.c = aVar;
    }

    private void a() {
        this.a = this.c.a();
    }

    private void e() {
        xt1 xt1 = this.a;
        if (xt1 != null) {
            xt1.a();
            this.a = null;
        }
    }

    public SparseArray<wt1> b(a03 a03) {
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

    public void f(int i) {
        if (i != this.d) {
            d();
            this.c.b(i);
            this.d = i;
        }
    }
}
