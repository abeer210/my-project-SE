package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.g;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k1 implements Runnable {
    private final /* synthetic */ vo0 a;
    private final /* synthetic */ g.b b;

    public k1(g.b bVar, vo0 vo0) {
        this.b = bVar;
        this.a = vo0;
    }

    public final void run() {
        g.a aVar = (g.a) g.this.i.get(this.b.b);
        if (aVar != null) {
            if (this.a.u()) {
                this.b.e = true;
                if (this.b.a.r()) {
                    this.b.g();
                    return;
                }
                try {
                    this.b.a.f(null, this.b.a.e());
                } catch (SecurityException e) {
                    Log.e(C0201.m82(34565), C0201.m82(34566), e);
                    aVar.onConnectionFailed(new vo0(10));
                }
            } else {
                aVar.onConnectionFailed(this.a);
            }
        }
    }
}
