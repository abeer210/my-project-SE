package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import vigqyno.C0201;

/* renamed from: x6  reason: default package */
/* compiled from: ViewUtilsApi21 */
public class x6 extends w6 {
    private static boolean g;
    private static boolean h;
    private static boolean i;

    static {
        C0201.m83(x6.class, 480);
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void j(View view, Matrix matrix) {
        if (i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
