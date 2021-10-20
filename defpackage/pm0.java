package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: pm0  reason: default package */
/* compiled from: PagePart */
public class pm0 {
    private int a;
    private Bitmap b;
    private RectF c;
    private boolean d;
    private int e;

    public pm0(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.a = i;
        this.b = bitmap;
        this.c = rectF;
        this.d = z;
        this.e = i2;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.a;
    }

    public RectF c() {
        return this.c;
    }

    public Bitmap d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pm0)) {
            return false;
        }
        pm0 pm0 = (pm0) obj;
        if (pm0.b() == this.a && pm0.c().left == this.c.left && pm0.c().right == this.c.right && pm0.c().top == this.c.top && pm0.c().bottom == this.c.bottom) {
            return true;
        }
        return false;
    }

    public void f(int i) {
        this.e = i;
    }
}
