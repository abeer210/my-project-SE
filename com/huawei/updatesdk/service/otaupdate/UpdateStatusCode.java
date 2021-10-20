package com.huawei.updatesdk.service.otaupdate;

import vigqyno.C0201;

public interface UpdateStatusCode {
    public static final int CANCEL = 0;
    public static final int CHECK_FAILED = 0;
    public static final int CONNECT_ERROR = 0;
    public static final int HAS_UPGRADE_INFO = 0;
    public static final int INSTALL_FAILED = 0;
    public static final int IN_MARKET_UPDATING = 0;
    public static final int MARKET_FORBID = 0;
    public static final int NO_UPGRADE_INFO = 0;
    public static final int PARAMER_ERROR = 0;

    public interface DialogButton {
        public static final int CANCEL = 0;
        public static final int CONFIRM = 0;

        static {
            C0201.m83(DialogButton.class, 532);
        }
    }

    static {
        C0201.m83(UpdateStatusCode.class, 353);
    }
}
