package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

public final class f {
    private static f e;
    private final Context a;
    private final ScheduledExecutorService b;
    private h c = new h(this);
    private int d = 1;

    private f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final synchronized <T> zs1<T> c(m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.e(mVar)) {
            h hVar = new h(this);
            this.c = hVar;
            hVar.e(mVar);
        }
        return mVar.b.a();
    }

    public static synchronized f f(Context context) {
        f fVar;
        synchronized (f.class) {
            if (e == null) {
                e = new f(context, l01.a().a(1, new cq0("MessengerIpcClient"), q01.a));
            }
            fVar = e;
        }
        return fVar;
    }

    private final synchronized int g() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final zs1<Void> b(int i, Bundle bundle) {
        return c(new n(g(), 2, bundle));
    }

    public final zs1<Bundle> d(int i, Bundle bundle) {
        return c(new o(g(), 1, bundle));
    }
}
