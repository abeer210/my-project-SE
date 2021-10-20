package com.huawei.hms.security;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.HuaweiServicesNotAvailableException;
import com.huawei.hms.api.HuaweiServicesRepairableException;
import vigqyno.C0201;

public class SecComponentInstallWizard {
    public static final String PROVIDER_NAME = null;

    public interface SecComponentInstallWizardListener {
        void onFailed(int i, Intent intent);

        void onSuccess();
    }

    static {
        C0201.m83(SecComponentInstallWizard.class, 698);
    }

    public static void install(Context context) throws HuaweiServicesNotAvailableException, HuaweiServicesRepairableException {
    }
}
