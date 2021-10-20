package com.huawei.hms.maps;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import vigqyno.C0201;

public final class MapsInitializer {
    private static boolean a;

    static {
        C0201.m83(MapsInitializer.class, 608);
    }

    public static synchronized int initialize(Context context) {
        synchronized (MapsInitializer.class) {
            BitmapDescriptorFactory.setContext(context);
        }
        return 0;
    }

    public static void setApiKey(String str) {
        MapClientIdentify.a(str);
    }
}
