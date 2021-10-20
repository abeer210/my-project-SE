package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TextProperties */
public enum i0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    
    private static final Map<String, i0> u = new HashMap();
    private final String a;

    /* access modifiers changed from: public */
    static {
        i0[] values = values();
        for (i0 i0Var : values) {
            u.put(i0Var.a, i0Var);
        }
    }

    private i0(String str) {
        this.a = str;
    }

    public static i0 b(String str) {
        if (u.containsKey(str)) {
            return u.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.a;
    }
}
