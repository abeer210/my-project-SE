package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import defpackage.i1;
import defpackage.j2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: s1  reason: default package */
/* compiled from: TypefaceCompatApi26Impl */
public class s1 extends q1 {
    public static final String a = null;
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    static {
        C0201.m83(s1.class, 5);
    }

    public s1() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class y = y();
            constructor = z(y);
            method4 = v(y);
            method3 = w(y);
            method2 = A(y);
            method = u(y);
            method5 = x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(C0201.m82(1621), C0201.m82(1620) + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method4;
        this.j = method3;
        this.k = method2;
        this.l = method;
        this.m = method5;
    }

    private Object o() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.i == null) {
            Log.w(C0201.m82(1622), C0201.m82(1623));
        }
        return this.i != null;
    }

    public Method A(Class cls) throws NoSuchMethodException {
        return cls.getMethod(C0201.m82(1624), new Class[0]);
    }

    @Override // defpackage.q1, defpackage.u1
    public Typeface b(Context context, i1.b bVar, Resources resources, int i2) {
        if (!t()) {
            return super.b(context, bVar, resources, i2);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        i1.c[] a2 = bVar.a();
        for (i1.c cVar : a2) {
            if (!q(context, o, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o);
                return null;
            }
        }
        if (!s(o)) {
            return null;
        }
        return l(o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r12.addSuppressed(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        throw r13;
     */
    @Override // defpackage.q1, defpackage.u1
    public Typeface c(Context context, CancellationSignal cancellationSignal, j2.f[] fVarArr, int i2) {
        Typeface l2;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            j2.f h2 = h(fVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.c(), a, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h2.d()).setItalic(h2.e()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> i3 = j2.i(context, fVarArr, cancellationSignal);
            Object o = o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (j2.f fVar : fVarArr) {
                ByteBuffer byteBuffer = i3.get(fVar.c());
                if (byteBuffer != null) {
                    if (!r(o, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                        p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                p(o);
                return null;
            } else if (s(o) && (l2 = l(o)) != null) {
                return Typeface.create(l2, i2);
            } else {
                return null;
            }
        }
    }

    @Override // defpackage.u1
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        if (!q(context, o, str, 0, -1, -1, null)) {
            p(o);
            return null;
        } else if (!s(o)) {
            return null;
        } else {
            return l(o);
        }
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method u(Class cls) throws NoSuchMethodException {
        return cls.getMethod(C0201.m82(1625), new Class[0]);
    }

    public Method v(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(C0201.m82(1626), AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method w(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod(C0201.m82(1627), ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method x(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(C0201.m82(1628), Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class y() throws ClassNotFoundException {
        return Class.forName(C0201.m82(1629));
    }

    public Constructor z(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
