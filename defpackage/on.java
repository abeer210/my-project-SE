package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@Deprecated
/* renamed from: on  reason: default package */
/* compiled from: ManifestParser */
public final class on {
    private final Context a;

    public on(Context context) {
        this.a = context;
    }

    private static mn b(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof mn) {
                    return (mn) newInstance;
                }
                throw new RuntimeException(C0201.m82(35509) + newInstance);
            } catch (InstantiationException e) {
                c(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                c(cls2, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                c(cls3, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                c(cls4, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException(C0201.m82(35510), e5);
        }
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException(C0201.m82(35511) + cls, exc);
    }

    public List<mn> a() {
        String r0 = C0201.m82(35512);
        if (Log.isLoggable(r0, 3)) {
            Log.d(r0, C0201.m82(35513));
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable(r0, 3)) {
                    Log.d(r0, C0201.m82(35514));
                }
                return arrayList;
            }
            if (Log.isLoggable(r0, 2)) {
                Log.v(r0, C0201.m82(35515) + applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if (C0201.m82(35516).equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                    if (Log.isLoggable(r0, 3)) {
                        Log.d(r0, C0201.m82(35517) + str);
                    }
                }
            }
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(35518));
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(C0201.m82(35519), e);
        }
    }
}
