package defpackage;

import android.net.Uri;
import vigqyno.C0201;

/* renamed from: z61  reason: default package */
public final class z61 {
    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        int length = valueOf.length();
        String r1 = C0201.m82(2482);
        return Uri.parse(length != 0 ? r1.concat(valueOf) : new String(r1));
    }
}
