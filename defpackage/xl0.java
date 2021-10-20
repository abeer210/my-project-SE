package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;
import com.shockwave.pdfium.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: xl0  reason: default package */
/* compiled from: PDFView */
public class xl0 extends RelativeLayout {
    private static final String S = xl0.class.getSimpleName();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private PdfiumCore E;
    private qm0 F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private PaintFlagsDrawFilter L;
    private int M;
    private boolean N;
    private boolean O;
    private List<Integer> P;
    private boolean Q;
    private b R;
    private float a = 1.0f;
    private float b = 1.75f;
    private float c = 3.0f;
    public ul0 d;
    private tl0 e;
    private wl0 f;
    public zl0 g;
    private int h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private d m;
    private vl0 n;
    private final HandlerThread o;
    public am0 p;
    private yl0 q;
    public em0 u;
    private Paint v;
    private Paint w;
    private um0 x;
    private int y;
    private boolean z;

    /* renamed from: xl0$b */
    /* compiled from: PDFView */
    public class b {
        private boolean A;
        private final rm0 a;
        private int[] b;
        private boolean c;
        private boolean d;
        private fm0 e;
        private fm0 f;
        private hm0 g;
        private gm0 h;
        private jm0 i;
        private lm0 j;
        private mm0 k;
        private nm0 l;
        private im0 m;
        private km0 n;
        private dm0 o;
        private int p;
        private boolean q;
        private boolean r;
        private String s;
        private qm0 t;
        private boolean u;
        private int v;
        private boolean w;
        private um0 x;
        private boolean y;
        private boolean z;

        public b a(boolean z2) {
            this.w = z2;
            return this;
        }

        public b b(int i2) {
            this.p = i2;
            return this;
        }

        public b c(boolean z2) {
            this.r = z2;
            return this;
        }

        public b d(boolean z2) {
            this.u = z2;
            return this;
        }

        public void e() {
            if (!xl0.this.Q) {
                xl0.this.R = this;
                return;
            }
            xl0.this.Y();
            xl0.this.u.p(this.g);
            xl0.this.u.o(this.h);
            xl0.this.u.m(this.e);
            xl0.this.u.n(this.f);
            xl0.this.u.r(this.i);
            xl0.this.u.t(this.j);
            xl0.this.u.u(this.k);
            xl0.this.u.v(this.l);
            xl0.this.u.q(this.m);
            xl0.this.u.s(this.n);
            xl0.this.u.l(this.o);
            xl0.this.setSwipeEnabled(this.c);
            xl0.this.setNightMode(this.A);
            xl0.this.y(this.d);
            xl0.this.setDefaultPage(this.p);
            xl0.this.setSwipeVertical(!this.q);
            xl0.this.w(this.r);
            xl0.this.setScrollHandle(this.t);
            xl0.this.x(this.u);
            xl0.this.setSpacing(this.v);
            xl0.this.setAutoSpacing(this.w);
            xl0.this.setPageFitPolicy(this.x);
            xl0.this.setPageSnap(this.z);
            xl0.this.setPageFling(this.y);
            int[] iArr = this.b;
            if (iArr != null) {
                xl0.this.M(this.a, this.s, iArr);
            } else {
                xl0.this.L(this.a, this.s);
            }
        }

        public b f(fm0 fm0) {
            this.e = fm0;
            return this;
        }

        public b g(gm0 gm0) {
            this.h = gm0;
            return this;
        }

        public b h(hm0 hm0) {
            this.g = hm0;
            return this;
        }

        public b i(jm0 jm0) {
            this.i = jm0;
            return this;
        }

        public b j(lm0 lm0) {
            this.j = lm0;
            return this;
        }

        public b k(nm0 nm0) {
            this.l = nm0;
            return this;
        }

        public b l(um0 um0) {
            this.x = um0;
            return this;
        }

        public b m(boolean z2) {
            this.y = z2;
            return this;
        }

        public b n(boolean z2) {
            this.z = z2;
            return this;
        }

        public b o(String str) {
            this.s = str;
            return this;
        }

