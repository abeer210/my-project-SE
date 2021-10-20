package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import defpackage.o1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: p7  reason: default package */
/* compiled from: VectorDrawableCompat */
public class p7 extends o7 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    private h b;
    private PorterDuffColorFilter c;
    private ColorFilter d;
    private boolean e;
    private boolean f;
    private final float[] g;
    private final Matrix h;
    private final Rect i;

    /* access modifiers changed from: private */
    /* renamed from: p7$b */
    /* compiled from: VectorDrawableCompat */
    public static class b extends f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = o1.d(string2);
            }
            this.c = m1.g(typedArray, xmlPullParser, C0201.m82(28231), 2, 0);
        }

        @Override // defpackage.p7.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (m1.j(xmlPullParser, C0201.m82(28232))) {
                TypedArray k = m1.k(resources, theme, attributeSet, h7.d);
                f(k, xmlPullParser);
                k.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$e */
    /* compiled from: VectorDrawableCompat */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$h */
    /* compiled from: VectorDrawableCompat */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h(h hVar) {
            this.c = null;
            this.d = p7.j;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.e != null) {
                    gVar.e = new Paint(hVar.b.e);
                }
                if (hVar.b.d != null) {
                    this.b.d = new Paint(hVar.b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f.getWidth() && i3 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f == null || !a(i2, i3)) {
                this.f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.b.g(iArr);
            this.k |= g2;
            return g2;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int i2, int i3) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i2, i3, null);
        }

        public Drawable newDrawable() {
            return new p7(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new p7(this);
        }

        public h() {
            this.c = null;
            this.d = p7.j;
            this.b = new g();
        }
    }

    public p7() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = new h();
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[Catch:{ XmlPullParserException -> 0x0057, IOException -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ XmlPullParserException -> 0x0057, IOException -> 0x0052 }] */
    public static p7 b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        String r0 = C0201.m82(34198);
        String r1 = C0201.m82(34199);
        if (Build.VERSION.SDK_INT >= 24) {
            p7 p7Var = new p7();
            p7Var.a = l1.b(resources, i2, theme);
            new i(p7Var.a.getConstantState());
            return p7Var;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        return c(resources, xml, asAttributeSet, theme);
                    }
                    throw new XmlPullParserException(C0201.m82(34200));
                }
            }
            if (next != 2) {
            }
        } catch (XmlPullParserException e2) {
            Log.e(r1, r0, e2);
            return null;
        } catch (IOException e3) {
            Log.e(r1, r0, e3);
            return null;
        }
    }

    public static p7 c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        p7 p7Var = new p7();
        p7Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return p7Var;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.b;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String r9 = C0201.m82(34201);
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (C0201.m82(34202).equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.a = cVar.d | hVar.a;
                } else if (C0201.m82(34203).equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.d | hVar.a;
                } else if (r9.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.k | hVar.a;
                }
            } else if (eventType == 3 && r9.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException(C0201.m82(34204));
        }
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.b;
        g gVar = hVar.b;
        hVar.d = g(m1.g(typedArray, xmlPullParser, C0201.m82(34205), 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = m1.c(typedArray, xmlPullParser, theme, C0201.m82(34206), 1);
        if (c2 != null) {
            hVar.c = c2;
        }
        hVar.e = m1.a(typedArray, xmlPullParser, C0201.m82(34207), 5, hVar.e);
        gVar.k = m1.f(typedArray, xmlPullParser, C0201.m82(34208), 7, gVar.k);
        float f2 = m1.f(typedArray, xmlPullParser, C0201.m82(34209), 8, gVar.l);
        gVar.l = f2;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + C0201.m82(34214));
        } else if (f2 > 0.0f) {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + C0201.m82(34212));
            } else if (dimension > 0.0f) {
                gVar.setAlpha(m1.f(typedArray, xmlPullParser, C0201.m82(34210), 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + C0201.m82(34211));
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + C0201.m82(34213));
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public Object d(String str) {
        return this.b.b.p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.i);
        if (this.i.width() > 0 && this.i.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            canvas.getMatrix(this.h);
            this.h.getValues(this.g);
            float abs = Math.abs(this.g[0]);
            float abs2 = Math.abs(this.g[4]);
            float abs3 = Math.abs(this.g[1]);
            float abs4 = Math.abs(this.g[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.i.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.i.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.i;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.i.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.i.offsetTo(0, 0);
                this.b.c(min, min2);
                if (!this.f) {
                    this.b.j(min, min2);
                } else if (!this.b.b()) {
                    this.b.j(min, min2);
                    this.b.i();
                }
                this.b.d(canvas, colorFilter, this.i);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.b.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void h(boolean z) {
        this.f = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.b.e;
    }

    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.b) != null && (hVar.g() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.b = new h(this.b);
            this.e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.b;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.c = j(this.c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.b.b.getRootAlpha() != i2) {
            this.b.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.b.e = z;
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.b;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.c = j(this.c, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.b;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.c = j(this.c, hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$i */
    /* compiled from: VectorDrawableCompat */
    public static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            p7 p7Var = new p7();
            p7Var.a = (VectorDrawable) this.a.newDrawable();
            return p7Var;
        }

        public Drawable newDrawable(Resources resources) {
            p7 p7Var = new p7();
            p7Var.a = (VectorDrawable) this.a.newDrawable(resources);
            return p7Var;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            p7 p7Var = new p7();
            p7Var.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return p7Var;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$f */
    /* compiled from: VectorDrawableCompat */
    public static abstract class f extends e {
        public o1.b[] a = null;
        public String b;
        public int c = 0;
        public int d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            o1.b[] bVarArr = this.a;
            if (bVarArr != null) {
                o1.b.e(bVarArr, path);
            }
        }

        public o1.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(o1.b[] bVarArr) {
            if (!o1.b(this.a, bVarArr)) {
                this.a = o1.f(bVarArr);
            } else {
                o1.j(this.a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = o1.f(fVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.b;
        hVar.b = new g();
        TypedArray k = m1.k(resources, theme, attributeSet, h7.a);
        i(k, xmlPullParser, theme);
        k.recycle();
        hVar.a = getChangingConfigurations();
        hVar.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.c = j(this.c, hVar.c, hVar.d);
    }

    public p7(h hVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = hVar;
        this.c = j(this.c, hVar.c, hVar.d);
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$c */
    /* compiled from: VectorDrawableCompat */
    public static class c extends f {
        private int[] e;
        public h1 f;
        public float g = 0.0f;
        public h1 h;
        public float i = 1.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            if (i2 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            if (i2 == 0) {
                return Paint.Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (m1.j(xmlPullParser, C0201.m82(28113))) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = o1.d(string2);
                }
                this.h = m1.e(typedArray, xmlPullParser, theme, C0201.m82(28114), 1, 0);
                this.j = m1.f(typedArray, xmlPullParser, C0201.m82(28115), 12, this.j);
                this.n = e(m1.g(typedArray, xmlPullParser, C0201.m82(28116), 8, -1), this.n);
                this.o = f(m1.g(typedArray, xmlPullParser, C0201.m82(28117), 9, -1), this.o);
                this.p = m1.f(typedArray, xmlPullParser, C0201.m82(28118), 10, this.p);
                this.f = m1.e(typedArray, xmlPullParser, theme, C0201.m82(28119), 3, 0);
                this.i = m1.f(typedArray, xmlPullParser, C0201.m82(28120), 11, this.i);
                this.g = m1.f(typedArray, xmlPullParser, C0201.m82(28121), 4, this.g);
                this.l = m1.f(typedArray, xmlPullParser, C0201.m82(28122), 6, this.l);
                this.m = m1.f(typedArray, xmlPullParser, C0201.m82(28123), 7, this.m);
                this.k = m1.f(typedArray, xmlPullParser, C0201.m82(28124), 5, this.k);
                this.c = m1.g(typedArray, xmlPullParser, C0201.m82(28125), 13, this.c);
            }
        }

        @Override // defpackage.p7.e
        public boolean a() {
            return this.h.i() || this.f.i();
        }

        @Override // defpackage.p7.e
        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = m1.k(resources, theme, attributeSet, h7.c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.e();
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.e();
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        public void setFillColor(int i2) {
            this.h.k(i2);
        }

        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f.k(i2);
        }

        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.k = f2;
        }

        public c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$g */
    /* compiled from: VectorDrawableCompat */
    public static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;
        public Paint d;
        public Paint e;
        private PathMeasure f;
        private int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final r0<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new r0<>();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.k;
            float f3 = ((float) i3) / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                fVar.d(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.c()) {
                    this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.k == 0.0f && cVar.l == 1.0f)) {
                    float f4 = cVar.k;
                    float f5 = cVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.l + f5) % 1.0f;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.a, false);
                    float length = this.f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f.getSegment(f8, length, path, true);
                        this.f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(path, this.c);
                if (cVar.h.l()) {
                    h1 h1Var = cVar.h;
                    if (this.e == null) {
                        Paint paint = new Paint(1);
                        this.e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.e;
                    if (h1Var.h()) {
                        Shader f10 = h1Var.f();
                        f10.setLocalMatrix(this.c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(p7.a(h1Var.e(), cVar.j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.f.l()) {
                    h1 h1Var2 = cVar.f;
                    if (this.d == null) {
                        Paint paint3 = new Paint(1);
                        this.d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (h1Var2.h()) {
                        Shader f11 = h1Var2.f();
                        f11.setLocalMatrix(this.c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(p7.a(h1Var2.e(), cVar.i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.g * min * e2);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            r0<String, Object> r0Var = new r0<>();
            this.p = r0Var;
            this.h = new d(gVar.h, r0Var);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p7$d */
    /* compiled from: VectorDrawableCompat */
    public static class d extends e {
        public final Matrix a = new Matrix();
        public final ArrayList<e> b = new ArrayList<>();
        public float c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        public final Matrix j = new Matrix();
        public int k;
        private int[] l;
        private String m = null;

        public d(d dVar, r0<String, Object> r0Var) {
            super();
            f fVar;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                r0Var.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, r0Var));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException(C0201.m82(28079));
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        r0Var.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = m1.f(typedArray, xmlPullParser, C0201.m82(28080), 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = m1.f(typedArray, xmlPullParser, C0201.m82(28081), 3, this.f);
            this.g = m1.f(typedArray, xmlPullParser, C0201.m82(28082), 4, this.g);
            this.h = m1.f(typedArray, xmlPullParser, C0201.m82(28083), 6, this.h);
            this.i = m1.f(typedArray, xmlPullParser, C0201.m82(28084), 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // defpackage.p7.e
        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.p7.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = m1.k(resources, theme, attributeSet, h7.b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                d();
            }
        }

        public d() {
            super();
        }
    }
}
