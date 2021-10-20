package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import vigqyno.C0201;

public final class g {
    private static String a;
    private static Resources b;

    public static int a(Context context, String str) {
        return a(context, str, C0201.m82(36226));
    }

    private static int a(Context context, String str, String str2) {
        if (b == null) {
            b = context.getResources();
        }
        return b.getIdentifier(str, str2, a(context));
    }

    private static String a(Context context) {
        if (a == null) {
            a = context.getPackageName();
        }
        return a;
    }

    public static int b(Context context, String str) {
        return a(context, str, C0201.m82(36227));
    }

    public static int c(Context context, String str) {
        return a(context, str, C0201.m82(36228));
    }

    public static int d(Context context, String str) {
        return a(context, str, C0201.m82(36229));
    }

    public static int e(Context context, String str) {
        return a(context, str, C0201.m82(36230));
    }

    public static String f(Context context, String str) {
        try {
            return context.getResources().getString(a(context, str, C0201.m82(36231)));
        } catch (Resources.NotFoundException unused) {
            Log.e(C0201.m82(36233), C0201.m82(36232) + str);
            return C0201.m82(36234);
        }
    }
}
