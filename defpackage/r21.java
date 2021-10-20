package defpackage;

import android.os.Looper;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* renamed from: r21  reason: default package */
public final class r21 {
    public static Looper a(Looper looper) {
        return looper != null ? looper : b();
    }

    public static Looper b() {
        u.o(Looper.myLooper() != null, C0201.m82(6183));
        return Looper.myLooper();
    }
}
