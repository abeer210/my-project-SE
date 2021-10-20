package com.huawei.hms.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import vigqyno.C0201;

public abstract class NetWorkUtil {

    public static final class NetType {
        public static final int NET = 0;
        public static final int TYPE_2G = 0;
        public static final int TYPE_3G = 0;
        public static final int TYPE_4G = 0;
        public static final int TYPE_5G = 0;
        public static final int TYPE_NEED_INIT = 0;
        public static final int TYPE_OTHER = 0;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 0;
        public static final int WAP = 0;

        static {
            C0201.m83(NetType.class, 291);
        }
    }

    private static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(29486));
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static int getNetworkType(Context context) {
        return a(a(context));
    }

    private static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (networkInfo.getType() == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                        return 3;
                    case 13:
                    case 14:
                        return 4;
                    default:
                        return 6;
                }
            }
        }
        return 0;
    }
}
