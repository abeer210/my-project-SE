package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class l {
    private final t31 a;

    /* access modifiers changed from: package-private */
    public static class a {
        public static final a a = new a();

        private a() {
        }

        public static w31 a(IBinder iBinder) {
            return x31.U3(iBinder);
        }

        public static m b(w31 w31) {
            return new m(w31);
        }
    }

    public l(t31 t31) {
        this(t31, a.a);
    }

    public final int a() {
        try {
            return this.a.r2();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final List<m> b() {
        try {
            List<IBinder> c0 = this.a.c0();
            ArrayList arrayList = new ArrayList(c0.size());
            for (IBinder iBinder : c0) {
                arrayList.add(a.b(a.a(iBinder)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean c() {
        try {
            return this.a.N3();
        } catch (RemoteException e) {
            throw new x(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        try {
            return this.a.s3(((l) obj).a);
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

    private l(t31 t31, a aVar) {
        u.l(t31, C0201.m82(21795));
        this.a = t31;
        u.l(aVar, C0201.m82(21796));
    }
}
