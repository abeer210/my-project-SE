package defpackage;

import android.view.View;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.n;

/* renamed from: ij0  reason: default package */
/* compiled from: LayoutMetricsConversions */
public class ij0 {
    public static float a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return (float) size;
    }

    public static float b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return (float) size;
        }
        return 0.0f;
    }

    public static n c(float f, float f2) {
        if (f == f2) {
            return n.EXACTLY;
        }
        if (Float.isInfinite(f2)) {
            return n.UNDEFINED;
        }
        return n.AT_MOST;
    }

    public static float d(float f, float f2) {
        if (f == f2) {
            return q.c(f2);
        }
        if (Float.isInfinite(f2)) {
            return Float.POSITIVE_INFINITY;
        }
        return q.c(f2);
    }
}
