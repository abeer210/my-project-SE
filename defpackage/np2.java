package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.reactnativenavigation.views.e;
import defpackage.ll2;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* renamed from: np2  reason: default package */
/* compiled from: TopTabsViewPager */
public class np2 extends ViewPager implements e, ll2.b {
    private List<nl2> m0;

    public np2(Context context, List<nl2> list, go2 go2) {
        super(context);
        this.m0 = list;
        W(go2);
    }

    private boolean V() {
        for (nl2 nl2 : this.m0) {
            if (!nl2.E()) {
                return false;
            }
        }
        return true;
    }

    private void W(go2 go2) {
        setOffscreenPageLimit(99);
        for (nl2 nl2 : this.m0) {
            addView(nl2.B(), new ViewGroup.LayoutParams(-1, -1));
        }
        setAdapter(go2);
        e(go2);
    }

    public void U(bf2 bf2) {
    }

    public boolean X(View view) {
        for (nl2 nl2 : this.m0) {
            if (nl2.B() == view) {
                return true;
            }
        }
        return false;
    }

    @Override // com.reactnativenavigation.views.k
    public boolean b() {
        return this.m0.size() != 0 && V();
    }

    @Override // defpackage.ll2.b
    public void c(String str) {
        ((gl2) this.m0.get(getCurrentItem()).B()).d(str);
    }
}
