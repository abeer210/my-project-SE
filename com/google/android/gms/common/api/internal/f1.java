package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class f1 implements Runnable {
    private final /* synthetic */ vo0 a;
    private final /* synthetic */ g.a b;

    public f1(g.a aVar, vo0 vo0) {
        this.b = aVar;
        this.a = vo0;
    }

    public final void run() {
        this.b.onConnectionFailed(this.a);
    }
}
