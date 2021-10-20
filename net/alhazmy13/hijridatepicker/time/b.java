package net.alhazmy13.hijridatepicker.time;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: CircleView */
public class b extends View {
    private final Paint a = new Paint();
    private boolean b;
    private int c;
    private int d;
    private float e;
    private float f;
    private boolean g = false;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public b(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.g) {
            if (!this.h) {
                this.i = getWidth() / 2;
                int height = getHeight() / 2;
                this.j = height;
                int min = (int) (((float) Math.min(this.i, height)) * this.e);
                this.k = min;
                if (!this.b) {
                    double d2 = (double) this.j;
                    double d3 = (double) ((int) (((float) min) * this.f));
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.j = (int) (d2 - (d3 * 0.75d));
                }
                this.h = true;
            }
            this.a.setColor(this.c);
            canvas.drawCircle((float) this.i, (float) this.j, (float) this.k, this.a);
            this.a.setColor(this.d);
            canvas.drawCircle((float) this.i, (float) this.j, 8.0f, this.a);
        }
    }
}
