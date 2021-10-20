package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.utils.Util;
import java.util.Map;
import vigqyno.C0201;

public class HiAnalyticsInnerClient extends HiAnalyticsBase {
    public static void reportEntryClient(Context context, String str, String str2, String str3, String str4) {
        Map<String, String> mapForBi = HiAnalyticsBase.getMapForBi(context, str);
        mapForBi.put(C0201.m82(32692), str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = TransactionIdCreater.getId(str2, str);
        }
        mapForBi.put(C0201.m82(32693), str3);
        mapForBi.put(C0201.m82(32694), C0201.m82(32695));
        if (!TextUtils.isEmpty(str4)) {
            mapForBi.put(C0201.m82(32696), HiAnalyticsUtil.versionCodeToName(str4));
        }
        mapForBi.put(C0201.m82(32699), Util.getSystemProperties(C0201.m82(32697), C0201.m82(32698)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(32700), mapForBi);
    }

    public static void reportEntryExit(Context context, ResponseHeader responseHeader, String str) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(C0201.m82(32701), C0201.m82(32702));
        if (!TextUtils.isEmpty(str)) {
            mapFromRequestHeader.put(C0201.m82(32703), HiAnalyticsUtil.versionCodeToName(str));
        }
        mapFromRequestHeader.put(C0201.m82(32706), Util.getSystemProperties(C0201.m82(32704), C0201.m82(32705)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(32707), mapFromRequestHeader);
    }
}
