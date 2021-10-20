package net.alhazmy13.hijridatepicker.time;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: AmPmCirclesView */
public class a extends View {
    private final Paint a = new Paint();
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private String k;
    private String l;
    private boolean m;
    private boolean n;
    private boolean o = false;
    private boolean p;
    private int q;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public a(Context context) {
        super(context);
    }

    public int a(float f2, float f3) {
        if (!this.p) {
            return -1;
        }
        int i2 = this.w;
        int i3 = (int) ((f3 - ((float) i2)) * (f3 - ((float) i2)));
        int i4 = this.u;
        float f4 = (float) i3;
        if (((int) Math.sqrt((double) (((f2 - ((float) i4)) * (f2 - ((float) i4))) + f4))) <= this.q && !this.m) {
            return 0;
        }
        int i5 = this.v;
        if (((int) Math.sqrt((double) (((f2 - ((float) i5)) * (f2 - ((float) i5))) + f4))) > this.q || this.n) {
            return -1;
        }
        return 1;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (getWidth() != 0 && this.o) {
            if (!this.p) {
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int min = (int) (((float) Math.min(width, height)) * this.i);
                int i5 = (int) (((float) min) * this.j);
                this.q = i5;
                double d2 = (double) height;
                double d3 = (double) i5;
                Double.isNaN(d3);
                Double.isNaN(d2);
                this.a.setTextSize((float) ((i5 * 3) / 4));
                int i6 = this.q;
                this.w = (((int) (d2 + (d3 * 0.75d))) - (i6 / 2)) + min;
                this.u = (width - min) + i6;
                this.v = (width + min) - i6;
                this.p = true;
            }
            int i7 = this.d;
            int i8 = this.e;
            int i9 = this.x;
            int i10 = 255;
            if (i9 == 0) {
                int i11 = this.h;
                i10 = this.b;
                i3 = 255;
                i4 = i7;
                i7 = i11;
                i2 = i8;
                i8 = this.f;
            } else if (i9 == 1) {
                i4 = this.h;
                i3 = this.b;
                i2 = this.f;
            } else {
                i4 = i7;
                i2 = i8;
                i3 = 255;
            }
            int i12 = this.y;
            if (i12 == 0) {
                i7 = this.c;
                i10 = this.b;
            } else if (i12 == 1) {
                i4 = this.c;
                i3 = this.b;
            }
            if (this.m) {
                i7 = this.d;
                i8 = this.g;
            }
            if (this.n) {
                i4 = this.d;
                i2 = this.g;
            }
            this.a.setColor(i7);
            this.a.setAlpha(i10);
            canvas.drawCircle((float) this.u, (float) this.w, (float) this.q, this.a);
            this.a.setColor(i4);
            this.a.setAlpha(i3);
            canvas.drawCircle((float) this.v, (float) this.w, (float) this.q, this.a);
            this.a.setColor(i8);
            float descent = (float) (this.w - (((int) (this.a.descent() + this.a.ascent())) / 2));
            canvas.drawText(this.k, (float) this.u, descent, this.a);
            this.a.setColor(i2);
            canvas.drawText(this.l, (float) this.v, descent, this.a);
        }
    }

    public void setAmOrPm(int i2) {
        this.x = i2;
    }

    public void setAmOrPmPressed(int i2) {
        this.y = i2;
    }
}
