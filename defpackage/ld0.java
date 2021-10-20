package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ld0  reason: default package */
/* compiled from: StagingArea */
public class ld0 {
    private static final Class<?> b = ld0.class;
    private Map<m40, af0> a = new HashMap();

    private ld0() {
    }

    public static ld0 d() {
        return new ld0();
    }

    private synchronized void e() {
        f60.q(b, C0201.m82(7687), Integer.valueOf(this.a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a.values());
            this.a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            af0 af0 = (af0) arrayList.get(i);
            if (af0 != null) {
                af0.close();
            }
        }
    }

    public synchronized boolean b(m40 m40) {
        z50.g(m40);
        if (!this.a.containsKey(m40)) {
            return false;
        }
        af0 af0 = this.a.get(m40);
        synchronized (af0) {
            if (af0.F(af0)) {
                return true;
            }
            this.a.remove(m40);
            f60.y(b, C0201.m82(7688), Integer.valueOf(System.identityHashCode(af0)), m40.b(), Integer.valueOf(System.identityHashCode(m40)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r0 = r8;
     */
    public synchronized af0 c(m40 m40) {
        z50.g(m40);
        af0 af0 = this.a.get(m40);
        if (af0 != null) {
            synchronized (af0) {
                if (!af0.F(af0)) {
                    this.a.remove(m40);
                    f60.y(b, C0201.m82(7689), Integer.valueOf(System.identityHashCode(af0)), m40.b(), Integer.valueOf(System.identityHashCode(m40)));
                    return null;
                }
                af0 c = af0.c(af0);
            }
        }
        return af0;
    }

    public synchronized void f(m40 m40, af0 af0) {
        z50.g(m40);
        z50.b(af0.F(af0));
        af0.h(this.a.put(m40, af0.c(af0)));
        e();
    }

    public boolean g(m40 m40) {
        af0 remove;
        z50.g(m40);
        synchronized (this) {
            remove = this.a.remove(m40);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.E();
        } finally {
            remove.close();
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized boolean h(m40 m40, af0 af0) {
        z50.g(m40);
        z50.g(af0);
        z50.b(af0.F(af0));
        af0 af02 = this.a.get(m40);
        if (af02 == null) {
            return false;
        }
        v60<q60> m = af02.m();
        v60<q60> m2 = af0.m();
        if (!(m == null || m2 == null)) {
            try {
                if (m.w() == m2.w()) {
                    this.a.remove(m40);
                    v60.s(m2);
                    v60.s(m);
                    af0.h(af02);
                    e();
                    return true;
                }
            } catch (Throwable th) {
                v60.s(m2);
                v60.s(m);
                af0.h(af02);
                throw th;
            }
        }
        v60.s(m2);
        v60.s(m);
        af0.h(af02);
        return false;
    }
}
