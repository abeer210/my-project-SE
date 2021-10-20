package com.huawei.hms.support.api.entity.core;

import vigqyno.C0201;

public interface CommonCode {
    public static final int ERROR = 0;
    public static final int OK = 0;

    public interface ErrorCode {
        public static final int ARGUMENTS_INVALID = 0;
        public static final int CLIENT_API_INVALID = 0;
        public static final int EXECUTE_TIMEOUT = 0;
        public static final int HMS_VERSION_CONFIGER_INVALID = 0;
        public static final int INTERNAL_ERROR = 0;
        public static final int NAMING_INVALID = 0;
        public static final int NOT_IN_SERVICE = 0;
        public static final int SESSION_INVALID = 0;

        static {
            C0201.m83(ErrorCode.class, 186);
        }
    }

    public interface Resolution {
        public static final String HAS_RESOLUTION = null;

        static {
            C0201.m83(Resolution.class, 279);
        }
    }

    public interface StatusCode {
        public static final int API_CLIENT_EXPIRED = 0;
        public static final int API_UNAVAILABLE = 0;

        static {
            C0201.m83(StatusCode.class, 486);
        }
    }

    static {
        C0201.m83(CommonCode.class, 539);
    }
}
