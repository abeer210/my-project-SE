package com.huawei.hms.rn.map.logger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
    private final ConnectivityManager connectivityManager;
    private final Map<String, Long> failCountMap = new HashMap();
    private final Map<String, Long> firstReceiveTimeMap = new HashMap();
    private final HiAnalyticsUtils hiAnalyticsUtils;
    private boolean isEnabled = false;
    private final Map<String, Long> lastReceiveTimeMap = new HashMap();
    private final Map<Integer, String> networkTypeMap = createNetworkTypeMap();
    private final Map<String, Object> periodicEventMap = new HashMap();
    private final Map<String, Map<String, Long>> resultCodeCountMap = new HashMap();
    private final Map<String, Object> singleEventMap = new HashMap();
    private final Map<String, Long> startTimeMap = new HashMap();
    private final WeakReference<Context> weakContext;

    static {
        C0201.m83(HMSLogger.class, 347);
    }

    private HMSLogger(Context context) {
        this.weakContext = new WeakReference<>(context);
        this.hiAnalyticsUtils = HiAnalyticsUtils.getInstance();
        this.connectivityManager = (ConnectivityManager) objectCast(context.getSystemService(C0201.m82(22124)), ConnectivityManager.class);
        initHMSBI(HMSBIInitializer.getInstance(context));
        setupEventMap(this.singleEventMap);
        setupEventMap(this.periodicEventMap);
        enableLogger();
    }

    private Map<Integer, String> createNetworkTypeMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, C0201.m82(22125));
        String r2 = C0201.m82(22126);
        hashMap.put(1, r2);
        hashMap.put(2, r2);
        String r3 = C0201.m82(22127);
        hashMap.put(3, r3);
        hashMap.put(4, r3);
        hashMap.put(5, r3);
        hashMap.put(6, r3);
        hashMap.put(7, r2);
        hashMap.put(8, r3);
        hashMap.put(9, r3);
        hashMap.put(10, r3);
        hashMap.put(11, r2);
        hashMap.put(12, r3);
        String r4 = C0201.m82(22128);
        hashMap.put(13, r4);
        hashMap.put(14, r3);
        hashMap.put(15, r3);
        hashMap.put(16, r2);
        hashMap.put(17, r3);
        hashMap.put(18, r3);
        hashMap.put(19, r4);
        hashMap.put(20, C0201.m82(22129));
        return Collections.unmodifiableMap(hashMap);
    }

    private String getAppId() {
        try {
            return ib2.a(getContext()).c(C0201.m82(22130));
        } catch (NullPointerException unused) {
            Log.d(C0201.m82(22131), C0201.m82(22132));
            return C0201.m82(22133);
        }
    }

    private String getAppVersionName(String str) {
        try {
            return getContext().getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(C0201.m82(22134), C0201.m82(22135));
            return C0201.m82(22136);
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
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        String r1 = C0201.m82(22137);
        if (connectivityManager2 == null || (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return r1;
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return C0201.m82(22138);
        }
        String r2 = C0201.m82(22139);
        return type == 0 ? (String) getOrDefault(this.networkTypeMap, Integer.valueOf(activeNetworkInfo.getSubtype()), r2) : r2;
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
        if (!str2.equals(C0201.m82(22140))) {
            increaseMapValue(str, this.failCountMap);
        }
        long longValue = ((Long) getOrDefault(this.firstReceiveTimeMap, str, Long.valueOf(j))).longValue();
        this.periodicEventMap.put(C0201.m82(22141), Long.valueOf(longValue));
        int longValue2 = (int) (j - ((Long) getOrDefault(this.lastReceiveTimeMap, str, Long.valueOf(j))).longValue());
        this.periodicEventMap.put(C0201.m82(22142), Integer.valueOf(longValue2));
        this.periodicEventMap.put(C0201.m82(22143), str);
        this.periodicEventMap.put(C0201.m82(22144), this.resultCodeCountMap.get(str));
        long longValue3 = ((Long) getOrDefault(this.allCountMap, str, 0L)).longValue();
        this.periodicEventMap.put(C0201.m82(22145), Long.valueOf(longValue3));
        long longValue4 = ((Long) getOrDefault(this.failCountMap, str, 0L)).longValue();
        this.periodicEventMap.put(C0201.m82(22146), Long.valueOf(longValue4));
        this.periodicEventMap.put(C0201.m82(22147), Long.valueOf(j));
        this.periodicEventMap.put(C0201.m82(22148), getNetworkType());
        putIfAbsent(this.firstReceiveTimeMap, str, Long.valueOf(j));
        this.lastReceiveTimeMap.put(str, Long.valueOf(j));
    }

    private void putToSingleEventMap(String str, String str2, long j) {
        int longValue = (int) (j - ((Long) getOrDefault(this.startTimeMap, str, Long.valueOf(j))).longValue());
        this.singleEventMap.put(C0201.m82(22149), str);
        this.singleEventMap.put(C0201.m82(22150), str2);
        this.singleEventMap.put(C0201.m82(22151), Long.valueOf(j));
        this.singleEventMap.put(C0201.m82(22152), Integer.valueOf(longValue));
        this.singleEventMap.put(C0201.m82(22153), getNetworkType());
    }

    private synchronized void sendEvent(String str, String str2, String str3) {
        if (this.isEnabled) {
            long currentTimeMillis = System.currentTimeMillis();
            if (str.equals(C0201.m82(22154))) {
                putToSingleEventMap(str2, str3, currentTimeMillis);
                this.hiAnalyticsUtils.onNewEvent(getContext(), C0201.m82(22155), this.singleEventMap);
                String r5 = C0201.m82(22156);
                Log.d(r5, C0201.m82(22157) + this.singleEventMap);
            } else {
                putToPeriodicEventMap(str2, str3, currentTimeMillis);
                this.hiAnalyticsUtils.onNewEvent(getContext(), C0201.m82(22158), this.periodicEventMap);
                String r52 = C0201.m82(22159);
                Log.d(r52, C0201.m82(22160) + this.periodicEventMap);
            }
        }
    }

    private void setupEventMap(Map<String, Object> map) {
        map.put(C0201.m82(22161), C0201.m82(22162));
        map.put(C0201.m82(22163), C0201.m82(22164));
        map.put(C0201.m82(22165), getAppId());
        map.put(C0201.m82(22166), getContext().getPackageName());
        map.put(C0201.m82(22167), getAppVersionName(getContext().getPackageName()));
        map.put(C0201.m82(22168), Build.DEVICE);
    }

    public synchronized void disableLogger() {
        this.isEnabled = false;
        Log.d(C0201.m82(22169), C0201.m82(22170));
    }

    public synchronized void enableLogger() {
        this.isEnabled = true;
        Log.d(C0201.m82(22171), C0201.m82(22172));
    }

    public synchronized void sendPeriodicEvent(String str) {
        sendEvent(C0201.m82(22173), str, C0201.m82(22174));
    }

    public synchronized void sendSingleEvent(String str) {
        sendEvent(C0201.m82(22176), str, C0201.m82(22177));
    }

    public synchronized void startMethodExecutionTimer(String str) {
        this.startTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public synchronized void sendPeriodicEvent(String str, String str2) {
        sendEvent(C0201.m82(22175), str, str2);
    }

    public synchronized void sendSingleEvent(String str, String str2) {
        sendEvent(C0201.m82(22178), str, str2);
    }
}
