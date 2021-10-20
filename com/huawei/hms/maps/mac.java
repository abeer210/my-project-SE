package com.huawei.hms.maps;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public final class mac {
    private static mag a;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    public static double a(LatLng latLng, LatLng latLng2) {
        String str;
        String r0 = C0201.m82(34921);
        if (latLng == null || latLng2 == null) {
            return 0.0d;
        }
        try {
            if (a == null) {
                try {
                    Application application = (Application) Class.forName(C0201.m82(34922)).getMethod(C0201.m82(34923), new Class[0]).invoke(null, null);
                    MapClientIdentify mapClientIdentify = new MapClientIdentify();
                    int isHmsAvailable = HmsUtil.isHmsAvailable(application);
                    if (isHmsAvailable != 0) {
                        mco.d(r0, C0201.m82(34924).concat(String.valueOf(isHmsAvailable)));
                    } else {
                        maf a2 = mbu.a(application);
                        mapClientIdentify.a(application, a2);
                        if (a2 == null) {
                            mco.a(r0, C0201.m82(34925));
                        } else {
                            a = a2.c(ObjectWrapper.wrap(mbu.b(application)));
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (ClassNotFoundException e2) {
                    str = C0201.m82(34929) + e2.toString();
                    mco.d(r0, str);
                    if (a != null) {
                    }
                } catch (NoSuchMethodException e3) {
                    str = C0201.m82(34928) + e3.toString();
                    mco.d(r0, str);
                    if (a != null) {
                    }
                } catch (IllegalAccessException e4) {
                    str = C0201.m82(34927) + e4.toString();
                    mco.d(r0, str);
                    if (a != null) {
                    }
                } catch (InvocationTargetException e5) {
                    str = C0201.m82(34926) + e5.toString();
                    mco.d(r0, str);
                    if (a != null) {
                    }
                }
            }
            if (a != null) {
                return a.a(latLng, latLng2);
            }
            return 0.0d;
        } catch (RemoteException e6) {
            mco.a(r0, C0201.m82(34930) + e6.toString());
            return 0.0d;
        }
    }

    public static int a(Context context) {
        String str;
        String r0 = C0201.m82(34931);
        try {
            str = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128).metaData.getString(C0201.m82(34932));
        } catch (PackageManager.NameNotFoundException unused) {
            mco.d(r0, C0201.m82(34933));
            str = null;
        }
        int i = 40001300;
        if (str != null && !C0201.m82(34934).equals(str)) {
            String[] split = str.split(C0201.m82(34935));
            if (split.length == 4) {
                StringBuilder sb = new StringBuilder();
                sb.append(split[0]);
                String r4 = C0201.m82(34936);
                sb.append(r4);
                sb.append(split[1]);
                sb.append(r4);
                sb.append(split[2]);
                sb.append(split[3]);
                mco.a(r0, C0201.m82(34937).concat(String.valueOf(str)));
                i = Integer.parseInt(sb.toString());
            }
        }
        return new AvailableAdapter(i).isHuaweiMobileServicesAvailable(context);
    }

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(C0201.m82(34938));
            Object invoke = cls.getDeclaredMethod(C0201.m82(34939), String.class, String.class).invoke(cls, str, str2);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            mco.d(C0201.m82(34941), C0201.m82(34940).concat(String.valueOf(str)));
        }
        return str2;
    }

    public static boolean a() {
        StringBuilder sb;
        int i;
        String r0 = C0201.m82(34942);
        String r1 = C0201.m82(34943);
        if (!a(r0, r1).equals(r1) || !a(C0201.m82(34944), r1).contains(C0201.m82(34945))) {
            return true;
        }
        String a2 = a(C0201.m82(34946), r1);
        String concat = C0201.m82(34947).concat(String.valueOf(a2));
        String r5 = C0201.m82(34948);
        mco.a(r5, concat);
        if (r1.equals(a2)) {
            a2 = a(C0201.m82(34949), r1);
            mco.a(r5, C0201.m82(34950).concat(String.valueOf(a2)));
        }
        String[] split = a2.split(C0201.m82(34951));
        if (1 < split.length) {
            String[] split2 = split[1].split(C0201.m82(34952));
            if (3 < split2.length) {
                String str = split2[3];
                int indexOf = str.indexOf(C0201.m82(34953));
                if (-1 != indexOf) {
                    str = str.substring(0, indexOf);
                }
                try {
                    int parseInt = Integer.parseInt(split2[0]);
                    return parseInt >= 10 && (parseInt != 10 || Integer.parseInt(split2[1]) != 0 || Integer.parseInt(split2[2]) > 0 || Integer.parseInt(str) >= 122);
                } catch (NumberFormatException e) {
                    mco.d(r5, C0201.m82(34954) + e.toString());
                    return true;
                }
            } else {
                sb = new StringBuilder(C0201.m82(34955));
                i = split2.length;
            }
        } else {
            sb = new StringBuilder(C0201.m82(34956));
            i = split.length;
        }
        sb.append(i);
        mco.d(r5, sb.toString());
    }
}
