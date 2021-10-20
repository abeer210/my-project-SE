package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import vigqyno.C0201;

/* renamed from: mp1  reason: default package */
public abstract class mp1<T> {
    private static String h;
    private final Context a;
    private final Object b = new Object();
    private final String c;
    private final String d;
    private final String e;
    private boolean f = false;
    private T g;

    static {
        C0201.m83(mp1.class, 668);
    }

    public mp1(Context context, String str, String str2) {
        this.a = context;
        this.c = str;
        String str3 = h;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(C0201.m82(33052));
        sb.append(str2);
        this.d = sb.toString();
        this.e = h;
    }

    public final boolean a() {
        return e() != null;
    }

    public abstract T b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.a;

    public abstract void c() throws RemoteException;

    public final void d() {
        synchronized (this.b) {
            if (this.g != null) {
                try {
                    c();
                } catch (RemoteException e2) {
                    Log.e(this.c, C0201.m82(33053), e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        android.util.Log.e(r6.c, vigqyno.C0201.m82(33055), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        android.util.Log.e(r6.c, vigqyno.C0201.m82(33056), r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:9:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    public final T e() {
        synchronized (this.b) {
            if (this.g != null) {
                return this.g;
            }
            DynamiteModule dynamiteModule = null;
            try {
                dynamiteModule = DynamiteModule.e(this.a, DynamiteModule.l, this.d);
            } catch (DynamiteModule.a unknown) {
                Log.d(this.c, C0201.m82(33054));
                dynamiteModule = DynamiteModule.e(this.a, DynamiteModule.l, this.e);
            } catch (RemoteException e2) {
            }
            Log.d(this.c, C0201.m82(33054));
            dynamiteModule = DynamiteModule.e(this.a, DynamiteModule.l, this.e);
            if (dynamiteModule != null) {
                this.g = b(dynamiteModule, this.a);
            }
            if (this.f && this.g == null) {
                Log.w(this.c, C0201.m82(33057));
                this.f = true;
            } else if (this.f && this.g != null) {
                Log.w(this.c, C0201.m82(33058));
            }
            return this.g;
        }
    }
}
