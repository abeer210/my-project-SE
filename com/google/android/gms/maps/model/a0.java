package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;

public final class a0 {
    private final c31 a;

    public a0(c31 c31) {
        u.k(c31);
        this.a = c31;
    }

    public final void a() {
        try {
            this.a.R();
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

    public final void c(float f) {
        try {
            this.a.f(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final void d(float f) {
        try {
            this.a.e(f);
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        try {
            return this.a.l0(((a0) obj).a);
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
