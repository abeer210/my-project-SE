package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class j {
    private final q31 a;

    public j(q31 q31) {
        u.k(q31);
        this.a = q31;
    }

    public final LatLng a() {
        try {
            return this.a.getPosition();
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

    public final void d(a aVar) {
        u.l(aVar, C0201.m82(21964));
        try {
            this.a.J(aVar.a());
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e(LatLngBounds latLngBounds) {
        try {
            this.a.B0(latLngBounds);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        try {
            return this.a.k2(((j) obj).a);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(float f) {
        try {
            this.a.f(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(boolean z) {
        try {
            this.a.setVisible(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void h(float f) {
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
