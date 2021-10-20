package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ReactFontManager */
public class i {
    private static final String[] c = {C0201.m82(1068), C0201.m82(1069), C0201.m82(1070), C0201.m82(1071)};
    private static final String[] d = {C0201.m82(1072), C0201.m82(1073)};
    private static i e;
    private final Map<String, b> a = new HashMap();
    private final Map<String, Typeface> b = new HashMap();

    /* access modifiers changed from: private */
    /* compiled from: ReactFontManager */
    public static class b {
        private SparseArray<Typeface> a;

        public Typeface a(int i) {
            return this.a.get(i);
        }

        public void b(int i, Typeface typeface) {
            this.a.put(i, typeface);
        }

        private b() {
            this.a = new SparseArray<>(4);
        }
    }

    private i() {
    }

    private static Typeface a(String str, int i, AssetManager assetManager) {
        String str2 = c[i];
        String[] strArr = d;
        for (String str3 : strArr) {
            try {
                return Typeface.createFromAsset(assetManager, C0201.m82(1074) + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    public static i b() {
        if (e == null) {
            e = new i();
        }
        return e;
    }

    public Typeface c(String str, int i, int i2, AssetManager assetManager) {
        if (this.b.containsKey(str)) {
            Typeface typeface = this.b.get(str);
            if (Build.VERSION.SDK_INT < 28 || i2 < 100 || i2 > 1000) {
                return Typeface.create(typeface, i);
            }
            return Typeface.create(typeface, i2, (i & 2) != 0);
        }
        b bVar = this.a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.a.put(str, bVar);
        }
        Typeface a2 = bVar.a(i);
        if (a2 == null && (a2 = a(str, i, assetManager)) != null) {
            bVar.b(i, a2);
        }
        return a2;
    }

    public Typeface d(String str, int i, AssetManager assetManager) {
        return c(str, i, 0, assetManager);
    }
}
