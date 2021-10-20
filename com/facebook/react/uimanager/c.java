package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: DisplayMetricsHolder */
public class c {
    private static DisplayMetrics a;
    private static DisplayMetrics b;

    public static Map<String, Map<String, Object>> a(double d) {
        yh0.d(Boolean.valueOf((a == null && b == null) ? false : true), C0201.m82(23992));
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(23993), c(a, d));
        hashMap.put(C0201.m82(23994), c(b, d));
        return hashMap;
    }

    public static WritableNativeMap b(double d) {
        yh0.d(Boolean.valueOf((a == null && b == null) ? false : true), C0201.m82(23995));
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap(C0201.m82(23996), d(a, d));
        writableNativeMap.putMap(C0201.m82(23997), d(b, d));
        return writableNativeMap;
    }

    private static Map<String, Object> c(DisplayMetrics displayMetrics, double d) {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(23998), Integer.valueOf(displayMetrics.widthPixels));
        hashMap.put(C0201.m82(23999), Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put(C0201.m82(24000), Float.valueOf(displayMetrics.density));
        hashMap.put(C0201.m82(24001), Double.valueOf(d));
        hashMap.put(C0201.m82(24002), Integer.valueOf(displayMetrics.densityDpi));
        return hashMap;
    }

    private static WritableNativeMap d(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(C0201.m82(24003), displayMetrics.widthPixels);
        writableNativeMap.putInt(C0201.m82(24004), displayMetrics.heightPixels);
        writableNativeMap.putDouble(C0201.m82(24005), (double) displayMetrics.density);
        writableNativeMap.putDouble(C0201.m82(24006), d);
        writableNativeMap.putDouble(C0201.m82(24007), (double) displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static DisplayMetrics e() {
        return b;
    }

    @Deprecated
    public static DisplayMetrics f() {
        return a;
    }

    public static void g(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        j(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService(C0201.m82(24008));
        yh0.d(windowManager, C0201.m82(24009));
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod(C0201.m82(24010), new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod(C0201.m82(24011), new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(C0201.m82(24012), e);
            }
        }
        i(displayMetrics2);
    }

    public static void h(Context context) {
        if (e() == null) {
            g(context);
        }
    }

    public static void i(DisplayMetrics displayMetrics) {
        b = displayMetrics;
    }

    public static void j(DisplayMetrics displayMetrics) {
        a = displayMetrics;
    }
}
