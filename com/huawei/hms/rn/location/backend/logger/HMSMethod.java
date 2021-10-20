package com.huawei.hms.rn.location.backend.logger;

import android.app.Activity;

public class HMSMethod {
    private String name;
    private boolean periodical;

    public HMSMethod(String str) {
        this.periodical = false;
        this.name = str;
    }

    public static void disableLogger(Activity activity) {
        HMSLogger.getInstance(activity).disableLogger();
    }

    public static void enableLogger(Activity activity) {
        HMSLogger.getInstance(activity).enableLogger();
    }

    public String getName() {
        return this.name;
    }

    public void sendLoggerEvent(Activity activity) {
        if (this.periodical) {
            HMSLogger.getInstance(activity).sendPeriodicEvent(this.name);
        } else {
            HMSLogger.getInstance(activity).sendSingleEvent(this.name);
        }
    }

    public HMSMethod(String str, boolean z) {
        this(str);
        this.periodical = z;
    }

    public void sendLoggerEvent(Activity activity, String str) {
        if (this.periodical) {
            HMSLogger.getInstance(activity).sendPeriodicEvent(this.name, str);
        } else {
            HMSLogger.getInstance(activity).sendSingleEvent(this.name, str);
        }
    }
}
