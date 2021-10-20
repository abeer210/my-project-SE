package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.k2;
import defpackage.l1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: j2  reason: default package */
/* compiled from: FontsContractCompat */
public class j2 {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final v0<String, Typeface> a = new v0<>(16);
    private static final k2 b = new k2(C0201.m82(20333), 10, 10000);
    public static final Object c = new Object();
    public static final x0<String, ArrayList<k2.d<g>>> d = new x0<>();
    private static final Comparator<byte[]> e = new d();
    public static final String f = null;
    public static final String g = null;
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

    /* access modifiers changed from: package-private */
    /* renamed from: j2$a */
    /* compiled from: FontsContractCompat */
    public static class a implements Callable<g> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ i2 b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public a(Context context, i2 i2Var, int i, String str) {
            this.a = context;
            this.b = i2Var;
            this.c = i;
            this.d = str;
        }

        /* renamed from: a */
        public g call() throws Exception {
            g f = j2.f(this.a, this.b, this.c);
            Typeface typeface = f.a;
            if (typeface != null) {
                j2.a.d(this.d, typeface);
            }
            return f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2$b */
    /* compiled from: FontsContractCompat */
    public static class b implements k2.d<g> {
        public final /* synthetic */ l1.a a;
        public final /* synthetic */ Handler b;

        public b(l1.a aVar, Handler handler) {
            this.a = aVar;
            this.b = handler;
        }

        /* renamed from: b */
        public void a(g gVar) {
            if (gVar == null) {
                this.a.a(1, this.b);
                return;
            }
            int i = gVar.b;
            if (i == 0) {
                this.a.b(gVar.a, this.b);
            } else {
                this.a.a(i, this.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2$c */
    /* compiled from: FontsContractCompat */
    public static class c implements k2.d<g> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1.get(r0).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        public void a(g gVar) {
            synchronized (j2.c) {
                ArrayList<k2.d<g>> arrayList = j2.d.get(this.a);
                if (arrayList != null) {
                    j2.d.remove(this.a);
                }
            }
        }
    }

    /* renamed from: j2$d */
    /* compiled from: FontsContractCompat */
    static class d implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    /* renamed from: j2$e */
    /* compiled from: FontsContractCompat */
    public static class e {
        private final int a;
        private final f[] b;

        public e(int i, f[] fVarArr) {
            this.a = i;
            this.b = fVarArr;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: j2$f */
    /* compiled from: FontsContractCompat */
    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            androidx.core.util.g.c(uri);
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2$g */
    /* compiled from: FontsContractCompat */
    public static final class g {
        public final Typeface a;
        public final int b;

        public g(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    static {
        C0201.m83(j2.class, 62);
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, i2 i2Var) throws PackageManager.NameNotFoundException {
        ProviderInfo h2 = h(context.getPackageManager(), i2Var, context.getResources());
        if (h2 == null) {
            return new e(1, null);
        }
        return new e(0, e(context, i2Var, h2.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(i2 i2Var, Resources resources) {
        if (i2Var.a() != null) {
            return i2Var.a();
        }
        return i1.c(resources, i2Var.b());
    }

    public static f[] e(Context context, i2 i2Var, String str, CancellationSignal cancellationSignal) {
        Uri uri;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        Uri.Builder builder = new Uri.Builder();
        String str2 = k;
        Uri build = builder.scheme(str2).authority(str).build();
        Uri build2 = new Uri.Builder().scheme(str2).authority(str).appendPath(u).build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{v, g, l, t, f, n, r}, w, new String[]{i2Var.f()}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{B, q, m, C, z, o, s}, h, new String[]{i2Var.f()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(j);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(p);
                int columnIndex3 = cursor.getColumnIndex(y);
                int columnIndex4 = cursor.getColumnIndex(A);
                int columnIndex5 = cursor.getColumnIndex(x);
                int columnIndex6 = cursor.getColumnIndex(i);
                while (cursor.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new f(uri, i3, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : C0188.f25, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static g f(Context context, i2 i2Var, int i2) {
        try {
            e c2 = c(context, null, i2Var);
            int i3 = -3;
            if (c2.b() == 0) {
                Typeface b2 = p1.b(context, null, c2.a(), i2);
                if (b2 != null) {
                    i3 = 0;
                }
                return new g(b2, i3);
            }
            if (c2.b() == 1) {
                i3 = -2;
            }
            return new g(null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, i2 i2Var, l1.a aVar, Handler handler, boolean z2, int i2, int i3) {
        b bVar;
        String str = i2Var.c() + C0201.m82(20334) + i3;
        Typeface c2 = a.c(str);
        if (c2 != null) {
            if (aVar != null) {
                aVar.d(c2);
            }
            return c2;
        } else if (!z2 || i2 != -1) {
            a aVar2 = new a(context, i2Var, i3, str);
            if (z2) {
                try {
                    return ((g) b.e(aVar2, i2)).a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (aVar == null) {
                    bVar = null;
                } else {
                    bVar = new b(aVar, handler);
                }
                synchronized (c) {
                    ArrayList<k2.d<g>> arrayList = d.get(str);
                    if (arrayList != null) {
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                        return null;
                    }
                    if (bVar != null) {
                        ArrayList<k2.d<g>> arrayList2 = new ArrayList<>();
                        arrayList2.add(bVar);
                        d.put(str, arrayList2);
                    }
                    b.d(aVar2, new c(str));
                    return null;
                }
            }
        } else {
            g f2 = f(context, i2Var, i3);
            if (aVar != null) {
                int i4 = f2.b;
                if (i4 == 0) {
                    aVar.b(f2.a, handler);
                } else {
                    aVar.a(i4, handler);
                }
            }
            return f2.a;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, i2 i2Var, Resources resources) throws PackageManager.NameNotFoundException {
        String d2 = i2Var.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C0201.m82(20337) + d2);
        } else if (resolveContentProvider.packageName.equals(i2Var.e())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, e);
            List<List<byte[]>> d3 = d(i2Var, resources);
            for (int i2 = 0; i2 < d3.size(); i2++) {
                ArrayList arrayList = new ArrayList(d3.get(i2));
                Collections.sort(arrayList, e);
                if (b(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException(C0201.m82(20335) + d2 + C0201.m82(20336) + i2Var.e());
        }
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, v1.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
