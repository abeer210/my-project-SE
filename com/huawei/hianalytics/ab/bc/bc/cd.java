package com.huawei.hianalytics.ab.bc.bc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hianalytics.ab.bc.ef.ab;
import vigqyno.C0201;

public class cd {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static String ab(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return C0201.m82(1443);
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                break;
            case 13:
                return C0201.m82(1442);
            default:
                if (!str.equalsIgnoreCase(C0201.m82(1439)) && !str.equalsIgnoreCase(C0201.m82(1440)) && !str.equalsIgnoreCase(C0201.m82(1441))) {
                    return str;
                }
        }
        return C0201.m82(1444);
    }

    public static String ab(Context context) {
        NetworkInfo activeNetworkInfo;
        String r0 = C0201.m82(1445);
        String r1 = C0201.m82(1446);
        if (context != null) {
            if (context.getPackageManager().checkPermission(C0201.m82(1447), context.getPackageName()) == 0) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(1448));
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                    return r0;
                }
                if (activeNetworkInfo.getType() == 1) {
                    return C0201.m82(1449);
                }
                if (activeNetworkInfo.getType() == 0) {
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    ab.cd(r1, C0201.m82(1450) + subtypeName);
                    return ab(activeNetworkInfo.getSubtype(), subtypeName);
                }
                int type = activeNetworkInfo.getType();
                String r3 = C0201.m82(1451);
                if (type == 16) {
                    String r02 = C0201.m82(1452);
                    ab.fg(r1, r3 + r02);
                    return r02;
                } else if (activeNetworkInfo.getType() == 9) {
                    String r03 = C0201.m82(1453);
                    ab.cd(r1, r3 + r03);
                    return r03;
                } else {
                    ab.cd(r1, r3 + activeNetworkInfo.getType());
                    return C0201.m82(1454);
                }
            }
        }
        ab.fg(r1, C0201.m82(1455));
        return r0;
    }
}
