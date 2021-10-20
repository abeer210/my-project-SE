package com.facebook.react.bridge;

import vigqyno.C0201;

public class SoftAssertions {
    public static void assertCondition(boolean z, String str) {
        if (!z) {
            ReactSoftException.logSoftException(C0201.m82(26765), new AssertionException(str));
        }
    }

    public static <T> T assertNotNull(T t) {
        if (t == null) {
            ReactSoftException.logSoftException(C0201.m82(26767), new AssertionException(C0201.m82(26766)));
        }
        return t;
    }

    public static void assertUnreachable(String str) {
        ReactSoftException.logSoftException(C0201.m82(26768), new AssertionException(str));
    }
}
