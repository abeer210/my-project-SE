package defpackage;

import android.content.Context;
import vigqyno.C0201;

/* renamed from: dj2  reason: default package */
/* compiled from: Context.kt */
public final class dj2 {
    public static final boolean a(Context context) {
        ow2.c(context, C0201.m82(4829));
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            vi0 a = ((qi0) applicationContext).a();
            ow2.b(a, C0201.m82(4830));
            return a.m();
        }
        throw new fv2(C0201.m82(4831));
    }
}
