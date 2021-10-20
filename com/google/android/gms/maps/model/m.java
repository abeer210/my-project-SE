package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;

public final class m {
    private final w31 a;

    public m(w31 w31) {
        u.k(w31);
        this.a = w31;
    }

    public final void a() {
        try {
            this.a.h2();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final String b() {
        try {
            return this.a.getName();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final String c() {
        try {
            return this.a.L();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        try {
            return this.a.F0(((m) obj).a);
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
