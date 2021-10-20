package com.samsung.android.sdk.pass;

import vigqyno.C0201;

public class SpassInvalidStateException extends IllegalStateException {
    public static final int STATUS_OPERATION_DENIED = 0;
    private int a = 0;

    static {
        C0201.m83(SpassInvalidStateException.class, 645);
    }

    public SpassInvalidStateException(String str, int i) {
        super(str);
        this.a = i;
    }

    public int getType() {
        return this.a;
    }
}
