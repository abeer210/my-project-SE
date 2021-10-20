package com.huawei.hms.support.api.entity.hwid;

import vigqyno.C0201;

public final class HwIDConstant {

    public static class ACTION {
        public static final String HWID_SCHEME_URL = null;
        public static final String STARTUP_FOR_LOGIN = null;
        public static final String WEB_AUTH = null;

        static {
            C0201.m83(ACTION.class, 626);
        }
    }

    public static class LOCALPERMISSION {
        public static final String ACCESS_TOKEN = null;
        public static final String SERVICE_AUTH_CODE = null;

        static {
            C0201.m83(LOCALPERMISSION.class, 617);
        }
    }

    public static class PERMISSION {
        public static final String BASE_PROFILE = null;
        public static final String COUNTRY = null;
        public static final String IDTOKEN = null;
        public static final String OPENID = null;
        public static final String SHIPPING_ADDRESS = null;
        public static final String UID = null;
        public static final String UNIONID = null;

        static {
            C0201.m83(PERMISSION.class, 364);
        }
    }

    public static final class RETCODE {
        public static final int RESPONSE_RESULT_OK = 0;
        public static final int SIGN_IN_AUTH = 0;
        public static final int SIGN_IN_AUTH_SERVER_FAILED = 0;
        public static final int SIGN_IN_CANCELLED = 0;
        public static final int SIGN_IN_CHECK_PASSWORD = 0;
        public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 0;
        public static final int SIGN_IN_FAILED = 0;
        public static final int SIGN_IN_NETWORK_ERROR = 0;
        public static final int SIGN_IN_NETWORK_UNDER_CONTROLED = 0;
        public static final int SIGN_IN_PARAMS_ERROR = 0;
        public static final int SIGN_IN_SDK_INNER_ERROR = 0;
        public static final int SIGN_IN_SUCCESS = 0;
        public static final int SIGN_IN_UNLOGIN = 0;
        public static final String SMS_PARAM_ERROR = null;
        public static final int SMS_RETRIEVER_PARAM_FAILED = 0;
        public static final int ST_VALID = 0;

        static {
            C0201.m83(RETCODE.class, 208);
        }
    }

    public static final class RETKEY {
        public static final String ACCESS_TOKEN = null;
        public static final String COUNTRYCODE = null;
        public static final String DISPLAYNAME = null;
        public static final String EMAIL = null;
        public static final String FAMILY_NAME = null;
        public static final String GENDER = null;
        public static final String GIVEN_NAME = null;
        public static final String ID_TOKEN = null;
        public static final String OPENID = null;
        public static final String PHOTOURL = null;
        public static final String RETCODE = null;
        public static final String SCOPE = null;
        public static final String SERVICEAUTHCODE = null;
        public static final String SERVICECOUNTRYCODE = null;
        public static final String SHIPPING_ADDRESS = null;
        public static final String STATUS = null;
        public static final String UNIONID = null;
        public static final String USERID = null;

        static {
            C0201.m83(RETKEY.class, 298);
        }
    }

    public static class ReqAccessTokenParm {
        public static final String CLIENT_ID = null;
        public static final String DISPLAY_LABEL = null;
        public static final String HMS_REDIRECT_URI = null;
        public static final String LANGUAGE_LABEL = null;
        public static final String PACKAGE_NAME = null;
        public static final String PERMISSION_INFO_LABEL = null;
        public static final String REDIRECT_URI = null;
        public static final String RESPONSE_TYPE = null;
        public static final String SCOPE_LABEL = null;
        public static final String STATE_LABEL = null;

        static {
            C0201.m83(ReqAccessTokenParm.class, 237);
        }
    }

    public static class SCOPE {
        public static final String ACCOUNT_BASEPROFILE = null;
        public static final String SCOPE_ACCOUNT_COUNTRY = null;
        public static final String SCOPE_ACCOUNT_EMAIL = null;
        public static final String SCOPE_ACCOUNT_GAME = null;
        public static final String SCOPE_ACCOUNT_OPENID = null;
        public static final String SCOPE_ACCOUNT_PROFILE = null;
        public static final String SCOPE_ACCOUNT_SHIPPING_ADDRESS = null;
        public static final String SCOPE_IS_ADULT = null;

        static {
            C0201.m83(SCOPE.class, 381);
        }
    }

    public static class URI {
        public static final String LOGIN_BY_PASSWORD = null;

        static {
            C0201.m83(URI.class, 681);
        }
    }
}
