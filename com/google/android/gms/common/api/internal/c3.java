package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class c3 implements us1<Map<b<?>, String>> {
    private final /* synthetic */ a3 a;

    private c3(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // defpackage.us1
    public final void a(zs1<Map<b<?>, String>> zs1) {
        a3.n(this.a).lock();
        try {
            if (a3.w(this.a)) {
                if (zs1.p()) {
                    a3.m(this.a, new r0(a3.x(this.a).size()));
                    for (b3 b3Var : a3.x(this.a).values()) {
                        a3.y(this.a).put(b3Var.b(), vo0.e);
                    }
                } else if (zs1.k() instanceof c) {
                    c cVar = (c) zs1.k();
                    if (a3.z(this.a)) {
                        a3.m(this.a, new r0(a3.x(this.a).size()));
                        for (b3 b3Var2 : a3.x(this.a).values()) {
                            b b = b3Var2.b();
                            vo0 a2 = cVar.a(b3Var2);
                            if (a3.o(this.a, b3Var2, a2)) {
                                a3.y(this.a).put(b, new vo0(16));
                            } else {
                                a3.y(this.a).put(b, a2);
                            }
                        }
                    } else {
                        a3.m(this.a, cVar.b());
                    }
                    a3.l(this.a, a3.A(this.a));
                } else {
                    Log.e(C0201.m82(19723), C0201.m82(19724), zs1.k());
                    a3.m(this.a, Collections.emptyMap());
                    a3.l(this.a, new vo0(8));
                }
                if (a3.B(this.a) != null) {
                    a3.y(this.a).putAll(a3.B(this.a));
                    a3.l(this.a, a3.A(this.a));
                }
                if (a3.C(this.a) == null) {
                    a3.D(this.a);
                    a3.E(this.a);
                } else {
                    a3.p(this.a, false);
                    a3.F(this.a).a(a3.C(this.a));
                }
                a3.G(this.a).signalAll();
                a3.n(this.a).unlock();
            }
        } finally {
            a3.n(this.a).unlock();
        }
    }
}
