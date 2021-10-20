package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.android.os.BuildEx;
import com.huawei.android.telephony.ServiceStateEx;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import vigqyno.C0201;

public class NetworkUtil {
    private static final String TAG = null;
    private static final int TYPE_WIFI_P2P = 0;

    public static final class NetType {
        public static final int TYPE_2G = 0;
        public static final int TYPE_3G = 0;
        public static final int TYPE_4G = 0;
        public static final int TYPE_5G = 0;
        public static final int TYPE_NO_NETWORK = 0;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 0;

        static {
            C0201.m83(NetType.class, 355);
        }
    }

    static {
        C0201.m83(NetworkUtil.class, 383);
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    private static String[] getDnsServerIpsFromConnectionManager(Context context) {
        ConnectivityManager connectivityManager;
        Object e;
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(8134);
        LinkedList<String> linkedList = new LinkedList<>();
        if (!(Build.VERSION.SDK_INT < 21 || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(8135))) == null)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    linkedList = getDnsServerIpsFromLinkProperties(connectivityManager, activeNetworkInfo);
                }
            } catch (SecurityException e2) {
                e = e2;
                str = TAG;
                sb = new StringBuilder();
                sb.append(r0);
                sb.append(e.getClass().getSimpleName());
                Logger.i(str, sb.toString());
                if (linkedList.isEmpty()) {
                }
            } catch (RuntimeException e3) {
                e = e3;
                str = TAG;
                sb = new StringBuilder();
                sb.append(r0);
                sb.append(e.getClass().getSimpleName());
                Logger.i(str, sb.toString());
                if (linkedList.isEmpty()) {
                }
            }
        }
        return linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    private static LinkedList<String> getDnsServerIpsFromLinkProperties(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        LinkProperties linkProperties;
        LinkedList<String> linkedList = new LinkedList<>();
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (!(allNetworks == null || allNetworks.length == 0)) {
            for (Network network : allNetworks) {
                if (network != null) {
                    NetworkInfo networkInfo2 = null;
                    try {
                        networkInfo2 = connectivityManager.getNetworkInfo(network);
                    } catch (NullPointerException e) {
                        Logger.i(TAG, C0201.m82(8136) + e.getClass().getSimpleName());
                    }
                    if (!(networkInfo2 == null || networkInfo2.getType() != networkInfo.getType() || (linkProperties = connectivityManager.getLinkProperties(network)) == null)) {
                        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                            linkedList.add(inetAddress.getHostAddress());
                        }
                    }
                }
            }
        }
        return linkedList;
    }

    public static String getHost(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(8137);
        if (isEmpty) {
            return r1;
        }
        try {
            URI uri = new URI(str);
            if (uri.getPort() == -1) {
                return uri.getHost();
            }
            return uri.getHost() + C0201.m82(8138) + uri.getPort();
        } catch (URISyntaxException e) {
            Logger.w(TAG, e.getClass().getSimpleName());
            return r1;
        }
    }

    private static int getHwNetworkType(Context context) {
        TelephonyManager telephonyManager;
        String str;
        String str2;
        ServiceState serviceState;
        int i = 0;
        if (!EmuiUtil.isEMUI()) {
            return 0;
        }
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService(C0201.m82(8139))) == null)) {
            try {
                if (BuildEx.VERSION.EMUI_SDK_INT >= 21 && (serviceState = telephonyManager.getServiceState()) != null) {
                    i = ServiceStateEx.getConfigRadioTechnology(serviceState);
                    String str3 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0201.m82(8140));
                    sb.append(i);
                    Logger.i(str3, sb.toString());
                }
            } catch (SecurityException unused) {
                str = TAG;
                str2 = C0201.m82(8143);
                Logger.w(str, str2);
                return i;
            } catch (NoSuchMethodError unused2) {
                str = TAG;
                str2 = C0201.m82(8142);
                Logger.w(str, str2);
                return i;
            } catch (NoClassDefFoundError unused3) {
                str = TAG;
                str2 = C0201.m82(8141);
                Logger.w(str, str2);
                return i;
            }
        }
        return i;
    }

    public static int getMobileRsrp(Context context) {
        String str;
        String str2;
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService(C0201.m82(8144));
        SignalStrength signalStrength = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signalStrength = telephonyManager.createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId()).getSignalStrength();
        }
        if (signalStrength == null) {
            return 0;
        }
        try {
            return ((Integer) SignalStrength.class.getDeclaredMethod(C0201.m82(8145), new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (NoSuchMethodException unused) {
            str = TAG;
            str2 = C0201.m82(8148);
        } catch (IllegalAccessException unused2) {
            str = TAG;
            str2 = C0201.m82(8147);
        } catch (InvocationTargetException unused3) {
            str = TAG;
            str2 = C0201.m82(8146);
        }
        Logger.i(str, str2);
        return 0;
    }

    public static int getMobileRsrpLevel(Context context) {
        String str;
        String str2;
        if (context == null) {
            return 0;
        }
        Object systemService = context.getSystemService(C0201.m82(8149));
        SignalStrength signalStrength = null;
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signalStrength = telephonyManager.getSignalStrength();
        }
        if (signalStrength == null) {
            return 0;
        }
        try {
            return ((Integer) SignalStrength.class.getDeclaredMethod(C0201.m82(8150), new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (NoSuchMethodException unused) {
            str = TAG;
            str2 = C0201.m82(8153);
        } catch (IllegalAccessException unused2) {
            str = TAG;
            str2 = C0201.m82(8152);
        } catch (InvocationTargetException unused3) {
            str = TAG;
            str2 = C0201.m82(8151);
        }
        Logger.i(str, str2);
        return 0;
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(8154))) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (SecurityException unused) {
            return null;
        } catch (RuntimeException e) {
            String str = TAG;
            Logger.i(str, C0201.m82(8155) + e.getClass().getSimpleName());
            return null;
        }
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    i = 2;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    i = 3;
                    break;
                case 13:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (subtype != 16) {
                return subtype != 17 ? 0 : 3;
            }
            return 2;
        }
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int hwNetworkType = getHwNetworkType(context);
            String str = TAG;
            Logger.v(str, C0201.m82(8156) + hwNetworkType);
            if (hwNetworkType == 0) {
                hwNetworkType = networkInfo.getSubtype();
            }
            if (hwNetworkType != 20) {
                switch (hwNetworkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i = 2;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i = 3;
                        break;
                    case 13:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 5;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (hwNetworkType != 16) {
                return hwNetworkType != 17 ? 0 : 3;
            }
            return 2;
        }
    }

    public static String getSSIDByNetWorkId(Context context) {
        return C0201.m82(8157);
    }

    public static String getWifiGatewayIp(Context context) {
        String r0 = C0201.m82(8158);
        if (context == null) {
            return r0;
        }
        Object systemService = context.getApplicationContext().getSystemService(C0201.m82(8159));
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return r0;
        }
        try {
            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
            if (dhcpInfo == null) {
                return r0;
            }
            int i = dhcpInfo.gateway;
            try {
                return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)}).getHostAddress();
            } catch (Exception unused) {
                Logger.i(TAG, C0201.m82(8160));
                return r0;
            }
        } catch (SecurityException unused2) {
            Logger.i(TAG, C0201.m82(8161));
            return r0;
        }
    }

    public static int getWifiRssi(Context context) {
        if (context == null) {
            return 0;
        }
        Object systemService = context.getApplicationContext().getSystemService(C0201.m82(8162));
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return 0;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return 0;
            }
            return connectionInfo.getRssi();
        } catch (SecurityException unused) {
            Logger.i(TAG, C0201.m82(8163));
            return 0;
        }
    }

    public static int getWifiRssiLevel(Context context) {
        if (context == null) {
            return 0;
        }
        Object systemService = context.getApplicationContext().getSystemService(C0201.m82(8164));
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return 0;
        }
        try {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null || connectionInfo.getBSSID() == null) {
                return 0;
            }
            return WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
        } catch (SecurityException unused) {
            Logger.i(TAG, C0201.m82(8165));
            return 0;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(C0201.m82(8166))) == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> list = null;
        try {
            list = activityManager.getRunningAppProcesses();
        } catch (Exception e) {
            Logger.w(TAG, C0201.m82(8167), e);
        }
        if (list == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            String str = runningAppProcessInfo.processName;
            if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                Logger.v(TAG, C0201.m82(8168));
                return true;
            }
        }
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = context.getSystemService(C0201.m82(8169));
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null && Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager;
        if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(8170))) == null)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (SecurityException unused) {
                Logger.w(TAG, C0201.m82(8171));
                return true;
            }
        }
        return false;
    }

    public static NetworkInfo.DetailedState networkStatus(Context context) {
        String str;
        String r1;
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = context.getSystemService(C0201.m82(8172));
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        return activeNetworkInfo.getDetailedState();
                    }
                    Logger.i(TAG, C0201.m82(8173));
                    return detailedState;
                } catch (SecurityException unused) {
                }
            } else {
                str = TAG;
                r1 = C0201.m82(8174);
            }
        } else {
            str = TAG;
            r1 = C0201.m82(8175);
        }
        Logger.i(str, r1);
        return detailedState;
    }
}
