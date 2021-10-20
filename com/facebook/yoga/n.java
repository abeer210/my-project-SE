package com.facebook.yoga;

/* compiled from: YogaMeasureMode */
public enum n {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private n(int i) {
    }

    public static n b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
