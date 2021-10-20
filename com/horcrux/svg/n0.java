package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TextProperties */
public enum n0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    
    private static final Map<String, n0> g = new HashMap();
    private final String a;

    /* access modifiers changed from: public */
    static {
        n0[] values = values();
        for (n0 n0Var : values) {
            g.put(n0Var.a, n0Var);
        }
    }

    private n0(String str) {
        this.a = str;
    }

    public static n0 b(String str) {
        if (g.containsKey(str)) {
            return g.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.a;
    }
}
