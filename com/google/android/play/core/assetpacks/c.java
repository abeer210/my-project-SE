package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public abstract class c {
    public static c a(long j, Map<String, AssetPackState> map) {
        return new h0(j, map);
    }

    public static c b(Bundle bundle, x0 x0Var) {
        return c(bundle, x0Var, new ArrayList());
    }

    public static c c(Bundle bundle, x0 x0Var, List<String> list) {
        return d(bundle, x0Var, list, a0.a);
    }

    private static c d(Bundle bundle, x0 x0Var, List<String> list, y yVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(C0201.m82(10660));
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.a(bundle, str, x0Var, yVar));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, AssetPackState.b(str2, 4, 0, 0, 0, 0.0d));
        }
        return a(bundle.getLong(C0201.m82(10661)), hashMap);
    }

    public abstract Map<String, AssetPackState> e();

    public abstract long f();
}
