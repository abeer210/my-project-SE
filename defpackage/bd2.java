package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.a;
import vigqyno.C0201;

/* renamed from: bd2  reason: default package */
/* compiled from: DeviceTypeResolver */
public class bd2 {
    private final Context a;

    public bd2(Context context) {
        this.a = context;
    }

    private a b() {
        WindowManager windowManager = (WindowManager) this.a.getSystemService(C0201.m82(4));
        if (windowManager == null) {
            return a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        double d = (double) displayMetrics.widthPixels;
        double d2 = (double) displayMetrics.xdpi;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) displayMetrics.heightPixels;
        double d5 = (double) displayMetrics.ydpi;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d4 / d5, 2.0d));
        if (sqrt >= 3.0d && sqrt <= 6.9d) {
            return a.HANDSET;
        }
        if (sqrt <= 6.9d || sqrt > 18.0d) {
            return a.UNKNOWN;
        }
        return a.TABLET;
    }

    private a c() {
        int i = this.a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i == 0) {
            return a.UNKNOWN;
        }
        return i >= 600 ? a.TABLET : a.HANDSET;
    }

    public a a() {
        if (this.a.getPackageManager().hasSystemFeature(C0201.m82(5))) {
            return a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.a.getSystemService(C0201.m82(6));
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return a.TV;
        }
        a c = c();
        if (c == null || c == a.UNKNOWN) {
            return b();
        }
        return c;
    }

    public boolean d() {
        return a() == a.TABLET;
    }
}
