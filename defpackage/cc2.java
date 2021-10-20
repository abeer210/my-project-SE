package defpackage;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import vigqyno.C0201;

/* renamed from: cc2  reason: default package */
public abstract class cc2 {
    private static final String[] a = {C0201.m82(30435), C0201.m82(30436), C0201.m82(30437), C0201.m82(30438), C0201.m82(30439), C0201.m82(30440), C0201.m82(30441), C0201.m82(30442)};
    private static final String[] b = {C0201.m82(30443), C0201.m82(30444), C0201.m82(30445), C0201.m82(30446), C0201.m82(30447), C0201.m82(30448), C0201.m82(30449), C0201.m82(30450)};
    private static final String[] c = {C0201.m82(30451), C0201.m82(30452), C0201.m82(30453), C0201.m82(30454), C0201.m82(30455), C0201.m82(30456), C0201.m82(30457), C0201.m82(30458), C0201.m82(30459), C0201.m82(30460), C0201.m82(30461), C0201.m82(30462), C0201.m82(30463), C0201.m82(30464), C0201.m82(30465), C0201.m82(30466)};

    public static boolean a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return b(sSLSocket, c);
    }

    public static boolean b(SSLSocket sSLSocket, String[] strArr) {
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

    public static void c(SSLSocket sSLSocket) {
        if (sSLSocket != null && !g(sSLSocket)) {
            a(sSLSocket);
        }
    }

    public static void d(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            int i = Build.VERSION.SDK_INT;
            String r1 = C0201.m82(30467);
            if (i >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(30468), r1});
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16 && i2 < 29) {
                sSLSocket.setEnabledProtocols(new String[]{r1});
            } else if (Build.VERSION.SDK_INT < 16) {
                sSLSocket.setEnabledProtocols(new String[]{C0201.m82(30469)});
            }
        }
    }

    public static boolean e(SSLSocket sSLSocket, String[] strArr) {
        if (!(sSLSocket == null || strArr == null)) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e) {
                pc2.e(C0201.m82(30471), C0201.m82(30470) + e.getMessage());
            }
        }
        return false;
    }

    public static SSLContext f() throws NoSuchAlgorithmException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return SSLContext.getInstance(C0201.m82(30472));
        }
        if (i >= 16) {
            return SSLContext.getInstance(C0201.m82(30473));
        }
        return SSLContext.getInstance(C0201.m82(30474));
    }

    public static boolean g(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19) {
            return h(sSLSocket, b);
        }
        return h(sSLSocket, a);
    }

    public static boolean h(SSLSocket sSLSocket, String[] strArr) {
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
}
