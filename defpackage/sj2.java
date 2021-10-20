package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import vigqyno.C0201;

/* renamed from: sj2  reason: default package */
/* compiled from: StatusBarUtils */
public class sj2 {
    private static int a;

    static {
        C0201.m83(sj2.class, 693);
    }

    public static int a(Context context) {
        int i;
        int i2 = a;
        if (i2 > 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(C0201.m82(10561), C0201.m82(10562), C0201.m82(10563));
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = xj2.b(context, Build.VERSION.SDK_INT >= 23 ? 24 : 25);
        }
        a = i;
        return i;
    }

    public static boolean b(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        return attributes != null && (attributes.flags & 67108864) == 67108864;
    }

    public static void c(int i) {
        a = i;
    }
}
