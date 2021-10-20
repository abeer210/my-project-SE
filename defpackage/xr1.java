package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.a;
import vigqyno.C0201;

/* renamed from: xr1  reason: default package */
public final class xr1 {
    private static final a.g<xh1> a = new a.g<>();
    private static final a.AbstractC0054a<xh1, a.d.C0056d> b;

    static {
        zr1 zr1 = new zr1();
        b = zr1;
        new a(C0201.m82(36757), zr1, a);
    }

    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        int length = valueOf.length();
        String r1 = C0201.m82(36758);
        return Uri.parse(length != 0 ? r1.concat(valueOf) : new String(r1));
    }
}
