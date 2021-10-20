package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: rt0  reason: default package */
public final class rt0 extends kt0<T> {
    private final Object k = new Object();
    private String l;
    private T m;
    private final /* synthetic */ tt0 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rt0(ut0 ut0, String str, Object obj, tt0 tt0) {
        super(ut0, str, obj, null);
        this.n = tt0;
    }

    @Override // defpackage.kt0
    public final T f(SharedPreferences sharedPreferences) {
        try {
            return (T) m(sharedPreferences.getString(this.b, C0201.m82(1767)));
        } catch (ClassCastException e) {
            String r0 = C0201.m82(1768);
            String valueOf = String.valueOf(this.b);
            Log.e(C0201.m82(1769), valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0), e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r0 = vigqyno.C0201.m82(1770);
        r1 = r5.b;
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 27) + java.lang.String.valueOf(r6).length());
        r3.append(vigqyno.C0201.m82(1771));
        r3.append(r1);
        r3.append(vigqyno.C0201.m82(1772));
        r3.append(r6);
        android.util.Log.e(r0, r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        return null;
     */
    @Override // defpackage.kt0
    public final T m(String str) {
        T t;
        synchronized (this.k) {
            if (!str.equals(this.l)) {
                this.l = str;
                this.m = (T) this.n.a(Base64.decode(str, 3));
            }
            t = this.m;
        }
        return t;
    }
}
