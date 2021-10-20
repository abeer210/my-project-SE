package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import defpackage.vj;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: FastImageViewConverter */
public class f {
    private static final Drawable a = new ColorDrawable(0);
    private static final Map<String, a> b = new a();
    private static final Map<String, g> c = new b();
    private static final Map<String, ImageView.ScaleType> d = new c();

    /* compiled from: FastImageViewConverter */
    static class a extends HashMap<String, a> {
        public a() {
            put(C0201.m82(32756), a.IMMUTABLE);
            put(C0201.m82(32757), a.WEB);
            put(C0201.m82(32758), a.CACHE_ONLY);
        }
    }

    /* compiled from: FastImageViewConverter */
    static class b extends HashMap<String, g> {
        public b() {
            put(C0201.m82(32803), g.LOW);
            put(C0201.m82(32804), g.NORMAL);
            put(C0201.m82(32805), g.HIGH);
        }
    }

    /* compiled from: FastImageViewConverter */
    static class c extends HashMap<String, ImageView.ScaleType> {
        public c() {
            put(C0201.m82(32820), ImageView.ScaleType.FIT_CENTER);
            put(C0201.m82(32821), ImageView.ScaleType.CENTER_CROP);
            put(C0201.m82(32822), ImageView.ScaleType.FIT_XY);
            put(C0201.m82(32823), ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    /* compiled from: FastImageViewConverter */
    static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            iArr[a.WEB.ordinal()] = 1;
            a[a.CACHE_ONLY.ordinal()] = 2;
            try {
                a[a.IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static a a(ReadableMap readableMap) {
        return (a) h(C0201.m82(19385), C0201.m82(19386), b, readableMap);
    }

    public static tj b(ReadableMap readableMap) {
        tj tjVar = tj.a;
        String r1 = C0201.m82(19387);
        if (!readableMap.hasKey(r1)) {
            return tjVar;
        }
        ReadableMap map = readableMap.getMap(r1);
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        vj.a aVar = new vj.a();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            aVar.b(nextKey, map.getString(nextKey));
        }
        return aVar.c();
    }

    public static e c(Context context, ReadableMap readableMap) {
        return new e(context, readableMap.getString(C0201.m82(19388)), b(readableMap));
    }

    public static ao d(Context context, e eVar, ReadableMap readableMap) {
        Boolean bool;
        g e = e(readableMap);
        a a2 = a(readableMap);
        vh vhVar = vh.c;
        Boolean bool2 = Boolean.FALSE;
        int i = d.a[a2.ordinal()];
        if (i == 1) {
            vhVar = vh.a;
            bool = Boolean.TRUE;
        } else if (i != 2) {
            bool = bool2;
        } else {
            bool2 = Boolean.TRUE;
            bool = bool2;
        }
        ao aoVar = (ao) ((ao) ((ao) ((ao) ((ao) new ao().e(vhVar)).Q(bool2.booleanValue())).f0(bool.booleanValue())).Y(e)).X(a);
        return eVar.f() ? (ao) aoVar.a(ao.p0(so.c(context))) : aoVar;
    }

    private static g e(ReadableMap readableMap) {
        return (g) h(C0201.m82(19389), C0201.m82(19390), c, readableMap);
    }

    public static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g(C0201.m82(19391), C0201.m82(19392), d, str);
    }

    private static <T> T g(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t = map.get(str2);
        if (t != null) {
            return t;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(19393) + str + C0201.m82(19394) + str2);
    }

    private static <T> T h(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return (T) g(str, str2, map, str3);
    }
}
