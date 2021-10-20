package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: gm2  reason: default package */
/* compiled from: OnSwitchToTab */
public class gm2 extends cm2 {
    private final nl2 d;

    public gm2(ViewGroup viewGroup, List<nl2> list, bi2 bi2, bf2 bf2) {
        super(viewGroup, list, bi2, bf2);
        this.d = list.get(((Integer) bf2.e.f.e(0)).intValue());
    }

    private boolean f(nl2 nl2) {
        return nl2.B().getParent() == null;
    }

    @Override // defpackage.cm2
    public void a() {
        b(this.d);
    }

    @Override // defpackage.cm2
    public void e(nl2 nl2) {
        if (nl2 != this.d && f(nl2)) {
            b(nl2);
        }
    }
}
