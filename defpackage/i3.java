package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: i3  reason: default package */
/* compiled from: PointerIconCompat */
public final class i3 {
    private Object a;

    private i3(Object obj) {
        this.a = obj;
    }

    public static i3 b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new i3(PointerIcon.getSystemIcon(context, i));
        }
        return new i3(null);
    }

    public Object a() {
        return this.a;
    }
}
