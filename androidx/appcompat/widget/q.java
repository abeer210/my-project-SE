package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;

/* compiled from: AppCompatPopupWindow */
public class q extends PopupWindow {
    private static final boolean b = (Build.VERSION.SDK_INT < 21);
    private boolean a;

    public q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        x0 u = x0.u(context, attributeSet, m.PopupWindow, i, i2);
        if (u.r(m.PopupWindow_overlapAnchor)) {
            b(u.a(m.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(u.g(m.PopupWindow_android_popupBackground));
        u.v();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            h.a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
