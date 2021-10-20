package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: gt0  reason: default package */
public class gt0 {
    private static volatile UserManager a;
    private static volatile boolean b = (!b());

    private gt0() {
    }

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z = b;
        if (!z) {
            UserManager userManager = a;
            if (userManager == null) {
                synchronized (gt0.class) {
                    userManager = a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        a = userManager2;
                        if (userManager2 == null) {
                            b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            b = z;
            if (z) {
                a = null;
            }
        }
        return z;
    }
}
