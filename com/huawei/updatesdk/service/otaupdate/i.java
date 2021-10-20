package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import vigqyno.C0201;

public class i {
    public static int a(long j, long j2) {
        if (j2 <= 0) {
            return 0;
        }
        double d = (double) j;
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.min((int) Math.round((d / d2) * 100.0d), 100);
    }

    public static String a(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double d = (double) i;
        Double.isNaN(d);
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format(d / 100.0d);
    }

    public static String a(Context context, long j) {
        String r2 = C0201.m82(36311);
        if (j == 0) {
            return context.getString(g.e(context, r2), C0201.m82(36312));
        }
        DecimalFormat decimalFormat = null;
        if (j > 104857) {
            decimalFormat = new DecimalFormat(C0201.m82(36313));
        } else if (j > 10485) {
            decimalFormat = new DecimalFormat(C0201.m82(36314));
        }
        if (decimalFormat != null) {
            double d = (double) j;
            Double.isNaN(d);
            return context.getString(g.e(context, r2), decimalFormat.format(d / 1048576.0d));
        }
        return context.getString(g.e(context, r2), C0201.m82(36315));
    }

    public static boolean a(List list) {
        return list == null || list.size() <= 0;
    }
}
