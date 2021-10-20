package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import defpackage.aj;
import defpackage.gn;
import defpackage.ij;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder */
public final class d {
    private final Map<Class<?>, l<?, ?>> a = new r0();
    private wh b;
    private qi c;
    private ni d;
    private hj e;
    private kj f;
    private kj g;
    private aj.a h;
    private ij i;
    private ym j;
    private int k = 4;
    private c.a l = new a(this);
    private gn.b m;
    private kj n;
    private boolean o;
    private List<zn<Object>> p;
    private boolean q;
    private boolean r;

    /* compiled from: GlideBuilder */
    class a implements c.a {
        public a(d dVar) {
        }

        @Override // com.bumptech.glide.c.a
        public ao a() {
            return new ao();
        }
    }

    public c a(Context context) {
        if (this.f == null) {
            this.f = kj.g();
        }
        if (this.g == null) {
            this.g = kj.e();
        }
        if (this.n == null) {
            this.n = kj.c();
        }
        if (this.i == null) {
            this.i = new ij.a(context).a();
        }
        if (this.j == null) {
            this.j = new an();
        }
        if (this.c == null) {
            int b2 = this.i.b();
            if (b2 > 0) {
                this.c = new wi((long) b2);
            } else {
                this.c = new ri();
            }
        }
        if (this.d == null) {
            this.d = new vi(this.i.a());
        }
        if (this.e == null) {
            this.e = new gj((long) this.i.d());
        }
        if (this.h == null) {
            this.h = new fj(context);
        }
        if (this.b == null) {
            this.b = new wh(this.e, this.h, this.g, this.f, kj.h(), this.n, this.o);
        }
        List<zn<Object>> list = this.p;
        if (list == null) {
            this.p = Collections.emptyList();
        } else {
            this.p = Collections.unmodifiableList(list);
        }
        return new c(context, this.b, this.e, this.c, this.d, new gn(this.m), this.j, this.k, this.l, this.a, this.p, this.q, this.r);
    }

    public void b(gn.b bVar) {
        this.m = bVar;
    }
}
