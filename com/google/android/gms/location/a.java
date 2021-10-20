package com.google.android.gms.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.t;

public class a extends e<a.d.C0056d> {

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.location.a$a  reason: collision with other inner class name */
    public static class BinderC0061a extends o11 {
        private final at1<Void> a;

        public BinderC0061a(at1<Void> at1) {
            this.a = at1;
        }

        @Override // defpackage.n11
        public final void d0(h11 h11) {
            t.a(h11.k(), this.a);
        }
    }

    public a(Context context) {
        super(context, i.c, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    /* access modifiers changed from: private */
    public final n11 x(at1<Boolean> at1) {
        return new i0(this, at1);
    }

    public zs1<Location> t() {
        return g(new f0(this));
    }

    public zs1<Void> u(g gVar) {
        return t.c(i(l.b(gVar, g.class.getSimpleName())));
    }

    public zs1<Void> v(LocationRequest locationRequest, g gVar, Looper looper) {
        i21 o = i21.o(locationRequest);
        k a = l.a(gVar, r21.a(looper), g.class.getSimpleName());
        return h(new g0(this, a, o, a), new h0(this, a.b()));
    }
}
