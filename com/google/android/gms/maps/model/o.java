package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class o {
    private final z31 a;

    public o(z31 z31) {
        u.k(z31);
        this.a = z31;
    }

    public final LatLng a() {
        try {
            return this.a.getPosition();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final String b() {
        try {
            return this.a.x3();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final String c() {
        try {
            return this.a.getTitle();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void d() {
        try {
            this.a.g1();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void e() {
        try {
            this.a.remove();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        try {
            return this.a.l2(((o) obj).a);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void f(float f) {
        try {
            this.a.T1(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void g(float f, float f2) {
        try {
            this.a.h0(f, f2);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void h(boolean z) {
        try {
            this.a.O(z);
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

    public final void i(boolean z) {
        try {
            this.a.P(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void j(a aVar) {
        if (aVar == null) {
            try {
                this.a.s1(null);
            } catch (RemoteException e) {
                throw new x(e);
            }
        } else {
            this.a.s1(aVar.a());
        }
    }

    public final void k(float f, float f2) {
        try {
            this.a.S(f, f2);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void l(LatLng latLng) {
        if (latLng != null) {
            try {
                this.a.i0(latLng);
            } catch (RemoteException e) {
                throw new x(e);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(22436));
        }
    }

    public final void m(float f) {
        try {
            this.a.p2(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void n(String str) {
        try {
            this.a.I2(str);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void o(String str) {
        try {
            this.a.J0(str);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void p(boolean z) {
        try {
            this.a.setVisible(z);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void q(float f) {
        try {
            this.a.e(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void r() {
        try {
            this.a.F();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }
}
