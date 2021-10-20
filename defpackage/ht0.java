package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: ht0  reason: default package */
public final class ht0 {
    private static final ConcurrentHashMap<Uri, ht0> h = new ConcurrentHashMap<>();
    private static final String[] i = {C0201.m82(37585), C0201.m82(37586)};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c;
    private final Object d = new Object();
    private volatile Map<String, String> e;
    private final Object f = new Object();
    private final List<jt0> g = new ArrayList();

    private ht0(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        this.c = new it0(this, null);
    }

    public static ht0 a(ContentResolver contentResolver, Uri uri) {
        ht0 ht0 = h.get(uri);
        if (ht0 != null) {
            return ht0;
        }
        ht0 ht02 = new ht0(contentResolver, uri);
        ht0 putIfAbsent = h.putIfAbsent(uri, ht02);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        ht02.a.registerContentObserver(ht02.b, false, ht02.c);
        return ht02;
    }

    private final Map<String, String> e() {
        HashMap hashMap = new HashMap();
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } catch (SQLiteException | SecurityException unused) {
                    Log.e(C0201.m82(37587), C0201.m82(37588));
                    return null;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public final void f() {
        synchronized (this.f) {
            for (jt0 jt0 : this.g) {
                jt0.E();
            }
        }
    }

    public final Map<String, String> c() {
        Map<String, String> e2 = kt0.h(C0201.m82(37589), false) ? e() : this.e;
        if (e2 == null) {
            synchronized (this.d) {
                e2 = this.e;
                if (e2 == null) {
                    e2 = e();
                    this.e = e2;
                }
            }
        }
        return e2 != null ? e2 : Collections.emptyMap();
    }

    public final void d() {
        synchronized (this.d) {
            this.e = null;
        }
    }
}
