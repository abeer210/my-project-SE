package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.x;

public final class i {
    private final xp1 a;

    public i(xp1 xp1) {
        this.a = xp1;
    }

    public final boolean a() {
        try {
            return this.a.d3();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void b(boolean z) {
        try {
            this.a.W(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void c(boolean z) {
        try {
            this.a.R3(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void d(boolean z) {
        try {
            this.a.m2(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e(boolean z) {
        try {
            this.a.V(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(boolean z) {
        try {
            this.a.E1(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(boolean z) {
        try {
            this.a.A2(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void h(boolean z) {
        try {
            this.a.Z0(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void i(boolean z) {
        try {
            this.a.z1(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void j(boolean z) {
        try {
            this.a.f1(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
