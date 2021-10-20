package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* compiled from: PixelUtil */
public class q {
    public static float a(float f) {
        return f / c.f().density;
    }

    public static float b(double d) {
        return c((float) d);
    }

    public static float c(float f) {
        return TypedValue.applyDimension(1, f, c.f());
    }

    public static float d(double d) {
        return e((float) d);
    }

    public static float e(float f) {
        return f(f, Float.NaN);
    }

    public static float f(float f, float f2) {
        DisplayMetrics f3 = c.f();
        float f4 = f3.scaledDensity;
        float f5 = f3.density;
        float f6 = f4 / f5;
        if (f2 >= 1.0f && f2 < f6) {
            f4 = f5 * f2;
        }
        return f * f4;
    }

    public static float g(float f) {
        return f / c.e().scaledDensity;
    }
}