        public b p(int i2) {
            this.v = i2;
            return this;
        }

        public b q(boolean z2) {
            this.q = z2;
            return this;
        }

        private b(rm0 rm0) {
            this.b = null;
            this.c = true;
            this.d = true;
            this.o = new cm0(xl0.this);
            this.p = 0;
            this.q = false;
            this.r = false;
            this.s = null;
            this.t = null;
            this.u = true;
            this.v = 0;
            this.w = false;
            this.x = um0.WIDTH;
            this.y = false;
            this.z = false;
            this.A = false;
            this.a = rm0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: xl0$c */
    /* compiled from: PDFView */
    public enum c {
        NONE,
        START,
        END
    }

    /* access modifiers changed from: private */
    /* renamed from: xl0$d */
    /* compiled from: PDFView */
    public enum d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public xl0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar = c.NONE;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 1.0f;
        this.l = true;
        this.m = d.DEFAULT;
        this.u = new em0();
        this.x = um0.WIDTH;
        this.y = 0;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = true;
        this.L = new PaintFlagsDrawFilter(0, 3);
        this.M = 0;
        this.N = false;
        this.O = true;
        this.P = new ArrayList(10);
        this.Q = false;
        this.o = new HandlerThread(C0201.m82(24202));
        if (!isInEditMode()) {
            this.d = new ul0();
            tl0 tl0 = new tl0(this);
            this.e = tl0;
            this.f = new wl0(this, tl0);
            this.q = new yl0(this);
            this.v = new Paint();
            Paint paint = new Paint();
            this.w = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.E = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void L(rm0 rm0, String str) {
        M(rm0, str, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void M(rm0 rm0, String str, int[] iArr) {
        if (this.l) {
            this.l = false;
            vl0 vl0 = new vl0(rm0, str, iArr, this, this.E);
            this.n = vl0;
            vl0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new IllegalStateException(C0201.m82(24203));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setAutoSpacing(boolean z2) {
        this.N = z2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setDefaultPage(int i2) {
        this.y = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setPageFitPolicy(um0 um0) {
        this.x = um0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollHandle(qm0 qm0) {
        this.F = qm0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSpacing(int i2) {
        this.M = ym0.a(getContext(), i2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSwipeVertical(boolean z2) {
        this.z = z2;
    }

    private void u(Canvas canvas, pm0 pm0) {
        float f2;
        float f3;
        RectF c2 = pm0.c();
        Bitmap d2 = pm0.d();
        if (!d2.isRecycled()) {
            com.shockwave.pdfium.util.a n2 = this.g.n(pm0.b());
            if (this.z) {
                f3 = this.g.m(pm0.b(), this.k);
                f2 = e0(this.g.h() - n2.b()) / 2.0f;
            } else {
                f2 = this.g.m(pm0.b(), this.k);
                f3 = e0(this.g.f() - n2.a()) / 2.0f;
            }
            canvas.translate(f2, f3);
            Rect rect = new Rect(0, 0, d2.getWidth(), d2.getHeight());
            float e0 = e0(c2.left * n2.b());
            float e02 = e0(c2.top * n2.a());
            RectF rectF = new RectF((float) ((int) e0), (float) ((int) e02), (float) ((int) (e0 + e0(c2.width() * n2.b()))), (float) ((int) (e02 + e0(c2.height() * n2.a()))));
            float f4 = this.i + f2;
            float f5 = this.j + f3;
            if (rectF.left + f4 >= ((float) getWidth()) || f4 + rectF.right <= 0.0f || rectF.top + f5 >= ((float) getHeight()) || f5 + rectF.bottom <= 0.0f) {
                canvas.translate(-f2, -f3);
                return;
            }
            canvas.drawBitmap(d2, rect, rectF, this.v);
            if (tm0.a) {
                this.w.setColor(pm0.b() % 2 == 0 ? -65536 : -16776961);
                canvas.drawRect(rectF, this.w);
            }
            canvas.translate(-f2, -f3);
        }
    }

    private void v(Canvas canvas, int i2, fm0 fm0) {
        float f2;
        if (fm0 != null) {
            float f3 = 0.0f;
            if (this.z) {
                f2 = this.g.m(i2, this.k);
            } else {
                f3 = this.g.m(i2, this.k);
                f2 = 0.0f;
            }
            canvas.translate(f3, f2);
            com.shockwave.pdfium.util.a n2 = this.g.n(i2);
            fm0.f(canvas, e0(n2.b()), e0(n2.a()), i2);
            canvas.translate(-f3, -f2);
        }
    }

    public xm0 A(int i2) {
        if (!this.D || i2 < 0) {
            return xm0.NONE;
        }
        float f2 = this.z ? this.j : this.i;
        float f3 = -this.g.m(i2, this.k);
        int height = this.z ? getHeight() : getWidth();
        float k2 = this.g.k(i2, this.k);
        float f4 = (float) height;
        if (f4 >= k2) {
            return xm0.CENTER;
        }
        if (f2 >= f3) {
            return xm0.START;
        }
        if (f3 - k2 > f2 - f4) {
            return xm0.END;
        }
        return xm0.NONE;
    }

    public b B(Uri uri) {
        return new b(new sm0(uri));
    }

    public boolean C() {
        return this.I;
    }

    public boolean D() {
        return this.H;
    }

    public boolean E() {
        return this.B;
    }

    public boolean F() {
        return this.l;
    }

    public boolean G() {
        return this.A;
    }

    public boolean H() {
        return this.z;
    }

    public boolean I() {
        return this.k != this.a;
    }

    public void J(int i2) {
        K(i2, false);
    }

    public void K(int i2, boolean z2) {
        float f2;
        zl0 zl0 = this.g;
        if (zl0 != null) {
            int a2 = zl0.a(i2);
            if (a2 == 0) {
                f2 = 0.0f;
            } else {
                f2 = -this.g.m(a2, this.k);
            }
            if (this.z) {
                if (z2) {
                    this.e.j(this.j, f2);
                } else {
                    S(this.i, f2);
                }
            } else if (z2) {
                this.e.i(this.i, f2);
            } else {
                S(f2, this.j);
            }
            c0(a2);
        }
    }

    public void N(zl0 zl0) {
        this.m = d.LOADED;
        this.g = zl0;
        if (!this.o.isAlive()) {
            this.o.start();
        }
        am0 am0 = new am0(this.o.getLooper(), this);
        this.p = am0;
        am0.e();
        qm0 qm0 = this.F;
        if (qm0 != null) {
            qm0.f(this);
            this.G = true;
        }
        this.f.d();
        this.u.b(zl0.p());
        K(this.y, false);
    }

    public void O(Throwable th) {
        this.m = d.ERROR;
        gm0 k2 = this.u.k();
        Y();
        invalidate();
        if (k2 != null) {
            k2.a(th);
        } else {
            Log.e(C0201.m82(24204), C0201.m82(24205), th);
        }
    }

    public void P() {
        int i2;
        float f2;
        if (this.g.p() != 0) {
            if (this.z) {
                f2 = this.j;
                i2 = getHeight();
            } else {
                f2 = this.i;
                i2 = getWidth();
            }
            int j2 = this.g.j(-(f2 - (((float) i2) / 2.0f)), this.k);
            if (j2 < 0 || j2 > this.g.p() - 1 || j2 == getCurrentPage()) {
                Q();
            } else {
                c0(j2);
            }
        }
    }

    public void Q() {
        am0 am0;
        if (this.g != null && (am0 = this.p) != null) {
            am0.removeMessages(1);
            this.d.i();
            this.q.i();
            Z();
        }
    }

    public void R(float f2, float f3) {
        S(this.i + f2, this.j + f3);
    }

    public void S(float f2, float f3) {
        T(f2, f3, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    public void T(float f2, float f3, boolean z2) {
        float e2;
        float f4;
        float height;
        float e3;
        float f5;
        float width;
        if (this.z) {
            float e0 = e0(this.g.h());
            if (e0 < ((float) getWidth())) {
                width = (float) (getWidth() / 2);
                e0 /= 2.0f;
            } else {
                if (f2 > 0.0f) {
                    f2 = 0.0f;
                } else if (f2 + e0 < ((float) getWidth())) {
                    width = (float) getWidth();
                }
                e3 = this.g.e(this.k);
                if (e3 >= ((float) getHeight())) {
                    f3 = (((float) getHeight()) - e3) / 2.0f;
                } else if (f3 > 0.0f) {
                    f3 = 0.0f;
                } else if (f3 + e3 < ((float) getHeight())) {
                    f3 = (-e3) + ((float) getHeight());
                }
                f5 = this.j;
                if (f3 >= f5) {
                    c cVar = c.END;
                } else if (f3 > f5) {
                    c cVar2 = c.START;
                } else {
                    c cVar3 = c.NONE;
                }
            }
            f2 = width - e0;
            e3 = this.g.e(this.k);
            if (e3 >= ((float) getHeight())) {
            }
            f5 = this.j;
            if (f3 >= f5) {
            }
        } else {
            float e02 = e0(this.g.f());
            if (e02 < ((float) getHeight())) {
                height = (float) (getHeight() / 2);
                e02 /= 2.0f;
            } else {
                if (f3 > 0.0f) {
                    f3 = 0.0f;
                } else if (f3 + e02 < ((float) getHeight())) {
                    height = (float) getHeight();
                }
                e2 = this.g.e(this.k);
                if (e2 >= ((float) getWidth())) {
                    f2 = (((float) getWidth()) - e2) / 2.0f;
                } else if (f2 > 0.0f) {
                    f2 = 0.0f;
                } else if (f2 + e2 < ((float) getWidth())) {
                    f2 = (-e2) + ((float) getWidth());
                }
                f4 = this.i;
                if (f2 >= f4) {
                    c cVar4 = c.END;
                } else if (f2 > f4) {
                    c cVar5 = c.START;
                } else {
                    c cVar6 = c.NONE;
                }
            }
            f3 = height - e02;
            e2 = this.g.e(this.k);
            if (e2 >= ((float) getWidth())) {
            }
            f4 = this.i;
            if (f2 >= f4) {
            }
        }
        this.i = f2;
        this.j = f3;
        float positionOffset = getPositionOffset();
        if (z2 && this.F != null && !t()) {
            this.F.h(positionOffset);
        }
        this.u.f(getCurrentPage(), positionOffset);
        Z();
    }

    public void U(pm0 pm0) {
        if (this.m == d.LOADED) {
            this.m = d.SHOWN;
            this.u.g(this.g.p());
        }
        if (pm0.e()) {
            this.d.c(pm0);
        } else {
            this.d.b(pm0);
        }
        Z();
    }

    public void V(bm0 bm0) {
        if (!this.u.e(bm0.a(), bm0.getCause())) {
            String str = S;
            Log.e(str, C0201.m82(24206) + bm0.a(), bm0.getCause());
        }
    }

    public boolean W() {
        float f2 = -this.g.m(this.h, this.k);
        float k2 = f2 - this.g.k(this.h, this.k);
        if (H()) {
            float f3 = this.j;
            if (f2 <= f3 || k2 >= f3 - ((float) getHeight())) {
                return false;
            }
            return true;
        }
        float f4 = this.i;
        if (f2 <= f4 || k2 >= f4 - ((float) getWidth())) {
            return false;
        }
        return true;
    }

    public void X() {
        zl0 zl0;
        int z2;
        xm0 A2;
        if (this.D && (zl0 = this.g) != null && zl0.p() != 0 && (A2 = A((z2 = z(this.i, this.j)))) != xm0.NONE) {
            float d0 = d0(z2, A2);
            if (this.z) {
                this.e.j(this.j, -d0);
            } else {
                this.e.i(this.i, -d0);
            }
        }
    }

    public void Y() {
        this.R = null;
        this.e.l();
        this.f.c();
        am0 am0 = this.p;
        if (am0 != null) {
            am0.f();
            this.p.removeMessages(1);
        }
        vl0 vl0 = this.n;
        if (vl0 != null) {
            vl0.cancel(true);
        }
        this.d.j();
        qm0 qm0 = this.F;
        if (qm0 != null && this.G) {
            qm0.e();
        }
        zl0 zl0 = this.g;
        if (zl0 != null) {
            zl0.b();
            this.g = null;
        }
        this.p = null;
        this.F = null;
        this.G = false;
        this.j = 0.0f;
        this.i = 0.0f;
        this.k = 1.0f;
        this.l = true;
        this.u = new em0();
        this.m = d.DEFAULT;
    }

    public void Z() {
        invalidate();
    }

    public void a0() {
        i0(this.a);
    }

    public void b0(float f2, boolean z2) {
        if (this.z) {
            T(this.i, ((-this.g.e(this.k)) + ((float) getHeight())) * f2, z2);
        } else {
            T(((-this.g.e(this.k)) + ((float) getWidth())) * f2, this.j, z2);
        }
        P();
    }

    public void c0(int i2) {
        if (!this.l) {
            this.h = this.g.a(i2);
            Q();
            if (this.F != null && !t()) {
                this.F.c(this.h + 1);
            }
            this.u.d(this.h, this.g.p());
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.g == null) {
            return true;
        }
        if (this.z) {
            if (i2 < 0 && this.i < 0.0f) {
                return true;
            }
            if (i2 <= 0 || this.i + e0(this.g.h()) <= ((float) getWidth())) {
                return false;
            }
            return true;
        } else if (i2 < 0 && this.i < 0.0f) {
            return true;
        } else {
            if (i2 <= 0 || this.i + this.g.e(this.k) <= ((float) getWidth())) {
                return false;
            }
            return true;
        }
    }

    public boolean canScrollVertically(int i2) {
        if (this.g == null) {
            return true;
        }
        if (this.z) {
            if (i2 < 0 && this.j < 0.0f) {
                return true;
            }
            if (i2 <= 0 || this.j + this.g.e(this.k) <= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (i2 < 0 && this.j < 0.0f) {
            return true;
        } else {
            if (i2 <= 0 || this.j + e0(this.g.f()) <= ((float) getHeight())) {
                return false;
            }
            return true;
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            this.e.d();
        }
    }

    public float d0(int i2, xm0 xm0) {
        float f2;
        float m2 = this.g.m(i2, this.k);
        float height = (float) (this.z ? getHeight() : getWidth());
        float k2 = this.g.k(i2, this.k);
        if (xm0 == xm0.CENTER) {
            f2 = m2 - (height / 2.0f);
            k2 /= 2.0f;
        } else if (xm0 != xm0.END) {
            return m2;
        } else {
            f2 = m2 - height;
        }
        return f2 + k2;
    }

    public float e0(float f2) {
        return f2 * this.k;
    }

    public void f0(float f2, PointF pointF) {
        g0(this.k * f2, pointF);
    }

    public void g0(float f2, PointF pointF) {
        float f3 = f2 / this.k;
        h0(f2);
        float f4 = pointF.x;
        float f5 = pointF.y;
        S((this.i * f3) + (f4 - (f4 * f3)), (this.j * f3) + (f5 - (f3 * f5)));
    }

    public int getCurrentPage() {
        return this.h;
    }

    public float getCurrentXOffset() {
        return this.i;
    }

    public float getCurrentYOffset() {
        return this.j;
    }

    public a.c getDocumentMeta() {
        zl0 zl0 = this.g;
        if (zl0 == null) {
            return null;
        }
        return zl0.i();
    }

    public float getMaxZoom() {
        return this.c;
    }

    public float getMidZoom() {
        return this.b;
    }

    public float getMinZoom() {
        return this.a;
    }

    public int getPageCount() {
        zl0 zl0 = this.g;
        if (zl0 == null) {
            return 0;
        }
        return zl0.p();
    }

    public um0 getPageFitPolicy() {
        return this.x;
    }

    public float getPositionOffset() {
        int i2;
        float f2;
        float f3;
        if (this.z) {
            f3 = -this.j;
            f2 = this.g.e(this.k);
            i2 = getHeight();
        } else {
            f3 = -this.i;
            f2 = this.g.e(this.k);
            i2 = getWidth();
        }
        return vm0.c(f3 / (f2 - ((float) i2)), 0.0f, 1.0f);
    }

    public qm0 getScrollHandle() {
        return this.F;
    }

    public int getSpacingPx() {
        return this.M;
    }

    public List<a.C0126a> getTableOfContents() {
        zl0 zl0 = this.g;
        if (zl0 == null) {
            return Collections.emptyList();
        }
        return zl0.d();
    }

    public float getZoom() {
        return this.k;
    }

    public void h0(float f2) {
        this.k = f2;
    }

    public void i0(float f2) {
        this.e.k((float) (getWidth() / 2), (float) (getHeight() / 2), this.k, f2);
    }

    public void j0(float f2, float f3, float f4) {
        this.e.k(f2, f3, this.k, f4);
    }

    public void onDetachedFromWindow() {
        Y();
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            if (this.K) {
                canvas.setDrawFilter(this.L);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(this.C ? -16777216 : -1);
            } else {
                background.draw(canvas);
            }
            if (!this.l && this.m == d.SHOWN) {
                float f2 = this.i;
                float f3 = this.j;
                canvas.translate(f2, f3);
                for (pm0 pm0 : this.d.g()) {
                    u(canvas, pm0);
                }
                for (pm0 pm02 : this.d.f()) {
                    u(canvas, pm02);
                    if (this.u.j() != null && !this.P.contains(Integer.valueOf(pm02.b()))) {
                        this.P.add(Integer.valueOf(pm02.b()));
                    }
                }
                for (Integer num : this.P) {
                    v(canvas, num.intValue(), this.u.j());
                }
                this.P.clear();
                v(canvas, this.h, this.u.i());
                canvas.translate(-f2, -f3);
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.Q = true;
        b bVar = this.R;
        if (bVar != null) {
            bVar.e();
        }
        if (!isInEditMode() && this.m == d.SHOWN) {
            this.e.l();
            this.g.y(new Size(i2, i3));
            if (this.z) {
                S(this.i, -this.g.m(this.h, this.k));
            } else {
                S(-this.g.m(this.h, this.k), this.j);
            }
            P();
        }
    }

    public boolean q() {
        return this.N;
    }

    public boolean r() {
        return this.O;
    }

    public boolean s() {
        return this.J;
    }

    public void setMaxZoom(float f2) {
        this.c = f2;
    }

    public void setMidZoom(float f2) {
        this.b = f2;
    }

    public void setMinZoom(float f2) {
        this.a = f2;
    }

    public void setNightMode(boolean z2) {
        this.C = z2;
        if (z2) {
            this.v.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            return;
        }
        this.v.setColorFilter(null);
    }

    public void setPageFling(boolean z2) {
        this.O = z2;
    }

    public void setPageSnap(boolean z2) {
        this.D = z2;
    }

    public void setPositionOffset(float f2) {
        b0(f2, true);
    }

    public void setSwipeEnabled(boolean z2) {
        this.A = z2;
    }

    public boolean t() {
        float e2 = this.g.e(1.0f);
        if (this.z) {
            if (e2 < ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (e2 < ((float) getWidth())) {
            return true;
        } else {
            return false;
        }
    }

    public void w(boolean z2) {
        this.I = z2;
    }

    public void x(boolean z2) {
        this.K = z2;
    }

    public void y(boolean z2) {
        this.B = z2;
    }

    public int z(float f2, float f3) {
        if (this.z) {
            f2 = f3;
        }
        float height = (float) (this.z ? getHeight() : getWidth());
        if (f2 > -1.0f) {
            return 0;
        }
        if (f2 < (-this.g.e(this.k)) + height + 1.0f) {
            return this.g.p() - 1;
        }
        return this.g.j(-(f2 - (height / 2.0f)), this.k);
    }
}
