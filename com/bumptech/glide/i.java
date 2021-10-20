package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.l;
import defpackage.wg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* compiled from: Registry */
public class i {
    private final bk a;
    private final pn b;
    private final tn c;
    private final un d;
    private final xg e;
    private final tm f;
    private final qn g;
    private final sn h = new sn();
    private final rn i = new rn();
    private final androidx.core.util.e<List<Throwable>> j;

    /* compiled from: Registry */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry */
    public static final class b extends a {
        public b() {
            super(C0201.m82(28566));
        }
    }

    /* compiled from: Registry */
    public static class c extends a {
        public c(Object obj) {
            super(C0201.m82(28612) + obj.getClass());
        }

        public <M> c(M m, List<zj<M, ?>> list) {
            super(C0201.m82(28613) + list + C0201.m82(28614) + ((Object) m));
        }

        public c(Class<?> cls, Class<?> cls2) {
            super(C0201.m82(28610) + cls + C0201.m82(28611) + cls2);
        }
    }

    /* compiled from: Registry */
    public static class d extends a {
        public d(Class<?> cls) {
            super(C0201.m82(28697) + cls + C0201.m82(28698));
        }
    }

    /* compiled from: Registry */
    public static class e extends a {
        public e(Class<?> cls) {
            super(C0201.m82(28715) + cls);
        }
    }

    public i() {
        androidx.core.util.e<List<Throwable>> e2 = gp.e();
        this.j = e2;
        this.a = new bk(e2);
        this.b = new pn();
        this.c = new tn();
        this.d = new un();
        this.e = new xg();
        this.f = new tm();
        this.g = new qn();
        s(Arrays.asList(C0201.m82(5397), C0201.m82(5398), C0201.m82(5399)));
    }

    private <Data, TResource, Transcode> List<uh<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new uh(cls, cls4, cls5, this.c.b(cls, cls4), this.f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public <Data> i a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.b.a(cls, dVar);
        return this;
    }

    public <TResource> i b(Class<TResource> cls, l<TResource> lVar) {
        this.d.a(cls, lVar);
        return this;
    }

    public <Data, TResource> i c(Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        e(C0201.m82(5400), cls, cls2, kVar);
        return this;
    }

    public <Model, Data> i d(Class<Model> cls, Class<Data> cls2, ak<Model, Data> akVar) {
        this.a.a(cls, cls2, akVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, k<Data, TResource> kVar) {
        this.c.a(str, kVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b2 = this.g.b();
        if (!b2.isEmpty()) {
            return b2;
        }
        throw new b();
    }

    public <Data, TResource, Transcode> fi<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        fi<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        if (this.i.c(a2)) {
            return null;
        }
        if (a2 == null) {
            List<uh<Data, TResource, Transcode>> f2 = f(cls, cls2, cls3);
            if (f2.isEmpty()) {
                a2 = null;
            } else {
                a2 = new fi<>(cls, cls2, cls3, f2, this.j);
            }
            this.i.d(cls, cls2, cls3, a2);
        }
        return a2;
    }

    public <Model> List<zj<Model, ?>> i(Model model) {
        return this.a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a2 = this.h.a(cls, cls2, cls3);
        if (a2 == null) {
            a2 = new ArrayList<>();
            for (Class<?> cls4 : this.a.c(cls)) {
                for (Class<?> cls5 : this.c.d(cls4, cls2)) {
                    if (!this.f.b(cls5, cls3).isEmpty() && !a2.contains(cls5)) {
                        a2.add(cls5);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(a2));
        }
        return a2;
    }

    public <X> l<X> k(hi<X> hiVar) throws d {
        l<X> b2 = this.d.b(hiVar.b());
        if (b2 != null) {
            return b2;
        }
        throw new d(hiVar.b());
    }

    public <X> wg<X> l(X x) {
        return this.e.a(x);
    }

    public <X> com.bumptech.glide.load.d<X> m(X x) throws e {
        com.bumptech.glide.load.d<X> b2 = this.b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean n(hi<?> hiVar) {
        return this.d.b(hiVar.b()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public i p(wg.a<?> aVar) {
        this.e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, sm<TResource, Transcode> smVar) {
        this.f.c(cls, cls2, smVar);
        return this;
    }

    public <Model, Data> i r(Class<Model> cls, Class<Data> cls2, ak<? extends Model, ? extends Data> akVar) {
        this.a.f(cls, cls2, akVar);
        return this;
    }

    public final i s(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, C0201.m82(5401));
        arrayList.add(C0201.m82(5402));
        this.c.e(arrayList);
        return this;
    }
}
