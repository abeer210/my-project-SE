package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import defpackage.i1;
import defpackage.j2;
import defpackage.l1;
import vigqyno.C0201;

/* renamed from: p1  reason: default package */
/* compiled from: TypefaceCompat */
public class p1 {
    private static final u1 a;
    private static final v0<String, Typeface> b = new v0<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            a = new t1();
        } else if (i >= 26) {
            a = new s1();
        } else if (i >= 24 && r1.m()) {
            a = new r1();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new q1();
        } else {
            a = new u1();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context == null) {
            throw new IllegalArgumentException(C0201.m82(33715));
        } else if (Build.VERSION.SDK_INT >= 21 || (g = g(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return g;
        }
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, j2.f[] fVarArr, int i) {
        return a.c(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface c(Context context, i1.a aVar, Resources resources, int i, int i2, l1.a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof i1.d) {
            i1.d dVar = (i1.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typeface = j2.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typeface = a.b(context, (i1.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.b(typeface, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.d(e(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = a.e(context, resources, i, str, i2);
        if (e != null) {
            b.d(e(resources, i, i2), e);
        }
        return e;
    }

    private static String e(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String r1 = C0201.m82(33716);
        sb.append(r1);
        sb.append(i);
        sb.append(r1);
        sb.append(i2);
        return sb.toString();
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return b.c(e(resources, i, i2));
    }

    private static Typeface g(Context context, Typeface typeface, int i) {
        i1.b i2 = a.i(typeface);
        if (i2 == null) {
            return null;
        }
        return a.b(context, i2, context.getResources(), i);
    }
}
