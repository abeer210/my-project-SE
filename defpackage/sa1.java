package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: sa1  reason: default package */
public final class sa1 implements pa1 {
    @Override // defpackage.pa1
    public final Map<?, ?> a(Object obj) {
        return (qa1) obj;
    }

    @Override // defpackage.pa1
    public final Map<?, ?> b(Object obj) {
        return (qa1) obj;
    }

    @Override // defpackage.pa1
    public final ma1<?, ?> c(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.pa1
    public final int d(int i, Object obj, Object obj2) {
        qa1 qa1 = (qa1) obj;
        if (qa1.isEmpty()) {
            return 0;
        }
        Iterator it = qa1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // defpackage.pa1
    public final Object e(Object obj, Object obj2) {
        qa1 qa1 = (qa1) obj;
        qa1 qa12 = (qa1) obj2;
        if (!qa12.isEmpty()) {
            if (!qa1.a()) {
                qa1 = qa1.f();
            }
            qa1.b(qa12);
        }
        return qa1;
    }

    @Override // defpackage.pa1
    public final boolean f(Object obj) {
        return !((qa1) obj).a();
    }

    @Override // defpackage.pa1
    public final Object h(Object obj) {
        ((qa1) obj).c();
        return obj;
    }

    @Override // defpackage.pa1
    public final Object i(Object obj) {
        return qa1.e().f();
    }
}
