package com.huawei.hms.maps;

import android.os.Bundle;
import android.os.Parcelable;
import vigqyno.C0201;

public class mbv {
    private mbv() {
    }

    public static Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            return bundle2;
        }
        String r1 = C0201.m82(31191);
        Parcelable a = a(bundle, r1);
        if (a != null) {
            a(bundle2, r1, a);
        }
        String r12 = C0201.m82(31192);
        Parcelable a2 = a(bundle, r12);
        if (a2 != null) {
            a(bundle2, r12, a2);
        }
        String r13 = C0201.m82(31193);
        Parcelable a3 = a(bundle, r13);
        if (a3 != null) {
            a(bundle2, r13, a3);
        }
        String r14 = C0201.m82(31194);
        if (bundle.containsKey(r14)) {
            bundle2.putString(r14, bundle.getString(r14));
        }
        return bundle2;
    }

    private static <T extends Parcelable> T a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(mbv.class.getClassLoader());
        Bundle bundle2 = (Bundle) bundle.get(C0201.m82(31195));
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(mbv.class.getClassLoader());
        return (T) bundle2.getParcelable(str);
    }

    public static void a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(mbv.class.getClassLoader());
        bundle.putBundle(C0201.m82(31196), b(bundle, str, parcelable));
    }

    private static Bundle b(Bundle bundle, String str, Parcelable parcelable) {
        Bundle bundle2 = bundle != null ? bundle.getBundle(C0201.m82(31197)) : null;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(mbv.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        return bundle2;
    }
}
