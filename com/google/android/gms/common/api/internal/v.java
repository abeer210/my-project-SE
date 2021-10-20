package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class v implements us1<Map<b<?>, String>> {
    private p a;
    private final /* synthetic */ a3 b;

    public v(a3 a3Var, p pVar) {
        this.b = a3Var;
        this.a = pVar;
    }

    @Override // defpackage.us1
    public final void a(zs1<Map<b<?>, String>> zs1) {
        a3.n(this.b).lock();
        try {
            if (!a3.w(this.b)) {
                this.a.a();
                return;
            }
            if (zs1.p()) {
                a3.u(this.b, new r0(a3.H(this.b).size()));
                for (b3 b3Var : a3.H(this.b).values()) {
                    a3.B(this.b).put(b3Var.b(), vo0.e);
                }
            } else if (zs1.k() instanceof c) {
                c cVar = (c) zs1.k();
                if (a3.z(this.b)) {
                    a3.u(this.b, new r0(a3.H(this.b).size()));
                    for (b3 b3Var2 : a3.H(this.b).values()) {
                        b b2 = b3Var2.b();
                        vo0 a2 = cVar.a(b3Var2);
                        if (a3.o(this.b, b3Var2, a2)) {
                            a3.B(this.b).put(b2, new vo0(16));
                        } else {
                            a3.B(this.b).put(b2, a2);
                        }
                    }
                } else {
                    a3.u(this.b, cVar.b());
                }
            } else {
                Log.e(C0201.m82(37882), C0201.m82(37883), zs1.k());
                a3.u(this.b, Collections.emptyMap());
            }
            if (this.b.isConnected()) {
                a3.y(this.b).putAll(a3.B(this.b));
                if (a3.A(this.b) == null) {
                    a3.D(this.b);
                    a3.E(this.b);
                    a3.G(this.b).signalAll();
                }
            }
            this.a.a();
            a3.n(this.b).unlock();
        } finally {
            a3.n(this.b).unlock();
        }
    }

    public final void b() {
        this.a.a();
    }
}
