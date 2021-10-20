package com.agontuk.RNFusedLocation;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* compiled from: LocationUtils */
public class b {
    public static WritableMap a(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(7556), i);
        if (str != null) {
            createMap.putString(C0201.m82(7557), str);
        }
        return createMap;
    }

    public static boolean b(Context context) {
        return androidx.core.content.b.a(context, C0201.m82(7558)) == 0 || androidx.core.content.b.a(context, C0201.m82(7559)) == 0;
    }

    public static boolean c(Context context) {
        int i = yo0.q().i(context);
        return i == 0 || i == 18;
    }

    public static boolean d(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), C0201.m82(7561)));
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), C0201.m82(7560)) != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public static WritableMap e(Location location) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(C0201.m82(7562), location.getLatitude());
        createMap2.putDouble(C0201.m82(7563), location.getLongitude());
        createMap2.putDouble(C0201.m82(7564), location.getAltitude());
        createMap2.putDouble(C0201.m82(7565), (double) location.getAccuracy());
        createMap2.putDouble(C0201.m82(7566), (double) location.getBearing());
        createMap2.putDouble(C0201.m82(7567), (double) location.getSpeed());
        createMap.putMap(C0201.m82(7568), createMap2);
        createMap.putDouble(C0201.m82(7569), (double) location.getTime());
        if (Build.VERSION.SDK_INT >= 18) {
            createMap.putBoolean(C0201.m82(7570), location.isFromMockProvider());
        }
        return createMap;
    }
}
