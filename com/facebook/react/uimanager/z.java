package com.facebook.react.uimanager;

import vigqyno.C0201;

/* compiled from: ReactRootViewTagGenerator */
public class z {
    private static int a;

    static {
        C0201.m83(z.class, 588);
    }

    public static synchronized int a() {
        int i;
        synchronized (z.class) {
            i = a;
            a += 10;
        }
        return i;
    }
}
