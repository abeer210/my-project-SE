package com.huawei.hms.maps;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.maf;
import vigqyno.C0201;

public final class mbu {
    private static Context a;
    private static Context b;
    private static maf c;
    private static boolean d;

    static {
        C0201.m83(mbu.class, 489);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        com.huawei.hms.maps.mco.d(r0, vigqyno.C0201.m82(31278));
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ExcHandler: ClassNotFoundException | IllegalAccessException | InstantiationException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:14:0x005f] */
    public static maf a(Context context) {
        Preconditions.checkNotNull(context);
        maf maf = c;
        if (maf != null) {
            return maf;
        }
        String r0 = C0201.m82(31273);
        mco.b(r0, C0201.m82(31274));
        Context b2 = b(context);
        b = b2;
        if (b2 == null) {
            mco.d(r0, C0201.m82(31275));
            return null;
        }
        Object newInstance = b2.getClassLoader().loadClass(C0201.m82(31276)).newInstance();
        if (newInstance instanceof IBinder) {
            maf a2 = maf.maa.a((IBinder) newInstance);
            c = a2;
            try {
                a2.a(ObjectWrapper.wrap(b(context).getResources()));
            } catch (RemoteException unused) {
                try {
                    mco.d(r0, C0201.m82(31277));
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused2) {
                }
            }
        }
        return c;
    }

    public static void a() {
        a = null;
        b = null;
        c = null;
    }

    public static void a(boolean z) {
        d = z;
    }

    public static Context b(Context context) {
        MapClientIdentify.a(context);
        Context context2 = a;
        if (context2 != null) {
            return context2;
        }
        Context c2 = c(context);
        a = c2;
        return c2;
    }

    private static Context c(Context context) {
        String r7;
        try {
            DynamicModule load = DynamicModule.load(context, DynamicModule.PREFER_REMOTE, C0201.m82(31279));
            if (load != null) {
                return load.getModuleContext();
            }
            return null;
        } catch (DynamicModule.LoadingException e) {
            Bundle bundle = e.getBundle();
            String r3 = C0201.m82(31280);
            if (bundle != null && bundle.getInt(C0201.m82(31281)) == 2) {
                Intent intent = (Intent) bundle.getParcelable(C0201.m82(31282));
                if (intent == null) {
                    r7 = C0201.m82(31283);
                } else {
                    mco.d(r3, C0201.m82(31284));
                    if (d) {
                        try {
                            context.startActivity(intent);
                            d = false;
                        } catch (ActivityNotFoundException unused) {
                            r7 = C0201.m82(31285);
                        }
                    }
                }
                mco.d(r3, r7);
            }
            mco.d(r3, C0201.m82(31286).concat(String.valueOf(e)));
            return null;
        }
    }
}
