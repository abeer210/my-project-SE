package com.huawei.hms.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mbz;
import com.huawei.hms.maps.mck;
import com.huawei.hms.maps.mcl;
import com.huawei.hms.maps.mcn;
import com.huawei.hms.maps.mco;
import com.huawei.hms.maps.mcr;
import com.huawei.hms.maps.mcs;
import vigqyno.C0201;

public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 0.0f;
    public static final float HUE_BLUE = 0.0f;
    public static final float HUE_CYAN = 0.0f;
    public static final float HUE_GREEN = 0.0f;
    public static final float HUE_MAGENTA = 0.0f;
    public static final float HUE_ORANGE = 0.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 0.0f;
    public static final float HUE_VIOLET = 0.0f;
    public static final float HUE_YELLOW = 0.0f;
    private static Context a;
    public static mbz sIBitmapDescriptorDelegate;

    static {
        C0201.m83(BitmapDescriptorFactory.class, 269);
    }

    public static BitmapDescriptor defaultMarker() {
        mbz mbz = sIBitmapDescriptorDelegate;
        String r2 = C0201.m82(23804);
        if (mbz == null) {
            mco.c(r2, C0201.m82(23805));
            return null;
        }
        try {
            IObjectWrapper a2 = mbz.a();
            if (a2 != null) {
                return new BitmapDescriptor(a2);
            }
            mco.c(r2, C0201.m82(23806));
            return null;
        } catch (RemoteException unused) {
            mco.d(r2, C0201.m82(23807));
            return null;
        }
    }

    public static BitmapDescriptor defaultMarker(float f) {
        mbz mbz = sIBitmapDescriptorDelegate;
        String r2 = C0201.m82(23808);
        if (mbz == null) {
            mco.c(r2, C0201.m82(23809));
            return null;
        }
        try {
            IObjectWrapper a2 = mbz.a(f);
            if (a2 != null) {
                return new BitmapDescriptor(a2);
            }
            mco.c(r2, C0201.m82(23810));
            return null;
        } catch (RemoteException unused) {
            mco.d(r2, C0201.m82(23811));
            return null;
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mck(str).a(a)));
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcl(bitmap).a(a)));
    }

    public static BitmapDescriptor fromFile(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcn(str).a(a)));
    }

    public static BitmapDescriptor fromPath(String str) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcr(str).a(a)));
    }

    public static BitmapDescriptor fromResource(int i) {
        return new BitmapDescriptor(ObjectWrapper.wrap(new mcs(i).a(a)));
    }

    public static void setContext(Context context) {
        a = context;
    }
}
