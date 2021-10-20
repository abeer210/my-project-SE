package defpackage;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import vigqyno.C0201;

/* renamed from: ok0  reason: default package */
/* compiled from: SimpleSpringInterpolator */
public class ok0 implements Interpolator {
    private final float a;

    public ok0(float f) {
        this.a = f;
    }

    public static float a(ReadableMap readableMap) {
        String r0 = C0201.m82(2292);
        if (readableMap.getType(r0).equals(ReadableType.Number)) {
            return (float) readableMap.getDouble(r0);
        }
        return 0.5f;
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.a;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (float) ((pow * Math.sin(((d * 3.141592653589793d) * 2.0d) / d2)) + 1.0d);
    }
}
