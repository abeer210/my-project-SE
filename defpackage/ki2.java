package defpackage;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.BehaviourDelegate;
import vigqyno.C0201;

/* renamed from: ki2  reason: default package */
/* compiled from: RootPresenter */
public class ki2 {
    private be2 a;
    private CoordinatorLayout b;
    private gi2 c;

    public ki2(Context context) {
        this(new be2(context, new ko2()), new gi2());
    }

    private void a(nl2 nl2, aj2 aj2, bf2 bf2) {
        if (bf2.h.d.d()) {
            this.a.l(nl2.B(), bf2.h.d, new ph2(aj2, nl2));
        } else {
            aj2.a(nl2.x());
        }
    }

    public /* synthetic */ void c(nl2 nl2, aj2 aj2, bf2 bf2) {
        if (nl2.D()) {
            aj2.onError(C0201.m82(26879));
            return;
        }
        nl2.B().setAlpha(1.0f);
        a(nl2, aj2, bf2);
    }

    public void d(nl2 nl2, bf2 bf2, aj2 aj2, si0 si0) {
        this.c.a(nl2, bf2, si0);
        this.b.addView(nl2.B(), ej2.b(new BehaviourDelegate(nl2)));
        bf2 Z = nl2.Z(bf2);
        nl2.f0(Z.h.d.c);
        if (Z.h.d.c.i()) {
            nl2.B().setAlpha(0.0f);
            nl2.i(new oh2(this, nl2, aj2, Z));
            return;
        }
        a(nl2, aj2, Z);
    }

    public void e(CoordinatorLayout coordinatorLayout) {
        this.b = coordinatorLayout;
    }

    public ki2(be2 be2, gi2 gi2) {
        this.a = be2;
        this.c = gi2;
    }
}
