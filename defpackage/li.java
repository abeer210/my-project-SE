package defpackage;

import android.util.Log;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.g;
import defpackage.rh;
import defpackage.vg;
import defpackage.zj;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: li  reason: default package */
/* compiled from: SourceGenerator */
public class li implements rh, rh.a {
    private final sh<?> a;
    private final rh.a b;
    private int c;
    private oh d;
    private Object e;
    private volatile zj.a<?> f;
    private ph g;

    /* access modifiers changed from: package-private */
    /* renamed from: li$a */
    /* compiled from: SourceGenerator */
    public class a implements vg.a<Object> {
        public final /* synthetic */ zj.a a;

        public a(zj.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.vg.a
        public void c(Exception exc) {
            if (li.this.g(this.a)) {
                li.this.i(this.a, exc);
            }
        }

        @Override // defpackage.vg.a
        public void f(Object obj) {
            if (li.this.g(this.a)) {
                li.this.h(this.a, obj);
            }
        }
    }

    public li(sh<?> shVar, rh.a aVar) {
        this.a = shVar;
        this.b = aVar;
    }

    /* JADX INFO: finally extract failed */
    private void c(Object obj) {
        String r0 = C0201.m82(29205);
        long b2 = ap.b();
        try {
            d<X> p = this.a.p(obj);
            qh qhVar = new qh(p, obj, this.a.k());
            this.g = new ph(this.f.a, this.a.o());
            this.a.d().a(this.g, qhVar);
            if (Log.isLoggable(r0, 2)) {
                Log.v(r0, C0201.m82(29206) + this.g + C0201.m82(29207) + obj + C0201.m82(29208) + p + C0201.m82(29209) + ap.a(b2));
            }
            this.f.c.b();
            this.d = new oh(Collections.singletonList(this.f.a), this.a, this);
        } catch (Throwable th) {
            this.f.c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.c < this.a.g().size();
    }

    private void j(zj.a<?> aVar) {
        this.f.c.e(this.a.l(), new a(aVar));
    }

    @Override // defpackage.rh
    public boolean a() {
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            c(obj);
        }
        oh ohVar = this.d;
        if (ohVar != null && ohVar.a()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && f()) {
            List<zj.a<?>> g2 = this.a.g();
            int i = this.c;
            this.c = i + 1;
            this.f = g2.get(i);
            if (this.f != null && (this.a.e().c(this.f.c.d()) || this.a.t(this.f.c.a()))) {
                j(this.f);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rh.a
    public void b(g gVar, Exception exc, vg<?> vgVar, com.bumptech.glide.load.a aVar) {
        this.b.b(gVar, exc, vgVar, this.f.c.d());
    }

    @Override // defpackage.rh
    public void cancel() {
        zj.a<?> aVar = this.f;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.rh.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rh.a
    public void e(g gVar, Object obj, vg<?> vgVar, com.bumptech.glide.load.a aVar, g gVar2) {
        this.b.e(gVar, obj, vgVar, this.f.c.d(), gVar);
    }

    public boolean g(zj.a<?> aVar) {
        zj.a<?> aVar2 = this.f;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(zj.a<?> aVar, Object obj) {
        vh e2 = this.a.e();
        if (obj == null || !e2.c(aVar.c.d())) {
            rh.a aVar2 = this.b;
            g gVar = aVar.a;
            vg<Data> vgVar = aVar.c;
            aVar2.e(gVar, obj, vgVar, vgVar.d(), this.g);
            return;
        }
        this.e = obj;
        this.b.d();
    }

    public void i(zj.a<?> aVar, Exception exc) {
        rh.a aVar2 = this.b;
        ph phVar = this.g;
        vg<Data> vgVar = aVar.c;
        aVar2.b(phVar, exc, vgVar, vgVar.d());
    }
}
