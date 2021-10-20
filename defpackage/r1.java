package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.i1;
import defpackage.j2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import vigqyno.C0201;

/* renamed from: r1  reason: default package */
/* compiled from: TypefaceCompatApi24Impl */
public class r1 extends u1 {
    private static final Class b;
    private static final Constructor c;
    private static final Method d;
    private static final Method e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(C0201.m82(37661));
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod(C0201.m82(37662), ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod(C0201.m82(37663), Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e(C0201.m82(37664), e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = cls;
        d = method;
        e = method2;
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        if (d == null) {
            Log.w(C0201.m82(37665), C0201.m82(37666));
        }
        return d != null;
    }

    private static Object n() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.u1
    public Typeface b(Context context, i1.b bVar, Resources resources, int i) {
        Object n = n();
        if (n == null) {
            return null;
        }
        i1.c[] a = bVar.a();
        for (i1.c cVar : a) {
            ByteBuffer b2 = v1.b(context, resources, cVar.b());
            if (b2 == null || !k(n, b2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return l(n);
    }

    @Override // defpackage.u1
    public Typeface c(Context context, CancellationSignal cancellationSignal, j2.f[] fVarArr, int i) {
        Object n = n();
        if (n == null) {
            return null;
        }
        x0 x0Var = new x0();
        for (j2.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) x0Var.get(c2);
            if (byteBuffer == null) {
                byteBuffer = v1.f(context, cancellationSignal, c2);
                x0Var.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !k(n, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface l = l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
