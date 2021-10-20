package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

public final class c0 {
    private int a = 0;
    private final Map<Integer, at1<Void>> b = new r0();
    private final y c;

    public c0(y yVar) {
        this.c = yVar;
    }

    private static boolean b(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c2 = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c2 = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    firebaseInstanceId.t(str3);
                    if (FirebaseInstanceId.B()) {
                        Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                    }
                } else if (c2 == 1) {
                    firebaseInstanceId.u(str3);
                    if (FirebaseInstanceId.B()) {
                        Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }

    private final String d() {
        String d;
        synchronized (this.c) {
            d = this.c.d();
        }
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        String[] split = d.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final synchronized boolean f(String str) {
        synchronized (this.c) {
            String d = this.c.d();
            String valueOf = String.valueOf(str);
            if (!d.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                return false;
            }
            String valueOf2 = String.valueOf(str);
            this.c.i(d.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
            return true;
        }
    }

    public final synchronized zs1<Void> a(String str) {
        String d;
        at1<Void> at1;
        int i;
        synchronized (this.c) {
            d = this.c.d();
            y yVar = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(str).length());
            sb.append(d);
            sb.append(",");
            sb.append(str);
            yVar.i(sb.toString());
        }
        at1 = new at1<>();
        Map<Integer, at1<Void>> map = this.b;
        if (TextUtils.isEmpty(d)) {
            i = 0;
        } else {
            i = d.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.a + i), at1);
        return at1.a();
    }

    public final synchronized boolean c() {
        return d() != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (b(r5, r0) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r4.b.remove(java.lang.Integer.valueOf(r4.a));
        f(r0);
        r4.a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r2.c(null);
     */
    public final boolean e(FirebaseInstanceId firebaseInstanceId) {
        while (true) {
            synchronized (this) {
                String d = d();
                if (d == null) {
                    if (FirebaseInstanceId.B()) {
                        Log.d("FirebaseInstanceId", "topic sync succeeded");
                    }
                    return true;
                }
            }
        }
    }
}
