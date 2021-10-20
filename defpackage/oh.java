package defpackage;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import defpackage.rh;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.util.List;

/* renamed from: oh  reason: default package */
/* compiled from: DataCacheGenerator */
public class oh implements rh, vg.a<Object> {
    private final List<g> a;
    private final sh<?> b;
    private final rh.a c;
    private int d;
    private g e;
    private List<zj<File, ?>> f;
    private int g;
    private volatile zj.a<?> h;
    private File i;

    public oh(sh<?> shVar, rh.a aVar) {
        this(shVar.c(), shVar, aVar);
    }

    private boolean b() {
        return this.g < this.f.size();
    }

    @Override // defpackage.rh
    public boolean a() {
        while (true) {
            boolean z = false;
            if (this.f == null || !b()) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= this.a.size()) {
                    return false;
                }
                g gVar = this.a.get(this.d);
                File b2 = this.b.d().b(new ph(gVar, this.b.o()));
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
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.h = list.get(i3).b(this.i, this.b.s(), this.b.f(), this.b.k());
                    if (this.h != null && this.b.t(this.h.c.a())) {
                        this.h.c.e(this.b.l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // defpackage.vg.a
    public void c(Exception exc) {
        this.c.b(this.e, exc, this.h.c, a.DATA_DISK_CACHE);
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
        this.c.e(this.e, obj, this.h.c, a.DATA_DISK_CACHE, this.e);
    }

    public oh(List<g> list, sh<?> shVar, rh.a aVar) {
        this.d = -1;
        this.a = list;
        this.b = shVar;
        this.c = aVar;
    }
}
