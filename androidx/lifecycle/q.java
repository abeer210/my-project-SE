package androidx.lifecycle;

import vigqyno.C0201;

/* compiled from: ViewModelProvider */
public class q {
    private final a a;
    private final r b;

    /* compiled from: ViewModelProvider */
    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider */
    public static abstract class b implements a {
        @Override // androidx.lifecycle.q.a
        public <T extends p> T a(Class<T> cls) {
            throw new UnsupportedOperationException(C0201.m82(28618));
        }

        public abstract <T extends p> T b(String str, Class<T> cls);
    }

    public q(r rVar, a aVar) {
        this.a = aVar;
        this.b = rVar;
    }

    public <T extends p> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(C0201.m82(13534) + canonicalName, cls);
        }
        throw new IllegalArgumentException(C0201.m82(13535));
    }

    public <T extends p> T b(String str, Class<T> cls) {
        T t = (T) this.b.b(str);
        if (cls.isInstance(t)) {
            return t;
        }
        a aVar = this.a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.b.c(str, t2);
        return t2;
    }
}
