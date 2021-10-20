package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.x;
import vigqyno.C0201;

/* renamed from: er1  reason: default package */
public class er1 {
    private static final String a = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context b;
    private static hr1 c;

    static {
        C0201.m83(er1.class, 517);
    }

    public static hr1 a(Context context) throws ap0 {
        hr1 hr1;
        u.k(context);
        hr1 hr12 = c;
        if (hr12 != null) {
            return hr12;
        }
        int g = cp0.g(context, 13400000);
        if (g == 0) {
            Log.i(a, C0201.m82(10816));
            IBinder iBinder = (IBinder) c(d(context).getClassLoader(), C0201.m82(10817));
            if (iBinder == null) {
                hr1 = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(10818));
                if (queryLocalInterface instanceof hr1) {
                    hr1 = (hr1) queryLocalInterface;
                } else {
                    hr1 = new ir1(iBinder);
                }
            }
            c = hr1;
            try {
                hr1.a3(ar0.W3(d(context).getResources()), cp0.f);
                return c;
            } catch (RemoteException e) {
                throw new x(e);
            }
        } else {
            throw new ap0(g);
        }
    }

    private static <T> T b(Class<?> cls) {
        try {
            return (T) cls.newInstance();
        } catch (InstantiationException unused) {
            String r1 = C0201.m82(10820);
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
        } catch (IllegalAccessException unused2) {
            String r12 = C0201.m82(10819);
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? r12.concat(valueOf2) : new String(r12));
        }
    }

    private static <T> T c(ClassLoader classLoader, String str) {
        try {
            u.k(classLoader);
            return (T) b(classLoader.loadClass(str));
        } catch (ClassNotFoundException unused) {
            String r0 = C0201.m82(10821);
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
        }
    }

    private static Context d(Context context) {
        Context context2 = b;
        if (context2 != null) {
            return context2;
        }
        Context e = e(context);
        b = e;
        return e;
    }

    private static Context e(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.i, C0201.m82(10822)).b();
        } catch (Exception e) {
            Log.e(a, C0201.m82(10823), e);
            return cp0.d(context);
        }
    }
}
