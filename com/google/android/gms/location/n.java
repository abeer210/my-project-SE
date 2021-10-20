package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
public final class n {
    public static int a(int i) {
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            return 1;
        }
        return i;
    }

    public static Status b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
