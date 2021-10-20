package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* renamed from: f01  reason: default package */
public class f01 {
    private static final Uri a = Uri.parse(C0201.m82(14063));
    private static final Uri b = Uri.parse(C0201.m82(14064));
    public static final Pattern c = Pattern.compile(C0201.m82(14065), 2);
    public static final Pattern d = Pattern.compile(C0201.m82(14066), 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j2) {
        Object i2 = i(contentResolver);
        long j3 = 0;
        Long l2 = (Long) b(i, str, 0L);
        if (l2 != null) {
            return l2.longValue();
        }
        String c2 = c(contentResolver, str, null);
        if (c2 != null) {
            try {
                long parseLong = Long.parseLong(c2);
                l2 = Long.valueOf(parseLong);
                j3 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        g(i2, i, str, l2);
        return j3;
    }

    private static <T> T b(HashMap<String, T> hashMap, String str, T t) {
        synchronized (f01.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            T t2 = hashMap.get(str);
            if (t2 != null) {
                t = t2;
            }
            return t;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(defpackage.f01.a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals(null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        f(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
        f(r0, r14, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r13 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        if (r13 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a1, code lost:
        throw r14;
     */
    public static String c(ContentResolver contentResolver, String str, String str2) {
        synchronized (f01.class) {
            e(contentResolver);
            Object obj = k;
            String str3 = null;
            if (f.containsKey(str)) {
                String str4 = f.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            for (String str5 : m) {
                if (str.startsWith(str5)) {
                    if (!l || f.isEmpty()) {
                        f.putAll(d(contentResolver, m));
                        l = true;
                        if (f.containsKey(str)) {
                            String str6 = f.get(str);
                            if (str6 != null) {
                                str3 = str6;
                            }
                            return str3;
                        }
                    }
                    return null;
                }
            }
        }
    }

    private static Map<String, String> d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void e(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap<>();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new g01(null));
        } else if (e.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (f01.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    private static <T> void g(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (f01.class) {
            if (obj == k) {
                hashMap.put(str, t);
                f.remove(str);
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z) {
        Object i2 = i(contentResolver);
        Boolean bool = (Boolean) b(g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c2 = c(contentResolver, str, null);
        if (c2 != null && !c2.equals(C0201.m82(14067))) {
            if (c.matcher(c2).matches()) {
                z = true;
                bool = Boolean.TRUE;
            } else if (d.matcher(c2).matches()) {
                z = false;
                bool = Boolean.FALSE;
            } else {
                Log.w(C0201.m82(14071), C0201.m82(14068) + str + C0201.m82(14069) + c2 + C0201.m82(14070));
            }
        }
        g(i2, g, str, bool);
        return z;
    }

    private static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (f01.class) {
            e(contentResolver);
            obj = k;
        }
        return obj;
    }
}
