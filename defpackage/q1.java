package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import defpackage.i1;
import defpackage.j2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: q1  reason: default package */
/* compiled from: TypefaceCompatApi21Impl */
public class q1 extends u1 {
    private static Class b;
    private static Constructor c;
    private static Method d;
    private static Method e;
    private static boolean f;

    static {
        C0201.m83(q1.class, 618);
    }

    private static boolean k(Object obj, String str, int i, boolean z) {
        n();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink(C0201.m82(35656) + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName(C0201.m82(35657));
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod(C0201.m82(35658), String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod(C0201.m82(35659), Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e(C0201.m82(35660), e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            c = constructor;
            b = cls;
            d = method;
            e = method2;
        }
    }

    private static Object o() {
        n();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.u1
    public Typeface b(Context context, i1.b bVar, Resources resources, int i) {
        Object o = o();
        i1.c[] a = bVar.a();
        for (i1.c cVar : a) {
            File e2 = v1.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!v1.c(e2, resources, cVar.b())) {
                    e2.delete();
                    return null;
                } else if (!k(o, e2.getPath(), cVar.e(), cVar.f())) {
                    return null;
                } else {
                    e2.delete();
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return l(o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        r5.addSuppressed(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        if (r6 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0067, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0068, code lost:
        r5.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006b, code lost:
        throw r7;
     */
    @Override // defpackage.u1
    public Typeface c(Context context, CancellationSignal cancellationSignal, j2.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        j2.f h = h(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.c(), C0201.m82(35661), cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m = m(openFileDescriptor);
            if (m != null) {
                if (m.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(m);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return createFromFile;
                }
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface d2 = super.d(context, fileInputStream);
            fileInputStream.close();
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
            return d2;
        } catch (IOException unused) {
            return null;
        }
    }
}
