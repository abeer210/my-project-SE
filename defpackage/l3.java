package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: l3  reason: default package */
/* compiled from: ViewConfigurationCompat */
public final class l3 {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                a = ViewConfiguration.class.getDeclaredMethod(C0201.m82(25209), new Class[0]);
            } catch (Exception unused) {
                Log.i(C0201.m82(25210), C0201.m82(25211));
            }
        }
    }

    private static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(C0201.m82(25212), C0201.m82(25213));
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return a(viewConfiguration, context);
    }

    public static int c(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static float d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return a(viewConfiguration, context);
    }

    public static boolean e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(C0201.m82(25214), C0201.m82(25215), C0201.m82(25216));
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
