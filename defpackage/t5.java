package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: t5  reason: default package */
/* compiled from: GhostViewUtils */
public class t5 {
    public static p5 a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return r5.b(view, viewGroup, matrix);
        }
        return s5.b(view, viewGroup, matrix);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            r5.f(view);
        } else {
            s5.f(view);
        }
    }
}
