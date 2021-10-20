package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import vigqyno.C0201;

/* compiled from: NotificationManagerCompat */
public final class l {
    private final Context a;
    private final NotificationManager b;

    static {
        new HashSet();
    }

    private l(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService(C0201.m82(20710));
    }

    public static l b(Context context) {
        return new l(context);
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService(C0201.m82(20711));
        ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        String packageName = this.a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            if (((Integer) cls.getMethod(C0201.m82(20712), Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(C0201.m82(20713)).get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
