package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.IDynamicInstall;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import com.huawei.hms.feature.dynamic.a.c;
import com.huawei.hms.feature.dynamic.a.d;
import com.huawei.hms.feature.dynamic.a.e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import vigqyno.C0201;

public class DynamicModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new c();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new e();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new d();
    public static final VersionPolicy PREFER_REMOTE = new e();
    private static final String a = DynamicModule.class.getSimpleName();
    private static final int b = 0;
    private static final int c = 0;
    private static final ThreadLocal<HashMap<String, Boolean>> d = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, String>> e = new ThreadLocal<>();
    private static final ThreadLocal<HashMap<String, IDynamicLoader>> f = new ThreadLocal<>();
    private static int h;
    private static final int i = 0;
    private static final int j = 0;
    private Context g;

    public static class DynamicLoaderClassLoader {
        private static HashMap<String, ClassLoader> a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            a.put(str, classLoader);
        }
    }

    public static class LoadingException extends Exception {
        private Bundle a;

        private LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, byte b) {
            this(str);
        }

        private LoadingException(String str, Bundle bundle) {
            super(str);
            this.a = bundle;
        }

        public /* synthetic */ LoadingException(String str, Bundle bundle, byte b) {
            this(str, bundle);
        }

        public Bundle getBundle() {
            return this.a;
        }
    }

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    /* access modifiers changed from: package-private */
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }
    }

    static {
        C0201.m83(DynamicModule.class, 378);
    }

    private DynamicModule(Context context) {
        this.g = context;
    }

    public static Set<String> GetInstalledModuleInfo() {
        return c.a().a;
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper load = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(C0201.m82(11028)), ObjectWrapper.wrap(bundle));
            if (ObjectWrapper.unwrap(load) == null) {
                Logger.w(a, C0201.m82(11029));
                return null;
            } else if (ObjectWrapper.unwrap(load) instanceof Context) {
                Logger.i(a, C0201.m82(11030));
                return (Context) ObjectWrapper.unwrap(load);
            } else if (!ObjectWrapper.unwrap(load).getClass().getName().equals(LoadingException.class.getName())) {
                return null;
            } else {
                Logger.w(a, C0201.m82(11032));
                throw new LoadingException(C0201.m82(11033), (Bundle) ObjectWrapper.unwrap(load).getClass().getDeclaredMethod(C0201.m82(11031), new Class[0]).invoke(ObjectWrapper.unwrap(load), new Object[0]), (byte) 0);
            }
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.w(a, C0201.m82(11034), e3);
            return null;
        }
    }

    private static Bundle a(Context context, String str) throws LoadingException, a {
        try {
            Bundle d2 = d(context, str);
            String string = d2.getString(C0201.m82(11035));
            if (TextUtils.isEmpty(string) || !new File(string).exists()) {
                String str2 = a;
                Logger.w(str2, C0201.m82(11038) + string + C0201.m82(11039));
                throw new LoadingException(C0201.m82(11040), (byte) 0);
            }
            String str3 = a;
            Logger.i(str3, C0201.m82(11036) + str + C0201.m82(11037));
            return d2;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a(C0201.m82(11041) + str + C0201.m82(11042), (byte) 0);
        }
    }

    private static DynamicModule a(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                bool = (Boolean) ((HashMap) Objects.requireNonNull(d.get())).get(str);
                iDynamicLoader = (IDynamicLoader) ((HashMap) Objects.requireNonNull(f.get())).get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException(C0201.m82(11044) + str + C0201.m82(11045), (byte) 0);
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context a2 = a(context, str, bundle, iDynamicLoader);
            if (a2 != null) {
                return new DynamicModule(a2);
            }
            throw new LoadingException(C0201.m82(11043), (byte) 0);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new LoadingException(C0201.m82(11046), (byte) 0);
        }
    }

    private static IDynamicInstall a(Context context) throws LoadingException {
        int i2;
        int i3;
        String r0 = C0201.m82(11047);
        String str = null;
        try {
            Bundle a2 = a(context, r0);
            str = a2.getString(C0201.m82(11048));
            i2 = a2.getInt(C0201.m82(11049));
        } catch (Exception e2) {
            Logger.w(a, C0201.m82(11050), e2);
            i2 = 0;
        }
        try {
            i3 = getLocalVersion(context, r0);
        } catch (Exception e3) {
            Logger.w(a, C0201.m82(11051), e3);
            i3 = 0;
        }
        String str2 = a;
        Logger.i(str2, C0201.m82(11052) + i2 + C0201.m82(11053) + str + C0201.m82(11054) + i3);
        int i4 = i2 > i3 ? i2 : i3;
        if (i4 <= 10009300) {
            String str3 = a;
            Logger.w(str3, C0201.m82(11057) + i4 + C0201.m82(11058));
            throw new LoadingException(C0201.m82(11059) + i4 + C0201.m82(11060), (byte) 0);
        } else if (i2 > i3) {
            Logger.i(a, C0201.m82(11055).concat(String.valueOf(str)));
            h = 1;
            return a(str);
        } else {
            Logger.i(a, C0201.m82(11056));
            h = 2;
            return b(context);
        }
    }

    private static IDynamicInstall a(String str) throws LoadingException {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return IDynamicInstall.Stub.asInterface((IBinder) new com.huawei.hms.feature.dynamic.a.a(str, ClassLoader.getSystemClassLoader()).loadClass(C0201.m82(11061)).getConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                throw new LoadingException(C0201.m82(11063) + e2.getMessage(), (byte) 0);
            }
        }
        throw new LoadingException(C0201.m82(11062), (byte) 0);
    }

    private static void a(final String str, ClassLoader classLoader) throws LoadingException {
        try {
            final IBinder iBinder = (IBinder) classLoader.loadClass(C0201.m82(11064)).getConstructor(new Class[0]).newInstance(new Object[0]);
            f.set(new HashMap<String, IDynamicLoader>() {
                /* class com.huawei.hms.feature.dynamic.DynamicModule.AnonymousClass3 */

                {
                    put(str, IDynamicLoader.Stub.asInterface(iBinder));
                }
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException(C0201.m82(11065) + e2.getMessage(), (byte) 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        com.huawei.hms.common.util.Logger.i(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11071));
        r4 = new com.huawei.hms.feature.dynamic.a.b(r7, r10.getFilesDir().getAbsolutePath(), java.lang.ClassLoader.getSystemClassLoader());
        a(r11, r4);
        r0.invoke(null, r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r10 = new com.huawei.hms.feature.dynamic.a.a(r7, java.lang.ClassLoader.getSystemClassLoader());
        a(r11, r10);
        r0.invoke(null, r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        com.huawei.hms.feature.dynamic.DynamicModule.d.set(new com.huawei.hms.feature.dynamic.DynamicModule.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f3, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f8, code lost:
        com.huawei.hms.common.util.Logger.w(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11072), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7 A[ExcHandler: Exception (r10v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    private static Bundle b(Context context, final String str) throws LoadingException {
        boolean z = true;
        try {
            Class<?> loadClass = (context.getApplicationContext() == null ? context : context.getApplicationContext()).getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
            Method declaredMethod = loadClass.getDeclaredMethod(C0201.m82(11066), String.class);
            Method declaredMethod2 = loadClass.getDeclaredMethod(C0201.m82(11067), String.class, ClassLoader.class);
            ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
            if (classLoader == null) {
                try {
                    Logger.i(a, C0201.m82(11070));
                    Bundle c2 = c(context, str);
                    synchronized (DynamicModule.class) {
                        String str2 = (String) ((HashMap) Objects.requireNonNull(e.get())).get(str);
                        if (TextUtils.isEmpty(str2)) {
                            return c2;
                        }
                    }
                } catch (a unused) {
                }
            } else if (classLoader == ClassLoader.getSystemClassLoader()) {
                z = false;
                HashMap<String, Boolean> hashMap = new HashMap<>();
                hashMap.put(str, Boolean.valueOf(z));
                d.set(hashMap);
                return new Bundle();
            } else {
                Logger.i(a, C0201.m82(11068));
                a(str, classLoader);
                HashMap<String, Boolean> hashMap2 = new HashMap<>();
                hashMap2.put(str, Boolean.valueOf(z));
                d.set(hashMap2);
                return new Bundle();
            }
        } catch (LoadingException e2) {
            Logger.w(a, C0201.m82(11069), e2);
        } catch (Exception e3) {
        }
    }

    private static IDynamicInstall b(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(C0201.m82(11073)).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException(C0201.m82(11074) + e2.getMessage(), (byte) 0);
        }
    }

    private static Bundle c(Context context, final String str) throws LoadingException, a {
        try {
            Bundle d2 = d(context, str);
            final String string = d2.getString(C0201.m82(11075));
            if (!TextUtils.isEmpty(string)) {
                if (new File(string).exists()) {
                    e.set(new HashMap<String, String>() {
                        /* class com.huawei.hms.feature.dynamic.DynamicModule.AnonymousClass2 */

                        {
                            put(str, string);
                        }
                    });
                    String str2 = a;
                    Logger.i(str2, C0201.m82(11076) + str + C0201.m82(11077));
                    return d2;
                }
            }
            String str3 = a;
            Logger.w(str3, C0201.m82(11078) + string + C0201.m82(11079));
            d2.putInt(C0201.m82(11080), -100);
            return d2;
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a(C0201.m82(11081), (byte) 0);
        }
    }

    private static Bundle d(Context context, String str) throws LoadingException, a {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                Bundle call = contentResolver.call(Uri.parse(C0201.m82(11082)), str, (String) null, (Bundle) null);
                if (call != null) {
                    int i2 = call.getInt(C0201.m82(11083));
                    String string = call.getString(C0201.m82(11084));
                    String str2 = a;
                    Logger.i(str2, C0201.m82(11085) + i2 + C0201.m82(11086) + call.getInt(C0201.m82(11087)) + C0201.m82(11088) + call.getString(C0201.m82(11089)) + C0201.m82(11090) + call.getInt(C0201.m82(11091)) + C0201.m82(11092) + string + C0201.m82(11093) + call.getInt(C0201.m82(11094)));
                    if (i2 == 0) {
                        return call;
                    }
                    String str3 = a;
                    Logger.w(str3, C0201.m82(11095) + str + C0201.m82(11096) + i2);
                    throw new LoadingException(C0201.m82(11097) + str + C0201.m82(11098) + i2, call, (byte) 0);
                }
                Logger.w(a, C0201.m82(11099));
                throw new a(C0201.m82(11100), (byte) 0);
            }
            throw new a(C0201.m82(11101), (byte) 0);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception unused) {
            throw new a(C0201.m82(11102) + str + C0201.m82(11103), (byte) 0);
        }
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString(C0201.m82(11104), str);
        bundle.putInt(C0201.m82(11105), localVersion);
        return bundle;
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.e(a, C0201.m82(11111));
            return 0;
        }
        try {
            String str2 = C0201.m82(11106) + str + C0201.m82(11107);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(str2).getDeclaredField(C0201.m82(11108)).getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(a, C0201.m82(11110).concat(String.valueOf(str)));
            return 0;
        } catch (Exception e2) {
            Logger.w(a, C0201.m82(11109), e2);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (com.huawei.hms.feature.dynamic.DynamicModule.d.get().get(r5).booleanValue() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return c(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        com.huawei.hms.common.util.Logger.w(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11113), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        return new android.os.Bundle();
     */
    public static Bundle getRemoteModuleInfo(Context context, String str) throws LoadingException {
        try {
            synchronized (DynamicModule.class) {
                if (d.get() == null || d.get().get(str) == null || !d.get().get(str).booleanValue()) {
                    Bundle b2 = b(context, str);
                    if (b2.getInt(C0201.m82(11112)) > 0) {
                        return b2;
                    }
                }
            }
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
            String str2 = a;
            Logger.w(str2, C0201.m82(11114) + str + C0201.m82(11115), e3);
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        String r0 = C0201.m82(11116);
        try {
            Bundle c2 = c(context, str);
            if (c2 != null && !c2.isEmpty()) {
                return c2.getInt(C0201.m82(11117));
            }
            String str2 = a;
            Logger.w(str2, r0 + str + C0201.m82(11118));
            throw new LoadingException(C0201.m82(11119), (byte) 0);
        } catch (a e2) {
            String str3 = a;
            Logger.w(str3, r0 + str + C0201.m82(11120) + e2);
            return 0;
        }
    }

    public static void install(Context context) {
        if (context == null) {
            Logger.e(a, C0201.m82(11121));
            return;
        }
        try {
            IDynamicInstall a2 = a(context);
            if (a2 != null) {
                Bundle install = a2.install(ObjectWrapper.wrap(context), new Bundle());
                if (install != null) {
                    c.a().a(install);
                    Logger.i(a, C0201.m82(11122));
                    return;
                }
                throw new LoadingException(C0201.m82(11123), (byte) 0);
            }
            throw new LoadingException(C0201.m82(11124), (byte) 0);
        } catch (RemoteException | LoadingException | NullPointerException e2) {
            if (h == 2 || getLocalVersion(context, C0201.m82(11125)) <= 0) {
                Logger.w(a, C0201.m82(11130), e2);
                return;
            }
            Logger.i(a, C0201.m82(11126));
            Bundle install2 = b(context).install(ObjectWrapper.wrap(context), new Bundle());
            if (install2 != null) {
                c.a().a(install2);
                Logger.i(a, C0201.m82(11127));
                return;
            }
            throw new LoadingException(C0201.m82(11128), (byte) 0);
        } catch (RemoteException | LoadingException | NullPointerException e3) {
            Logger.w(a, C0201.m82(11129), e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        com.huawei.hms.common.util.Logger.w(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11132), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (getLocalVersion(r5, r7) > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        com.huawei.hms.common.util.Logger.d(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11133));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        com.huawei.hms.common.util.Logger.e(com.huawei.hms.feature.dynamic.DynamicModule.a, vigqyno.C0201.m82(11137).concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a6, code lost:
        throw new com.huawei.hms.feature.dynamic.DynamicModule.LoadingException(vigqyno.C0201.m82(11138), (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return new com.huawei.hms.feature.dynamic.DynamicModule(r5.getApplicationContext());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[ExcHandler: Exception (r5v3 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:9:0x0016] */
    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException(C0201.m82(11139), (byte) 0);
        }
        try {
            Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
            if (moduleInfo.getInt(C0201.m82(11131)) > 0) {
                return a(context, str, moduleInfo);
            }
            if (moduleInfo.getInt(C0201.m82(11134)) > 0) {
                Logger.i(a, C0201.m82(11135));
                return new DynamicModule(context.getApplicationContext());
            }
            throw new LoadingException(C0201.m82(11136), (byte) 0);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Exception e3) {
        }
    }

    public final Context getModuleContext() {
        return this.g;
    }
}
