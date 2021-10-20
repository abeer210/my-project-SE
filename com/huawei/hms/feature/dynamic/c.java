package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

public final class c {
    private static final String b = null;
    private static final c c = new c();
    public Set<String> a;

    static {
        C0201.m83(c.class, 522);
    }

    private c() {
    }

    public static c a() {
        return c;
    }

    public final void a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(C0201.m82(12247));
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.w(b, C0201.m82(12249));
            this.a = new HashSet();
            return;
        }
        Logger.i(b, C0201.m82(12248).concat(String.valueOf(stringArrayList)));
        this.a = new HashSet(stringArrayList);
    }
}
