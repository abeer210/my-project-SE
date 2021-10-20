package defpackage;

import android.os.Binder;

/* renamed from: t61  reason: default package */
public final /* synthetic */ class t61 {
    public static <V> V a(s61<V> s61) {
        long clearCallingIdentity;
        try {
            return s61.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = s61.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
