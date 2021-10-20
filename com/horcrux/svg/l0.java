package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TextProperties */
public enum l0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    
    private static final Map<String, l0> o = new HashMap();
    private final String a;

    /* access modifiers changed from: public */
    static {
        l0[] values = values();
        for (l0 l0Var : values) {
            o.put(l0Var.a, l0Var);
        }
    }

    private l0(String str) {
        this.a = str;
    }

    public static l0 b(String str) {
        return o.get(str);
    }

    public static boolean d(String str) {
        return o.containsKey(str);
    }

    public String toString() {
        return this.a;
    }
}
