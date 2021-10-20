package com.facebook.yoga;

/* compiled from: YogaDirection */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    private final int a;

    private h(int i) {
        this.a = i;
    }

    public static h b(int i) {
        if (i == 0) {
            return INHERIT;
        }
        if (i == 1) {
            return LTR;
        }
        if (i == 2) {
            return RTL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int d() {
        return this.a;
    }
}
