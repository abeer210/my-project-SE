package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: h2  reason: default package */
/* compiled from: UserManagerCompat */
public class h2 {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
