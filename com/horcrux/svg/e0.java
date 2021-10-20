package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.f;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ViewConstructor"})
/* compiled from: SvgView */
public class e0 extends f implements v, w {
    private Bitmap a;
    private Runnable b = null;
    private boolean c = false;
    private final Map<String, w0> d = new HashMap();
    private final Map<String, w0> e = new HashMap();
    private final Map<String, w0> f = new HashMap();
    private final Map<String, w0> g = new HashMap();
    private final Map<String, a> h = new HashMap();
    private Canvas i;
    private final float j = c.e().density;
    private float k;
    private float l;
    private float m;
    private float n;
    private b0 o;
    private b0 p;
    private String q;
    private int u;
    public final Matrix v = new Matrix();
    private boolean w = true;
    private boolean x = false;
    public int y = 0;

    public e0(ReactContext reactContext) {
        super(reactContext);
    }

    private void e() {
        if (this.x) {
            this.x = false;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof w0) {
                    ((w0) childAt).f();
                }
            }
        }
    }

    private RectF getViewBox() {
        float f2 = this.k;
        float f3 = this.j;
        float f4 = this.l;
        return new RectF(f2 * f3, f4 * f3, (f2 + this.m) * f3, (f4 + this.n) * f3);
    }

    private Bitmap m() {
        boolean z = true;
        this.x = true;
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (!Float.isNaN(width) && !Float.isNaN(height) && width >= 1.0f && height >= 1.0f && Math.log10((double) width) + Math.log10((double) height) <= 42.0d) {
            z = false;
        }
        if (z) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        l(new Canvas(createBitmap));
        return createBitmap;
    }

    private int t(float f2, float f3) {
        if (!this.c || !this.w) {
            return getId();
        }
        float[] fArr = {f2, f3};
        this.v.mapPoints(fArr);
        int i2 = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof w0) {
                i2 = ((w0) childAt).n(fArr);
            } else if (childAt instanceof e0) {
                i2 = ((e0) childAt).t(f2, f3);
            }
            if (i2 != -1) {
                break;
            }
        }
        return i2 == -1 ? getId() : i2;
    }

    @Override // com.facebook.react.uimanager.v
    public int b(float f2, float f3) {
        return t(f2, f3);
    }

    @Override // com.facebook.react.uimanager.w
    public boolean d(float f2, float f3) {
        return true;
    }

    public void f(a aVar, String str) {
        this.h.put(str, aVar);
    }

    public Rect getCanvasBounds() {
        return this.i.getClipBounds();
    }

    public void h(w0 w0Var, String str) {
        this.d.put(str, w0Var);
    }

    public void i(w0 w0Var, String str) {
        this.f.put(str, w0Var);
    }

    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (!(parent instanceof w0)) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.a = null;
        } else if (this.x) {
            this.x = false;
            ((w0) parent).getSvgView().invalidate();
        }
    }

    public void j(w0 w0Var, String str) {
        this.g.put(str, w0Var);
    }

    public void k(w0 w0Var, String str) {
        this.e.put(str, w0Var);
    }

    public synchronized void l(Canvas canvas) {
        this.x = true;
        this.i = canvas;
        Matrix matrix = new Matrix();
        if (this.q != null) {
            RectF viewBox = getViewBox();
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            boolean z = getParent() instanceof w0;
            if (z) {
                width = (float) v.a(this.o, (double) width, 0.0d, (double) this.j, 12.0d);
                height = (float) v.a(this.p, (double) height, 0.0d, (double) this.j, 12.0d);
            }
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            if (z) {
                canvas.clipRect(rectF);
            }
            matrix = v0.a(viewBox, rectF, this.q, this.u);
            this.w = matrix.invert(this.v);
            canvas.concat(matrix);
        }
        Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof w0) {
                ((w0) childAt).v();
            }
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            if (childAt2 instanceof w0) {
                w0 w0Var = (w0) childAt2;
                int u2 = w0Var.u(canvas, matrix);
                w0Var.s(canvas, paint, 1.0f);
                w0Var.t(canvas, u2);
                if (w0Var.o() && !this.c) {
                    this.c = true;
                }
            }
        }
    }

    public void n() {
        if (!this.c) {
            this.c = true;
        }
    }

    public a o(String str) {
        return this.h.get(str);
    }

    public void onDraw(Canvas canvas) {
        if (!(getParent() instanceof w0)) {
            super.onDraw(canvas);
            if (this.a == null) {
                this.a = m();
            }
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    this.b = null;
                }
            }
        }
    }

    @Override // com.facebook.react.views.view.f
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        invalidate();
    }

    public w0 p(String str) {
        return this.d.get(str);
    }

    public w0 q(String str) {
        return this.f.get(str);
    }

    public w0 r(String str) {
        return this.g.get(str);
    }

    public w0 s(String str) {
        return this.e.get(str);
    }

    @xj0(name = "align")
    public void setAlign(String str) {
        this.q = str;
        invalidate();
        e();
    }

    @xj0(name = "bbHeight")
    public void setBbHeight(Dynamic dynamic) {
        this.p = b0.b(dynamic);
        invalidate();
        e();
    }

    @xj0(name = "bbWidth")
    public void setBbWidth(Dynamic dynamic) {
        this.o = b0.b(dynamic);
        invalidate();
        e();
    }

    public void setId(int i2) {
        super.setId(i2);
        SvgViewManager.setSvgView(i2, this);
    }

    @xj0(name = "meetOrSlice")
    public void setMeetOrSlice(int i2) {
        this.u = i2;
        invalidate();
        e();
    }

    @xj0(name = "minX")
    public void setMinX(float f2) {
        this.k = f2;
        invalidate();
        e();
    }

    @xj0(name = "minY")
    public void setMinY(float f2) {
        this.l = f2;
        invalidate();
        e();
    }

    @xj0(name = "tintColor")
    public void setTintColor(Integer num) {
        if (num == null) {
            this.y = 0;
        } else {
            this.y = num.intValue();
        }
        invalidate();
        e();
    }

    public void setToDataUrlTask(Runnable runnable) {
        this.b = runnable;
    }

    @xj0(name = "vbHeight")
    public void setVbHeight(float f2) {
        this.n = f2;
        invalidate();
        e();
    }

    @xj0(name = "vbWidth")
    public void setVbWidth(float f2) {
        this.m = f2;
        invalidate();
        e();
    }

    public boolean u() {
        return this.c;
    }

    public boolean v() {
        return !this.x;
    }

    public String w() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        e();
        l(new Canvas(createBitmap));
        e();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public String x(int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        e();
        l(new Canvas(createBitmap));
        e();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
