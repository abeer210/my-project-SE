package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: em2  reason: default package */
/* compiled from: BottomTabsAttacher */
public class em2 {
    private final List<nl2> a;
    private final bi2 b;
    private bf2 c;
    public cm2 d;

    public em2(List<nl2> list, bi2 bi2, bf2 bf2) {
        this.a = list;
        this.b = bi2;
        this.c = bf2;
    }

    public void a() {
        this.d.a();
    }

    public void b() {
        this.d.c();
    }

    public void c(ViewGroup viewGroup, bf2 bf2) {
        List<nl2> list = this.a;
        bi2 bi2 = this.b;
        bf2.m(this.c);
        this.d = cm2.d(viewGroup, list, bi2, bf2);
    }

    public void d(nl2 nl2) {
        this.d.e(nl2);
    }
}
