package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.reactnativenavigation.react.b0;

@SuppressLint({"ViewConstructor"})
/* renamed from: gp2  reason: default package */
/* compiled from: TitleBarReactView */
public class gp2 extends b0 {
    public gp2(Context context, si0 si0, String str, String str2) {
        super(context, si0, str, str2);
    }

    @Override // defpackage.zi0
    public void onMeasure(int i, int i2) {
        if (getChildCount() > 0 && getChildAt(0).getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(getChildAt(0).getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
