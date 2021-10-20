package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class HiAnalyticsUtil {
    private static final Object LOCK_INST = new Object();
    private static final String TAG = null;
    private static HiAnalyticsUtil sInstance;
    private static HiAnalyticsUtils sUtilsInstance;

    static {
        C0201.m83(HiAnalyticsUtil.class, 434);
    }

    private String genValue(Context context, String str) {
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(17831));
        sb.append(C0201.m82(17832));
        String r2 = C0201.m82(17833);
        sb.append(r2);
        sb.append(packageName);
        sb.append(r2);
        sb.append(Util.getAppId(context));
        sb.append(r2);
        sb.append(50004301);
        sb.append(r2);
        sb.append(str);
        return sb.toString();
    }

    public static HiAnalyticsUtil getInstance() {
        HiAnalyticsUtil hiAnalyticsUtil;
        synchronized (LOCK_INST) {
            if (sInstance == null) {
                sInstance = new HiAnalyticsUtil();
                sUtilsInstance = HiAnalyticsUtils.getInstance();
            }
            hiAnalyticsUtil = sInstance;
        }
        return hiAnalyticsUtil;
    }

    public static Map<String, String> getMapFromForegroundResponseHeader(ResponseHeader responseHeader) {
        HashMap hashMap = new HashMap();
        if (responseHeader == null) {
            return hashMap;
        }
        hashMap.put(C0201.m82(17834), responseHeader.getTransactionId());
        hashMap.put(C0201.m82(17835), responseHeader.getActualAppID());
        hashMap.put(C0201.m82(17836), responseHeader.getSrvName());
        hashMap.put(C0201.m82(17837), responseHeader.getApiName());
        hashMap.put(C0201.m82(17838), responseHeader.getPkgName());
        hashMap.put(C0201.m82(17839), String.valueOf(responseHeader.getStatusCode()));
        hashMap.put(C0201.m82(17840), String.valueOf(responseHeader.getErrorCode()));
        hashMap.put(C0201.m82(17841), responseHeader.getErrorReason());
        hashMap.put(C0201.m82(17842), String.valueOf(System.currentTimeMillis()));
        hashMap.put(C0201.m82(17843), C0201.m82(17844));
        return hashMap;
    }

    public static Map<String, String> getMapFromRequestHeader(ResponseHeader responseHeader) {
        HashMap hashMap = new HashMap();
        if (responseHeader == null) {
            return hashMap;
        }
        hashMap.put(C0201.m82(17845), responseHeader.getTransactionId());
        hashMap.put(C0201.m82(17846), responseHeader.getActualAppID());
        hashMap.put(C0201.m82(17847), responseHeader.getSrvName());
        String apiName = responseHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] split = apiName.split(C0201.m82(17848));
            if (split.length >= 2) {
                hashMap.put(C0201.m82(17849), split[1]);
            }
        }
        hashMap.put(C0201.m82(17850), responseHeader.getPkgName());
        hashMap.put(C0201.m82(17851), String.valueOf(responseHeader.getStatusCode()));
        hashMap.put(C0201.m82(17852), String.valueOf(responseHeader.getErrorCode()));
        hashMap.put(C0201.m82(17853), responseHeader.getErrorReason());
        hashMap.put(C0201.m82(17854), String.valueOf(System.currentTimeMillis()));
        hashMap.put(C0201.m82(17855), C0201.m82(17856));
        return hashMap;
    }

    public static String versionCodeToName(String str) {
        return HiAnalyticsUtils.versionCodeToName(str);
    }

    @Deprecated
    public Map<String, String> getMapForBi(Context context, String str) {
        HashMap hashMap = new HashMap();
        String[] split = str.split(C0201.m82(17857));
        if (split.length >= 2) {
            String str2 = split[0];
            String str3 = split[1];
            String appId = Util.getAppId(context);
            hashMap.put(C0201.m82(17858), TransactionIdCreater.getId(appId, str));
            hashMap.put(C0201.m82(17859), appId);
            hashMap.put(C0201.m82(17860), str2);
            hashMap.put(C0201.m82(17861), str3);
            hashMap.put(C0201.m82(17862), context.getPackageName());
            hashMap.put(C0201.m82(17863), C0201.m82(17864));
            hashMap.put(C0201.m82(17865), String.valueOf(System.currentTimeMillis()));
        }
        return hashMap;
    }

    public Map<String, String> getMapFromForegroundRequestHeader(RequestHeader requestHeader) {
        HashMap hashMap = new HashMap();
        if (requestHeader == null) {
            return hashMap;
        }
        hashMap.put(C0201.m82(17866), requestHeader.getTransactionId());
        hashMap.put(C0201.m82(17867), requestHeader.getActualAppID());
        hashMap.put(C0201.m82(17868), requestHeader.getSrvName());
        hashMap.put(C0201.m82(17869), requestHeader.getApiName());
        hashMap.put(C0201.m82(17870), requestHeader.getPkgName());
        hashMap.put(C0201.m82(17871), String.valueOf(System.currentTimeMillis()));
        hashMap.put(C0201.m82(17872), C0201.m82(17873));
        return hashMap;
    }

    @Deprecated
    public boolean hasError() {
        if (SystemUtils.isChinaROM()) {
            return false;
        }
        HMSLog.i(C0201.m82(17883), C0201.m82(17884));
        return true;
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        sUtilsInstance.onBuoyEvent(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        sUtilsInstance.onEvent(context, str, map);
    }

    public void onEvent2(Context context, String str, String str2) {
        sUtilsInstance.onEvent2(context, str, str2);
    }

    public void onNewEvent(Context context, String str, Map map) {
        sUtilsInstance.onNewEvent(context, str, map);
    }

    public void onEvent(Context context, String str, String str2) {
        if (context != null) {
            onEvent2(context, str, genValue(context, str2));
        }
    }

    public boolean hasError(Context context) {
        return sUtilsInstance.hasError(context);
    }

    public Map<String, String> getMapFromRequestHeader(RequestHeader requestHeader) {
        HashMap hashMap = new HashMap();
        if (requestHeader == null) {
            return hashMap;
        }
        hashMap.put(C0201.m82(17874), requestHeader.getTransactionId());
        hashMap.put(C0201.m82(17875), requestHeader.getActualAppID());
        hashMap.put(C0201.m82(17876), requestHeader.getSrvName());
        String apiName = requestHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] split = apiName.split(C0201.m82(17877));
            if (split.length >= 2) {
                hashMap.put(C0201.m82(17878), split[1]);
            }
        }
        hashMap.put(C0201.m82(17879), requestHeader.getPkgName());
        hashMap.put(C0201.m82(17880), String.valueOf(System.currentTimeMillis()));
        hashMap.put(C0201.m82(17881), C0201.m82(17882));
        return hashMap;
    }
}
