package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: oo2  reason: default package */
/* compiled from: TransitionSet.kt */
public final class oo2 {
    private List<lo2> a = new ArrayList();
    private List<jo2> b = new ArrayList();

    public final void a(jo2 jo2) {
        ow2.c(jo2, C0201.m82(10964));
        this.b.add(jo2);
    }

    public final void b(lo2 lo2) {
        ow2.c(lo2, C0201.m82(10965));
        this.a.add(lo2);
    }

    public final void c(gw2<? super mo2, hv2> gw2) {
        ow2.c(gw2, C0201.m82(10966));
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            gw2.a(it.next());
        }
        Iterator<T> it2 = this.b.iterator();
        while (it2.hasNext()) {
            gw2.a(it2.next());
        }
    }

    public final List<mo2> d() {
        return mv2.h(this.b, this.a);
    }

    public final List<jo2> e() {
        return this.b;
    }

    public final List<lo2> f() {
        return this.a;
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        return this.b.size() + this.a.size();
    }
}
