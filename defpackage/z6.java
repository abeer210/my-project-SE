package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import vigqyno.C0201;

/* renamed from: z6  reason: default package */
/* compiled from: ViewUtilsApi23 */
public class z6 extends y6 {
    private static boolean k;

    static {
        C0201.m83(z6.class, 177);
    }

    @Override // defpackage.b7
    @SuppressLint({"NewApi"})
    public void h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i);
        } else if (k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
