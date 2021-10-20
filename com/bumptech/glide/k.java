package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.xm;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import vigqyno.C0201;

/* compiled from: RequestManager */
public class k implements ComponentCallbacks2, dn {
    private static final ao m = ((ao) ao.n0(Bitmap.class).P());
    private static final ao n = ((ao) ao.n0(gm.class).P());
    private static final ao o = ((ao) ((ao) ao.o0(vh.b).Y(g.LOW)).f0(true));
    public final c a;
    public final Context b;
    public final cn c;
    private final in d;
    private final hn e;
    private final kn f;
    private final Runnable g;
    private final Handler h;
    private final xm i;
    private final CopyOnWriteArrayList<zn<Object>> j;
    private ao k;
    private boolean l;

    /* compiled from: RequestManager */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            k kVar = k.this;
            kVar.c.a(kVar);
        }
    }

    /* compiled from: RequestManager */
    private static class b extends ho<View, Object> {
        public b(View view) {
            super(view);
        }

        @Override // defpackage.no
        public void b(Object obj, qo<? super Object> qoVar) {
        }

        @Override // defpackage.no
        public void d(Drawable drawable) {
        }

        @Override // defpackage.ho
        public void l(Drawable drawable) {
        }
    }

    /* compiled from: RequestManager */
    private class c implements xm.a {
        private final in a;

        public c(in inVar) {
            this.a = inVar;
        }

        @Override // defpackage.xm.a
        public void a(boolean z) {
            if (z) {
                synchronized (k.this) {
                    this.a.e();
                }
            }
        }
    }

    public k(c cVar, cn cnVar, hn hnVar, Context context) {
        this(cVar, cnVar, hnVar, new in(), cVar.g(), context);
    }

    private void y(no<?> noVar) {
        boolean x = x(noVar);
        xn f2 = noVar.f();
        if (!x && !this.a.p(noVar) && f2 != null) {
            noVar.c(null);
            f2.clear();
        }
    }

    public <ResourceType> j<ResourceType> i(Class<ResourceType> cls) {
        return new j<>(this.a, this, cls, this.b);
    }

    public j<Bitmap> j() {
        return i(Bitmap.class).a(m);
    }

    public j<Drawable> k() {
        return i(Drawable.class);
    }

    public void l(View view) {
        m(new b(view));
    }

    public void m(no<?> noVar) {
        if (noVar != null) {
            y(noVar);
        }
    }

    public List<zn<Object>> n() {
        return this.j;
    }

    public synchronized ao o() {
        return this.k;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.dn
    public synchronized void onDestroy() {
        this.f.onDestroy();
        for (no<?> noVar : this.f.j()) {
            m(noVar);
        }
        this.f.i();
        this.d.b();
        this.c.b(this);
        this.c.b(this.i);
        this.h.removeCallbacks(this.g);
        this.a.s(this);
    }

    public void onLowMemory() {
    }

    @Override // defpackage.dn
    public synchronized void onStart() {
        u();
        this.f.onStart();
    }

    @Override // defpackage.dn
    public synchronized void onStop() {
        t();
        this.f.onStop();
    }

    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.l) {
            s();
        }
    }

    public <T> l<?, T> p(Class<T> cls) {
        return this.a.i().e(cls);
    }

    public j<Drawable> q(Object obj) {
        return k().F0(obj);
    }

    public synchronized void r() {
        this.d.c();
    }

    public synchronized void s() {
        r();
        for (k kVar : this.e.a()) {
            kVar.r();
        }
    }

    public synchronized void t() {
        this.d.d();
    }

    public synchronized String toString() {
        return super.toString() + C0201.m82(5289) + this.d + C0201.m82(5290) + this.e + C0201.m82(5291);
    }

    public synchronized void u() {
        this.d.f();
    }

    public synchronized void v(ao aoVar) {
        this.k = (ao) ((ao) aoVar.clone()).b();
    }

    public synchronized void w(no<?> noVar, xn xnVar) {
        this.f.k(noVar);
        this.d.g(xnVar);
    }

    public synchronized boolean x(no<?> noVar) {
        xn f2 = noVar.f();
        if (f2 == null) {
            return true;
        }
        if (!this.d.a(f2)) {
            return false;
        }
        this.f.l(noVar);
        noVar.c(null);
        return true;
    }

    public k(c cVar, cn cnVar, hn hnVar, in inVar, ym ymVar, Context context) {
        this.f = new kn();
        this.g = new a();
        this.h = new Handler(Looper.getMainLooper());
        this.a = cVar;
        this.c = cnVar;
        this.e = hnVar;
        this.d = inVar;
        this.b = context;
        this.i = ymVar.a(context.getApplicationContext(), new c(inVar));
        if (fp.o()) {
            this.h.post(this.g);
        } else {
            cnVar.a(this);
        }
        cnVar.a(this.i);
        this.j = new CopyOnWriteArrayList<>(cVar.i().c());
        v(cVar.i().d());
        cVar.o(this);
    }
}
