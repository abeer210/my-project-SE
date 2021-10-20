package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.reactnativenavigation.views.topbar.a;

/* renamed from: kp2  reason: default package */
/* compiled from: TopTabs */
public class kp2 extends TabLayout {
    private final mp2 S = new mp2(this);

    public kp2(Context context) {
        super(context);
    }

    public void O(uf2 uf2, uf2 uf22) {
        this.S.b(uf2, uf22);
    }

    public void P(fg2 fg2) {
        this.S.c(fg2);
    }

    public void Q() {
        setupWithViewPager(null);
        zj2.m(this);
    }

    public void R(ViewPager viewPager) {
        setupWithViewPager(viewPager);
    }

    public void S(int i, Typeface typeface) {
        this.S.g(i, typeface);
    }

    public void T(a aVar, boolean z) {
        if (!z || getTabCount() <= 0) {
            aVar.removeView(this);
            return;
        }
        if (getParent() == null) {
            aVar.addView(this, 1);
        }
        setVisibility(0);
    }

    public int[] getDefaultTabColors() {
        return HorizontalScrollView.EMPTY_STATE_SET;
    }

    public int[] getSelectedTabColors() {
        return HorizontalScrollView.SELECTED_STATE_SET;
    }
}
