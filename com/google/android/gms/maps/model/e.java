package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;

public final class e {
    private final n31 a;

    public e(n31 n31) {
        u.k(n31);
        this.a = n31;
    }

    public final void a() {
        try {
            this.a.remove();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void b(LatLng latLng) {
        try {
            this.a.v3(latLng);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void c(int i) {
        try {
            this.a.n(i);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void d(double d) {
        try {
            this.a.n3(d);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e(int i) {
        try {
            this.a.d(i);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.a.w0(((e) obj).a);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(float f) {
        try {
            this.a.o(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(float f) {
        try {
            this.a.e(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.s();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
