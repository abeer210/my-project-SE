package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: bm2  reason: default package */
/* compiled from: AfterInitialTab */
public class bm2 extends cm2 {
    private final Runnable d = new rl2(this);

    public bm2(ViewGroup viewGroup, List<nl2> list, bi2 bi2, bf2 bf2) {
        super(viewGroup, list, bi2, bf2);
    }

    private List<nl2> h() {
        return yi2.d(this.b, new sl2(this));
    }

    @Override // defpackage.cm2
    public void a() {
        this.c.i(this.d);
        b(this.c);
    }

    @Override // defpackage.cm2
    public void c() {
        this.c.V(this.d);
    }

    public /* synthetic */ void f() {
        yi2.i(h(), new zl2(this));
    }

    public /* synthetic */ boolean g(nl2 nl2) {
        return nl2 != this.c;
    }
}
