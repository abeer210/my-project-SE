package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.core.content.c;
import vigqyno.C0201;

/* renamed from: v61  reason: default package */
public final class v61 implements q61 {
    public static v61 b;
    private final Context a;

    private v61(Context context) {
        this.a = context;
        context.getContentResolver().registerContentObserver(l61.a, true, new x61(this, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) t61.a(new u61(this, str));
        } catch (SecurityException e) {
            String r2 = C0201.m82(27158);
            String valueOf = String.valueOf(str);
            Log.e(C0201.m82(27159), valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2), e);
            return null;
        }
    }

    public static v61 d(Context context) {
        v61 v61;
        synchronized (v61.class) {
            if (b == null) {
                b = c.c(context, C0201.m82(27160)) == 0 ? new v61(context) : new v61();
            }
            v61 = b;
        }
        return v61;
    }

    public final /* synthetic */ String c(String str) {
        return l61.a(this.a.getContentResolver(), str, null);
    }

    private v61() {
        this.a = null;
    }
}
