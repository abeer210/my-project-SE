package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import vigqyno.C0201;

/* renamed from: ep  reason: default package */
/* compiled from: Preconditions */
public final class ep {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(C0201.m82(13084));
    }

    public static <T extends Collection<Y>, Y> T c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException(C0201.m82(13085));
    }

    public static <T> T d(T t) {
        e(t, C0201.m82(13086));
        return t;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
