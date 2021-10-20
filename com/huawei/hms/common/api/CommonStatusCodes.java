package com.huawei.hms.common.api;

import vigqyno.C0201;

public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 0;
    public static final int CANCELED = 0;
    public static final int DEVELOPER_ERROR = 0;
    public static final int ERROR = 0;
    public static final int INTERNAL_ERROR = 0;
    public static final int INTERRUPTED = 0;
    public static final int INVALID_ACCOUNT = 0;
    public static final int NETWORK_ERROR = 0;
    public static final int RESOLUTION_REQUIRED = 0;
    @Deprecated
    public static final int SERVICE_DISABLED = 0;
    @Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 0;
    public static final int SIGN_IN_REQUIRED = 0;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = 0;
    public static final int TIMEOUT = 0;

    static {
        C0201.m83(CommonStatusCodes.class, 441);
    }

    public static String getStatusCodeString(int i) {
        if (i == -1) {
            return C0201.m82(30570);
        }
        if (i == 0) {
            return C0201.m82(30569);
        }
        if (i == 10) {
            return C0201.m82(30568);
        }
        if (i == 9004) {
            return C0201.m82(30567);
        }
        switch (i) {
            case 2:
                return C0201.m82(30566);
            case 3:
                return C0201.m82(30565);
            case 4:
                return C0201.m82(30564);
            case 5:
                return C0201.m82(30563);
            case 6:
                return C0201.m82(30562);
            case 7:
                return C0201.m82(30561);
            case 8:
                return C0201.m82(30560);
            default:
                switch (i) {
                    case 13:
                        return C0201.m82(30559);
                    case 14:
                        return C0201.m82(30558);
                    case 15:
                        return C0201.m82(30557);
                    case 16:
                        return C0201.m82(30556);
                    case 17:
                        return C0201.m82(30555);
                    default:
                        return C0201.m82(30554) + i;
                }
        }
    }
}
