package net.alhazmy13.hijridatepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RadialSelectorView */
public class c extends View {
    private boolean A;
    private final Paint a = new Paint();
    private boolean b = false;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private float u;
    private int v;
    private int w;
    private a x;
    private int y;
    private double z;

    /* compiled from: RadialSelectorView */
    private class a implements ValueAnimator.AnimatorUpdateListener {
    }

    public c(Context context) {
        super(context);
    }

    public int a(float f2, float f3, boolean z2, Boolean[] boolArr) {
        if (!this.c) {
            return -1;
        }
        int i2 = this.o;
        float f4 = (f3 - ((float) i2)) * (f3 - ((float) i2));
        int i3 = this.n;
        double sqrt = Math.sqrt((double) (f4 + ((f2 - ((float) i3)) * (f2 - ((float) i3)))));
        boolean z3 = true;
        if (this.l) {
            if (z2) {
                double d2 = (double) ((int) (((float) this.p) * this.f));
                Double.isNaN(d2);
                int abs = (int) Math.abs(sqrt - d2);
                double d3 = (double) ((int) (((float) this.p) * this.g));
                Double.isNaN(d3);
                boolArr[0] = Boolean.valueOf(abs <= ((int) Math.abs(sqrt - d3)));
            } else {
                int i4 = this.p;
                float f5 = this.f;
                int i5 = this.w;
                float f6 = this.g;
                int i6 = ((int) (((float) i4) * f6)) + i5;
                int i7 = (int) (((float) i4) * ((f6 + f5) / 2.0f));
                if (sqrt >= ((double) (((int) (((float) i4) * f5)) - i5)) && sqrt <= ((double) i7)) {
                    boolArr[0] = Boolean.TRUE;
                } else if (sqrt > ((double) i6) || sqrt < ((double) i7)) {
                    return -1;
                } else {
                    boolArr[0] = Boolean.FALSE;
                }
            }
        } else if (!z2) {
            double d4 = (double) this.v;
            Double.isNaN(d4);
            if (((int) Math.abs(sqrt - d4)) > ((int) (((float) this.p) * (1.0f - this.h)))) {
                return -1;
            }
        }
        double abs2 = (double) Math.abs(f3 - ((float) this.o));
        Double.isNaN(abs2);
        int asin = (int) ((Math.asin(abs2 / sqrt) * 180.0d) / 3.141592653589793d);
        boolean z4 = f2 > ((float) this.n);
        if (f3 >= ((float) this.o)) {
            z3 = false;
        }
        if (z4 && z3) {
            return 90 - asin;
        }
        if (z4 && !z3) {
            return asin + 90;
        }
        if (z4 || z3) {
            return (z4 || !z3) ? asin : asin + 270;
        }
        return 270 - asin;
    }

    public void b(int i2, boolean z2, boolean z3) {
        this.y = i2;
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.z = (d2 * 3.141592653589793d) / 180.0d;
        this.A = z3;
        if (!this.l) {
            return;
        }
        if (z2) {
            this.h = this.f;
        } else {
            this.h = this.g;
        }
    }

    public ObjectAnimator getDisappearAnimator() {
        if (!this.b || !this.c) {
            Log.e(C0201.m82(19774), C0201.m82(19775));
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(C0201.m82(19772), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.q), Keyframe.ofFloat(1.0f, this.u)), PropertyValuesHolder.ofKeyframe(C0201.m82(19773), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration((long) C0188.f21);
        duration.addUpdateListener(this.x);
        return duration;
    }

    public ObjectAnimator getReappearAnimator() {
        if (!this.b || !this.c) {
            Log.e(C0201.m82(19778), C0201.m82(19779));
            return null;
        }
        float f2 = (float) C0188.f21;
        int i2 = (int) (1.25f * f2);
        float f3 = (f2 * 0.25f) / ((float) i2);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(C0201.m82(19776), Keyframe.ofFloat(0.0f, this.u), Keyframe.ofFloat(f3, this.u), Keyframe.ofFloat(1.0f - ((1.0f - f3) * 0.2f), this.q), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(C0201.m82(19777), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(f3, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) i2);
        duration.addUpdateListener(this.x);
        return duration;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.b) {
            boolean z2 = true;
            if (!this.c) {
                this.n = getWidth() / 2;
                int height = getHeight() / 2;
                this.o = height;
                int min = (int) (((float) Math.min(this.n, height)) * this.d);
                this.p = min;
                if (!this.k) {
                    double d2 = (double) this.o;
                    double d3 = (double) ((int) (((float) min) * this.e));
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.o = (int) (d2 - (d3 * 0.75d));
                }
                this.w = (int) (((float) this.p) * this.i);
                this.c = true;
            }
            int i2 = (int) (((float) this.p) * this.h * this.j);
            this.v = i2;
            int i3 = this.n;
            double d4 = (double) i2;
            double sin = Math.sin(this.z);
            Double.isNaN(d4);
            int i4 = i3 + ((int) (d4 * sin));
            int i5 = this.o;
            double d5 = (double) this.v;
            double cos = Math.cos(this.z);
            Double.isNaN(d5);
            int i6 = i5 - ((int) (d5 * cos));
            this.a.setAlpha(this.m);
            float f2 = (float) i4;
            float f3 = (float) i6;
            canvas.drawCircle(f2, f3, (float) this.w, this.a);
            boolean z3 = this.A;
            if (this.y % 30 == 0) {
                z2 = false;
            }
            if (z2 || z3) {
                this.a.setAlpha(255);
                canvas.drawCircle(f2, f3, (float) ((this.w * 2) / 7), this.a);
            } else {
                int i7 = this.v - this.w;
                int i8 = this.n;
                double d6 = (double) i7;
                double sin2 = Math.sin(this.z);
                Double.isNaN(d6);
                int i9 = ((int) (sin2 * d6)) + i8;
                int i10 = this.o;
                double cos2 = Math.cos(this.z);
                Double.isNaN(d6);
                int i11 = i10 - ((int) (d6 * cos2));
                i4 = i9;
                i6 = i11;
            }
            this.a.setAlpha(255);
            this.a.setStrokeWidth(3.0f);
            canvas.drawLine((float) this.n, (float) this.o, (float) i4, (float) i6, this.a);
        }
    }

    public void setAnimationRadiusMultiplier(float f2) {
        this.j = f2;
    }
}
