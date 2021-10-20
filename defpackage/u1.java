package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.i1;
import defpackage.j2;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: u1  reason: default package */
/* compiled from: TypefaceCompatBaseImpl */
public class u1 {
    private ConcurrentHashMap<Long, i1.b> a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: u1$a */
    /* compiled from: TypefaceCompatBaseImpl */
    public class a implements c<j2.f> {
        public a(u1 u1Var) {
        }

        /* renamed from: c */
        public int a(j2.f fVar) {
            return fVar.d();
        }

        /* renamed from: d */
        public boolean b(j2.f fVar) {
            return fVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1$b */
    /* compiled from: TypefaceCompatBaseImpl */
    public class b implements c<i1.c> {
        public b(u1 u1Var) {
        }

        /* renamed from: c */
        public int a(i1.c cVar) {
            return cVar.e();
        }

        /* renamed from: d */
        public boolean b(i1.c cVar) {
            return cVar.f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1$c */
    /* compiled from: TypefaceCompatBaseImpl */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    private void a(Typeface typeface, i1.b bVar) {
        long j = j(typeface);
        if (j != 0) {
            this.a.put(Long.valueOf(j), bVar);
        }
    }

    private i1.c f(i1.b bVar, int i) {
        return (i1.c) g(bVar.a(), i, new b(this));
    }

    private static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? C0188.f25 : C0188.f17;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = C0188.f24;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        String r0 = C0201.m82(5951);
        String r1 = C0201.m82(5952);
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField(C0201.m82(5953));
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(r1, r0, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(r1, r0, e2);
            return 0;
        }
    }

    public Typeface b(Context context, i1.b bVar, Resources resources, int i) {
        i1.c f = f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = p1.d(context, resources, f.b(), f.a(), i);
        a(d, bVar);
        return d;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, j2.f[] fVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(fVarArr, i).c());
            try {
                Typeface d = d(context, inputStream);
                v1.a(inputStream);
                return d;
            } catch (IOException unused) {
                v1.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                v1.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            v1.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            v1.a(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e = v1.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!v1.d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = v1.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!v1.c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public j2.f h(j2.f[] fVarArr, int i) {
        return (j2.f) g(fVarArr, i, new a(this));
    }

    public i1.b i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j));
    }
}
