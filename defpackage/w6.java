package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import vigqyno.C0201;

/* renamed from: w6  reason: default package */
/* compiled from: ViewUtilsApi19 */
public class w6 extends b7 {
    private static boolean f;

    static {
        C0201.m83(w6.class, 651);
    }

    @Override // defpackage.b7
    public void a(View view) {
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.b7
    public void d(View view) {
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void g(View view, float f2) {
        if (f) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        view.setAlpha(f2);
    }
}
