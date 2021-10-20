package com.huawei.hms.rn.location.backend.helpers;

import vigqyno.C0201;

public class Constants {
    public static final String DEFAULT_CONTENT_TEXT = null;
    public static final String DEFAULT_CONTENT_TITLE = null;
    public static final String DEFAULT_DEF_TYPE = null;
    public static final String DEFAULT_RESOURCE_NAME = null;
    public static final String KEY_CONTENT_TEXT = null;
    public static final String KEY_CONTENT_TITLE = null;
    public static final String KEY_DEF_TYPE = null;
    public static final String KEY_RESOURCE_NAME = null;

    public enum Event {
        SCANNING_RESULT("onScanningResult"),
        ACTIVITY_IDENTIFICATION_RESULT("onActivityIdentificationResult"),
        ACTIVITY_CONVERSION_RESULT("onActivityConversionResult"),
        GEOFENCE_RESULT("onGeofenceResult");
        
        private String val;

        private Event(String str) {
            this.val = str;
        }

        public String getVal() {
            return this.val;
        }

        public String toString() {
            return this.val;
        }
    }

    static {
        C0201.m83(Constants.class, 422);
    }
}
