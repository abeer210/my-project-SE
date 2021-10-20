package com.huawei.hms.framework.network.grs.d.b;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import vigqyno.C0201;

public abstract class b {
    private static final String[] a = {C0201.m82(29167), C0201.m82(29168), C0201.m82(29169), C0201.m82(29170), C0201.m82(29171), C0201.m82(29172), C0201.m82(29173), C0201.m82(29174)};
    private static final String[] b = {C0201.m82(29175), C0201.m82(29176), C0201.m82(29177), C0201.m82(29178), C0201.m82(29179), C0201.m82(29180), C0201.m82(29181), C0201.m82(29182)};
    private static final String[] c = {C0201.m82(29183), C0201.m82(29184), C0201.m82(29185), C0201.m82(29186), C0201.m82(29187), C0201.m82(29188), C0201.m82(29189), C0201.m82(29190), C0201.m82(29191), C0201.m82(29192), C0201.m82(29193), C0201.m82(29194), C0201.m82(29195), C0201.m82(29196), C0201.m82(29197), C0201.m82(29198)};

    public static SSLContext a() {
        int i = Build.VERSION.SDK_INT;
        return SSLContext.getInstance(i >= 29 ? C0201.m82(29199) : i >= 16 ? C0201.m82(29200) : C0201.m82(29201));
    }

    public static boolean a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return a(sSLSocket, c);
    }

    public static boolean a(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        int length = enabledCipherSuites.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            String str = enabledCipherSuites[i];
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z = false;
                    break;
                } else if (upperCase.contains(strArr[i2].toUpperCase(Locale.ENGLISH))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                arrayList.add(str);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static void b(SSLSocket sSLSocket) {
        if (sSLSocket != null && !e(sSLSocket)) {
            a(sSLSocket);
        }
    }

    public static boolean b(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static void c(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            int i = Build.VERSION.SDK_INT;
            String r1 = C0201.m82(29202);
            if (i >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(29203), r1});
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16 && i2 < 29) {
                sSLSocket.setEnabledProtocols(new String[]{r1});
            } else if (Build.VERSION.SDK_INT < 16) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(29204)});
            }
        }
    }

    public static void d(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            c(sSLSocket);
            b(sSLSocket);
        }
    }

    public static boolean e(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return Build.VERSION.SDK_INT > 19 ? b(sSLSocket, b) : b(sSLSocket, a);
    }
}
