package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: il0  reason: default package */
/* compiled from: ContextUtils */
public class il0 {
    public static <T> T a(Context context, Class<? extends T> cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = (T) baseContext;
        }
        return (T) context;
    }
}
