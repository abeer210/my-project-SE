package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class b {
    private static k31 a;

    public static a a() {
        try {
            return new a(f().w());
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a b(float f) {
        try {
            return new a(f().s2(f));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a c(Bitmap bitmap) {
        try {
            return new a(f().o1(bitmap));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static a d(int i) {
        try {
            return new a(f().C(i));
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public static void e(k31 k31) {
        if (a == null) {
            u.k(k31);
            a = k31;
        }
    }

    private static k31 f() {
        k31 k31 = a;
        u.l(k31, C0201.m82(21451));
        return k31;
    }
}
