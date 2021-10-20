package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.b;

public class HorizontalProgressWheelView extends View {
    private final Rect a;
    private a b;
    private float c;
    private Paint d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private int k;

    public interface a {
        void a();

        void b(float f, float f2);

        void c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.k = b.d(getContext(), com.yalantis.ucrop.a.ucrop_color_widget_rotate_mid_line);
        this.f = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.b.ucrop_width_horizontal_wheel_progress_line);
        this.g = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.b.ucrop_height_horizontal_wheel_progress_line);
        this.h = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.b.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth((float) this.f);
        this.d.setColor(getResources().getColor(com.yalantis.ucrop.a.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.d);
        this.e = paint2;
        paint2.setColor(this.k);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        this.e.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.b.ucrop_width_middle_wheel_progress_line));
    }

    private void b(MotionEvent motionEvent, float f2) {
        this.j -= f2;
        postInvalidate();
        this.c = motionEvent.getX();
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(-f2, this.j);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.a);
        int width = this.a.width();
        int i2 = this.f;
        int i3 = this.h;
        int i4 = width / (i2 + i3);
        float f2 = this.j % ((float) (i3 + i2));
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i4 / 4;
            if (i5 < i6) {
                this.d.setAlpha((int) ((((float) i5) / ((float) i6)) * 255.0f));
            } else if (i5 > (i4 * 3) / 4) {
                this.d.setAlpha((int) ((((float) (i4 - i5)) / ((float) i6)) * 255.0f));
            } else {
                this.d.setAlpha(255);
            }
            float f3 = -f2;
            Rect rect = this.a;
            float f4 = ((float) rect.left) + f3 + ((float) ((this.f + this.h) * i5));
            float centerY = ((float) rect.centerY()) - (((float) this.g) / 4.0f);
            Rect rect2 = this.a;
            canvas.drawLine(f4, centerY, f3 + ((float) rect2.left) + ((float) ((this.f + this.h) * i5)), ((float) rect2.centerY()) + (((float) this.g) / 4.0f), this.d);
        }
        canvas.drawLine((float) this.a.centerX(), ((float) this.a.centerY()) - (((float) this.g) / 2.0f), (float) this.a.centerX(), (((float) this.g) / 2.0f) + ((float) this.a.centerY()), this.e);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.b;
            if (aVar != null) {
                this.i = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.c;
            if (x != 0.0f) {
                if (!this.i) {
                    this.i = true;
                    a aVar2 = this.b;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i2) {
        this.k = i2;
        this.e.setColor(i2);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.b = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new Rect();
        a();
    }
}
