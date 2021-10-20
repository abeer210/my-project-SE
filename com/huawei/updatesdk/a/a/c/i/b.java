package com.huawei.updatesdk.a.a.c.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.updatesdk.a.a.b.a.a.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import vigqyno.C0201;

public class b {
    private static String a;
    private static int b;
    private static int c;
    private static Proxy d;

    static {
        C0201.m83(b.class, 499);
    }

    private static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                }
            }
        }
        return 0;
    }

    private static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(4664));
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static Proxy a() {
        return d;
    }

    private static void a(int i) {
        c = i;
    }

    private static void a(Proxy proxy) {
        d = proxy;
    }

    private static boolean a(NetworkInfo networkInfo, Context context) {
        int type = networkInfo.getType();
        boolean f = a.f(context);
        if (type != 0 || !f) {
            return false;
        }
        String host = android.net.Proxy.getHost(context);
        int port = android.net.Proxy.getPort(context);
        Proxy proxy = null;
        if (!(host == null || host.length() <= 0 || port == -1)) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        }
        a(proxy);
        return true;
    }

    public static Proxy b(Context context) {
        if (e(context)) {
            return a();
        }
        return null;
    }

    public static int c(Context context) {
        if (-1 == b) {
            a.a(a, C0201.m82(4665));
            if (context != null) {
                f(context);
            }
        }
        return b;
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(4666))) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean e(Context context) {
        if (-1 == c) {
            c(context);
        }
        return c == -3;
    }

    private static void f(Context context) {
        a(0);
        NetworkInfo a2 = a(context);
        if (a2 == null) {
            a.a(a, C0201.m82(4667));
            return;
        }
        int a3 = a(a2);
        b = a3;
        if (1 != a3) {
            a(a(a2, context) ? -3 : -2);
        }
    }
}
