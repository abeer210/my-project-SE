package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.a;
import java.util.List;
import vigqyno.C0201;

/* renamed from: go2  reason: default package */
/* compiled from: TopTabsAdapter */
public class go2 extends a implements ViewPager.j {
    private List<nl2> c;
    private int d = 0;

    public go2(List<nl2> list) {
        this.c = list;
    }

    private bf2 x(int i) {
        return this.c.get(i).f;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void a(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void b(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void c(int i) {
        w30.t(i);
        try {
            this.c.get(this.d).P();
            this.c.get(i).O();
            this.d = i;
        } finally {
            w30.u();
        }
    }

    @Override // androidx.viewpager.widget.a
    public int h() {
        return this.c.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence j(int i) {
        return (CharSequence) x(i).c.a.e(C0201.m82(33782));
    }

    @Override // androidx.viewpager.widget.a
    public Object l(ViewGroup viewGroup, int i) {
        return this.c.get(i).B();
    }

    @Override // androidx.viewpager.widget.a
    public boolean m(View view, Object obj) {
        return view == obj;
    }
}
