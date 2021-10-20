package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* renamed from: l61  reason: default package */
public class l61 {
    public static final Uri a = Uri.parse(C0201.m82(24745));
    private static final Uri b = Uri.parse(C0201.m82(24746));
    public static final Pattern c = Pattern.compile(C0201.m82(24747), 2);
    public static final Pattern d = Pattern.compile(C0201.m82(24748), 2);
    private static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(defpackage.l61.a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r13 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r13.moveToFirst() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        d(r0, r14, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r15 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (r15.equals(null) == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0094, code lost:
        d(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0097, code lost:
        if (r15 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0099, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r13 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r13 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a3, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a6, code lost:
        throw r14;
     */
    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (l61.class) {
            c(contentResolver);
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
                        f.putAll(b(contentResolver, m));
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

    private static Map<String, String> b(ContentResolver contentResolver, String... strArr) {
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

    private static void c(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap<>();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new k61(null));
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

    private static void d(Object obj, String str, String str2) {
        synchronized (l61.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }
}
