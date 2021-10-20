package com.huawei.hms.auth.api.signin;

import com.huawei.hms.common.api.CommonStatusCodes;
import vigqyno.C0201;

public final class HuaweiIdSignInStatusCodes extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 0;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 0;
    public static final int SIGN_IN_FAILED = 0;
    public static final int SIGN_IN_JSONEXCEPTION = 0;

    static {
        C0201.m83(HuaweiIdSignInStatusCodes.class, 309);
    }

    public static String getStatusCodeString(int i) {
        switch (i) {
            case 2012:
                return C0201.m82(31438);
            case 2013:
                return C0201.m82(31437);
            case 2014:
                return C0201.m82(31436);
            default:
                return C0201.m82(31435) + i;
        }
    }
}
