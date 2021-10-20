package com.facebook.yoga;

/* compiled from: YogaUnit */
public enum u {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    private final int a;

    private u(int i) {
        this.a = i;
    }

    public static u b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return POINT;
        }
        if (i == 2) {
            return PERCENT;
        }
        if (i == 3) {
            return AUTO;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }

    public int d() {
        return this.a;
    }
}
