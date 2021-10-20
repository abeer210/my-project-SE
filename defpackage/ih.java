package defpackage;

import android.net.Uri;
import vigqyno.C0201;

/* renamed from: ih  reason: default package */
/* compiled from: MediaStoreUtil */
public final class ih {
    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        if (uri != null) {
            if (C0201.m82(21845).equals(uri.getScheme())) {
                if (C0201.m82(21846).equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(C0201.m82(21847));
    }
}
