package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: pl0  reason: default package */
/* compiled from: ResourceDrawableIdHelper */
public class pl0 {
    private static volatile pl0 b;
    private Map<String, Integer> a = new HashMap();

    private pl0() {
    }

    public static pl0 a() {
        if (b == null) {
            synchronized (pl0.class) {
                if (b == null) {
                    b = new pl0();
                }
            }
        }
        return b;
    }

    public Drawable b(Context context, String str) {
        int c = c(context, str);
        if (c > 0) {
            return context.getResources().getDrawable(c);
        }
        return null;
    }

    public int c(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace(C0201.m82(35988), C0201.m82(35989));
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.a.containsKey(replace)) {
                    return this.a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, C0201.m82(35990), context.getPackageName());
                this.a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Uri d(Context context, String str) {
        int c = c(context, str);
        return c > 0 ? new Uri.Builder().scheme(C0201.m82(35991)).path(String.valueOf(c)).build() : Uri.EMPTY;
    }
}
