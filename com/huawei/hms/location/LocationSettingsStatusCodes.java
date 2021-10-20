package com.huawei.hms.location;

import com.huawei.hms.common.api.CommonStatusCodes;
import vigqyno.C0201;

public class LocationSettingsStatusCodes extends CommonStatusCodes {
    public static final int SETTINGS_CHANGE_UNAVAILABLE = 0;

    static {
        C0201.m83(LocationSettingsStatusCodes.class, 678);
    }
}
