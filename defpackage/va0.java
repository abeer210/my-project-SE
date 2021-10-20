package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.ta0;
import vigqyno.C0201;

/* renamed from: va0  reason: default package */
/* compiled from: BitmapAnimationBackend */
public class va0 implements ra0, ta0.b {
    private static final Class<?> m = va0.class;
    private final oc0 a;
    private final wa0 b;
    private final ua0 c;
    private final xa0 d;
    private final bb0 e;
    private final cb0 f;
    private final Paint g;
    private Rect h;
    private int i;
    private int j;
    private Bitmap.Config k = Bitmap.Config.ARGB_8888;
    private a l;

    /* renamed from: va0$a */
    /* compiled from: BitmapAnimationBackend */
    public interface a {
        void a(va0 va0, int i, int i2);

        void b(va0 va0, int i);

        void c(va0 va0, int i);
    }

    public va0(oc0 oc0, wa0 wa0, ua0 ua0, xa0 xa0, bb0 bb0, cb0 cb0) {
        this.a = oc0;
        this.b = wa0;
        this.c = ua0;
        this.d = xa0;
        this.e = bb0;
        this.f = cb0;
        this.g = new Paint(6);
        n();
    }

    private boolean k(int i2, v60<Bitmap> v60, Canvas canvas, int i3) {
        if (!v60.z(v60)) {
            return false;
        }
        if (this.h == null) {
            canvas.drawBitmap(v60.w(), 0.0f, 0.0f, this.g);
        } else {
            canvas.drawBitmap(v60.w(), (Rect) null, this.h, this.g);
        }
        if (i3 != 3) {
            this.b.e(i2, v60, i3);
        }
        a aVar = this.l;
        if (aVar == null) {
            return true;
        }
        aVar.a(this, i2, i3);
        return true;
    }

    private boolean l(Canvas canvas, int i2, int i3) {
        boolean z;
        int i4 = 3;
        boolean z2 = false;
        v60<Bitmap> v60 = null;
        if (i3 == 0) {
            v60 = this.b.d(i2);
            z = k(i2, v60, canvas, 0);
            i4 = 1;
        } else if (i3 == 1) {
            v60 = this.b.a(i2, this.i, this.j);
            if (m(i2, v60) && k(i2, v60, canvas, 1)) {
                z2 = true;
            }
            z = z2;
            i4 = 2;
        } else if (i3 == 2) {
            try {
                v60 = this.a.b(this.i, this.j, this.k);
                if (m(i2, v60) && k(i2, v60, canvas, 2)) {
                    z2 = true;
                }
                z = z2;
            } catch (RuntimeException e2) {
                f60.x(m, C0201.m82(12760), e2);
                v60.s(null);
                return false;
            }
        } else if (i3 != 3) {
            v60.s(null);
            return false;
        } else {
            try {
                v60 = this.b.f(i2);
                z = k(i2, v60, canvas, 3);
                i4 = -1;
            } catch (Throwable th) {
                v60.s(v60);
                throw th;
            }
        }
        v60.s(v60);
        return (z || i4 == -1) ? z : l(canvas, i2, i4);
    }

    private boolean m(int i2, v60<Bitmap> v60) {
        if (!v60.z(v60)) {
            return false;
        }
        boolean b2 = this.d.b(i2, v60.w());
        if (!b2) {
            v60.s(v60);
        }
        return b2;
    }

    private void n() {
        int e2 = this.d.e();
        this.i = e2;
        int i2 = -1;
        if (e2 == -1) {
            Rect rect = this.h;
            this.i = rect == null ? -1 : rect.width();
        }
        int a2 = this.d.a();
        this.j = a2;
        if (a2 == -1) {
            Rect rect2 = this.h;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.j = i2;
        }
    }

    @Override // defpackage.ra0
    public int a() {
        return this.j;
    }

    @Override // defpackage.ua0
    public int b() {
        return this.c.b();
    }

    @Override // defpackage.ra0
    public void c(Rect rect) {
        this.h = rect;
        this.d.c(rect);
        n();
    }

    @Override // defpackage.ra0
    public void clear() {
        this.b.clear();
    }

    @Override // defpackage.ua0
    public int d() {
        return this.c.d();
    }

    @Override // defpackage.ra0
    public int e() {
        return this.i;
    }

    @Override // defpackage.ta0.b
    public void f() {
        clear();
    }

    @Override // defpackage.ra0
    public void g(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    @Override // defpackage.ua0
    public int h(int i2) {
        return this.c.h(i2);
    }

    @Override // defpackage.ra0
    public void i(int i2) {
        this.g.setAlpha(i2);
    }

    @Override // defpackage.ra0
    public boolean j(Drawable drawable, Canvas canvas, int i2) {
        cb0 cb0;
        a aVar;
        a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.c(this, i2);
        }
        boolean l2 = l(canvas, i2, 0);
        if (!l2 && (aVar = this.l) != null) {
            aVar.b(this, i2);
        }
        bb0 bb0 = this.e;
        if (!(bb0 == null || (cb0 = this.f) == null)) {
            bb0.a(cb0, this.b, this, i2);
        }
        return l2;
    }
}
