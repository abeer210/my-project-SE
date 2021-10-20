package defpackage;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: lw1  reason: default package */
/* compiled from: CanvasCompat */
public class lw1 {
    public static int a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
