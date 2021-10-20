package defpackage;

import androidx.core.util.e;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bk  reason: default package */
/* compiled from: ModelLoaderRegistry */
public class bk {
    private final dk a;
    private final a b;

    /* access modifiers changed from: private */
    /* renamed from: bk$a */
    /* compiled from: ModelLoaderRegistry */
    public static class a {
        private final Map<Class<?>, C0026a<?>> a = new HashMap();

        /* access modifiers changed from: private */
        /* renamed from: bk$a$a  reason: collision with other inner class name */
        /* compiled from: ModelLoaderRegistry */
        public static class C0026a<Model> {
            public final List<zj<Model, ?>> a;

            public C0026a(List<zj<Model, ?>> list) {
                this.a = list;
            }
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<zj<Model, ?>> b(Class<Model> cls) {
            C0026a<?> aVar = this.a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.a;
        }

        public <Model> void c(Class<Model> cls, List<zj<Model, ?>> list) {
            if (this.a.put(cls, new C0026a<>(list)) != null) {
                throw new IllegalStateException(C0201.m82(1619) + cls);
            }
        }
    }

    public bk(e<List<Throwable>> eVar) {
        this(new dk(eVar));
    }

    private static <A> Class<A> b(A a2) {
        return (Class<A>) a2.getClass();
    }

    private synchronized <A> List<zj<A, ?>> e(Class<A> cls) {
        List<zj<A, ?>> b2;
        b2 = this.b.b(cls);
        if (b2 == null) {
            b2 = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, b2);
        }
        return b2;
    }

    private <Model, Data> void g(List<ak<? extends Model, ? extends Data>> list) {
        for (ak<? extends Model, ? extends Data> akVar : list) {
            akVar.a();
        }
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
        this.a.b(cls, cls2, akVar);
        this.b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.a.g(cls);
    }

    public <A> List<zj<A, ?>> d(A a2) {
        List<zj<A, ?>> e = e(b(a2));
        if (!e.isEmpty()) {
            int size = e.size();
            List<zj<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                zj<A, ?> zjVar = e.get(i);
                if (zjVar.a(a2)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(zjVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new i.c(a2, e);
        }
        throw new i.c(a2);
    }

    public synchronized <Model, Data> void f(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
        g(this.a.j(cls, cls2, akVar));
        this.b.a();
    }

    private bk(dk dkVar) {
        this.b = new a();
        this.a = dkVar;
    }
}
