package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import defpackage.vx1;
import defpackage.wx1;
import defpackage.xx1;

/* renamed from: rx1  reason: default package */
/* compiled from: MaterialShapeDrawable */
public class rx1 extends Drawable implements androidx.core.graphics.drawable.b, yx1 {
    private static final Paint z = new Paint(1);
    private c a;
    private final xx1.g[] b;
    private final xx1.g[] c;
    private boolean d;
    private final Matrix e;
    private final Path f;
    private final Path g;
    private final RectF h;
    private final RectF i;
    private final Region j;
    private final Region k;
    private vx1 l;
    private final Paint m;
    private final Paint n;
    private final jx1 o;
    private final wx1.a p;
    private final wx1 q;
    private PorterDuffColorFilter u;
    private PorterDuffColorFilter v;
    private Rect w;
    private final RectF x;
    private boolean y;

    /* renamed from: rx1$a */
    /* compiled from: MaterialShapeDrawable */
    class a implements wx1.a {
        public a() {
        }

        @Override // defpackage.wx1.a
        public void a(xx1 xx1, Matrix matrix, int i) {
            rx1.this.b[i] = xx1.e(matrix);
        }

        @Override // defpackage.wx1.a
        public void b(xx1 xx1, Matrix matrix, int i) {
            rx1.this.c[i] = xx1.e(matrix);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rx1$b */
    /* compiled from: MaterialShapeDrawable */
    public class b implements vx1.c {
        public final /* synthetic */ float a;

        public b(rx1 rx1, float f) {
            this.a = f;
        }

        @Override // defpackage.vx1.c
        public nx1 a(nx1 nx1) {
            return nx1 instanceof tx1 ? nx1 : new mx1(this.a, nx1);
        }
    }

    public /* synthetic */ rx1(c cVar, a aVar) {
        this(cVar);
    }

    private float C() {
        if (K()) {
            return this.n.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.a;
        int i2 = cVar.q;
        if (i2 == 1 || cVar.r <= 0 || (i2 != 2 && !S())) {
            return false;
        }
        return true;
    }

    private boolean J() {
        Paint.Style style = this.a.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.n.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (!this.y) {
                m(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.x.width() - ((float) getBounds().width()));
            int height = (int) (this.x.height() - ((float) getBounds().height()));
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.x.width()) + (this.a.r * 2) + width, ((int) this.x.height()) + (this.a.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (float) ((getBounds().left - this.a.r) - width);
            float f3 = (float) ((getBounds().top - this.a.r) - height);
            canvas2.translate(-f2, -f3);
            m(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int Q(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void R(Canvas canvas) {
        int y2 = y();
        int z2 = z();
        if (Build.VERSION.SDK_INT < 21 && this.y) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.a.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(y2, z2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) y2, (float) z2);
    }

    private boolean S() {
        return Build.VERSION.SDK_INT < 21 || (!O() && !this.f.isConvex() && Build.VERSION.SDK_INT < 29);
    }

    private PorterDuffColorFilter e(Paint paint, boolean z2) {
        int color;
        int k2;
        if (!z2 || (k2 = k((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(k2, PorterDuff.Mode.SRC_IN);
    }

    private boolean e0(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.a.d == null || color2 == (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.m.getColor())))) {
            z2 = false;
        } else {
            this.m.setColor(colorForState2);
            z2 = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.n.getColor())))) {
            return z2;
        }
        this.n.setColor(colorForState);
        return true;
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.a.j != 1.0f) {
            this.e.reset();
            Matrix matrix = this.e;
            float f2 = this.a.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.e);
        }
        path.computeBounds(this.x, true);
    }

    private boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        c cVar = this.a;
        this.u = j(cVar.g, cVar.h, this.m, true);
        c cVar2 = this.a;
        this.v = j(cVar2.f, cVar2.h, this.n, false);
        c cVar3 = this.a;
        if (cVar3.u) {
            this.o.d(cVar3.g.getColorForState(getState(), 0));
        }
        if (!androidx.core.util.c.a(porterDuffColorFilter, this.u) || !androidx.core.util.c.a(porterDuffColorFilter2, this.v)) {
            return true;
        }
        return false;
    }

