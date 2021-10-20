package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: ConnectivityReceiver */
public abstract class c {
    private final ConnectivityManager a;
    private final WifiManager b;
    private final TelephonyManager c;
    private final ReactApplicationContext d;
    private dd2 e = dd2.UNKNOWN;
    private cd2 f = null;
    private boolean g = false;
    private Boolean h;

    public c(ReactApplicationContext reactApplicationContext) {
        this.d = reactApplicationContext;
        this.a = (ConnectivityManager) reactApplicationContext.getSystemService(C0201.m82(34244));
        this.b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService(C0201.m82(34245));
        this.c = (TelephonyManager) reactApplicationContext.getSystemService(C0201.m82(34246));
    }

    private WritableMap a(String str) {
        String str2;
        WritableMap createMap = Arguments.createMap();
        if (e.a(e())) {
            createMap.putBoolean(C0201.m82(34247), this.b.isWifiEnabled());
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = this.e.a;
        }
        createMap.putString(C0201.m82(34248), str2);
        boolean z = true;
        boolean z2 = !this.e.equals(dd2.NONE) && !this.e.equals(dd2.UNKNOWN);
        createMap.putBoolean(C0201.m82(34249), z2);
        if (!this.g || (str != null && !str.equals(this.e.a))) {
            z = false;
        }
        createMap.putBoolean(C0201.m82(34250), z);
        if (str == null) {
            str = this.e.a;
        }
        WritableMap b2 = b(str);
        if (z2) {
            b2.putBoolean(C0201.m82(34251), b2.a(c()));
        }
        createMap.putMap(C0201.m82(34252), b2);
        return createMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:17|18|(1:22)|23|24|(1:26)|27|28|29|30|(1:32)|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ Exception -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[Catch:{ Exception -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0143  */
    private WritableMap b(String str) {
        char c2;
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        int hashCode = str.hashCode();
        if (hashCode != -916596374) {
            if (hashCode == 3649301 && str.equals(C0201.m82(34253))) {
                c2 = 1;
                if (c2 == 0) {
                    cd2 cd2 = this.f;
                    if (cd2 != null) {
                        createMap.putString(C0201.m82(34265), cd2.a);
                    }
                    String networkOperatorName = this.c.getNetworkOperatorName();
                    if (networkOperatorName != null) {
                        createMap.putString(C0201.m82(34266), networkOperatorName);
                    }
                } else if (c2 == 1 && e.a(e()) && (connectionInfo = this.b.getConnectionInfo()) != null) {
                    String ssid = connectionInfo.getSSID();
                    if (ssid != null && !ssid.contains(C0201.m82(34255))) {
                        createMap.putString(C0201.m82(34258), ssid.replace(C0201.m82(34256), C0201.m82(34257)));
                    }
                    String bssid = connectionInfo.getBSSID();
                    if (bssid != null) {
                        createMap.putString(C0201.m82(34259), bssid);
                    }
                    createMap.putInt(C0201.m82(34260), WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                    if (Build.VERSION.SDK_INT >= 21) {
                        createMap.putInt(C0201.m82(34261), connectionInfo.getFrequency());
                    }
                    byte[] byteArray = BigInteger.valueOf((long) connectionInfo.getIpAddress()).toByteArray();
                    e.b(byteArray);
                    createMap.putString(C0201.m82(34262), InetAddress.getByAddress(byteArray).getHostAddress());
                    try {
                        byte[] byteArray2 = BigInteger.valueOf((long) connectionInfo.getIpAddress()).toByteArray();
                        e.b(byteArray2);
                        int networkPrefixLength = -1 << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                        createMap.putString(C0201.m82(34264), String.format(Locale.US, C0201.m82(34263), Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
                    } catch (Exception unused) {
                    }
                }
                return createMap;
            }
        } else if (str.equals(C0201.m82(34254))) {
            c2 = 0;
            if (c2 == 0) {
            }
            return createMap;
        }
        c2 = 65535;
        if (c2 == 0) {
        }
        return createMap;
    }

    private void g() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(34267), a(null));
    }

    public ConnectivityManager c() {
        return this.a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    public ReactApplicationContext e() {
        return this.d;
    }

    public abstract void f();

    public void h(boolean z) {
        this.h = Boolean.valueOf(z);
        j(this.e, this.f, this.g);
    }

    public abstract void i();

    public void j(dd2 dd2, cd2 cd2, boolean z) {
        Boolean bool = this.h;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = true;
        boolean z3 = dd2 != this.e;
        boolean z4 = cd2 != this.f;
        if (z == this.g) {
            z2 = false;
        }
        if (z3 || z4 || z2) {
            this.e = dd2;
            this.f = cd2;
            this.g = z;
            g();
        }
    }
}
