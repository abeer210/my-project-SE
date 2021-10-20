package com.merryjs.PhotoViewer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: CircleProgressBarDrawable */
public class a extends o90 {
    private final Paint d = new Paint(1);
    private int e = 0;
    private int f = 10000;

    private void b(Canvas canvas, int i, int i2) {
        Rect bounds = getBounds();
        float min = (((float) Math.min(bounds.width(), bounds.height())) * 0.2f) / 2.0f;
        RectF rectF = new RectF(((float) bounds.centerX()) - min, ((float) bounds.centerY()) - min, ((float) bounds.centerX()) + min, ((float) bounds.centerY()) + min);
        this.d.setColor(i2);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(6.0f);
        if (i != 0) {
            canvas.drawArc(rectF, 0.0f, (float) ((i * 360) / this.f), false, this.d);
        }
    }

    public void draw(Canvas canvas) {
        if (!a() || this.e != 0) {
            b(canvas, this.f, -1);
            b(canvas, this.e, -572662307);
        }
    }

    public boolean onLevelChange(int i) {
        this.e = i;
        invalidateSelf();
        return true;
    }
}