    private void g0() {
        float H = H();
        this.a.r = (int) Math.ceil((double) (0.75f * H));
        this.a.s = (int) Math.ceil((double) (H * 0.25f));
        f0();
        M();
    }

    private void h() {
        vx1 x2 = B().x(new b(this, -C()));
        this.l = x2;
        this.q.d(x2, this.a.k, u(), this.g);
    }

    private PorterDuffColorFilter i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        if (colorStateList == null || mode == null) {
            return e(paint, z2);
        }
        return i(colorStateList, mode, z2);
    }

    private int k(int i2) {
        float H = H() + x();
        ww1 ww1 = this.a.b;
        return ww1 != null ? ww1.c(i2, H) : i2;
    }

    public static rx1 l(Context context, float f2) {
        int b2 = uw1.b(context, nv1.colorSurface, rx1.class.getSimpleName());
        rx1 rx1 = new rx1();
        rx1.L(context);
        rx1.V(ColorStateList.valueOf(b2));
        rx1.U(f2);
        return rx1;
    }

    private void m(Canvas canvas) {
        if (this.a.s != 0) {
            canvas.drawPath(this.f, this.o.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2].b(this.o, this.a.r, canvas);
            this.c[i2].b(this.o, this.a.r, canvas);
        }
        if (this.y) {
            int y2 = y();
            int z2 = z();
            canvas.translate((float) (-y2), (float) (-z2));
            canvas.drawPath(this.f, z);
            canvas.translate((float) y2, (float) z2);
        }
    }

    private void n(Canvas canvas) {
        p(canvas, this.m, this.f, this.a.a, t());
    }

