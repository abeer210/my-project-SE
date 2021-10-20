package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import vigqyno.C0201;

/* renamed from: w61  reason: default package */
public final class w61 {
    private static volatile i71<Boolean> a = i71.d();
    private static final Object b = new Object();

    public static boolean a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        if (!C0201.m82(24767).equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(C0201.m82(24771));
            throw new IllegalArgumentException(sb.toString());
        } else if (a.b()) {
            return a.a().booleanValue();
        } else {
            synchronized (b) {
                if (a.b()) {
                    return a.a().booleanValue();
                }
                boolean z2 = false;
                if (!C0201.m82(24768).equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(C0201.m82(24769), 0);
                    if (resolveContentProvider == null || !C0201.m82(24770).equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && b(context)) {
                            z2 = true;
                        }
                        a = i71.c(Boolean.valueOf(z2));
                        return a.a().booleanValue();
                    }
                }
                z = true;
                z2 = true;
                a = i71.c(Boolean.valueOf(z2));
                return a.a().booleanValue();
            }
        }
    }

    private static boolean b(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(C0201.m82(24772), 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
