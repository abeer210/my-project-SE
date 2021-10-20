package com.huawei.hms.common.internal;

import vigqyno.C0201;

public final class Asserter {
    private Asserter() {
        throw new AssertionError(C0201.m82(21709));
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(C0201.m82(21710));
        }
    }

    public static void checkNull(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException(obj.toString() + C0201.m82(21711));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(obj2.toString());
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(obj.toString());
        }
    }
}
