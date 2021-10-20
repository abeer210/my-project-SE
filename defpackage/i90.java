package defpackage;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: i90  reason: default package */
/* compiled from: DrawableProperties */
public class i90 {
    private int a = -1;
    private boolean b = false;
    private ColorFilter c = null;
    private int d = -1;
    private int e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable != null) {
            int i = this.a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.b) {
                drawable.setColorFilter(this.c);
            }
            int i2 = this.d;
            boolean z = true;
            if (i2 != -1) {
                drawable.setDither(i2 != 0);
            }
            int i3 = this.e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(ColorFilter colorFilter) {
        this.c = colorFilter;
        this.b = true;
    }

    public void d(boolean z) {
        this.d = z ? 1 : 0;
    }

    public void e(boolean z) {
        this.e = z ? 1 : 0;
    }
}
