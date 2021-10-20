package com.huawei.hms.rn.location.backend.logger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import vigqyno.C0201;

public final class HMSLogger {
    private static final String NETWORK_TYPE_WIFI = null;
    private static final String NOT_AVAILABLE = null;
    private static final String PERIODIC_EVENT_ID = null;
    private static final String SERVICE = null;
    private static final String SINGLE_EVENT_ID = null;
    private static final String SUCCESS = null;
    private static final String TAG = null;
    private static final String UNKNOWN = null;
    private static final String VERSION = null;
    private static volatile HMSLogger instance;
    private final Map<String, Long> allCountMap = new HashMap();
    private final Map<String, Long> failCountMap = new HashMap();
    private final Map<String, Long> firstReceiveTimeMap = new HashMap();
    private final HiAnalyticsUtils hiAnalyticsUtils;
    private boolean isEnabled = true;
    private final Map<String, Long> lastReceiveTimeMap = new HashMap();
    private final Map<Integer, String> networkTypeMap = createNetworkTypeMap();
    private final Map<String, Object> periodicEventMap = new HashMap();
    private final Map<String, Map<String, Long>> resultCodeCountMap = new HashMap();
    private final Map<String, Object> singleEventMap = new HashMap();
    private final Map<String, Long> startTimeMap = new HashMap();
    private final WeakReference<Context> weakContext;

    static {
        C0201.m83(HMSLogger.class, 437);
    }

    private HMSLogger(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.hiAnalyticsUtils = HiAnalyticsUtils.getInstance();
        setupEventMap(this.singleEventMap);
        setupEventMap(this.periodicEventMap);
        initHMSBI(HMSBIInitializer.getInstance(context));
        Log.d(C0201.m82(30579), C0201.m82(30580));
    }

