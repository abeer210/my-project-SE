package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: DevSupportManagerFactory */
public class a {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;

    static {
        C0201.m83(a.class, 117);
    }

    public static gj0 a(Context context, e eVar, String str, boolean z, f fVar, ej0 ej0, int i, Map<String, Object> map) {
        if (!z) {
            return new b();
        }
        try {
            return (gj0) Class.forName(a + c + b).getConstructor(Context.class, e.class, String.class, Boolean.TYPE, f.class, ej0.class, Integer.TYPE, Map.class).newInstance(context, eVar, str, Boolean.TRUE, fVar, ej0, Integer.valueOf(i), map);
        } catch (Exception e) {
            throw new RuntimeException(d, e);
        }
    }
}