    private void p(Canvas canvas, Paint paint, Path path, vx1 vx1, RectF rectF) {
        if (vx1.u(rectF)) {
            float a2 = vx1.t().a(rectF);
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void q(Canvas canvas) {
        p(canvas, this.n, this.g, this.l, u());
    }

    private RectF u() {
        this.i.set(t());
        float C = C();
        this.i.inset(C, C);
        return this.i;
    }

    public int A() {
        return this.a.r;
    }

    public vx1 B() {
        return this.a.a;
    }

    public ColorStateList D() {
        return this.a.g;
    }

    public float E() {
        return this.a.a.r().a(t());
    }

    public float F() {
        return this.a.a.t().a(t());
    }

    public float G() {
        return this.a.p;
    }

    public float H() {
        return v() + G();
    }

    public void L(Context context) {
        this.a.b = new ww1(context);
        g0();
    }

    public boolean N() {
        ww1 ww1 = this.a.b;
        return ww1 != null && ww1.d();
    }

    public boolean O() {
        return this.a.a.u(t());
    }

    public void T(float f2) {
        setShapeAppearanceModel(this.a.a.w(f2));
    }

    public void U(float f2) {
        c cVar = this.a;
        if (cVar.o != f2) {
            cVar.o = f2;
            g0();
        }
    }

    public void V(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f2) {
        c cVar = this.a;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.d = true;
            invalidateSelf();
        }
    }

    public void X(int i2, int i3, int i4, int i5) {
        c cVar = this.a;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.a.i.set(i2, i3, i4, i5);
        this.w = this.a.i;
        invalidateSelf();
    }

    public void Y(float f2) {
        c cVar = this.a;
        if (cVar.n != f2) {
            cVar.n = f2;
            g0();
        }
    }

    public void Z(int i2) {
        c cVar = this.a;
        if (cVar.t != i2) {
            cVar.t = i2;
            M();
        }
    }

    public void a0(float f2, int i2) {
        d0(f2);
        c0(ColorStateList.valueOf(i2));
    }

    public void b0(float f2, ColorStateList colorStateList) {
        d0(f2);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.a;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f2) {
        this.a.l = f2;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.m.setColorFilter(this.u);
        int alpha = this.m.getAlpha();
        this.m.setAlpha(Q(alpha, this.a.m));
        this.n.setColorFilter(this.v);
        this.n.setStrokeWidth(this.a.l);
        int alpha2 = this.n.getAlpha();
        this.n.setAlpha(Q(alpha2, this.a.m));
        if (this.d) {
            h();
            f(t(), this.f);
            this.d = false;
        }
        P(canvas);
        if (J()) {
            n(canvas);
        }
        if (K()) {
            q(canvas);
        }
        this.m.setAlpha(alpha);
        this.n.setAlpha(alpha2);
    }

    public final void g(RectF rectF, Path path) {
        wx1 wx1 = this.q;
        c cVar = this.a;
        wx1.e(cVar.a, cVar.k, rectF, this.p, path);
    }

    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.a.q != 2) {
            if (O()) {
                outline.setRoundRect(getBounds(), E());
                return;
            }
            f(t(), this.f);
            if (this.f.isConvex() || Build.VERSION.SDK_INT >= 29) {
                outline.setConvexPath(this.f);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.w;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.j.set(getBounds());
        f(t(), this.f);
        this.k.setPath(this.f, this.j);
        this.j.op(this.k, Region.Op.DIFFERENCE);
        return this.j;
    }

    public void invalidateSelf() {
        this.d = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.d) != null && colorStateList4.isStateful())));
    }

    public Drawable mutate() {
        this.a = new c(this.a);
        return this;
    }

    public void o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.a.a, rectF);
    }

    public void onBoundsChange(Rect rect) {
        this.d = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = e0(iArr) || f0();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public float r() {
        return this.a.a.j().a(t());
    }

    public float s() {
        return this.a.a.l().a(t());
    }

    public void setAlpha(int i2) {
        c cVar = this.a;
        if (cVar.m != i2) {
            cVar.m = i2;
            M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        M();
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        this.a.a = vx1;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        f0();
        M();
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.a;
        if (cVar.h != mode) {
            cVar.h = mode;
            f0();
            M();
        }
    }

    public RectF t() {
        this.h.set(getBounds());
        return this.h;
    }

    public float v() {
        return this.a.o;
    }

    public ColorStateList w() {
        return this.a.d;
    }

    public float x() {
        return this.a.n;
    }

    public int y() {
        c cVar = this.a;
        double d2 = (double) cVar.s;
        double sin = Math.sin(Math.toRadians((double) cVar.t));
        Double.isNaN(d2);
        return (int) (d2 * sin);
    }

    public int z() {
        c cVar = this.a;
        double d2 = (double) cVar.s;
        double cos = Math.cos(Math.toRadians((double) cVar.t));
        Double.isNaN(d2);
        return (int) (d2 * cos);
    }

    public rx1() {
        this(new vx1());
    }

    public rx1(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(vx1.e(context, attributeSet, i2, i3).m());
    }

    public rx1(vx1 vx1) {
        this(new c(vx1, null));
    }

    private rx1(c cVar) {
        this.b = new xx1.g[4];
        this.c = new xx1.g[4];
        this.e = new Matrix();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Region();
        this.k = new Region();
        this.m = new Paint(1);
        this.n = new Paint(1);
        this.o = new jx1();
        this.q = new wx1();
        this.x = new RectF();
        this.y = true;
        this.a = cVar;
        this.n.setStyle(Paint.Style.STROKE);
        this.m.setStyle(Paint.Style.FILL);
        z.setColor(-1);
        z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f0();
        e0(getState());
        this.p = new a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rx1$c */
    /* compiled from: MaterialShapeDrawable */
    public static final class c extends Drawable.ConstantState {
        public vx1 a;
        public ww1 b;
        public ColorFilter c;
        public ColorStateList d = null;
        public ColorStateList e = null;
        public ColorStateList f = null;
        public ColorStateList g = null;
        public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = 255;
        public float n = 0.0f;
        public float o = 0.0f;
        public float p = 0.0f;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public c(vx1 vx1, ww1 ww1) {
            this.a = vx1;
            this.b = ww1;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            rx1 rx1 = new rx1(this, null);
            rx1.d = true;
            return rx1;
        }

        public c(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }
    }
}
