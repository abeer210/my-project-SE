package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

public abstract class f0 extends Service {
    public final ExecutorService a;
    private Binder b;
    private final Object c;
    private int d;
    private int e;

    public f0() {
        m01 a2 = l01.a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.a = a2.b(new cq0(valueOf.length() != 0 ? "Firebase-".concat(valueOf) : new String("Firebase-")), q01.a);
        this.c = new Object();
        this.e = 0;
    }

    /* access modifiers changed from: private */
    public final void a(Intent intent) {
        if (intent != null) {
            p4.c(intent);
        }
        synchronized (this.c) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    public abstract Intent c(Intent intent);

    public abstract boolean d(Intent intent);

    public abstract void e(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new j0(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent c2 = c(intent);
        if (c2 == null) {
            a(intent);
            return 2;
        } else if (d(c2)) {
            a(intent);
            return 2;
        } else {
            this.a.execute(new d0(this, c2, intent));
            return 3;
        }
    }
}
