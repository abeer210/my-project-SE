package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import vigqyno.C0201;

public class b {
    private static final Map<String, Map<String, Integer>> a = new HashMap();

    static {
        new HashSet(Arrays.asList(C0201.m82(25140)));
        new HashSet(Arrays.asList(C0201.m82(25141), C0201.m82(25142)));
        new gy1(C0201.m82(25143));
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> b = b(C0201.m82(25144));
        bundle.putInt(C0201.m82(25146), b.get(C0201.m82(25145)).intValue());
        String r2 = C0201.m82(25147);
        if (b.containsKey(r2)) {
            bundle.putInt(C0201.m82(25148), b.get(r2).intValue());
        }
        String r22 = C0201.m82(25149);
        if (b.containsKey(r22)) {
            bundle.putInt(C0201.m82(25150), b.get(r22).intValue());
        }
        return bundle;
    }

    public static synchronized Map<String, Integer> b(String str) {
        Map<String, Integer> map;
        synchronized (b.class) {
            if (!a.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put(C0201.m82(25151), 10800);
                a.put(str, hashMap);
            }
            map = a.get(str);
        }
        return map;
    }
}
