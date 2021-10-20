package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: m61  reason: default package */
public final class m61 implements q61 {
    public static final Map<Uri, m61> f = new r0();
    private static final String[] g = {C0201.m82(12649), C0201.m82(12650)};
    private final ContentResolver a;
    private final Uri b;
    private final Object c = new Object();
    private volatile Map<String, String> d;
    private final List<r61> e = new ArrayList();

    private m61(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, new o61(this, null));
    }

    public static m61 b(ContentResolver contentResolver, Uri uri) {
        m61 m61;
        synchronized (m61.class) {
            m61 = f.get(uri);
            if (m61 == null) {
                try {
                    m61 m612 = new m61(contentResolver, uri);
                    try {
                        f.put(uri, m612);
                    } catch (SecurityException unused) {
                    }
                    m61 = m612;
                } catch (SecurityException unused2) {
                }
            }
        }
        return m61;
    }

    private final Map<String, String> e() {
        try {
            return (Map) t61.a(new p61(this));
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e(C0201.m82(12651), C0201.m82(12652));
            return null;
        }
    }

    @Override // defpackage.q61
    public final /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    public final Map<String, String> c() {
        Map<String, String> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    map = e();
                    this.d = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void d() {
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

    public final /* synthetic */ Map f() {
        Map map;
        Cursor query = this.a.query(this.b, g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new r0(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
