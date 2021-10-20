package com.samsung.android.sdk;

import android.os.Build;
import vigqyno.C0201;

public class SsdkVendorCheck {
    private static String strBrand = Build.BRAND;
    private static String strManufacturer = Build.MANUFACTURER;

    private SsdkVendorCheck() {
    }

    public static boolean isSamsungDevice() {
        String str = strBrand;
        if (str == null || strManufacturer == null) {
            return false;
        }
        String r2 = C0201.m82(4879);
        if (str.compareToIgnoreCase(r2) == 0 || strManufacturer.compareToIgnoreCase(r2) == 0) {
            return true;
        }
        return false;
    }
}
