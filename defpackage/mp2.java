package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: mp2  reason: default package */
/* compiled from: TopTabsStyleHelper */
public class mp2 {
    private kp2 a;

    public mp2(kp2 kp2) {
        this.a = kp2;
    }

    private void a(int i, fj2<TextView> fj2) {
        TextView textView = (TextView) zj2.b(d(i), TextView.class);
        if (textView != null) {
            fj2.a(textView);
        }
    }

    private ViewGroup d(int i) {
        return (ViewGroup) ((ViewGroup) this.a.getChildAt(0)).getChildAt(i);
    }

    public void b(uf2 uf2, uf2 uf22) {
        ColorStateList tabTextColors = this.a.getTabTextColors();
        int i = -1;
        int colorForState = tabTextColors != null ? tabTextColors.getColorForState(this.a.getSelectedTabColors(), -1) : -1;
        if (tabTextColors != null) {
            i = tabTextColors.getColorForState(this.a.getDefaultTabColors(), -1);
        }
        if (uf2.f()) {
            colorForState = ((Integer) uf2.d()).intValue();
        }
        if (uf22.f()) {
            i = ((Integer) uf22.d()).intValue();
        }
        this.a.H(i, colorForState);
    }

    public void c(fg2 fg2) {
        if (fg2.f()) {
            for (int i = 0; i < this.a.getTabCount(); i++) {
                a(i, new jp2(fg2));
            }
        }
    }

    public void g(int i, Typeface typeface) {
        a(i, new ip2(typeface));
    }
}
