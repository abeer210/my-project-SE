package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: e71  reason: default package */
public final class e71 implements q61 {
    public static final Map<String, e71> f = new HashMap();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b = new h71(this);
    private final Object c = new Object();
    private volatile Map<String, ?> d;
    private final List<r61> e = new ArrayList();

    private e71(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.b);
    }

    public static e71 c(Context context, String str) {
        e71 e71;
        SharedPreferences sharedPreferences;
        if (!((!n61.d() || str.startsWith(C0201.m82(36445))) ? true : n61.a(context))) {
            return null;
        }
        synchronized (e71.class) {
            e71 = f.get(str);
            if (e71 == null) {
                if (str.startsWith(C0201.m82(36446))) {
                    if (n61.d()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                e71 = new e71(sharedPreferences);
                f.put(str, e71);
            }
        }
        return e71;
    }

    @Override // defpackage.q61
    public final Object a(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    map = this.a.getAll();
                    this.d = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final /* synthetic */ void b(SharedPreferences sharedPreferences, String str) {
        synchronized (this.c) {
            this.d = null;
            y61.m();
        }
        synchronized (this) {
            for (r61 r61 : this.e) {
                r61.a();
            }
        }
    }
}
