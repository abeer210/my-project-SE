package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a2<R extends m> extends q<R> implements n<R> {
    private p<? super R, ? extends m> a;
    private a2<? extends m> b;
    private volatile o<? super R> c;
    private final Object d;
    private Status e;
    private final WeakReference<f> f;
    private final c2 g;

    /* access modifiers changed from: private */
    public static void c(m mVar) {
        if (mVar instanceof j) {
            try {
                ((j) mVar).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(mVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append(C0201.m82(24329));
                sb.append(valueOf);
                Log.w(C0201.m82(24330), sb.toString(), e2);
            }
        }
    }

    private final boolean e() {
        return (this.c == null || this.f.get() == null) ? false : true;
    }

    private final void h(Status status) {
        synchronized (this.d) {
            this.e = status;
            j(status);
        }
    }

    private final void j(Status status) {
        synchronized (this.d) {
            if (this.a != null) {
                Status a2 = this.a.a(status);
                u.l(a2, C0201.m82(24331));
                this.b.h(a2);
            } else if (e()) {
                this.c.b(status);
            }
        }
    }

    @Override // com.google.android.gms.common.api.n
    public final void a(R r) {
        synchronized (this.d) {
            if (!r.k().s()) {
                h(r.k());
                c(r);
            } else if (this.a != null) {
                t1.a().submit(new d2(this, r));
            } else if (e()) {
                this.c.c(r);
            }
        }
    }

    public final void d() {
        this.c = null;
    }
}
