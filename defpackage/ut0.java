package defpackage;

import android.net.Uri;
import vigqyno.C0201;

/* renamed from: ut0 */
public final class ut0 {
    private final String a;
    private final Uri b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;

    public ut0(Uri uri) {
        this(null, uri, C0201.m82(24804), C0201.m82(24805), false, false);
    }

    private ut0(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final <T> kt0<T> a(String str, T t, tt0<T> tt0) {
        return kt0.c(this, str, t, tt0);
    }

    public final kt0<String> b(String str, String str2) {
        return kt0.d(this, str, null);
    }

    public final kt0<Boolean> e(String str, boolean z) {
        return kt0.e(this, str, false);
    }

    public final ut0 f(String str) {
        boolean z = this.e;
        if (!z) {
            return new ut0(this.a, this.b, str, this.d, z, this.f);
        }
        throw new IllegalStateException(C0201.m82(24806));
    }

    public final ut0 h(String str) {
        return new ut0(this.a, this.b, this.c, str, this.e, this.f);
    }
}
