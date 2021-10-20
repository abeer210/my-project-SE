package com.samsung.android.sdk;

import vigqyno.C0201;

public class SsdkUnsupportedException extends Exception {
    public static final int DEVICE_NOT_SUPPORTED = 0;
    public static final int LIBRARY_NOT_INSTALLED = 0;
    public static final int LIBRARY_UPDATE_IS_RECOMMENDED = 0;
    public static final int LIBRARY_UPDATE_IS_REQUIRED = 0;
    public static final int VENDOR_NOT_SUPPORTED = 0;
    private int mErrorType = 0;

    static {
        C0201.m83(SsdkUnsupportedException.class, 382);
    }

    public SsdkUnsupportedException(String str, int i) {
        super(str);
        this.mErrorType = i;
    }

    public int getType() {
        return this.mErrorType;
    }
}
