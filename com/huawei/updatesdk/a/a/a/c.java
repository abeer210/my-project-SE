package com.huawei.updatesdk.a.a.a;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import vigqyno.C0201;

public abstract class c {
    private static final String[] a = {C0201.m82(37294), C0201.m82(37295), C0201.m82(37296), C0201.m82(37297), C0201.m82(37298), C0201.m82(37299), C0201.m82(37300), C0201.m82(37301)};
    private static final String[] b = {C0201.m82(37302), C0201.m82(37303), C0201.m82(37304), C0201.m82(37305), C0201.m82(37306), C0201.m82(37307), C0201.m82(37308), C0201.m82(37309)};
    private static final String[] c = {C0201.m82(37310), C0201.m82(37311), C0201.m82(37312), C0201.m82(37313), C0201.m82(37314), C0201.m82(37315), C0201.m82(37316), C0201.m82(37317), C0201.m82(37318), C0201.m82(37319), C0201.m82(37320), C0201.m82(37321), C0201.m82(37322), C0201.m82(37323), C0201.m82(37324), C0201.m82(37325)};

    public static SSLContext a() throws NoSuchAlgorithmException {
        int i = Build.VERSION.SDK_INT;
        return SSLContext.getInstance(i >= 29 ? C0201.m82(37326) : i >= 16 ? C0201.m82(37327) : C0201.m82(37328));
    }

    private static void a(SSLSocket sSLSocket) {
        if (sSLSocket != null && !d(sSLSocket)) {
            a(sSLSocket, c);
        }
    }

    private static void a(SSLSocket sSLSocket, String[] strArr) {
        boolean z;
        if (!(sSLSocket == null || strArr == null)) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (upperCase.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    private static void b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            int i = Build.VERSION.SDK_INT;
            String r1 = C0201.m82(37329);
            if (i >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(37330), r1});
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16 && i2 < 29) {
                sSLSocket.setEnabledProtocols(new String[]{r1});
            } else if (Build.VERSION.SDK_INT < 16) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(37331)});
            }
        }
    }

    private static boolean b(SSLSocket sSLSocket, String[] strArr) {
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
            b(sSLSocket);
            a(sSLSocket);
        }
    }

    private static boolean d(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return Build.VERSION.SDK_INT > 19 ? b(sSLSocket, b) : b(sSLSocket, a);
    }
}
