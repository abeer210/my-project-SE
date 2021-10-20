package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import vigqyno.C0201;

/* renamed from: dr1  reason: default package */
public final class dr1 {
    private dr1() {
    }

    private static <T extends Parcelable> T a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(dr1.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(C0201.m82(24071));
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(dr1.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    public static void b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            String r0 = C0201.m82(24072);
            Parcelable a = a(bundle, r0);
            if (a != null) {
                c(bundle2, r0, a);
            }
            String r02 = C0201.m82(24073);
            Parcelable a2 = a(bundle, r02);
            if (a2 != null) {
                c(bundle2, r02, a2);
            }
            String r03 = C0201.m82(24074);
            Parcelable a3 = a(bundle, r03);
            if (a3 != null) {
                c(bundle2, r03, a3);
            }
            String r04 = C0201.m82(24075);
            if (bundle.containsKey(r04)) {
                bundle2.putString(r04, bundle.getString(r04));
            }
            String r05 = C0201.m82(24076);
            if (bundle.containsKey(r05)) {
                bundle2.putBoolean(r05, bundle.getBoolean(r05, false));
            }
        }
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(dr1.class.getClassLoader());
        String r1 = C0201.m82(24077);
        Bundle bundle2 = bundle.getBundle(r1);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(dr1.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle(r1, bundle2);
    }
}
