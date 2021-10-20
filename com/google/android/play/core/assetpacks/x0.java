package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

public final class x0 {
    private final Map<String, Double> a = new HashMap();

    public final synchronized double a(String str, n1 n1Var) {
        double d;
        double d2 = (double) ((q0) n1Var).g;
        Double.isNaN(d2);
        double d3 = (double) ((q0) n1Var).h;
        Double.isNaN(d3);
        d = (d2 + 1.0d) / d3;
        this.a.put(str, Double.valueOf(d));
        return d;
    }

    public final synchronized void b(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }

    public final synchronized double c(String str) {
        Double d = this.a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
