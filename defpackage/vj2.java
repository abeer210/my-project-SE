package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: vj2  reason: default package */
/* compiled from: TypefaceLoader */
public class vj2 {
    private static final Map<String, Typeface> b = new HashMap();
    private Context a;

    public vj2(Context context) {
        this.a = context;
    }

    private int a(String str) {
        if (str.toLowerCase().contains(C0201.m82(33496))) {
            return 1;
        }
        return str.toLowerCase().contains(C0201.m82(33497)) ? 2 : 0;
    }

    private Typeface d(String str) {
        Typeface c = c(str);
        if (c != null) {
            return c;
        }
        return Typeface.create(str, a(str));
    }

    public Typeface b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        Typeface d = d(str);
        b.put(str, d);
        return d;
    }

    public Typeface c(String str) {
        String r0 = C0201.m82(33498);
        String r1 = C0201.m82(33499);
        try {
            if (this.a == null) {
                return null;
            }
            AssetManager assets = this.a.getAssets();
            List asList = Arrays.asList(assets.list(C0201.m82(33500)));
            boolean contains = asList.contains(str + r1);
            String r5 = C0201.m82(33501);
            if (contains) {
                return Typeface.createFromAsset(assets, r5 + str + r1);
            }
            if (!asList.contains(str + r0)) {
                return null;
            }
            return Typeface.createFromAsset(assets, r5 + str + r0);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
