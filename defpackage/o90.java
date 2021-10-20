package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: o90  reason: default package */
/* compiled from: ProgressBarDrawable */
public class o90 extends Drawable {
    private final Paint a = new Paint(1);
    private int b;
    private boolean c;

    public o90() {
        new Path();
        new RectF();
        this.b = 10;
        this.c = false;
    }

    public boolean a() {
        return this.c;
    }

    public int getOpacity() {
        return j90.b(this.a.getColor());
    }

    public boolean getPadding(Rect rect) {
        int i = this.b;
        rect.set(i, i, i, i);
        return this.b != 0;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
