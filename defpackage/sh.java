package defpackage;

import com.bumptech.glide.e;
import com.bumptech.glide.i;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import defpackage.th;
import defpackage.zj;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: sh  reason: default package */
/* compiled from: DecodeHelper */
public final class sh<Transcode> {
    private final List<zj.a<?>> a = new ArrayList();
    private final List<g> b = new ArrayList();
    private e c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private th.e h;
    private i i;
    private Map<Class<?>, m<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private g n;
    private com.bumptech.glide.g o;
    private vh p;
    private boolean q;
    private boolean r;

    public void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    public ni b() {
        return this.c.b();
    }

    public List<g> c() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List<zj.a<?>> g2 = g();
            int size = g2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zj.a<?> aVar = g2.get(i2);
                if (!this.b.contains(aVar.a)) {
                    this.b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.b.size(); i3++) {
                    if (!this.b.contains(aVar.b.get(i3))) {
                        this.b.add(aVar.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    public aj d() {
        return this.h.a();
    }

    public vh e() {
        return this.p;
    }

    public int f() {
        return this.f;
    }

    public List<zj.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List i2 = this.c.h().i(this.d);
            int size = i2.size();
            for (int i3 = 0; i3 < size; i3++) {
                zj.a<?> b2 = ((zj) i2.get(i3)).b(this.d, this.e, this.f, this.i);
                if (b2 != null) {
                    this.a.add(b2);
                }
            }
        }
        return this.a;
    }

    public <Data> fi<Data, ?, Transcode> h(Class<Data> cls) {
        return this.c.h().h(cls, this.g, this.k);
    }

    public Class<?> i() {
        return this.d.getClass();
    }

    public List<zj<File, ?>> j(File file) throws i.c {
        return this.c.h().i(file);
    }

    public com.bumptech.glide.load.i k() {
        return this.i;
    }

    public com.bumptech.glide.g l() {
        return this.o;
    }

    public List<Class<?>> m() {
        return this.c.h().j(this.d.getClass(), this.g, this.k);
    }

    public <Z> l<Z> n(hi<Z> hiVar) {
        return this.c.h().k(hiVar);
    }

    public g o() {
        return this.n;
    }

    public <X> d<X> p(X x) throws i.e {
        return this.c.h().m(x);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.lang.Class<Transcode>, java.lang.Class<?> */
    public Class<?> q() {
        return (Class<Transcode>) this.k;
    }

    public <Z> m<Z> r(Class<Z> cls) {
        m<Z> mVar = (m<Z>) this.j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, m<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (m<Z>) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return sk.c();
        }
        throw new IllegalArgumentException(C0201.m82(5333) + cls + C0201.m82(5334));
    }

    public int s() {
        return this.e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Class<R> */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(e eVar, Object obj, g gVar, int i2, int i3, vh vhVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, com.bumptech.glide.load.i iVar, Map<Class<?>, m<?>> map, boolean z, boolean z2, th.e eVar2) {
        this.c = eVar;
        this.d = obj;
        this.n = gVar;
        this.e = i2;
        this.f = i3;
        this.p = vhVar;
        this.g = cls;
        this.h = eVar2;
        this.k = cls2;
        this.o = gVar2;
        this.i = iVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    public boolean v(hi<?> hiVar) {
        return this.c.h().n(hiVar);
    }

    public boolean w() {
        return this.r;
    }

    public boolean x(g gVar) {
        List<zj.a<?>> g2 = g();
        int size = g2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (g2.get(i2).a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
