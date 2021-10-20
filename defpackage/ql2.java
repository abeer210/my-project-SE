package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.view.d;
import defpackage.zj2;

/* renamed from: ql2  reason: default package */
/* compiled from: YellowBoxHelper */
public class ql2 {
    private static zj2.a<View> a() {
        return xk2.a;
    }

    public static /* synthetic */ boolean c(View view) {
        return (view.getBackground() instanceof d) && ((d) view.getBackground()).j() == -218449360;
    }

    public boolean b(View view, View view2) {
        if (!(view instanceof ViewGroup) || !(view2 instanceof ViewGroup) || ((ViewGroup) view).getChildCount() <= 1 || zj2.e((ViewGroup) view2, View.class, a()).isEmpty()) {
            return false;
        }
        return true;
    }
}
