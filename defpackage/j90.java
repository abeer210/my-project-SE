package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: j90  reason: default package */
/* compiled from: DrawableUtils */
public class j90 {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static int b(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void d(Drawable drawable, Drawable.Callback callback, y90 y90) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof x90) {
                ((x90) drawable).b(y90);
            }
        }
    }

    public static void e(Drawable drawable, i90 i90) {
        if (drawable != null && i90 != null) {
            i90.a(drawable);
        }
    }
}
