package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "RNDeviceInfo")
public class RNDeviceModule extends ReactContextBaseJavaModule {
    private static String BATTERY_LEVEL;
    private static String BATTERY_STATE;
    private static String LOW_POWER_MODE;
    public static final String NAME = null;
    private final ad2 deviceIdResolver;
    private final bd2 deviceTypeResolver;
    private BroadcastReceiver headphoneConnectionReceiver;
    private c installReferrerClient;
    private double mLastBatteryLevel = -1.0d;
    private String mLastBatteryState = C0201.m82(18571);
    private boolean mLastPowerSaveState = false;
    private BroadcastReceiver receiver;

    class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            WritableMap powerStateFromIntent = RNDeviceModule.this.getPowerStateFromIntent(intent);
            if (powerStateFromIntent != null) {
                String string = powerStateFromIntent.getString(RNDeviceModule.BATTERY_STATE);
                Double valueOf = Double.valueOf(powerStateFromIntent.getDouble(RNDeviceModule.BATTERY_LEVEL));
                Boolean valueOf2 = Boolean.valueOf(powerStateFromIntent.getBoolean(RNDeviceModule.LOW_POWER_MODE));
                if (!RNDeviceModule.this.mLastBatteryState.equalsIgnoreCase(string) || RNDeviceModule.this.mLastPowerSaveState != valueOf2.booleanValue()) {
                    RNDeviceModule rNDeviceModule = RNDeviceModule.this;
                    rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), C0201.m82(28769), string);
                    RNDeviceModule.this.mLastBatteryState = string;
                    RNDeviceModule.this.mLastPowerSaveState = valueOf2.booleanValue();
                }
                if (RNDeviceModule.this.mLastBatteryLevel != valueOf.doubleValue()) {
                    RNDeviceModule rNDeviceModule2 = RNDeviceModule.this;
                    rNDeviceModule2.sendEvent(rNDeviceModule2.getReactApplicationContext(), C0201.m82(28770), valueOf);
                    if (valueOf.doubleValue() <= 0.15d) {
                        RNDeviceModule rNDeviceModule3 = RNDeviceModule.this;
                        rNDeviceModule3.sendEvent(rNDeviceModule3.getReactApplicationContext(), C0201.m82(28771), valueOf);
                    }
                    RNDeviceModule.this.mLastBatteryLevel = valueOf.doubleValue();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            boolean isHeadphonesConnectedSync = RNDeviceModule.this.isHeadphonesConnectedSync();
            RNDeviceModule rNDeviceModule = RNDeviceModule.this;
            rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), C0201.m82(28714), Boolean.valueOf(isHeadphonesConnectedSync));
        }
    }

    static {
        C0201.m83(RNDeviceModule.class, 249);
    }

    public RNDeviceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.deviceTypeResolver = new bd2(reactApplicationContext);
        this.deviceIdResolver = new ad2(reactApplicationContext);
        this.installReferrerClient = new c(reactApplicationContext.getBaseContext());
    }

    private long getBlockSize(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getBlockSizeLong() : (long) statFs.getBlockSize();
    }

    private BigInteger getDirTotalCapacity(StatFs statFs) {
        boolean z = Build.VERSION.SDK_INT >= 18;
        return BigInteger.valueOf(z ? statFs.getBlockCountLong() : (long) statFs.getBlockCount()).multiply(BigInteger.valueOf(z ? statFs.getBlockSizeLong() : (long) statFs.getBlockSize()));
    }

    private PackageInfo getPackageInfo() throws Exception {
        return getReactApplicationContext().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WritableMap getPowerStateFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra(C0201.m82(18572), -1);
        int intExtra2 = intent.getIntExtra(C0201.m82(18573), -1);
        int intExtra3 = intent.getIntExtra(C0201.m82(18574), -1);
        int intExtra4 = intent.getIntExtra(C0201.m82(18575), -1);
        float f = ((float) intExtra) / ((float) intExtra2);
        String r6 = intExtra3 == 0 ? C0201.m82(18576) : intExtra4 == 2 ? C0201.m82(18577) : intExtra4 == 5 ? C0201.m82(18578) : C0201.m82(18579);
        PowerManager powerManager = (PowerManager) getReactApplicationContext().getSystemService(C0201.m82(18580));
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = powerManager.isPowerSaveMode();
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(BATTERY_STATE, r6);
        createMap.putDouble(BATTERY_LEVEL, (double) f);
        createMap.putBoolean(LOW_POWER_MODE, z);
        return createMap;
    }

    private long getTotalAvailableBlocks(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getAvailableBlocksLong() : (long) statFs.getAvailableBlocks();
    }

    @SuppressLint({"MissingPermission"})
    private WifiInfo getWifiInfo() {
        WifiManager wifiManager = (WifiManager) getReactApplicationContext().getApplicationContext().getSystemService(C0201.m82(18581));
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo();
        }
        return null;
    }

    private void initializeHeadphoneConnectionReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0201.m82(18582));
        intentFilter.addAction(C0201.m82(18583));
        this.headphoneConnectionReceiver = new b();
        getReactApplicationContext().registerReceiver(this.headphoneConnectionReceiver, intentFilter);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void getAndroidId(Promise promise) {
        promise.resolve(getAndroidIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getAndroidIdSync() {
        return getUniqueIdSync();
    }

    @ReactMethod
    public void getApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(getApiLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getApiLevelSync() {
        return Build.VERSION.SDK_INT;
    }

    @ReactMethod
    public void getAvailableLocationProviders(Promise promise) {
        promise.resolve(getAvailableLocationProvidersSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAvailableLocationProvidersSync() {
        LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(C0201.m82(18584));
        WritableMap createMap = Arguments.createMap();
        try {
            for (String str : locationManager.getProviders(false)) {
                createMap.putBoolean(str, locationManager.isProviderEnabled(str));
            }
        } catch (Exception unused) {
            System.err.println(C0201.m82(18585));
        }
        return createMap;
    }

    @ReactMethod
    public void getBaseOs(Promise promise) {
        promise.resolve(getBaseOsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBaseOsSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.BASE_OS : C0201.m82(18586);
    }

    @ReactMethod
    public void getBatteryLevel(Promise promise) {
        promise.resolve(Double.valueOf(getBatteryLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getBatteryLevelSync() {
        WritableMap powerStateFromIntent = getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter(C0201.m82(18587))));
        if (powerStateFromIntent == null) {
            return 0.0d;
        }
        return powerStateFromIntent.getDouble(BATTERY_LEVEL);
    }

    @ReactMethod
    public void getBootloader(Promise promise) {
        promise.resolve(getBootloaderSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBootloaderSync() {
        return Build.BOOTLOADER;
    }

    @ReactMethod
    public void getBuildId(Promise promise) {
        promise.resolve(getBuildIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBuildIdSync() {
        return Build.ID;
    }

    @ReactMethod
    public void getCarrier(Promise promise) {
        promise.resolve(getCarrierSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCarrierSync() {
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(C0201.m82(18588));
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        System.err.println(C0201.m82(18589));
        return C0201.m82(18590);
    }

    @ReactMethod
    public void getCodename(Promise promise) {
        promise.resolve(getCodenameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCodenameSync() {
        return Build.VERSION.CODENAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String str;
        String str2;
        String r0 = C0201.m82(18591);
        try {
            String str3 = getPackageInfo().versionName;
            str = Integer.toString(getPackageInfo().versionCode);
            str2 = getReactApplicationContext().getApplicationInfo().loadLabel(getReactApplicationContext().getPackageManager()).toString();
            r0 = str3;
        } catch (Exception unused) {
            str2 = r0;
            str = str2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(18592), getUniqueIdSync());
        hashMap.put(C0201.m82(18593), Build.BOARD);
        hashMap.put(C0201.m82(18594), getReactApplicationContext().getPackageName());
        hashMap.put(C0201.m82(18595), C0201.m82(18596));
        hashMap.put(C0201.m82(18597), Build.VERSION.RELEASE);
        hashMap.put(C0201.m82(18598), r0);
        hashMap.put(C0201.m82(18599), str);
        hashMap.put(C0201.m82(18600), Boolean.valueOf(this.deviceTypeResolver.d()));
        hashMap.put(C0201.m82(18601), str2);
        hashMap.put(C0201.m82(18602), Build.BRAND);
        hashMap.put(C0201.m82(18603), Build.MODEL);
        hashMap.put(C0201.m82(18604), this.deviceTypeResolver.a().b());
        return hashMap;
    }

    @ReactMethod
    public void getDevice(Promise promise) {
        promise.resolve(getDeviceSync());
    }

    @ReactMethod
    public void getDeviceName(Promise promise) {
        promise.resolve(getDeviceNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceNameSync() {
        String string;
        try {
            String string2 = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), C0201.m82(18605));
            if (string2 != null) {
                return string2;
            }
            if (Build.VERSION.SDK_INT >= 25 && (string = Settings.Global.getString(getReactApplicationContext().getContentResolver(), C0201.m82(18606))) != null) {
                return string;
            }
            return C0201.m82(18607);
        } catch (Exception unused) {
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceSync() {
        return Build.DEVICE;
    }

    @ReactMethod
    public void getDisplay(Promise promise) {
        promise.resolve(getDisplaySync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDisplaySync() {
        return Build.DISPLAY;
    }

    @ReactMethod
    public void getFingerprint(Promise promise) {
        promise.resolve(getFingerprintSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFingerprintSync() {
        return Build.FINGERPRINT;
    }

    @ReactMethod
    public void getFirstInstallTime(Promise promise) {
        promise.resolve(Double.valueOf(getFirstInstallTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFirstInstallTimeSync() {
        try {
            return (double) getPackageInfo().firstInstallTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getFontScale(Promise promise) {
        promise.resolve(Float.valueOf(getFontScaleSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getFontScaleSync() {
        return getReactApplicationContext().getResources().getConfiguration().fontScale;
    }

    @ReactMethod
    public void getFreeDiskStorage(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageSync()));
    }

    @ReactMethod
    public void getFreeDiskStorageOld(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageOldSync() {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (Build.VERSION.SDK_INT < 18) {
                j2 = (long) statFs.getAvailableBlocks();
                j = (long) statFs.getBlockSize();
            } else {
                j2 = statFs.getAvailableBlocksLong();
                j = statFs.getBlockSizeLong();
            }
            return BigInteger.valueOf(j2).multiply(BigInteger.valueOf(j)).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            Boolean valueOf = Boolean.valueOf(Build.VERSION.SDK_INT >= 18);
            return BigInteger.valueOf(getTotalAvailableBlocks(statFs, valueOf)).multiply(BigInteger.valueOf(getBlockSize(statFs, valueOf))).doubleValue() + BigInteger.valueOf(getTotalAvailableBlocks(statFs2, valueOf)).multiply(BigInteger.valueOf(getBlockSize(statFs2, valueOf))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getHardware(Promise promise) {
        promise.resolve(getHardwareSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHardwareSync() {
        return Build.HARDWARE;
    }

    @ReactMethod
    public void getHost(Promise promise) {
        promise.resolve(getHostSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHostSync() {
        return Build.HOST;
    }

    @ReactMethod
    public void getIncremental(Promise promise) {
        promise.resolve(getIncrementalSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIncrementalSync() {
        return Build.VERSION.INCREMENTAL;
    }

    @ReactMethod
    public void getInstallReferrer(Promise promise) {
        promise.resolve(getInstallReferrerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallReferrerSync() {
        return getReactApplicationContext().getSharedPreferences(C0201.m82(18608), 0).getString(C0201.m82(18609), C0201.m82(18610));
    }

    @ReactMethod
    public void getInstallerPackageName(Promise promise) {
        promise.resolve(getInstallerPackageNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallerPackageNameSync() {
        String installerPackageName = getReactApplicationContext().getPackageManager().getInstallerPackageName(getReactApplicationContext().getPackageName());
        return installerPackageName == null ? C0201.m82(18611) : installerPackageName;
    }

    @ReactMethod
    public void getInstanceId(Promise promise) {
        promise.resolve(getInstanceIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstanceIdSync() {
        return this.deviceIdResolver.c();
    }

    @ReactMethod
    public void getIpAddress(Promise promise) {
        promise.resolve(getIpAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIpAddressSync() {
        try {
            return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(getWifiInfo().getIpAddress()).array()).getHostAddress();
        } catch (Exception unused) {
            return C0201.m82(18612);
        }
    }

    @ReactMethod
    public void getLastUpdateTime(Promise promise) {
        promise.resolve(Double.valueOf(getLastUpdateTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getLastUpdateTimeSync() {
        try {
            return (double) getPackageInfo().lastUpdateTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getMacAddress(Promise promise) {
        promise.resolve(getMacAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getMacAddressSync() {
        WifiInfo wifiInfo = getWifiInfo();
        String r1 = C0201.m82(18613);
        String macAddress = wifiInfo != null ? wifiInfo.getMacAddress() : r1;
        if (getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(18614)) == 0) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface.getName().equalsIgnoreCase(C0201.m82(18615))) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            macAddress = r1;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (byte b2 : hardwareAddress) {
                                sb.append(String.format(C0201.m82(18616), Byte.valueOf(b2)));
                            }
                            if (sb.length() > 0) {
                                sb.deleteCharAt(sb.length() - 1);
                            }
                            macAddress = sb.toString();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return macAddress;
    }

    @ReactMethod
    public void getMaxMemory(Promise promise) {
        promise.resolve(Double.valueOf(getMaxMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getMaxMemorySync() {
        return (double) Runtime.getRuntime().maxMemory();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(18617);
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        promise.resolve(getPhoneNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String getPhoneNumberSync() {
        if (getReactApplicationContext() != null && (getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(18618)) == 0 || ((Build.VERSION.SDK_INT >= 23 && getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(18619)) == 0) || (Build.VERSION.SDK_INT >= 26 && getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(18620)) == 0)))) {
            TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(C0201.m82(18621));
            if (telephonyManager != null) {
                return telephonyManager.getLine1Number();
            }
            System.err.println(C0201.m82(18622));
        }
        return C0201.m82(18623);
    }

    @ReactMethod
    public void getPowerState(Promise promise) {
        promise.resolve(getPowerStateSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPowerStateSync() {
        return getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter(C0201.m82(18624))));
    }

    @ReactMethod
    public void getPreviewSdkInt(Promise promise) {
        promise.resolve(getPreviewSdkIntSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPreviewSdkIntSync() {
        return Build.VERSION.SDK_INT >= 23 ? Integer.toString(Build.VERSION.PREVIEW_SDK_INT) : C0201.m82(18625);
    }

    @ReactMethod
    public void getProduct(Promise promise) {
        promise.resolve(getProductSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProductSync() {
        return Build.PRODUCT;
    }

    @ReactMethod
    public void getSecurityPatch(Promise promise) {
        promise.resolve(getSecurityPatchSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSecurityPatchSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.SECURITY_PATCH : C0201.m82(18626);
    }

    @ReactMethod
    public void getSerialNumber(Promise promise) {
        promise.resolve(getSerialNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String getSerialNumberSync() {
        try {
            if (Build.VERSION.SDK_INT >= 26 && getReactApplicationContext().checkCallingOrSelfPermission(C0201.m82(18627)) == 0) {
                return Build.getSerial();
            }
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println(C0201.m82(18628) + e.getMessage());
        }
        return C0201.m82(18629);
    }

    @ReactMethod
    public void getSupported32BitAbis(Promise promise) {
        promise.resolve(getSupported32BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported32BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_32_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupported64BitAbis(Promise promise) {
        promise.resolve(getSupported64BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported64BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_64_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupportedAbis(Promise promise) {
        promise.resolve(getSupportedAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupportedAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                writableNativeArray.pushString(str);
            }
        } else {
            writableNativeArray.pushString(Build.CPU_ABI);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSystemAvailableFeatures(Promise promise) {
        promise.resolve(getSystemAvailableFeaturesSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSystemAvailableFeaturesSync() {
        FeatureInfo[] systemAvailableFeatures = getReactApplicationContext().getPackageManager().getSystemAvailableFeatures();
        WritableArray createArray = Arguments.createArray();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            String str = featureInfo.name;
            if (str != null) {
                createArray.pushString(str);
            }
        }
        return createArray;
    }

    @ReactMethod
    public void getSystemManufacturer(Promise promise) {
        promise.resolve(getSystemManufacturerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemManufacturerSync() {
        return Build.MANUFACTURER;
    }

    @ReactMethod
    public void getTags(Promise promise) {
        promise.resolve(getTagsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTagsSync() {
        return Build.TAGS;
    }

    @ReactMethod
    public void getTotalDiskCapacity(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacitySync()));
    }

    @ReactMethod
    public void getTotalDiskCapacityOld(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacityOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @Deprecated
    public double getTotalDiskCapacityOldSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return BigInteger.valueOf((long) statFs.getBlockCount()).multiply(BigInteger.valueOf((long) statFs.getBlockSize())).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacitySync() {
        try {
            return getDirTotalCapacity(new StatFs(Environment.getRootDirectory().getAbsolutePath())).add(getDirTotalCapacity(new StatFs(Environment.getDataDirectory().getAbsolutePath()))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getTotalMemory(Promise promise) {
        promise.resolve(Double.valueOf(getTotalMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalMemorySync() {
        ActivityManager activityManager = (ActivityManager) getReactApplicationContext().getSystemService(C0201.m82(18630));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return (double) memoryInfo.totalMem;
        }
        System.err.println(C0201.m82(18631));
        return -1.0d;
    }

    @ReactMethod
    public void getType(Promise promise) {
        promise.resolve(getTypeSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTypeSync() {
        return Build.TYPE;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public String getUniqueIdSync() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), C0201.m82(18632));
    }

    @ReactMethod
    public void getUsedMemory(Promise promise) {
        promise.resolve(Integer.valueOf(getUsedMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getUsedMemorySync() {
        Runtime runtime = Runtime.getRuntime();
        return (int) (runtime.totalMemory() - runtime.freeMemory());
    }

    @ReactMethod
    public void getUserAgent(Promise promise) {
        promise.resolve(getUserAgentSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserAgentSync() {
        String r0 = C0201.m82(18633);
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return WebSettings.getDefaultUserAgent(getReactApplicationContext());
            }
            return System.getProperty(r0);
        } catch (RuntimeException unused) {
            return System.getProperty(r0);
        }
    }

    @ReactMethod
    public void hasGms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasGmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasGmsSync() {
        try {
            Object invoke = Class.forName(C0201.m82(18634)).getMethod(C0201.m82(18635), new Class[0]).invoke(null, new Object[0]);
            if (((Integer) invoke.getClass().getMethod(C0201.m82(18636), Context.class).invoke(invoke, getReactApplicationContext())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasHms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasHmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasHmsSync() {
        try {
            Object invoke = Class.forName(C0201.m82(18637)).getMethod(C0201.m82(18638), new Class[0]).invoke(null, new Object[0]);
            if (((Integer) invoke.getClass().getMethod(C0201.m82(18639), Context.class).invoke(invoke, getReactApplicationContext())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasSystemFeature(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(hasSystemFeatureSync(str)));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasSystemFeatureSync(String str) {
        if (str == null || str.equals(C0201.m82(18640))) {
            return false;
        }
        return getReactApplicationContext().getPackageManager().hasSystemFeature(str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0201.m82(18641));
        intentFilter.addAction(C0201.m82(18642));
        intentFilter.addAction(C0201.m82(18643));
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction(C0201.m82(18644));
        }
        this.receiver = new a();
        getReactApplicationContext().registerReceiver(this.receiver, intentFilter);
        initializeHeadphoneConnectionReceiver();
    }

    @ReactMethod
    public void isAirplaneMode(Promise promise) {
        promise.resolve(Boolean.valueOf(isAirplaneModeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAirplaneModeSync() {
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(18645);
        if (i < 17) {
            if (Settings.System.getInt(getReactApplicationContext().getContentResolver(), r2, 0) != 0) {
                return true;
            }
        } else if (Settings.Global.getInt(getReactApplicationContext().getContentResolver(), r2, 0) != 0) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isBatteryCharging(Promise promise) {
        promise.resolve(Boolean.valueOf(isBatteryChargingSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isBatteryChargingSync() {
        Intent registerReceiver = getReactApplicationContext().registerReceiver(null, new IntentFilter(C0201.m82(18646)));
        if ((registerReceiver != null ? registerReceiver.getIntExtra(C0201.m82(18647), -1) : 0) == 2) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isCameraPresent(Promise promise) {
        promise.resolve(Boolean.valueOf(isCameraPresentSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isCameraPresentSync() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                if (((CameraManager) getReactApplicationContext().getSystemService(C0201.m82(18648))).getCameraIdList().length > 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        } else if (Camera.getNumberOfCameras() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @ReactMethod
    public void isEmulator(Promise promise) {
        promise.resolve(Boolean.valueOf(isEmulatorSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressLint({"HardwareIds"})
    public boolean isEmulatorSync() {
        String str = Build.FINGERPRINT;
        String r1 = C0201.m82(18649);
        if (!str.startsWith(r1) && !Build.FINGERPRINT.startsWith(C0201.m82(18650))) {
            String str2 = Build.MODEL;
            String r2 = C0201.m82(18651);
            if (!str2.contains(r2) && !Build.MODEL.toLowerCase(Locale.ROOT).contains(C0201.m82(18652)) && !Build.MODEL.contains(C0201.m82(18653)) && !Build.MODEL.contains(C0201.m82(18654)) && !Build.MANUFACTURER.contains(C0201.m82(18655)) && !Build.HARDWARE.contains(C0201.m82(18656)) && !Build.HARDWARE.contains(C0201.m82(18657)) && !Build.HARDWARE.contains(C0201.m82(18658)) && !Build.PRODUCT.contains(C0201.m82(18659)) && !Build.PRODUCT.contains(r2) && !Build.PRODUCT.contains(C0201.m82(18660)) && !Build.PRODUCT.contains(C0201.m82(18661)) && !Build.PRODUCT.contains(C0201.m82(18662)) && !Build.PRODUCT.contains(C0201.m82(18663)) && !Build.PRODUCT.contains(C0201.m82(18664))) {
                String lowerCase = Build.BOARD.toLowerCase(Locale.ROOT);
                String r22 = C0201.m82(18665);
                return lowerCase.contains(r22) || Build.BOOTLOADER.toLowerCase(Locale.ROOT).contains(r22) || Build.HARDWARE.toLowerCase(Locale.ROOT).contains(r22) || Build.PRODUCT.toLowerCase(Locale.ROOT).contains(r22) || Build.SERIAL.toLowerCase(Locale.ROOT).contains(r22) || (Build.BRAND.startsWith(r1) && Build.DEVICE.startsWith(r1));
            }
        }
    }

    @ReactMethod
    public void isHeadphonesConnected(Promise promise) {
        promise.resolve(Boolean.valueOf(isHeadphonesConnectedSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isHeadphonesConnectedSync() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(C0201.m82(18666));
        return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
    }

    @ReactMethod
    public void isLocationEnabled(Promise promise) {
        promise.resolve(Boolean.valueOf(isLocationEnabledSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isLocationEnabledSync() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            try {
                return ((LocationManager) getReactApplicationContext().getSystemService(C0201.m82(18667))).isLocationEnabled();
            } catch (Exception unused) {
                System.err.println(C0201.m82(18668));
                return false;
            }
        } else if (i < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(getReactApplicationContext().getContentResolver(), C0201.m82(18670)));
        } else {
            if (Settings.Secure.getInt(getReactApplicationContext().getContentResolver(), C0201.m82(18669), 0) != 0) {
                z = true;
            }
            return z;
        }
    }

    @ReactMethod
    public void isPinOrFingerprintSet(Promise promise) {
        promise.resolve(Boolean.valueOf(isPinOrFingerprintSetSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPinOrFingerprintSetSync() {
        KeyguardManager keyguardManager = (KeyguardManager) getReactApplicationContext().getSystemService(C0201.m82(18671));
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardSecure();
        }
        System.err.println(C0201.m82(18672));
        return false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        getReactApplicationContext().unregisterReceiver(this.receiver);
        getReactApplicationContext().unregisterReceiver(this.headphoneConnectionReceiver);
    }
}
