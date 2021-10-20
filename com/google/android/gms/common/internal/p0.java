package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.k;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class p0 implements ServiceConnection {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final k.a e;
    private ComponentName f;
    private final /* synthetic */ n0 g;

    public p0(n0 n0Var, k.a aVar) {
        this.g = n0Var;
        this.e = aVar;
    }

    public final IBinder a() {
        return this.d;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        aq0 unused = this.g.f;
        Context unused2 = this.g.d;
        this.e.c(this.g.d);
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        aq0 unused = this.g.f;
        Context unused2 = this.g.d;
        this.a.remove(serviceConnection);
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final void h(String str) {
        this.b = 3;
        boolean d2 = this.g.f.d(this.g.d, str, this.e.c(this.g.d), this, this.e.d());
        this.c = d2;
        if (d2) {
            this.g.e.sendMessageDelayed(this.g.e.obtainMessage(1, this.e), this.g.h);
            return;
        }
        this.b = 2;
        try {
            this.g.f.c(this.g.d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void i(String str) {
        this.g.e.removeMessages(1, this.e);
        this.g.f.c(this.g.d, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
