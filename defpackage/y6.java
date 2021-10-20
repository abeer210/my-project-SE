package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: y6  reason: default package */
/* compiled from: ViewUtilsApi22 */
public class y6 extends x6 {
    private static boolean j;

    static {
        C0201.m83(y6.class, C0188.f25);
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void f(View view, int i, int i2, int i3, int i4) {
        if (j) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
