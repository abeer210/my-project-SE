package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: cc0  reason: default package */
/* compiled from: AnimatedDrawableBackendImpl */
public class cc0 implements rb0 {
    private final gc0 a;
    private final vb0 b;
    private final tb0 c;
    private final Rect d;
    private final int[] e;
    private final sb0[] f;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final boolean i;
    private Bitmap j;

    public cc0(gc0 gc0, vb0 vb0, Rect rect, boolean z) {
        this.a = gc0;
        this.b = vb0;
        tb0 c2 = vb0.c();
        this.c = c2;
        int[] j2 = c2.j();
        this.e = j2;
        this.a.a(j2);
        this.a.c(this.e);
        this.a.b(this.e);
        this.d = l(this.c, rect);
        this.i = z;
        this.f = new sb0[this.c.b()];
        for (int i2 = 0; i2 < this.c.b(); i2++) {
            this.f[i2] = this.c.e(i2);
        }
    }

    private synchronized void k() {
        if (this.j != null) {
            this.j.recycle();
            this.j = null;
        }
    }

    private static Rect l(tb0 tb0, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, tb0.c(), tb0.a());
        }
        return new Rect(0, 0, Math.min(rect.width(), tb0.c()), Math.min(rect.height(), tb0.a()));
    }

    private synchronized void m(int i2, int i3) {
        if (this.j != null && (this.j.getWidth() < i2 || this.j.getHeight() < i3)) {
            k();
        }
        if (this.j == null) {
            this.j = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
        this.j.eraseColor(0);
    }

    private void n(Canvas canvas, ub0 ub0) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.i) {
            float max = Math.max(((float) ub0.c()) / ((float) Math.min(ub0.c(), canvas.getWidth())), ((float) ub0.a()) / ((float) Math.min(ub0.a(), canvas.getHeight())));
            i4 = (int) (((float) ub0.c()) / max);
            i3 = (int) (((float) ub0.a()) / max);
            i2 = (int) (((float) ub0.d()) / max);
            i5 = (int) (((float) ub0.e()) / max);
        } else {
            i4 = ub0.c();
            i3 = ub0.a();
            i2 = ub0.d();
            i5 = ub0.e();
        }
        synchronized (this) {
            m(i4, i3);
            ub0.b(i4, i3, this.j);
            canvas.save();
            canvas.translate((float) i2, (float) i5);
            canvas.drawBitmap(this.j, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void o(Canvas canvas, ub0 ub0) {
        double width = (double) this.d.width();
        double c2 = (double) this.c.c();
        Double.isNaN(width);
        Double.isNaN(c2);
        double d2 = width / c2;
        double height = (double) this.d.height();
        double a2 = (double) this.c.a();
        Double.isNaN(height);
        Double.isNaN(a2);
        double d3 = height / a2;
        double c3 = (double) ub0.c();
        Double.isNaN(c3);
        int round = (int) Math.round(c3 * d2);
        double a3 = (double) ub0.a();
        Double.isNaN(a3);
        int round2 = (int) Math.round(a3 * d3);
        double d4 = (double) ub0.d();
        Double.isNaN(d4);
        int i2 = (int) (d4 * d2);
        double e2 = (double) ub0.e();
        Double.isNaN(e2);
        int i3 = (int) (e2 * d3);
        synchronized (this) {
            int width2 = this.d.width();
            int height2 = this.d.height();
            m(width2, height2);
            ub0.b(round, round2, this.j);
            this.g.set(0, 0, width2, height2);
            this.h.set(i2, i3, width2 + i2, height2 + i3);
            canvas.drawBitmap(this.j, this.g, this.h, (Paint) null);
        }
    }

    @Override // defpackage.rb0
    public int a() {
        return this.c.a();
    }

    @Override // defpackage.rb0
    public int b() {
        return this.c.b();
    }

    @Override // defpackage.rb0
    public int c() {
        return this.c.c();
    }

    @Override // defpackage.rb0
    public int d() {
        return this.c.d();
    }

    @Override // defpackage.rb0
    public sb0 e(int i2) {
        return this.f[i2];
    }

    @Override // defpackage.rb0
    public void f(int i2, Canvas canvas) {
        ub0 f2 = this.c.f(i2);
        try {
            if (this.c.h()) {
                o(canvas, f2);
            } else {
                n(canvas, f2);
            }
        } finally {
            f2.dispose();
        }
    }

    @Override // defpackage.rb0
    public int g(int i2) {
        return this.e[i2];
    }

    @Override // defpackage.rb0
    public rb0 h(Rect rect) {
        if (l(this.c, rect).equals(this.d)) {
            return this;
        }
        return new cc0(this.a, this.b, rect, this.i);
    }

    @Override // defpackage.rb0
    public int i() {
        return this.d.height();
    }

    @Override // defpackage.rb0
    public int j() {
        return this.d.width();
    }
}
