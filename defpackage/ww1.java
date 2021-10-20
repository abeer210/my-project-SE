package defpackage;

import android.content.Context;
import android.graphics.Color;

/* renamed from: ww1  reason: default package */
/* compiled from: ElevationOverlayProvider */
public class ww1 {
    private final boolean a;
    private final int b;
    private final int c;
    private final float d;

    public ww1(Context context) {
        this.a = cx1.b(context, nv1.elevationOverlayEnabled, false);
        this.b = uw1.a(context, nv1.elevationOverlayColor, 0);
        this.c = uw1.a(context, nv1.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i) {
        return n1.o(i, 255) == this.c;
    }

    public float a(float f) {
        float f2 = this.d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float a2 = a(f);
        return n1.o(uw1.f(n1.o(i, 255), this.b, a2), Color.alpha(i));
    }

    public int c(int i, float f) {
        return (!this.a || !e(i)) ? i : b(i, f);
    }

    public boolean d() {
        return this.a;
    }
}
