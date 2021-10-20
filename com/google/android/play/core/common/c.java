package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public final class c {
    private final Map<String, Object> a = new HashMap();

    public final synchronized void a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && this.a.get(str) == null) {
                this.a.put(str, obj);
            }
        }
    }

    public final synchronized boolean b() {
        Object obj = this.a.get(C0201.m82(24998));
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
