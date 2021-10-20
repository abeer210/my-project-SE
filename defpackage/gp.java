package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: gp  reason: default package */
/* compiled from: FactoryPools */
public final class gp {
    private static final g<Object> a = new a();

    /* renamed from: gp$a */
    /* compiled from: FactoryPools */
    class a implements g<Object> {
        @Override // defpackage.gp.g
        public void a(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gp$b */
    /* compiled from: FactoryPools */
    public class b implements d<List<T>> {
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gp$c */
    /* compiled from: FactoryPools */
    public class c implements g<List<T>> {
        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: gp$d */
    /* compiled from: FactoryPools */
    public interface d<T> {
        T create();
    }

    /* access modifiers changed from: private */
    /* renamed from: gp$e */
    /* compiled from: FactoryPools */
    public static final class e<T> implements androidx.core.util.e<T> {
        private final d<T> a;
        private final g<T> b;
        private final androidx.core.util.e<T> c;

        public e(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.c = eVar;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // androidx.core.util.e
        public boolean a(T t) {
            if (t instanceof f) {
                t.f().b(true);
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // androidx.core.util.e
        public T b() {
            T b2 = this.c.b();
            if (b2 == null) {
                b2 = this.a.create();
                String r2 = C0201.m82(4320);
                if (Log.isLoggable(r2, 2)) {
                    Log.v(r2, C0201.m82(4321) + b2.getClass());
                }
            }
            if (b2 instanceof f) {
                b2.f().b(false);
            }
            return b2;
        }
    }

    /* renamed from: gp$f */
    /* compiled from: FactoryPools */
    public interface f {
        ip f();
    }

    /* renamed from: gp$g */
    /* compiled from: FactoryPools */
    public interface g<T> {
        void a(T t);
    }

    private static <T extends f> androidx.core.util.e<T> a(androidx.core.util.e<T> eVar, d<T> dVar) {
        return b(eVar, dVar, c());
    }

    private static <T> androidx.core.util.e<T> b(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) a;
    }

    public static <T extends f> androidx.core.util.e<T> d(int i, d<T> dVar) {
        return a(new androidx.core.util.f(i), dVar);
    }

    public static <T> androidx.core.util.e<List<T>> e() {
        return f(20);
    }

    public static <T> androidx.core.util.e<List<T>> f(int i) {
        return b(new androidx.core.util.f(i), new b(), new c());
    }
}
