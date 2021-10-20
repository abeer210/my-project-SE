package com.huawei.hms.auth.api.signin.internal.c;

import java.util.HashSet;
import java.util.Set;

/* compiled from: HwIdHiAnalyticsUtil */
public class b {
    private static final Set<Integer> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(0);
    }

    public static int a(int i) {
        return a.contains(Integer.valueOf(i)) ? 0 : 1;
    }
}
