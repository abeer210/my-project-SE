package defpackage;

import androidx.core.util.e;
import com.bumptech.glide.i;
import com.bumptech.glide.load.i;
import defpackage.zj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: dk  reason: default package */
/* compiled from: MultiModelLoaderFactory */
public class dk {
    private static final c e = new c();
    private static final zj<Object, Object> f = new a();
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final e<List<Throwable>> d;

    /* renamed from: dk$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class a implements zj<Object, Object> {
        @Override // defpackage.zj
        public boolean a(Object obj) {
            return false;
        }

        @Override // defpackage.zj
        public zj.a<Object> b(Object obj, int i, int i2, i iVar) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: dk$b */
    /* compiled from: MultiModelLoaderFactory */
    public static class b<Model, Data> {
        private final Class<Model> a;
        public final Class<Data> b;
        public final ak<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
            this.a = cls;
            this.b = cls2;
            this.c = akVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: dk$c */
    /* compiled from: MultiModelLoaderFactory */
    static class c {
        public <Model, Data> ck<Model, Data> a(List<zj<Model, Data>> list, e<List<Throwable>> eVar) {
            return new ck<>(list, eVar);
        }
    }

    public dk(e<List<Throwable>> eVar) {
        this(eVar, e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, akVar);
        List<b<?, ?>> list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* JADX DEBUG: Type inference failed for r1v3. Raw type applied. Possible types: zj<? extends Model, ? extends Data>, zj<Model, Data> */
    private <Model, Data> zj<Model, Data> c(b<?, ?> bVar) {
        zj c2 = bVar.c.c(this);
        ep.d(c2);
        return (zj<? extends Model, ? extends Data>) c2;
    }

    private static <Model, Data> zj<Model, Data> f() {
        return (zj<Model, Data>) f;
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: ak<? extends Model, ? extends Data>, ak<Model, Data> */
    private <Model, Data> ak<Model, Data> h(b<?, ?> bVar) {
        return (ak<? extends Model, ? extends Data>) bVar.c;
    }

    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
        a(cls, cls2, akVar, true);
    }

    public synchronized <Model, Data> zj<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.c.add(bVar);
                    arrayList.add(c(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (zj) arrayList.get(0);
            } else if (z) {
                return f();
            } else {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public synchronized <Model> List<zj<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar)) {
                    if (bVar.a(cls)) {
                        this.c.add(bVar);
                        arrayList.add(c(bVar));
                        this.c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<ak<? extends Model, ? extends Data>> i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> List<ak<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
        List<ak<? extends Model, ? extends Data>> i;
        i = i(cls, cls2);
        b(cls, cls2, akVar);
        return i;
    }

    public dk(e<List<Throwable>> eVar, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = eVar;
        this.b = cVar;
    }
}
