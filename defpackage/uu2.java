package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: uu2  reason: default package */
/* compiled from: BlockingBlurController */
public final class uu2 implements wu2 {
    private float a = 16.0f;
    private float b = 1.0f;
    private float c = 1.0f;
    private vu2 d;
    private Canvas e;
    private Bitmap f;
    public final View g;
    private int h;
    private final ViewGroup i;
    private final int[] j = new int[2];
    private final int[] k = new int[2];
    private final ViewTreeObserver.OnPreDrawListener l = new a();
    private boolean m = true;
    private boolean n;
    private Drawable o;
    private boolean p;
    private final Paint q = new Paint(2);

    /* renamed from: uu2$a */
    /* compiled from: BlockingBlurController */
    class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            uu2.this.q();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: uu2$b */
    /* compiled from: BlockingBlurController */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void a() {
            uu2.this.g.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT >= 16) {
                uu2.this.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                a();
            }
            uu2.this.m(uu2.this.g.getMeasuredWidth(), uu2.this.g.getMeasuredHeight());
        }
    }

    public uu2(View view, ViewGroup viewGroup, int i2) {
        this.i = viewGroup;
        this.g = view;
        this.h = i2;
        this.d = new zu2();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (n(measuredWidth, measuredHeight)) {
            k();
        } else {
            m(measuredWidth, measuredHeight);
        }
    }

    private void i(int i2, int i3) {
        int l2 = l((float) i2);
        int l3 = l((float) i3);
        int o2 = o(l2);
        int o3 = o(l3);
        this.c = ((float) l3) / ((float) o3);
        this.b = ((float) l2) / ((float) o2);
        this.f = Bitmap.createBitmap(o2, o3, this.d.a());
    }

    private void j() {
        this.f = this.d.c(this.f, this.a);
        if (!this.d.b()) {
            this.e.setBitmap(this.f);
        }
    }

    private void k() {
        this.g.getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }

    private int l(float f2) {
        return (int) Math.ceil((double) (f2 / 8.0f));
    }

    private boolean n(int i2, int i3) {
        return l((float) i3) == 0 || l((float) i2) == 0;
    }

    private int o(int i2) {
        int i3 = i2 % 64;
        return i3 == 0 ? i2 : (i2 - i3) + 64;
    }

    private void p() {
        this.i.getLocationOnScreen(this.j);
        this.g.getLocationOnScreen(this.k);
        int[] iArr = this.k;
        int i2 = iArr[0];
        int[] iArr2 = this.j;
        int i3 = i2 - iArr2[0];
        int i4 = iArr[1] - iArr2[1];
        float f2 = this.b * 8.0f;
        float f3 = this.c * 8.0f;
        this.e.translate(((float) (-i3)) / f2, ((float) (-i4)) / f3);
        this.e.scale(1.0f / f2, 1.0f / f3);
    }

    @Override // defpackage.yu2
    public yu2 a(boolean z) {
        this.g.getViewTreeObserver().removeOnPreDrawListener(this.l);
        if (z) {
            this.g.getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        return this;
    }

    @Override // defpackage.yu2
    public yu2 b(int i2) {
        if (this.h != i2) {
            this.h = i2;
            this.g.invalidate();
        }
        return this;
    }

    @Override // defpackage.yu2
    public yu2 c(Drawable drawable) {
        this.o = drawable;
        return this;
    }

    @Override // defpackage.yu2
    public yu2 d(boolean z) {
        this.p = z;
        return this;
    }

    @Override // defpackage.wu2
    public void destroy() {
        a(false);
        this.d.destroy();
        this.n = false;
    }

    @Override // defpackage.wu2
    public void e() {
        m(this.g.getMeasuredWidth(), this.g.getMeasuredHeight());
    }

    @Override // defpackage.wu2
    public boolean f(Canvas canvas) {
        if (this.m && this.n) {
            if (canvas == this.e) {
                return false;
            }
            q();
            canvas.save();
            canvas.scale(this.b * 8.0f, this.c * 8.0f);
            canvas.drawBitmap(this.f, 0.0f, 0.0f, this.q);
            canvas.restore();
            int i2 = this.h;
            if (i2 != 0) {
                canvas.drawColor(i2);
            }
        }
        return true;
    }

    @Override // defpackage.yu2
    public yu2 g(float f2) {
        this.a = f2;
        return this;
    }

    @Override // defpackage.yu2
    public yu2 h(vu2 vu2) {
        this.d = vu2;
        return this;
    }

    public void m(int i2, int i3) {
        if (n(i2, i3)) {
            this.g.setWillNotDraw(true);
            return;
        }
        this.g.setWillNotDraw(false);
        i(i2, i3);
        this.e = new Canvas(this.f);
        this.n = true;
        if (this.p) {
            p();
        }
    }

    public void q() {
        if (this.m && this.n) {
            Drawable drawable = this.o;
            if (drawable == null) {
                this.f.eraseColor(0);
            } else {
                drawable.draw(this.e);
            }
            if (this.p) {
                this.i.draw(this.e);
            } else {
                this.e.save();
                p();
                this.i.draw(this.e);
                this.e.restore();
            }
            j();
        }
    }
}
