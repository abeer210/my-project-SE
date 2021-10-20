package defpackage;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import defpackage.rh;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ii  reason: default package */
/* compiled from: ResourceCacheGenerator */
public class ii implements rh, vg.a<Object> {
    private final rh.a a;
    private final sh<?> b;
    private int c;
    private int d = -1;
    private g e;
    private List<zj<File, ?>> f;
    private int g;
    private volatile zj.a<?> h;
    private File i;
    private ji j;

    public ii(sh<?> shVar, rh.a aVar) {
        this.b = shVar;
        this.a = aVar;
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override // defpackage.rh
    public boolean a() {
        List<g> c2 = this.b.c();
        boolean z = false;
        if (c2.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.b.m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f == null || !b()) {
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= m.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= c2.size()) {
                            return false;
                        }
                        this.d = 0;
                    }
                    g gVar = c2.get(this.c);
                    Class<?> cls = m.get(this.d);
                    this.j = new ji(this.b.b(), gVar, this.b.o(), this.b.s(), this.b.f(), this.b.r(cls), cls, this.b.k());
                    File b2 = this.b.d().b(this.j);
                    this.i = b2;
                    if (b2 != null) {
                        this.e = gVar;
                        this.f = this.b.j(b2);
                        this.g = 0;
                    }
                } else {
                    this.h = null;
                    while (!z && b()) {
                        List<zj<File, ?>> list = this.f;
                        int i4 = this.g;
                        this.g = i4 + 1;
                        this.h = list.get(i4).b(this.i, this.b.s(), this.b.f(), this.b.k());
                        if (this.h != null && this.b.t(this.h.c.a())) {
                            this.h.c.e(this.b.l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.b.q())) {
            return false;
        } else {
            throw new IllegalStateException(C0201.m82(22179) + this.b.i() + C0201.m82(22180) + this.b.q());
        }
    }

    @Override // defpackage.vg.a
    public void c(Exception exc) {
        this.a.b(this.j, exc, this.h.c, a.RESOURCE_DISK_CACHE);
    }

    @Override // defpackage.rh
    public void cancel() {
        zj.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.vg.a
    public void f(Object obj) {
        this.a.e(this.e, obj, this.h.c, a.RESOURCE_DISK_CACHE, this.j);
    }
}
