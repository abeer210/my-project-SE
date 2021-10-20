package com.huawei.hianalytics.ab.bc.cd.ab;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class ab {
    public static Map<String, ef> bc = new HashMap();
    private static ab cd;
    private de ab = new de();

    private ab() {
    }

    public static ab cd() {
        if (cd == null) {
            de();
        }
        return cd;
    }

    private static synchronized void de() {
        synchronized (ab.class) {
            if (cd == null) {
                cd = new ab();
            }
        }
    }

    public ef ab(String str) {
        return bc.get(str);
    }

    public Set<String> ab() {
        return bc.keySet();
    }

    public void ab(String str, ef efVar) {
        bc.put(str, efVar);
    }

    public de bc() {
        return this.ab;
    }
}
