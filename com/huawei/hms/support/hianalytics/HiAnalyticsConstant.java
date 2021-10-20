package com.huawei.hms.support.hianalytics;

import vigqyno.C0188;
import vigqyno.C0201;

public class HiAnalyticsConstant {
    public static final String BI_KEY_API_NAME = null;
    public static final String BI_KEY_APP_ID = null;
    public static final String BI_KEY_COST_TIME = null;
    public static final String BI_KEY_NET_TYPE = null;
    public static final String BI_KEY_PACKAGE = null;
    public static final String BI_KEY_RESUST = null;
    public static final String BI_KEY_SDK_VER = null;
    public static final String BI_KEY_SERVICE = null;
    public static final String BI_KEY_TARGET_PACKAGE = null;
    public static final String BI_KEY_TARGET_VER = null;
    public static final String BI_KEY_TRIGGER_API = null;
    public static final String BI_KEY_UPDATE_TYPE = null;
    @Deprecated
    public static final String BI_TYPE_HMS_SDK_API = null;
    public static final String BI_TYPE_INTERFACE = null;
    public static final String BI_TYPE_UPDATE = null;
    public static final String HMS_SDK_BASE_ACTIVITY_STARTED = null;
    public static final String HMS_SDK_BASE_API_CALLED = null;
    public static final String HMS_SDK_BASE_CALL_AIDL = null;
    public static final String HMS_SDK_BASE_START_CORE_ACTIVITY = null;
    public static final String HMS_SDK_BASE_START_RESOLUTION = null;
    public static final String HMS_SDK_KIT_API_CALLED = null;
    public static final String REPORT_VAL_SEPARATOR = null;

    public interface Direction {
        public static final String REQUEST = null;
        public static final String RESPONSE = null;

        static {
            C0201.m83(Direction.class, 265);
        }
    }

    public interface HaKey {
        public static final String BI_KEY_APINAME = null;
        public static final String BI_KEY_APPID = null;
        public static final String BI_KEY_BASE_VERSION = null;
        public static final String BI_KEY_CALLTMEI = null;
        public static final String BI_KEY_DIRECTION = null;
        public static final String BI_KEY_ERRORREASON = null;
        public static final String BI_KEY_HMSVERSION = null;
        public static final String BI_KEY_PACKAGE = null;
        public static final String BI_KEY_PHONETYPE = null;
        public static final String BI_KEY_RESULT = null;
        public static final String BI_KEY_RETURNCODE = null;
        public static final String BI_KEY_SERVICE = null;
        public static final String BI_KEY_TRANSID = null;
        @Deprecated
        public static final String BI_KEY_TRANSTYPE = null;
        public static final String BI_KEY_VERSION = null;
        public static final String BI_KEY_WAITTIME = null;

        static {
            C0201.m83(HaKey.class, 405);
        }
    }

    public interface KeyAndValue {
        public static final String GAME_INIT_KEY = null;
        public static final String NUMBER_01 = null;
        public static final String START_BUY = null;
        public static final String START_BUYWITHPRICE = null;
        public static final String START_PAY = null;
        public static final String START_SUB = null;

        static {
            C0201.m83(KeyAndValue.class, C0188.f21);
        }
    }

    public interface TransType {
        @Deprecated
        public static final String TYPE_ENTER_CLIENT = null;
        @Deprecated
        public static final String TYPE_ENTER_IPC = null;
        @Deprecated
        public static final String TYPE_ENTER_RESOLUTION = null;
        @Deprecated
        public static final String TYPE_ENTER_SDK = null;
        @Deprecated
        public static final String TYPE_RETURN_CLIENT = null;
        @Deprecated
        public static final String TYPE_RETURN_IPC = null;
        @Deprecated
        public static final String TYPE_RETURN_RESOLUTION = null;
        @Deprecated
        public static final String TYPE_RETURN_SDK = null;

        static {
            C0201.m83(TransType.class, 322);
        }
    }

    static {
        C0201.m83(HiAnalyticsConstant.class, 329);
    }
}
