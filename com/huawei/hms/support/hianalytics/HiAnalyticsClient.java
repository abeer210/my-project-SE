package com.huawei.hms.support.hianalytics;

import android.content.Context;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.utils.Util;
import java.util.Map;
import vigqyno.C0201;

public class HiAnalyticsClient extends HiAnalyticsBase {
    @Deprecated
    public static String reportEntry(Context context, String str) {
        return reportEntry(context, str, Util.getAppId(context), 0);
    }

    public static void reportExit(Context context, String str, String str2, int i, int i2) {
        reportExit(context, str, str2, Util.getAppId(context), i, i2, 0);
    }

    public static String reportEntry(Context context, String str, int i) {
        return reportEntry(context, str, Util.getAppId(context), i);
    }

    public static void reportExit(Context context, String str, String str2, int i, int i2, int i3) {
        reportExit(context, str, str2, Util.getAppId(context), i, i2, i3);
    }

    public static String reportEntry(Context context, String str, String str2, int i) {
        String id = TransactionIdCreater.getId(str2, str);
        Map<String, String> mapForBi = HiAnalyticsBase.getMapForBi(context, str);
        mapForBi.put(C0201.m82(19573), str2);
        mapForBi.put(C0201.m82(19574), id);
        mapForBi.put(C0201.m82(19575), C0201.m82(19576));
        mapForBi.put(C0201.m82(19577), HiAnalyticsUtil.versionCodeToName(String.valueOf(i)));
        mapForBi.put(C0201.m82(19580), Util.getSystemProperties(C0201.m82(19578), C0201.m82(19579)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(19581), mapForBi);
        return id;
    }

    public static void reportExit(Context context, String str, String str2, String str3, int i, int i2, int i3) {
        Map<String, String> mapForBi = HiAnalyticsBase.getMapForBi(context, str);
        mapForBi.put(C0201.m82(19582), str3);
        mapForBi.put(C0201.m82(19583), str2);
        mapForBi.put(C0201.m82(19584), C0201.m82(19585));
        mapForBi.put(C0201.m82(19586), String.valueOf(i));
        mapForBi.put(C0201.m82(19587), String.valueOf(i2));
        mapForBi.put(C0201.m82(19588), HiAnalyticsUtil.versionCodeToName(String.valueOf(i3)));
        mapForBi.put(C0201.m82(19591), Util.getSystemProperties(C0201.m82(19589), C0201.m82(19590)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(19592), mapForBi);
    }
}
