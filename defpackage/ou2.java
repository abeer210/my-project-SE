package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ou2  reason: default package */
/* compiled from: FastBitmapDrawable */
public class ou2 extends Drawable {
    private final Paint a = new Paint(2);
    private Bitmap b;
    private int c = 255;
    private int d;
    private int e;

    public ou2(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.b;
    }

    public void b(Bitmap bitmap) {
        this.b = bitmap;
        if (bitmap != null) {
            this.d = bitmap.getWidth();
            this.e = this.b.getHeight();
            return;
        }
        this.e = 0;
        this.d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.b, (Rect) null, getBounds(), this.a);
        }
    }

    public int getAlpha() {
        return this.c;
    }

    public int getIntrinsicHeight() {
        return this.e;
    }

    public int getIntrinsicWidth() {
        return this.d;
    }

    public int getMinimumHeight() {
        return this.e;
    }

    public int getMinimumWidth() {
        return this.d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.c = i;
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }
}
