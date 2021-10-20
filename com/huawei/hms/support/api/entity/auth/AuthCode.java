package com.huawei.hms.support.api.entity.auth;

import vigqyno.C0201;

public interface AuthCode {

    public interface ErrorCode {
        public static final int CERT_FINGERPRINT_EMPTY = 0;
        public static final int GET_SCOPE_ERROR = 0;
        public static final int PERMISSION_LIST_EMPTY = 0;
        public static final int SCOPE_LIST_EMPTY = 0;

        static {
            C0201.m83(ErrorCode.class, 596);
        }
    }

    public interface StatusCode {
        public static final int AUTH_INFO_NOT_EXIST = 0;
        public static final int CERT_FINGERPRINT_ERROR = 0;
        public static final int OK = 0;
        public static final int PERMISSION_EXPIRED = 0;
        public static final int PERMISSION_NOT_AUTHORIZED = 0;
        public static final int PERMISSION_NOT_EXIST = 0;
        public static final int WAITING_CONNECT = 0;

        static {
            C0201.m83(StatusCode.class, 579);
        }
    }
}
