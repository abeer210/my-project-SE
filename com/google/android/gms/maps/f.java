package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.x;
import vigqyno.C0201;

public final class f {
    private static boolean a;

    static {
        C0201.m83(f.class, 641);
    }

    public static synchronized int a(Context context) {
        synchronized (f.class) {
            u.l(context, C0201.m82(20099));
            if (a) {
                return 0;
            }
            try {
                hr1 a2 = er1.a(context);
                try {
                    b.f(a2.J2());
                    b.e(a2.S0());
                    a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new x(e);
                }
            } catch (ap0 e2) {
                return e2.a;
            }
        }
    }
}
