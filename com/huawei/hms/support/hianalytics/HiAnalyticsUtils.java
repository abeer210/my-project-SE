package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.stats.a;
import com.huawei.hms.stats.b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AnalyticsSwitchHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class HiAnalyticsUtils {
    private static final Object LOCK_INST = new Object();
    private static final Object LOCK_REPORT = new Object();
    private static final String TAG = null;
    private static HiAnalyticsUtils sInstance;
    private int count = 0;

    static {
        C0201.m83(HiAnalyticsUtils.class, 200);
    }

    private static LinkedHashMap<String, String> convertToLinkedHashMap(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str : map.keySet()) {
            linkedHashMap.put(str, map.get(str));
        }
        return linkedHashMap;
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (LOCK_INST) {
            if (sInstance == null) {
                sInstance = new HiAnalyticsUtils();
            }
            hiAnalyticsUtils = sInstance;
        }
        return hiAnalyticsUtils;
    }

    private String getReportJson(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(14044), C0201.m82(14043) + e.getMessage());
        }
        return jSONObject.toString();
    }

    private void reportOnNeed() {
        synchronized (LOCK_REPORT) {
            if (this.count < 60) {
                this.count++;
            } else {
                this.count = 0;
                a.a();
            }
        }
    }

    public static String versionCodeToName(String str) {
        String r0 = C0201.m82(14045);
        boolean isEmpty = TextUtils.isEmpty(str);
        String r2 = C0201.m82(14046);
        if (!isEmpty && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + r0 + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + r0 + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + r0 + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return r2;
    }

    public void enableLog() {
        HMSLog.i(C0201.m82(14047), C0201.m82(14048));
        b.a();
    }

    public boolean getInitFlag() {
        HMSLog.i(C0201.m82(14049), C0201.m82(14050));
        return a.b();
    }

    public boolean hasError(Context context) {
        return AnalyticsSwitchHolder.isAnalyticsDisabled(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        if (!hasError(context) && context != null) {
            onEvent2(context, str, str2);
        }
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (!TextUtils.isEmpty(reportJson)) {
                onEvent2(context, str, reportJson);
                a.a(1, str, convertToLinkedHashMap(map));
                reportOnNeed();
            }
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        if (!hasError(context) && context != null && a.b()) {
            a.a(context, str, str2);
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (context != null && a.b()) {
                a.a(context, str, reportJson);
                a.a(1, str, convertToLinkedHashMap(map));
                reportOnNeed();
            }
        }
    }

    public void onReport(Context context, String str, Map map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (!TextUtils.isEmpty(reportJson)) {
                HMSLog.i(C0201.m82(14051), C0201.m82(14052));
                onEvent2(context, str, reportJson);
                a.a(1, str, convertToLinkedHashMap(map));
                a.a();
            }
        }
    }
}
