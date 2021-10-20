package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.g;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class DynamiteModule {
    private static Boolean b;
    private static h c;
    private static j d;
    private static String e;
    private static int f;
    private static final ThreadLocal<c> g = new ThreadLocal<>();
    private static final b.AbstractC0060b h = new a();
    public static final b i = new c();
    public static final b j = new b();
    public static final b k = new d();
    public static final b l = new e();
    private final Context a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ a(String str, a aVar) {
            this(str);
        }

        public /* synthetic */ a(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface b {

        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class a {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public interface AbstractC0060b {
            int a(Context context, String str);

            int b(Context context, String str, boolean z) throws a;
        }

        a a(Context context, String str, AbstractC0060b bVar) throws a;
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class c {
        public Cursor a;

        private c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class d implements b.AbstractC0060b {
        private final int a;

        public d(int i, int i2) {
            this.a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC0060b
        public final int a(Context context, String str) {
            return this.a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.AbstractC0060b
        public final int b(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        C0201.m83(DynamiteModule.class, 708);
    }

    private DynamiteModule(Context context) {
        u.k(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        String r0 = C0201.m82(10588);
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append(C0201.m82(10589));
            sb.append(str);
            sb.append(C0201.m82(10590));
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField(C0201.m82(10591));
            Field declaredField2 = loadClass.getDeclaredField(C0201.m82(10592));
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append(C0201.m82(10593));
            sb2.append(valueOf);
            sb2.append(C0201.m82(10594));
            sb2.append(str);
            sb2.append(C0201.m82(10595));
            Log.e(r0, sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append(C0201.m82(10597));
            sb3.append(str);
            sb3.append(C0201.m82(10598));
            Log.w(r0, sb3.toString());
            return 0;
        } catch (Exception e2) {
            String r7 = C0201.m82(10596);
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e(r0, valueOf2.length() != 0 ? r7.concat(valueOf2) : new String(r7));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) throws a {
        String r0 = C0201.m82(10599);
        String r1 = C0201.m82(10600);
        c cVar = g.get();
        c cVar2 = new c(null);
        g.set(cVar2);
        try {
            b.a a2 = bVar.a(context, str, h);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append(C0201.m82(10601));
            sb.append(str);
            sb.append(r0);
            sb.append(i2);
            sb.append(C0201.m82(10602));
            sb.append(str);
            sb.append(r0);
            sb.append(i3);
            Log.i(r1, sb.toString());
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                int i4 = a2.a;
                int i5 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append(C0201.m82(10606));
                sb2.append(i4);
                sb2.append(C0201.m82(10607));
                sb2.append(i5);
                sb2.append(C0201.m82(10608));
                throw new a(sb2.toString(), (a) null);
            } else if (a2.c == -1) {
                return m(context, str);
            } else {
                if (a2.c == 1) {
                    try {
                        DynamiteModule g2 = g(context, str, a2.b);
                        Cursor cursor = cVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        g.set(cVar);
                        return g2;
                    } catch (a e2) {
                        String r7 = C0201.m82(10603);
                        String valueOf = String.valueOf(e2.getMessage());
                        Log.w(r1, valueOf.length() != 0 ? r7.concat(valueOf) : new String(r7));
                        if (a2.a == 0 || bVar.a(context, str, new d(a2.a, 0)).c != -1) {
                            throw new a(C0201.m82(10604), e2, null);
                        }
                        DynamiteModule m = m(context, str);
                        Cursor cursor2 = cVar2.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        g.set(cVar);
                        return m;
                    }
                } else {
                    int i6 = a2.c;
                    StringBuilder sb3 = new StringBuilder(47);
                    sb3.append(C0201.m82(10605));
                    sb3.append(i6);
                    throw new a(sb3.toString(), (a) null);
                }
            }
        } finally {
            Cursor cursor3 = cVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            g.set(cVar);
        }
    }

    public static int f(Context context, String str, boolean z) {
        Boolean bool;
        ClassLoader classLoader;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = b;
                if (bool2 == null) {
                    try {
                        Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = loadClass.getDeclaredField(C0201.m82(10609));
                        synchronized (loadClass) {
                            ClassLoader classLoader2 = (ClassLoader) declaredField.get(null);
                            if (classLoader2 != null) {
                                if (classLoader2 == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        h(classLoader2);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if (C0201.m82(10610).equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int l2 = l(context, str, z);
                                    if (e != null) {
                                        if (!e.isEmpty()) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                classLoader = new DelegateLastClassLoader(e, ClassLoader.getSystemClassLoader());
                                            } else {
                                                classLoader = new f(e, ClassLoader.getSystemClassLoader());
                                            }
                                            h(classLoader);
                                            declaredField.set(null, classLoader);
                                            b = Boolean.TRUE;
                                            return l2;
                                        }
                                    }
                                    return l2;
                                } catch (a unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                    bool2 = bool;
                                    b = bool2;
                                    if (!bool2.booleanValue()) {
                                        return j(context, str, z);
                                    }
                                    try {
                                        return l(context, str, z);
                                    } catch (a e2) {
                                        String r11 = C0201.m82(10613);
                                        String r0 = C0201.m82(10614);
                                        String valueOf = String.valueOf(e2.getMessage());
                                        Log.w(r11, valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
                                        return 0;
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String r2 = C0201.m82(10611);
                        String valueOf2 = String.valueOf(e3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb.append(C0201.m82(10612));
                        sb.append(valueOf2);
                        Log.w(r2, sb.toString());
                        bool2 = Boolean.FALSE;
                    }
                }
            }
        } catch (Throwable th) {
            g.a(context, th);
            throw th;
        }
    }

    private static DynamiteModule g(Context context, String str, int i2) throws a {
        Boolean bool;
        yq0 yq0;
        try {
            synchronized (DynamiteModule.class) {
                bool = b;
            }
            if (bool == null) {
                throw new a(C0201.m82(10622), (a) null);
            } else if (bool.booleanValue()) {
                return k(context, str, i2);
            } else {
                String r1 = C0201.m82(10615);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append(C0201.m82(10616));
                sb.append(str);
                sb.append(C0201.m82(10617));
                sb.append(i2);
                Log.i(r1, sb.toString());
                h n = n(context);
                if (n != null) {
                    if (n.u3() >= 2) {
                        yq0 = n.y2(ar0.W3(context), str, i2);
                    } else {
                        Log.w(C0201.m82(10618), C0201.m82(10619));
                        yq0 = n.N0(ar0.W3(context), str, i2);
                    }
                    if (ar0.V3(yq0) != null) {
                        return new DynamiteModule((Context) ar0.V3(yq0));
                    }
                    throw new a(C0201.m82(10620), (a) null);
                }
                throw new a(C0201.m82(10621), (a) null);
            }
        } catch (RemoteException e2) {
            throw new a(C0201.m82(10624), e2, null);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            g.a(context, th);
            throw new a(C0201.m82(10623), th, null);
        }
    }

    private static void h(ClassLoader classLoader) throws a {
        j jVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass(C0201.m82(10625)).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(10626));
                if (queryLocalInterface instanceof j) {
                    jVar = (j) queryLocalInterface;
                } else {
                    jVar = new i(iBinder);
                }
            }
            d = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a(C0201.m82(10627), e2, null);
        }
    }

    private static Boolean i() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f >= 2);
        }
        return valueOf;
    }

    private static int j(Context context, String str, boolean z) {
        String r0 = C0201.m82(10628);
        h n = n(context);
        if (n == null) {
            return 0;
        }
        try {
            if (n.u3() >= 2) {
                return n.M1(ar0.W3(context), str, z);
            }
            Log.w(r0, C0201.m82(10629));
            return n.o2(ar0.W3(context), str, z);
        } catch (RemoteException e2) {
            String r7 = C0201.m82(10630);
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(r0, valueOf.length() != 0 ? r7.concat(valueOf) : new String(r7));
            return 0;
        }
    }

    private static DynamiteModule k(Context context, String str, int i2) throws a, RemoteException {
        j jVar;
        yq0 yq0;
        String r0 = C0201.m82(10631);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append(C0201.m82(10632));
        sb.append(str);
        sb.append(C0201.m82(10633));
        sb.append(i2);
        Log.i(r0, sb.toString());
        synchronized (DynamiteModule.class) {
            jVar = d;
        }
        if (jVar != null) {
            c cVar = g.get();
            if (cVar == null || cVar.a == null) {
                throw new a(C0201.m82(10639), (a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.a;
            ar0.W3(null);
            if (i().booleanValue()) {
                Log.v(C0201.m82(10634), C0201.m82(10635));
                yq0 = jVar.b0(ar0.W3(applicationContext), str, i2, ar0.W3(cursor));
            } else {
                Log.w(C0201.m82(10636), C0201.m82(10637));
                yq0 = jVar.X(ar0.W3(applicationContext), str, i2, ar0.W3(cursor));
            }
            Context context2 = (Context) ar0.V3(yq0);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new a(C0201.m82(10638), (a) null);
        }
        throw new a(C0201.m82(10640), (a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc A[Catch:{ all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    private static int l(Context context, String str, boolean z) throws a {
        Throwable th;
        Cursor cursor;
        Exception e2;
        Cursor cursor2 = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String r9 = z ? C0201.m82(10641) : C0201.m82(10642);
            StringBuilder sb = new StringBuilder(r9.length() + 42 + String.valueOf(str).length());
            sb.append(C0201.m82(10643));
            sb.append(r9);
            sb.append(C0201.m82(10644));
            sb.append(str);
            Cursor query = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i2 = query.getInt(0);
                        if (i2 > 0) {
                            synchronized (DynamiteModule.class) {
                                e = query.getString(2);
                                int columnIndex = query.getColumnIndex(C0201.m82(10645));
                                if (columnIndex >= 0) {
                                    f = query.getInt(columnIndex);
                                }
                            }
                            c cVar = g.get();
                            if (cVar != null && cVar.a == null) {
                                cVar.a = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                return i2;
                            }
                        }
                        cursor2 = query;
                        if (cursor2 != null) {
                        }
                        return i2;
                    }
                } catch (Exception e3) {
                    cursor = query;
                    e2 = e3;
                    try {
                        if (!(e2 instanceof a)) {
                            throw e2;
                        }
                        throw new a(C0201.m82(10649), e2, null);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = query;
                    th = th3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            Log.w(C0201.m82(10646), C0201.m82(10647));
            throw new a(C0201.m82(10648), (a) null);
        } catch (Exception e4) {
            e2 = e4;
            cursor = null;
            if (!(e2 instanceof a)) {
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private static DynamiteModule m(Context context, String str) {
        String valueOf = String.valueOf(str);
        int length = valueOf.length();
        String r1 = C0201.m82(10650);
        Log.i(C0201.m82(10651), length != 0 ? r1.concat(valueOf) : new String(r1));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static h n(Context context) {
        h hVar;
        synchronized (DynamiteModule.class) {
            if (c != null) {
                return c;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext(C0201.m82(10652), 3).getClassLoader().loadClass(C0201.m82(10653)).newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(10654));
                    if (queryLocalInterface instanceof h) {
                        hVar = (h) queryLocalInterface;
                    } else {
                        hVar = new g(iBinder);
                    }
                }
                if (hVar != null) {
                    c = hVar;
                    return hVar;
                }
            } catch (Exception e2) {
                String r2 = C0201.m82(10655);
                String r3 = C0201.m82(10656);
                String valueOf = String.valueOf(e2.getMessage());
                Log.e(r2, valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            }
            return null;
        }
    }

    public final Context b() {
        return this.a;
    }

    public final IBinder d(String str) throws a {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String r2 = C0201.m82(10657);
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? r2.concat(valueOf) : new String(r2), e2, null);
        }
    }
}
