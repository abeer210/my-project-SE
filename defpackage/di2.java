package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: di2  reason: default package */
/* compiled from: ComponentPresenterBase */
public class di2 {
    public void a(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i) {
            marginLayoutParams.bottomMargin = i;
            view.requestLayout();
        }
    }

    public void b(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null && marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            view.requestLayout();
        }
    }
}
