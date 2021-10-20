package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: mw0  reason: default package */
public final class mw0 implements lw0 {
    @Override // defpackage.lw0
    public final Object c(Object obj) {
        ((kw0) obj).g();
        return obj;
    }

    @Override // defpackage.lw0
    public final int d(int i, Object obj, Object obj2) {
        kw0 kw0 = (kw0) obj;
        if (kw0.isEmpty()) {
            return 0;
        }
        Iterator it = kw0.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // defpackage.lw0
    public final Object e(Object obj, Object obj2) {
        kw0 kw0 = (kw0) obj;
        kw0 kw02 = (kw0) obj2;
        if (!kw02.isEmpty()) {
            if (!kw0.a()) {
                kw0 = kw0.d();
            }
            kw0.b(kw02);
        }
        return kw0;
    }

    @Override // defpackage.lw0
    public final jw0<?, ?> g(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.lw0
    public final Object h(Object obj) {
        return kw0.c().d();
    }

    @Override // defpackage.lw0
    public final boolean i(Object obj) {
        return !((kw0) obj).a();
    }

    @Override // defpackage.lw0
    public final Map<?, ?> j(Object obj) {
        return (kw0) obj;
    }

    @Override // defpackage.lw0
    public final Map<?, ?> k(Object obj) {
        return (kw0) obj;
    }
}
