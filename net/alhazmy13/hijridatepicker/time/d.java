package net.alhazmy13.hijridatepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: RadialTextsView */
public class d extends View {
    private float A;
    private float B;
    private float[] C;
    private float[] D;
    private float[] E;
    private float[] F;
    private float G;
    private float H;
    private float I;
    public ObjectAnimator J;
    public ObjectAnimator K;
    private a L;
    private final Paint a = new Paint();
    private final Paint b = new Paint();
    private final Paint c = new Paint();
    private boolean d;
    private boolean e = false;
    private int f = -1;
    private b g;
    private Typeface h;
    private Typeface i;
    private String[] j;
    private String[] k;
    private boolean l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float u;
    private float v;
    private int w;
    private int x;
    private float y;
    private boolean z;

    /* access modifiers changed from: private */
    /* compiled from: RadialTextsView */
    public class a implements ValueAnimator.AnimatorUpdateListener {
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RadialTextsView */
    public interface b {
        boolean a(int i);
    }

    public d(Context context) {
        super(context);
    }

    private Paint[] a(String[] strArr) {
        Paint[] paintArr = new Paint[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int parseInt = Integer.parseInt(strArr[i2]);
            if (parseInt == this.f) {
                paintArr[i2] = this.b;
            } else if (this.g.a(parseInt)) {
                paintArr[i2] = this.a;
            } else {
                paintArr[i2] = this.c;
            }
        }
        return paintArr;
    }

    private void b(float f2, float f3, float f4, float f5, float[] fArr, float[] fArr2) {
        float sqrt = (((float) Math.sqrt(3.0d)) * f2) / 2.0f;
        float f6 = f2 / 2.0f;
        this.a.setTextSize(f5);
        this.b.setTextSize(f5);
        this.c.setTextSize(f5);
        float descent = f4 - ((this.a.descent() + this.a.ascent()) / 2.0f);
        fArr[0] = descent - f2;
        fArr2[0] = f3 - f2;
        fArr[1] = descent - sqrt;
        fArr2[1] = f3 - sqrt;
        fArr[2] = descent - f6;
        fArr2[2] = f3 - f6;
        fArr[3] = descent;
        fArr2[3] = f3;
        fArr[4] = descent + f6;
        fArr2[4] = f6 + f3;
        fArr[5] = descent + sqrt;
        fArr2[5] = sqrt + f3;
        fArr[6] = descent + f2;
        fArr2[6] = f3 + f2;
    }

    private void c(Canvas canvas, float f2, Typeface typeface, String[] strArr, float[] fArr, float[] fArr2) {
        this.a.setTextSize(f2);
        this.a.setTypeface(typeface);
        Paint[] a2 = a(strArr);
        canvas.drawText(strArr[0], fArr[3], fArr2[0], a2[0]);
        canvas.drawText(strArr[1], fArr[4], fArr2[1], a2[1]);
        canvas.drawText(strArr[2], fArr[5], fArr2[2], a2[2]);
        canvas.drawText(strArr[3], fArr[6], fArr2[3], a2[3]);
        canvas.drawText(strArr[4], fArr[5], fArr2[4], a2[4]);
        canvas.drawText(strArr[5], fArr[4], fArr2[5], a2[5]);
        canvas.drawText(strArr[6], fArr[3], fArr2[6], a2[6]);
        canvas.drawText(strArr[7], fArr[2], fArr2[5], a2[7]);
        canvas.drawText(strArr[8], fArr[1], fArr2[4], a2[8]);
        canvas.drawText(strArr[9], fArr[0], fArr2[3], a2[9]);
        canvas.drawText(strArr[10], fArr[1], fArr2[2], a2[10]);
        canvas.drawText(strArr[11], fArr[2], fArr2[1], a2[11]);
    }

    private void d() {
        Keyframe[] keyframeArr = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.H), Keyframe.ofFloat(1.0f, this.I)};
        String r5 = C0201.m82(20217);
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(r5, keyframeArr);
        Keyframe[] keyframeArr2 = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f)};
        String r9 = C0201.m82(20218);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(this, ofKeyframe, PropertyValuesHolder.ofKeyframe(r9, keyframeArr2)).setDuration((long) C0188.f21);
        this.J = duration;
        duration.addUpdateListener(this.L);
        float f2 = (float) C0188.f21;
        int i2 = (int) (1.25f * f2);
        float f3 = (f2 * 0.25f) / ((float) i2);
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(r5, Keyframe.ofFloat(0.0f, this.I), Keyframe.ofFloat(f3, this.I), Keyframe.ofFloat(1.0f - ((1.0f - f3) * 0.2f), this.H), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(r9, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(f3, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) i2);
        this.K = duration2;
        duration2.addUpdateListener(this.L);
    }

    public ObjectAnimator getDisappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.e && this.d && (objectAnimator = this.J) != null) {
            return objectAnimator;
        }
        Log.e(C0201.m82(20219), C0201.m82(20220));
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.e && this.d && (objectAnimator = this.K) != null) {
            return objectAnimator;
        }
        Log.e(C0201.m82(20221), C0201.m82(20222));
        return null;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.e) {
            if (!this.d) {
                this.w = getWidth() / 2;
                int height = getHeight() / 2;
                this.x = height;
                float min = ((float) Math.min(this.w, height)) * this.n;
                this.y = min;
                if (!this.l) {
                    float f2 = min * this.o;
                    double d2 = (double) this.x;
                    double d3 = (double) f2;
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.x = (int) (d2 - (d3 * 0.75d));
                }
                float f3 = this.y;
                this.A = this.u * f3;
                if (this.m) {
                    this.B = f3 * this.v;
                }
                d();
                this.z = true;
                this.d = true;
            }
            if (this.z) {
                b(this.y * this.p * this.G, (float) this.w, (float) this.x, this.A, this.C, this.D);
                if (this.m) {
                    b(this.y * this.q * this.G, (float) this.w, (float) this.x, this.B, this.E, this.F);
                }
                this.z = false;
            }
            c(canvas, this.A, this.h, this.j, this.D, this.C);
            if (this.m) {
                c(canvas, this.B, this.i, this.k, this.F, this.E);
            }
        }
    }

    public void setAnimationRadiusMultiplier(float f2) {
        this.G = f2;
        this.z = true;
    }

    public void setSelection(int i2) {
        this.f = i2;
    }
}
