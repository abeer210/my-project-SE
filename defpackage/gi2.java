package defpackage;

import com.facebook.react.modules.i18nmanager.a;

/* renamed from: gi2  reason: default package */
/* compiled from: LayoutDirectionApplier */
public class gi2 {
    public void a(nl2 nl2, bf2 bf2, si0 si0) {
        if (bf2.m.e.e() && si0.v() != null) {
            nl2.u().getWindow().getDecorView().setLayoutDirection(bf2.m.e.d());
            a.d().a(si0.v(), bf2.m.e.f());
            a.d().c(si0.v(), bf2.m.e.f());
        }
    }
}
