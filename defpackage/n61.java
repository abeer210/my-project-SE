package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: n61  reason: default package */
public class n61 {
    private static UserManager a;
    private static volatile boolean b = (!d());

    private n61() {
    }

    public static boolean a(Context context) {
        return !d() || c(context);
    }

    @TargetApi(24)
    private static boolean b(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
            } catch (NullPointerException e) {
                Log.w(C0201.m82(9892), C0201.m82(9893), e);
                a = null;
                i++;
            }
        }
        if (z) {
            a = null;
        }
        return z;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        if (b) {
            return true;
        }
        synchronized (n61.class) {
            if (b) {
                return true;
            }
            boolean b2 = b(context);
            if (b2) {
                b = b2;
            }
            return b2;
        }
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
