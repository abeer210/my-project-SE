package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import vigqyno.C0201;

/* renamed from: fa  reason: default package */
/* compiled from: LottieCompositionFactory */
public class fa {
    private static final Map<String, na<ea>> a = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: fa$a */
    /* compiled from: LottieCompositionFactory */
    public class a implements ia<ea> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public void onResult(ea eaVar) {
            fa.a.remove(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$b */
    /* compiled from: LottieCompositionFactory */
    public class b implements ia<Throwable> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            fa.a.remove(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$c */
    /* compiled from: LottieCompositionFactory */
    public class c implements Callable<ma<ea>> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* renamed from: a */
        public ma<ea> call() {
            return de.e(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$d */
    /* compiled from: LottieCompositionFactory */
    public class d implements Callable<ma<ea>> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public d(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* renamed from: a */
        public ma<ea> call() {
            return fa.f(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$e */
    /* compiled from: LottieCompositionFactory */
    public class e implements Callable<ma<ea>> {
        public final /* synthetic */ WeakReference a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int c;

        public e(WeakReference weakReference, Context context, int i) {
            this.a = weakReference;
            this.b = context;
            this.c = i;
        }

        /* renamed from: a */
        public ma<ea> call() {
            Context context = (Context) this.a.get();
            if (context == null) {
                context = this.b;
            }
            return fa.n(context, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$f */
    /* compiled from: LottieCompositionFactory */
    public class f implements Callable<ma<ea>> {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ String b;

        public f(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        /* renamed from: a */
        public ma<ea> call() {
            return fa.h(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa$g */
    /* compiled from: LottieCompositionFactory */
    public class g implements Callable<ma<ea>> {
        public final /* synthetic */ ea a;

        public g(ea eaVar) {
            this.a = eaVar;
        }

        /* renamed from: a */
        public ma<ea> call() {
            return new ma<>(this.a);
        }
    }

    private static na<ea> b(String str, Callable<ma<ea>> callable) {
        ea a2 = str == null ? null : lc.b().a(str);
        if (a2 != null) {
            return new na<>(new g(a2));
        }
        if (str != null && a.containsKey(str)) {
            return a.get(str);
        }
        na<ea> naVar = new na<>(callable);
        if (str != null) {
            naVar.f(new a(str));
            naVar.e(new b(str));
            a.put(str, naVar);
        }
        return naVar;
    }

    private static ha c(ea eaVar, String str) {
        for (ha haVar : eaVar.i().values()) {
            if (haVar.b().equals(str)) {
                return haVar;
            }
        }
        return null;
    }

    public static na<ea> d(Context context, String str) {
        return e(context, str, C0201.m82(14361) + str);
    }

    public static na<ea> e(Context context, String str, String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    public static ma<ea> f(Context context, String str, String str2) {
        try {
            if (str.endsWith(C0201.m82(14362))) {
                return r(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return h(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new ma<>(e2);
        }
    }

    public static na<ea> g(InputStream inputStream, String str) {
        return b(str, new f(inputStream, str));
    }

    public static ma<ea> h(InputStream inputStream, String str) {
        return i(inputStream, str, true);
    }

    private static ma<ea> i(InputStream inputStream, String str, boolean z) {
        try {
            return j(qf.x(jy2.d(jy2.k(inputStream))), str);
        } finally {
            if (z) {
                ag.c(inputStream);
            }
        }
    }

    public static ma<ea> j(qf qfVar, String str) {
        return k(qfVar, str, true);
    }

    private static ma<ea> k(qf qfVar, String str, boolean z) {
        try {
            ea a2 = xe.a(qfVar);
            if (str != null) {
                lc.b().c(str, a2);
            }
            ma<ea> maVar = new ma<>(a2);
            if (z) {
                ag.c(qfVar);
            }
            return maVar;
        } catch (Exception e2) {
            ma<ea> maVar2 = new ma<>(e2);
            if (z) {
                ag.c(qfVar);
            }
            return maVar2;
        } catch (Throwable th) {
            if (z) {
                ag.c(qfVar);
            }
            throw th;
        }
    }

    public static na<ea> l(Context context, int i) {
        return m(context, i, u(context, i));
    }

    public static na<ea> m(Context context, int i, String str) {
        return b(str, new e(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static ma<ea> n(Context context, int i) {
        return o(context, i, u(context, i));
    }

    public static ma<ea> o(Context context, int i, String str) {
        try {
            return h(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e2) {
            return new ma<>(e2);
        }
    }

    public static na<ea> p(Context context, String str) {
        return q(context, str, C0201.m82(14363) + str);
    }

    public static na<ea> q(Context context, String str, String str2) {
        return b(str2, new c(context, str, str2));
    }

    public static ma<ea> r(ZipInputStream zipInputStream, String str) {
        try {
            return s(zipInputStream, str);
        } finally {
            ag.c(zipInputStream);
        }
    }

    private static ma<ea> s(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ea eaVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains(C0201.m82(14364))) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(C0201.m82(14365))) {
                    eaVar = k(qf.x(jy2.d(jy2.k(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(C0201.m82(14366))) {
                        if (!name.contains(C0201.m82(14367))) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split(C0201.m82(14368));
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eaVar == null) {
                return new ma<>(new IllegalArgumentException(C0201.m82(14369)));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ha c2 = c(eaVar, (String) entry.getKey());
                if (c2 != null) {
                    c2.f(ag.l((Bitmap) entry.getValue(), c2.e(), c2.c()));
                }
            }
            for (Map.Entry<String, ha> entry2 : eaVar.i().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new ma<>(new IllegalStateException(C0201.m82(14370) + entry2.getValue().b()));
                }
            }
            if (str != null) {
                lc.b().c(str, eaVar);
            }
            return new ma<>(eaVar);
        } catch (IOException e2) {
            return new ma<>(e2);
        }
    }

    private static boolean t(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static String u(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(14371));
        sb.append(t(context) ? C0201.m82(14372) : C0201.m82(14373));
        sb.append(i);
        return sb.toString();
    }
}
