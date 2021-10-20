package com.huawei.hianalytics.ab.bc.hi;

import java.util.HashMap;
import java.util.Map;

public final class ab {
    private static ab bc;
    private volatile Map<String, bc> ab = new HashMap();

    private ab() {
    }

    public static ab ab() {
        if (bc == null) {
            bc();
        }
        return bc;
    }

    private bc bc(String str) {
        if (!this.ab.containsKey(str)) {
            this.ab.put(str, new bc());
        }
        return this.ab.get(str);
    }

    private static synchronized void bc() {
        synchronized (ab.class) {
            if (bc == null) {
                bc = new ab();
            }
        }
    }

    public bc ab(String str, long j) {
        bc bc2 = bc(str);
        bc2.ab(j);
        return bc2;
    }

    public void ab(String str) {
        bc(str).ab();
    }
}