    private Map<Integer, String> createNetworkTypeMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, C0201.m82(30581));
        hashMap.put(1, C0201.m82(30582));
        hashMap.put(2, C0201.m82(30583));
        String r2 = C0201.m82(30584);
        hashMap.put(3, r2);
        String r3 = C0201.m82(30585);
        hashMap.put(4, r3);
        hashMap.put(5, r2);
        hashMap.put(6, r2);
        hashMap.put(7, r3);
        hashMap.put(8, r2);
        hashMap.put(9, r2);
        hashMap.put(10, r2);
        hashMap.put(11, r3);
        hashMap.put(12, r2);
        String r4 = C0201.m82(30586);
        hashMap.put(13, r4);
        hashMap.put(14, r2);
        hashMap.put(15, r2);
        hashMap.put(16, r3);
        hashMap.put(17, r2);
        hashMap.put(18, r4);
        hashMap.put(19, r4);
        hashMap.put(20, C0201.m82(30587));
        return Collections.unmodifiableMap(hashMap);
    }

    private String getAppId() {
        try {
            return ib2.a(getContext()).c(C0201.m82(30588));
        } catch (NullPointerException unused) {
            Log.d(C0201.m82(30589), C0201.m82(30590));
            return C0201.m82(30591);
        }
    }

    private String getAppVersionName(String str) {
        try {
            return getContext().getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(C0201.m82(30592), C0201.m82(30593));
            return C0201.m82(30594);
        }
    }

    private Context getContext() {
        return this.weakContext.get();
    }

    public static synchronized HMSLogger getInstance(Context context) {
        HMSLogger hMSLogger;
        synchronized (HMSLogger.class) {
            if (instance == null) {
                synchronized (HMSLogger.class) {
                    if (instance == null) {
                        instance = new HMSLogger(context);
                    }
                }
            }
            hMSLogger = instance;
        }
        return hMSLogger;
    }

    private String getNetworkType() {
        ConnectivityManager connectivityManager = (ConnectivityManager) objectCast(getContext().getSystemService(C0201.m82(30595)), ConnectivityManager.class);
        String r1 = C0201.m82(30596);
        if (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            return r1;
        }
        int subtype = ((NetworkInfo) Objects.requireNonNull(connectivityManager.getActiveNetworkInfo())).getSubtype();
        Map<Integer, String> map = this.networkTypeMap;
        Integer valueOf = Integer.valueOf(subtype);
        String r4 = C0201.m82(30597);
        String str = (String) getOrDefault(map, valueOf, r4);
        int i = Build.VERSION.SDK_INT;
        String r6 = C0201.m82(30598);
        if (i >= 23) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return r1;
            }
            if (networkCapabilities.hasTransport(0)) {
                return str;
            }
            return networkCapabilities.hasTransport(1) ? r6 : r4;
        }
        int type = ((NetworkInfo) Objects.requireNonNull(connectivityManager.getActiveNetworkInfo())).getType();
        if (type != 0) {
            return type != 1 ? r4 : r6;
        }
        return str;
    }

    private <K, V> V getOrDefault(Map<K, V> map, K k, V v) {
        return map.containsKey(k) ? map.get(k) : v;
    }

    private void increaseMapValue(String str, Map<String, Long> map) {
        map.put(str, Long.valueOf(((Long) getOrDefault(map, str, 0L)).longValue() + 1));
    }

    private void increaseResultCodeCount(String str, String str2) {
        Map<String, Long> map = (Map) getOrDefault(this.resultCodeCountMap, str, new HashMap());
        increaseMapValue(str2, map);
        this.resultCodeCountMap.put(str, map);
    }

    private void initHMSBI(HMSBIInitializer hMSBIInitializer) {
        if (!hMSBIInitializer.isInit()) {
            hMSBIInitializer.initBI();
        }
    }

    private <S, D> D objectCast(S s, Class<D> cls) {
        return cls.cast(s);
    }

    private <K, V> void putIfAbsent(Map<K, V> map, K k, V v) {
        if (!map.containsKey(k)) {
            map.put(k, v);
        }
    }

    private void putToPeriodicEventMap(String str, String str2, long j) {
        increaseResultCodeCount(str, str2);
        increaseMapValue(str, this.allCountMap);
        if (!str2.equals(C0201.m82(30599))) {
            increaseMapValue(str, this.failCountMap);
        }
        long longValue = ((Long) getOrDefault(this.firstReceiveTimeMap, str, Long.valueOf(j))).longValue();
        this.periodicEventMap.put(C0201.m82(30600), Long.valueOf(longValue));
        int longValue2 = (int) (j - ((Long) getOrDefault(this.lastReceiveTimeMap, str, Long.valueOf(j))).longValue());
        this.periodicEventMap.put(C0201.m82(30601), Integer.valueOf(longValue2));
        this.periodicEventMap.put(C0201.m82(30602), str);
        this.periodicEventMap.put(C0201.m82(30603), this.resultCodeCountMap.get(str));
        long longValue3 = ((Long) getOrDefault(this.allCountMap, str, 0L)).longValue();
        this.periodicEventMap.put(C0201.m82(30604), Long.valueOf(longValue3));
        long longValue4 = ((Long) getOrDefault(this.failCountMap, str, 0L)).longValue();
        this.periodicEventMap.put(C0201.m82(30605), Long.valueOf(longValue4));
        this.periodicEventMap.put(C0201.m82(30606), Long.valueOf(j));
        this.periodicEventMap.put(C0201.m82(30607), getNetworkType());
        putIfAbsent(this.firstReceiveTimeMap, str, Long.valueOf(j));
        this.lastReceiveTimeMap.put(str, Long.valueOf(j));
    }

    private void putToSingleEventMap(String str, String str2, long j) {
        int longValue = (int) (j - ((Long) getOrDefault(this.startTimeMap, str, Long.valueOf(j))).longValue());
        this.singleEventMap.put(C0201.m82(30608), str);
        this.singleEventMap.put(C0201.m82(30609), str2);
        this.singleEventMap.put(C0201.m82(30610), Long.valueOf(j));
        this.singleEventMap.put(C0201.m82(30611), Integer.valueOf(longValue));
        this.singleEventMap.put(C0201.m82(30612), getNetworkType());
    }

    private synchronized void sendEvent(String str, String str2, String str3) {
        if (this.isEnabled) {
            long currentTimeMillis = System.currentTimeMillis();
            if (str.equals(C0201.m82(30613))) {
                putToSingleEventMap(str2, str3, currentTimeMillis);
                this.hiAnalyticsUtils.onNewEvent(getContext(), C0201.m82(30614), this.singleEventMap);
                String r5 = C0201.m82(30615);
                Log.d(r5, C0201.m82(30616) + this.singleEventMap);
            } else {
                putToPeriodicEventMap(str2, str3, currentTimeMillis);
                this.hiAnalyticsUtils.onNewEvent(getContext(), C0201.m82(30617), this.periodicEventMap);
                String r52 = C0201.m82(30618);
                Log.d(r52, C0201.m82(30619) + this.periodicEventMap);
            }
        }
    }

    private void setupEventMap(Map<String, Object> map) {
        map.put(C0201.m82(30620), C0201.m82(30621));
        map.put(C0201.m82(30622), C0201.m82(30623));
        map.put(C0201.m82(30624), getAppId());
        map.put(C0201.m82(30625), getContext().getPackageName());
        map.put(C0201.m82(30626), getAppVersionName(getContext().getPackageName()));
        map.put(C0201.m82(30627), Build.DEVICE);
    }

    public synchronized void disableLogger() {
        this.isEnabled = false;
        Log.d(C0201.m82(30628), C0201.m82(30629));
    }

    public synchronized void enableLogger() {
        this.isEnabled = true;
        Log.d(C0201.m82(30630), C0201.m82(30631));
    }

    public synchronized void sendPeriodicEvent(String str) {
        sendEvent(C0201.m82(30632), str, C0201.m82(30633));
    }

    public synchronized void sendSingleEvent(String str) {
        sendEvent(C0201.m82(30635), str, C0201.m82(30636));
    }

    public synchronized void startMethodExecutionTimer(String str) {
        this.startTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public synchronized void sendPeriodicEvent(String str, String str2) {
        sendEvent(C0201.m82(30634), str, str2);
    }

    public synchronized void sendSingleEvent(String str, String str2) {
        sendEvent(C0201.m82(30637), str, str2);
    }
}
