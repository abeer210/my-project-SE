package com.huawei.hms.android;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public class HwBuildEx {

    public static class VERSION {
        public static final int EMUI_SDK_INT = HwBuildEx.getSystemPropertiesInt(C0201.m82(15702), 0);
    }

    public static class VersionCodes {
        public static final int CUR_DEVELOPMENT = 0;
        public static final int EMUI_10_0 = 0;
        public static final int EMUI_1_0 = 0;
        public static final int EMUI_1_5 = 0;
        public static final int EMUI_1_6 = 0;
        public static final int EMUI_2_0_JB = 0;
        public static final int EMUI_2_0_KK = 0;
        public static final int EMUI_2_3 = 0;
        public static final int EMUI_3_0 = 0;
        public static final int EMUI_3_0_5 = 0;
        public static final int EMUI_3_1 = 0;
        public static final int EMUI_4_0 = 0;
        public static final int EMUI_4_1 = 0;
        public static final int EMUI_5_0 = 0;
        public static final int EMUI_5_1 = 0;
        public static final int EMUI_5_1_b10x = 0;
        public static final int EMUI_5_1_b200 = 0;
        public static final int EMUI_6_0 = 0;
        public static final int EMUI_9_0 = 0;
        public static final int UNKNOWN_EMUI = 0;

        static {
            C0201.m83(VersionCodes.class, 251);
        }
    }

    public static int getSystemPropertiesInt(String str, int i) {
        try {
            Class<?> cls = Class.forName(C0201.m82(4727));
            return ((Integer) cls.getDeclaredMethod(C0201.m82(4728), String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            Log.e(C0201.m82(4729), C0201.m82(4730));
            return i;
        }
    }
}
