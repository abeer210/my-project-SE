package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import vigqyno.C0201;

public abstract class ResourceLoaderUtil {
    private static Context a;
    private static String b;

    public static int getAnimId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18935), b);
    }

    public static int getColorId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18936), b);
    }

    public static Drawable getDrawable(String str) {
        return a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18937), b);
    }

    public static int getIdId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18938), b);
    }

    public static int getLayoutId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18939), b);
    }

    public static String getString(String str) {
        return a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18940), b);
    }

    public static int getStyleId(String str) {
        return a.getResources().getIdentifier(str, C0201.m82(18941), b);
    }

    public static Context getmContext() {
        return a;
    }

    public static void setmContext(Context context) {
        a = context;
        b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return a.getResources().getString(getStringId(str), objArr);
    }
}
