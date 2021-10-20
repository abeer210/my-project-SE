package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.reactnativenavigation.react.b0;

@SuppressLint({"ViewConstructor"})
/* renamed from: fp2  reason: default package */
/* compiled from: TitleBarReactButtonView */
public class fp2 extends b0 {
    private final me2 A;

    public fp2(Context context, si0 si0, me2 me2) {
        super(context, si0, (String) me2.b.d(), (String) me2.a.d());
        this.A = me2;
    }

    private int A(int i, fg2 fg2) {
        if (fg2.f()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(xj2.b(getContext(), ((Integer) fg2.d()).intValue())), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
    }

    @Override // defpackage.zi0
    public void onMeasure(int i, int i2) {
        super.onMeasure(A(i, this.A.e), A(i, this.A.f));
    }
}
