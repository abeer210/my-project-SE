package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ib2  reason: default package */
public abstract class ib2 {
    private static final Map<String, ib2> a = new HashMap();
    private static final Object b = new Object();

    public static ib2 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return b(context, context.getPackageName());
    }

    public static ib2 b(Context context, String str) {
        ib2 ib2;
        synchronized (b) {
            ib2 = a.get(str);
            if (ib2 == null) {
                ib2 = new kb2(context, str);
                a.put(str, ib2);
            }
        }
        return ib2;
    }

    public abstract String c(String str);

    public abstract void d(InputStream inputStream);
}
