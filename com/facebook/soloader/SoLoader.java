package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import vigqyno.C0201;

public class SoLoader {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final boolean a;
    public static k b;
    private static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    private static l[] d = null;
    private static volatile int e = 0;
    private static n[] f;
    private static b g;
    private static final HashSet<String> h = new HashSet<>();
    private static final Map<String, Object> i = new HashMap();
    private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    private static m k = null;
    private static int l;
    private static boolean m;
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

    /* access modifiers changed from: private */
    @d
    @TargetApi(14)
    public static class Api14Utils {
        private Api14Utils() {
        }

        public static String a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod(C0201.m82(12662), new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException(C0201.m82(12663), e);
                }
            } else {
                throw new IllegalStateException(C0201.m82(12664) + classLoader.getClass().getName() + C0201.m82(12665));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements k {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Runtime d;
        public final /* synthetic */ Method e;

        public a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = runtime;
            this.e = method;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            r8.addSuppressed(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
            throw r0;
         */
        private String b(String str) {
            try {
                File file = new File(str);
                MessageDigest instance = MessageDigest.getInstance(C0201.m82(27929));
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    } else {
                        String format = String.format(C0201.m82(27930), new BigInteger(1, instance.digest()));
                        fileInputStream.close();
                        return format;
                    }
                }
            } catch (IOException e2) {
                return e2.toString();
            } catch (SecurityException e3) {
                return e3.toString();
            } catch (NoSuchAlgorithmException e4) {
                return e4.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            android.util.Log.e(vigqyno.C0201.m82(27931), vigqyno.C0201.m82(27932) + r1 + vigqyno.C0201.m82(27933) + b(r10) + vigqyno.C0201.m82(27934) + r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
        @Override // com.facebook.soloader.k
        public void a(String str, int i) {
            String str2;
            Throwable th;
            Throwable e2;
            Throwable th2;
            if (this.a) {
                String str3 = (i & 4) == 4 ? this.b : this.c;
                try {
                    synchronized (this.d) {
                        try {
                            str2 = (String) this.e.invoke(this.d, str, SoLoader.class.getClassLoader(), str3);
                            if (str2 == null) {
                                try {
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        throw th2;
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                                        e2 = e3;
                                    }
                                }
                            } else {
                                throw new UnsatisfiedLinkError(str2);
                            }
                        } catch (Throwable th4) {
                            str2 = null;
                            th2 = th4;
                            throw th2;
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e4) {
                    str2 = null;
                    e2 = e4;
                    try {
                        throw new RuntimeException(C0201.m82(27935) + str, e2);
                    } catch (Throwable th5) {
                        th = th5;
                        if (str2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    str2 = null;
                    th = th6;
                    if (str2 != null) {
                        Log.e(C0201.m82(27936), C0201.m82(27937) + str2 + C0201.m82(27938) + b(str) + C0201.m82(27939) + str3);
                    }
                    throw th;
                }
            } else {
                System.load(str);
            }
        }
    }

    public static final class b extends UnsatisfiedLinkError {
        public b(Throwable th, String str) {
            super(C0201.m82(28073) + Arrays.toString(SysUtil.g()) + C0201.m82(28074) + str);
            initCause(th);
        }
    }

    static {
        C0201.m83(SoLoader.class, 84);
        boolean z2 = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z2 = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        a = z2;
    }

    private static void a() {
        c.readLock().lock();
        try {
            if (d == null) {
                throw new RuntimeException(C0201.m82(26651));
            }
        } finally {
            c.readLock().unlock();
        }
    }

    private static boolean b(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 129) == 0) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    private static void c(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z2;
        boolean z3;
        String str2 = t;
        c.readLock().lock();
        try {
            l[] lVarArr = d;
            String str3 = w;
            String str4 = s;
            if (lVarArr != null) {
                c.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a) {
                    Api18TraceUtils.a(F, str, I);
                }
                int i3 = 0;
                do {
                    try {
                        c.readLock().lock();
                        int i4 = e;
                        int i5 = 0;
                        while (true) {
                            if (i3 != 0) {
                                break;
                            }
                            try {
                                if (i5 < d.length) {
                                    i3 = d[i5].a(str, i2, threadPolicy);
                                    if (i3 == 3 && f != null) {
                                        Log.d(str4, q + str);
                                        n[] nVarArr = f;
                                        int length = nVarArr.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                break;
                                            }
                                            n nVar = nVarArr[i6];
                                            nVar.n(str);
                                            int a2 = nVar.a(str, i2, threadPolicy);
                                            if (a2 == 1) {
                                                i3 = a2;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    break;
                                }
                            } catch (Throwable th) {
                                c.readLock().unlock();
                                throw th;
                            }
                        }
                        c.readLock().unlock();
                        if ((i2 & 2) == 2 && i3 == 0) {
                            c.writeLock().lock();
                            try {
                                if (g != null && g.d()) {
                                    e++;
                                }
                                z3 = e != i4;
                                continue;
                            } finally {
                                c.writeLock().unlock();
                            }
                        } else {
                            z3 = false;
                            continue;
                        }
                    } catch (Throwable th2) {
                        if (a) {
                            Api18TraceUtils.b();
                        }
                        if (z2) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i3 == 0 || i3 == 3) {
                            String str5 = str3 + str;
                            String message = th2.getMessage();
                            if (message == null) {
                                message = th2.toString();
                            }
                            th2.printStackTrace();
                            String str6 = (str5 + A + message) + str2 + i3;
                            Log.e(str4, str6);
                            throw new UnsatisfiedLinkError(str6);
                        }
                        return;
                    }
                } while (z3);
                if (a) {
                    Api18TraceUtils.b();
                }
                if (z2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i3 == 0 || i3 == 3) {
                    String str7 = (str3 + str) + str2 + i3;
                    Log.e(str4, str7);
                    throw new UnsatisfiedLinkError(str7);
                }
                return;
            }
            Log.e(str4, L + str + x);
            throw new UnsatisfiedLinkError(str3 + str);
        } catch (Throwable th3) {
            c.readLock().unlock();
            throw th3;
        }
    }

    private static Method d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod(C0201.m82(26652), String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e2) {
                Log.w(C0201.m82(26653), C0201.m82(26654), e2);
            }
        }
        return null;
    }

    public static void e(Context context, int i2) throws IOException {
        f(context, i2, null);
    }

    public static void f(Context context, int i2, k kVar) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m = b(context);
            h(kVar);
            i(context, i2, kVar);
            if (!rl0.b()) {
                rl0.a(new j());
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void g(Context context, boolean z2) {
        try {
            e(context, z2 ? 1 : 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static synchronized void h(k kVar) {
        synchronized (SoLoader.class) {
            if (kVar != null) {
                b = kVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method d2 = d();
            boolean z2 = d2 != null;
            String a2 = z2 ? Api14Utils.a() : null;
            b = new a(z2, a2, n(a2), runtime, d2);
        }
    }

    private static void i(Context context, int i2, k kVar) throws IOException {
        int i3;
        String str = E;
        String str2 = M;
        c.writeLock().lock();
        try {
            if (d == null) {
                Log.d(str2, p);
                l = i2;
                ArrayList arrayList = new ArrayList();
                String str3 = System.getenv(u);
                if (str3 == null) {
                    str3 = r;
                }
                String[] split = str3.split(y);
                for (int i4 = 0; i4 < split.length; i4++) {
                    Log.d(str2, K + split[i4]);
                    arrayList.add(new c(new File(split[i4]), 2));
                }
                if (context != null) {
                    int i5 = i2 & 1;
                    String str4 = G;
                    if (i5 != 0) {
                        f = null;
                        Log.d(str2, J);
                        arrayList.add(0, new e(context, str4));
                    } else {
                        if (m) {
                            i3 = 0;
                        } else {
                            g = new b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            Log.d(str2, z + g.toString());
                            arrayList.add(0, g);
                            i3 = 1;
                        }
                        if ((l & 8) != 0) {
                            f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            a aVar = new a(context, file, str4, i3);
                            arrayList2.add(aVar);
                            Log.d(str2, n + aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d(str2, H);
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < length) {
                                    File file2 = new File(strArr[i6]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(D);
                                    sb.append(i7);
                                    a aVar2 = new a(context, file2, sb.toString(), i3);
                                    Log.d(str2, o + aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i6++;
                                    i7++;
                                }
                            }
                            f = (n[]) arrayList2.toArray(new n[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                l[] lVarArr = (l[]) arrayList.toArray(new l[arrayList.size()]);
                int o2 = o();
                int length2 = lVarArr.length;
                while (true) {
                    int i8 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    Log.d(str2, B + lVarArr[i8]);
                    lVarArr[i8].b(o2);
                    length2 = i8;
                }
                d = lVarArr;
                e++;
                Log.d(str2, C + d.length + v);
            }
        } finally {
            Log.d(str2, str);
            c.writeLock().unlock();
        }
    }

    public static boolean j(String str) {
        return k(str, 0);
    }

    /* JADX INFO: finally extract failed */
    public static boolean k(String str, int i2) throws UnsatisfiedLinkError {
        m mVar;
        boolean z2;
        c.readLock().lock();
        try {
            if (d == null) {
                if (C0201.m82(26655).equals(System.getProperty(C0201.m82(26656)))) {
                    a();
                } else {
                    synchronized (SoLoader.class) {
                        z2 = !h.contains(str);
                        if (z2) {
                            if (k != null) {
                                k.a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    c.readLock().unlock();
                    return z2;
                }
            }
            c.readLock().unlock();
            if (!m || (mVar = k) == null) {
                String b2 = h.b(str);
                return m(System.mapLibraryName(b2 != null ? b2 : str), str, b2, i2 | 2, null);
            }
            mVar.a(str);
            return true;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    public static void l(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        m(str, null, null, i2, threadPolicy);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (com.facebook.soloader.SoLoader.h.contains(r9) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r1 != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5 = vigqyno.C0201.m82(26657);
        android.util.Log.d(r5, vigqyno.C0201.m82(26658) + r9);
        c(r9, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r13 = vigqyno.C0201.m82(26659);
        android.util.Log.d(r13, vigqyno.C0201.m82(26660) + r9);
        com.facebook.soloader.SoLoader.h.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a0, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        r10 = r9.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r10 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        throw new com.facebook.soloader.SoLoader.b(r9, r10.substring(r10.lastIndexOf(vigqyno.C0201.m82(26662))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c9, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d0, code lost:
        throw new java.lang.RuntimeException(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        if ((r12 & 16) != 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e4, code lost:
        if (com.facebook.soloader.SoLoader.j.contains(r10) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e6, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e7, code lost:
        if (r11 == null) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (r2 != false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (com.facebook.soloader.SoLoader.a == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        com.facebook.soloader.Api18TraceUtils.a(vigqyno.C0201.m82(26663), r10, vigqyno.C0201.m82(26664));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r11 = vigqyno.C0201.m82(26665);
        android.util.Log.d(r11, vigqyno.C0201.m82(26666) + r10 + vigqyno.C0201.m82(26667) + r9);
        com.facebook.soloader.h.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0132, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0135, code lost:
        if (com.facebook.soloader.SoLoader.a != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0137, code lost:
        com.facebook.soloader.Api18TraceUtils.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013a, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013b, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013e, code lost:
        return !r1;
     */
    private static boolean m(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z2;
        Object obj;
        boolean z3 = false;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            if (!h.contains(str)) {
                z2 = false;
            } else if (str3 == null) {
                return false;
            } else {
                z2 = true;
            }
            if (i.containsKey(str)) {
                obj = i.get(str);
            } else {
                obj = new Object();
                i.put(str, obj);
            }
        }
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String r0 = C0201.m82(26668);
        String[] split = str.split(r0);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains(C0201.m82(26669))) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(r0, arrayList);
    }

    private static int o() {
        c.writeLock().lock();
        try {
            return (l & 2) != 0 ? 1 : 0;
        } finally {
            c.writeLock().unlock();
        }
    }

    public static File p(String str) throws UnsatisfiedLinkError {
        a();
        try {
            return q(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static File q(String str) throws IOException {
        c.readLock().lock();
        for (int i2 = 0; i2 < d.length; i2++) {
            try {
                File c2 = d[i2].c(str);
                if (c2 != null) {
                    return c2;
                }
            } finally {
                c.readLock().unlock();
            }
        }
        c.readLock().unlock();
        throw new FileNotFoundException(str);
    }
}
