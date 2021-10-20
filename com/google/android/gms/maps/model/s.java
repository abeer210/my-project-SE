package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import java.util.List;

public final class s {
    private final c41 a;

    public s(c41 c41) {
        u.k(c41);
        this.a = c41;
    }

    public final List<LatLng> a() {
        try {
            return this.a.v();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void b() {
        try {
            this.a.remove();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void c(boolean z) {
        try {
            this.a.l(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void d(int i) {
        try {
            this.a.n(i);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e(boolean z) {
        try {
            this.a.y(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        try {
            return this.a.E3(((s) obj).a);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(List<? extends List<LatLng>> list) {
        try {
            this.a.s0(list);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(List<LatLng> list) {
        try {
            this.a.z(list);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void h(int i) {
        try {
            this.a.d(i);
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

    public final void i(float f) {
        try {
            this.a.o(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void j(boolean z) {
        try {
            this.a.setVisible(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void k(float f) {
        try {
            this.a.e(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
