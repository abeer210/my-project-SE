package com.shazam.android.widget.text.reflow;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.core.graphics.drawable.a;
import vigqyno.C0201;

public class SwitchDrawable extends Drawable {
    public static final Property<SwitchDrawable, PointF> n = new Property<SwitchDrawable, PointF>(PointF.class, C0201.m82(29335)) {
        /* class com.shazam.android.widget.text.reflow.SwitchDrawable.AnonymousClass1 */

        /* renamed from: a */
        public PointF get(SwitchDrawable switchDrawable) {
            return switchDrawable.b();
        }

        /* renamed from: b */
        public void set(SwitchDrawable switchDrawable, PointF pointF) {
            switchDrawable.g(pointF);
        }
    };
    public static final Property<SwitchDrawable, Integer> o = new Property<SwitchDrawable, Integer>(Integer.class, C0201.m82(29336)) {
        /* class com.shazam.android.widget.text.reflow.SwitchDrawable.AnonymousClass2 */

        /* renamed from: a */
        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(switchDrawable.c());
        }

        /* renamed from: b */
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.h(num.intValue());
        }
    };
    public static final Property<SwitchDrawable, Integer> p = new Property<SwitchDrawable, Integer>(Integer.class, C0201.m82(29337)) {
        /* class com.shazam.android.widget.text.reflow.SwitchDrawable.AnonymousClass3 */

        /* renamed from: a */
        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(switchDrawable.a());
        }

        /* renamed from: b */
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.e(num.intValue());
        }
    };
    public static final Property<SwitchDrawable, Integer> q = new Property<SwitchDrawable, Integer>(Integer.class, C0201.m82(29338)) {
        /* class com.shazam.android.widget.text.reflow.SwitchDrawable.AnonymousClass4 */

        /* renamed from: a */
        public Integer get(SwitchDrawable switchDrawable) {
            return Integer.valueOf(a.d(switchDrawable));
        }

        /* renamed from: b */
        public void set(SwitchDrawable switchDrawable, Integer num) {
            switchDrawable.setAlpha(num.intValue());
        }
    };
    public static final Property<SwitchDrawable, Float> r = new Property<SwitchDrawable, Float>(Float.class, C0201.m82(29339)) {
        /* class com.shazam.android.widget.text.reflow.SwitchDrawable.AnonymousClass5 */

        /* renamed from: a */
        public Float get(SwitchDrawable switchDrawable) {
            return Float.valueOf(0.0f);
        }

        /* renamed from: b */
        public void set(SwitchDrawable switchDrawable, Float f) {
            switchDrawable.f(f.floatValue());
        }
    };
    private final Paint a;
    private final float b;
    private Bitmap c;
    private final Bitmap d;
    private Rect e;
    private final Rect f;
    private boolean g = false;
    private PointF h;
    private int i;
    private int j;
    private final double[] k;
    private final double[] l;
    private final double[] m = new double[3];

    public SwitchDrawable(Bitmap bitmap, Rect rect, float f2, Bitmap bitmap2, Rect rect2, float f3, int i2, int i3) {
        this.c = bitmap;
        this.e = rect;
        this.d = bitmap2;
        this.f = rect2;
        this.k = ColorUtils.b(i2);
        this.l = ColorUtils.b(i3);
        this.b = f2 / (f3 + f2);
        this.a = new Paint(6);
    }

    private void i() {
        int round = Math.round(this.h.x);
        int round2 = Math.round(this.h.y);
        setBounds(round, round2, this.i + round, this.j + round2);
    }

    public int a() {
        return this.j;
    }

    public PointF b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public void d(float f2) {
        ColorUtils.a(this.k, this.l, f2, this.m);
        this.a.setColorFilter(new PorterDuffColorFilter(ColorUtils.c(this.m), PorterDuff.Mode.SRC_IN));
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.c, this.e, getBounds(), this.a);
    }

    public void e(int i2) {
        this.j = i2;
        i();
    }

    public void f(float f2) {
        d(f2);
        if (!this.g && f2 >= this.b) {
            this.c = this.d;
            this.e = this.f;
            this.g = true;
        }
    }

    public void g(PointF pointF) {
        this.h = pointF;
        i();
    }

    public int getAlpha() {
        return this.a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    public int getOpacity() {
        return -3;
    }

    public void h(int i2) {
        this.i = i2;
        i();
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
