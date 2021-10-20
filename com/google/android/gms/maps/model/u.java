package com.google.android.gms.maps.model;

import android.os.RemoteException;
import java.util.List;
import vigqyno.C0201;

public final class u {
    private final f41 a;

    public u(f41 f41) {
        com.google.android.gms.common.internal.u.k(f41);
        this.a = f41;
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
            this.a.i1(i);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e(d dVar) {
        com.google.android.gms.common.internal.u.l(dVar, C0201.m82(20308));
        try {
            this.a.C0(dVar);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        try {
            return this.a.W0(((u) obj).a);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(boolean z) {
        try {
            this.a.y(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(List<q> list) {
        try {
            this.a.U(list);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void h(List<LatLng> list) {
        try {
            this.a.z(list);
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

    public final void i(d dVar) {
        com.google.android.gms.common.internal.u.l(dVar, C0201.m82(20309));
        try {
            this.a.j3(dVar);
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
            this.a.v2(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void l(float f) {
        try {
            this.a.e(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
