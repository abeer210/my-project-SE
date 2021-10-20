package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import vigqyno.C0201;

/* renamed from: hb0  reason: default package */
/* compiled from: AnimatedDrawable2 */
public class hb0 extends Drawable implements Animatable, y70 {
    private static final Class<?> o = hb0.class;
    private static final ib0 p = new jb0();
    private ra0 a;
    private lb0 b;
    private volatile boolean c;
    private long d;
    private long e;
    private long f;
    private int g;
    private long h;
    private long i;
    private int j;
    private volatile ib0 k;
    private volatile b l;
    private i90 m;
    private final Runnable n;

    /* renamed from: hb0$a */
    /* compiled from: AnimatedDrawable2 */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            hb0 hb0 = hb0.this;
            hb0.unscheduleSelf(hb0.n);
            hb0.this.invalidateSelf();
        }
    }

    /* renamed from: hb0$b */
    /* compiled from: AnimatedDrawable2 */
    public interface b {
        void a(hb0 hb0, lb0 lb0, int i, boolean z, boolean z2, long j, long j2, long j3, long j4, long j5, long j6, long j7);
    }

    public hb0() {
        this(null);
    }

    private static lb0 c(ra0 ra0) {
        if (ra0 == null) {
            return null;
        }
        return new kb0(ra0);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.j++;
        if (f60.o(2)) {
            f60.q(o, C0201.m82(31289), Integer.valueOf(this.j));
        }
    }

    private void f(long j2) {
        long j3 = this.d + j2;
        this.f = j3;
        scheduleSelf(this.n, j3);
    }

    @Override // defpackage.y70
    public void a() {
        ra0 ra0 = this.a;
        if (ra0 != null) {
            ra0.clear();
        }
    }

    public void draw(Canvas canvas) {
        long j2;
        long j3;
        long j4;
        long j5;
        hb0 hb0;
        if (this.a != null && this.b != null) {
            long d2 = d();
            if (this.c) {
                j2 = (d2 - this.d) + this.i;
            } else {
                j2 = Math.max(this.e, 0L);
            }
            int b2 = this.b.b(j2, this.e);
            if (b2 == -1) {
                b2 = this.a.b() - 1;
                this.k.c(this);
                this.c = false;
            } else if (b2 == 0 && this.g != -1 && d2 >= this.f) {
                this.k.a(this);
            }
            boolean j6 = this.a.j(this, canvas, b2);
            if (j6) {
                this.k.d(this, b2);
                this.g = b2;
            }
            if (!j6) {
                e();
            }
            long d3 = d();
            if (this.c) {
                long a2 = this.b.a(d3 - this.d);
                if (a2 != -1) {
                    long j7 = this.h + a2;
                    f(j7);
                    j3 = j7;
                } else {
                    j3 = -1;
                }
                j4 = a2;
            } else {
                j4 = -1;
                j3 = -1;
            }
            b bVar = this.l;
            if (bVar != null) {
                bVar.a(this, this.b, b2, j6, this.c, this.d, j2, this.e, d2, d3, j4, j3);
                hb0 = this;
                j5 = j2;
            } else {
                hb0 = this;
                j5 = j2;
            }
            hb0.e = j5;
        }
    }

    public int getIntrinsicHeight() {
        ra0 ra0 = this.a;
        if (ra0 == null) {
            return super.getIntrinsicHeight();
        }
        return ra0.a();
    }

    public int getIntrinsicWidth() {
        ra0 ra0 = this.a;
        if (ra0 == null) {
            return super.getIntrinsicWidth();
        }
        return ra0.e();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.c;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ra0 ra0 = this.a;
        if (ra0 != null) {
            ra0.c(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        if (this.c) {
            return false;
        }
        long j2 = (long) i2;
        if (this.e == j2) {
            return false;
        }
        this.e = j2;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        if (this.m == null) {
            this.m = new i90();
        }
        this.m.b(i2);
        ra0 ra0 = this.a;
        if (ra0 != null) {
            ra0.i(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.m == null) {
            this.m = new i90();
        }
        this.m.c(colorFilter);
        ra0 ra0 = this.a;
        if (ra0 != null) {
            ra0.g(colorFilter);
        }
    }

    public void start() {
        ra0 ra0;
        if (!this.c && (ra0 = this.a) != null && ra0.b() > 1) {
            this.c = true;
            long d2 = d();
            this.d = d2;
            this.f = d2;
            this.e = -1;
            this.g = -1;
            invalidateSelf();
            this.k.b(this);
        }
    }

    public void stop() {
        if (this.c) {
            this.c = false;
            this.d = 0;
            this.f = 0;
            this.e = -1;
            this.g = -1;
            unscheduleSelf(this.n);
            this.k.c(this);
        }
    }

    public hb0(ra0 ra0) {
        this.h = 8;
        this.i = 0;
        this.k = p;
        this.l = null;
        this.n = new a();
        this.a = ra0;
        this.b = c(ra0);
    }
}
