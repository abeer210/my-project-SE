package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: w4  reason: default package */
/* compiled from: LocalBroadcastManager */
public final class w4 {
    public static final String A = null;
    private static final Object f = new Object();
    private static w4 g;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<>();
    private final HashMap<String, ArrayList<c>> c = new HashMap<>();
    private final ArrayList<b> d = new ArrayList<>();
    private final Handler e;

    /* renamed from: w4$a */
    /* compiled from: LocalBroadcastManager */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                w4.this.a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4$b */
    /* compiled from: LocalBroadcastManager */
    public static final class b {
        public final Intent a;
        public final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4$c */
    /* compiled from: LocalBroadcastManager */
    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(C0201.m82(35604));
            sb.append(this.b);
            sb.append(C0201.m82(35605));
            sb.append(this.a);
            if (this.d) {
                sb.append(C0201.m82(35606));
            }
            sb.append(C0201.m82(35607));
            return sb.toString();
        }
    }

    static {
        C0201.m83(w4.class, 32);
    }

    private w4(Context context) {
        this.a = context;
        this.e = new a(context.getMainLooper());
    }

    public static w4 b(Context context) {
        w4 w4Var;
        synchronized (f) {
            if (g == null) {
                g = new w4(context.getApplicationContext());
            }
            w4Var = g;
        }
        return w4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.b.onReceive(r10.a, r4.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    public void a() {
        while (true) {
            synchronized (this.b) {
                int size = this.d.size();
                if (size > 0) {
                    b[] bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } else {
                    return;
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<c> arrayList2 = this.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        ArrayList<c> arrayList;
        String str2;
        int i2;
        ArrayList arrayList2;
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                Log.v(r, j + resolveTypeIfNeeded + h + scheme + v + intent);
            }
            ArrayList<c> arrayList3 = this.c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z2) {
                    Log.v(m, i + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    c cVar = arrayList3.get(i3);
                    if (z2) {
                        Log.v(o, p + cVar.a);
                    }
                    if (cVar.c) {
                        if (z2) {
                            Log.v(y, n);
                        }
                        i2 = i3;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        i2 = i3;
                        str2 = action;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = cVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, z);
                        if (match >= 0) {
                            if (z2) {
                                Log.v(u, x + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(cVar);
                            cVar.c = true;
                            i3 = i2 + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z2) {
                            String str3 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? k : A : w : q : s;
                            Log.v(l, t + str3);
                        }
                    }
                    arrayList4 = arrayList2;
                    i3 = i2 + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList4 != null) {
                    for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                        ((c) arrayList4.get(i4)).c = false;
                    }
                    this.d.add(new b(intent, arrayList4));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
