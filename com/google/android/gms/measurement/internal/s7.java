package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class s7 implements ServiceConnection, c.a, c.b {
    private volatile boolean a;
    private volatile h3 b;
    public final /* synthetic */ a7 c;

    public s7(a7 a7Var) {
        this.c = a7Var;
    }

    public final void b(Intent intent) {
        this.c.j();
        Context context = this.c.getContext();
        aq0 b2 = aq0.b();
        synchronized (this) {
            if (this.a) {
                this.c.e().M().d(C0201.m82(3229));
                return;
            }
            this.c.e().M().d(C0201.m82(3230));
            this.a = true;
            b2.a(context, intent, a7.H(this.c), 129);
        }
    }

    public final void c() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    public final void d() {
        this.c.j();
        Context context = this.c.getContext();
        synchronized (this) {
            if (this.a) {
                this.c.e().M().d(C0201.m82(3231));
            } else if (this.b == null || (!this.b.isConnecting() && !this.b.isConnected())) {
                this.b = new h3(context, Looper.getMainLooper(), this, this);
                this.c.e().M().d(C0201.m82(3233));
                this.a = true;
                this.b.v();
            } else {
                this.c.e().M().d(C0201.m82(3232));
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        u.f(C0201.m82(3234));
        synchronized (this) {
            try {
                this.c.c().y(new t7(this, (b3) this.b.E()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(vo0 vo0) {
        u.f(C0201.m82(3235));
        k3 v = this.c.a.v();
        if (v != null) {
            v.H().a(C0201.m82(3236), vo0);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.c().y(new v7(this));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        u.f(C0201.m82(3237));
        this.c.e().L().d(C0201.m82(3238));
        this.c.c().y(new w7(this));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b3 b3Var;
        u.f(C0201.m82(3239));
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.e().E().d(C0201.m82(3240));
                return;
            }
            b3 b3Var2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (C0201.m82(3241).equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(3242));
                        if (queryLocalInterface instanceof b3) {
                            b3Var = (b3) queryLocalInterface;
                        } else {
                            b3Var = new d3(iBinder);
                        }
                        b3Var2 = b3Var;
                    }
                    this.c.e().M().d(C0201.m82(3243));
                } else {
                    this.c.e().E().a(C0201.m82(3244), interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.e().E().d(C0201.m82(3245));
            }
            if (b3Var2 == null) {
                this.a = false;
                try {
                    aq0.b().c(this.c.getContext(), a7.H(this.c));
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.c().y(new r7(this, b3Var2));
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        u.f(C0201.m82(3246));
        this.c.e().L().d(C0201.m82(3247));
        this.c.c().y(new u7(this, componentName));
    }
}
