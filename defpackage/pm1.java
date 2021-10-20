package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: pm1  reason: default package */
public final class pm1 implements om1 {
    @Override // defpackage.om1
    public final Object a(Object obj) {
        return mm1.d().e();
    }

    @Override // defpackage.om1
    public final Object b(Object obj) {
        ((mm1) obj).c();
        return obj;
    }

    @Override // defpackage.om1
    public final Map<?, ?> c(Object obj) {
        return (mm1) obj;
    }

    @Override // defpackage.om1
    public final int d(int i, Object obj, Object obj2) {
        mm1 mm1 = (mm1) obj;
        if (mm1.isEmpty()) {
            return 0;
        }
        Iterator it = mm1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // defpackage.om1
    public final Object e(Object obj, Object obj2) {
        mm1 mm1 = (mm1) obj;
        mm1 mm12 = (mm1) obj2;
        if (!mm12.isEmpty()) {
            if (!mm1.a()) {
                mm1 = mm1.e();
            }
            mm1.b(mm12);
        }
        return mm1;
    }

    @Override // defpackage.om1
    public final lm1<?, ?> f(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.om1
    public final boolean g(Object obj) {
        return !((mm1) obj).a();
    }

    @Override // defpackage.om1
    public final Map<?, ?> h(Object obj) {
        return (mm1) obj;
    }
}
