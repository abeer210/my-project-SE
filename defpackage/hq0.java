package defpackage;

import android.content.Context;

/* renamed from: hq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class hq0 {
    private static hq0 b = new hq0();
    private gq0 a = null;

    public static gq0 a(Context context) {
        return b.b(context);
    }

    private final synchronized gq0 b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new gq0(context);
        }
        return this.a;
    }
}
