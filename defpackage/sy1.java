package defpackage;

import java.io.File;
import vigqyno.C0201;

/* renamed from: sy1  reason: default package */
public final class sy1 {
    public static String a(File file) {
        if (file.getName().endsWith(C0201.m82(5718))) {
            String name = file.getName();
            String r0 = C0201.m82(5719);
            String r1 = C0201.m82(5720);
            return name.replaceFirst(r0, r1).replace(C0201.m82(5721), C0201.m82(5722)).replace(C0201.m82(5723), C0201.m82(5724)).replace(C0201.m82(5725), r1).replace(C0201.m82(5726), r1);
        }
        throw new IllegalArgumentException(C0201.m82(5727));
    }

    public static <T> void b(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    public static void c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
