package com.huawei.hms.framework.common;

import vigqyno.C0201;

public class EmuiUtil {
    public static final String BUILDEX_VERSION = null;
    private static final int EMUI_3_0 = 0;
    private static final int EMUI_3_1 = 0;
    private static final int EMUI_4_0 = 0;
    private static final int EMUI_4_1 = 0;
    private static final int EMUI_5_0 = 0;
    private static final int EMUI_6_0 = 0;
    private static final int EMUI_8_0_1 = 0;
    private static final int EMUI_9_0 = 0;
    public static final String EMUI_SDK_INT = null;
    private static final int EMUI_TYPE_UNKOWN = 0;
    public static final String GET_PRIMARY_COLOR = null;
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = null;
    public static final String IMMERSION_STYLE = null;
    private static final String TAG = null;
    private static final int TYPE_EMUI_30 = 0;
    private static final int TYPE_EMUI_31 = 0;
    private static final int TYPE_EMUI_40 = 0;
    private static final int TYPE_EMUI_41 = 0;
    private static final int TYPE_EMUI_50 = 0;
    private static final int TYPE_EMUI_60 = 0;
    private static final int TYPE_EMUI_801 = 0;
    private static final int TYPE_EMUI_90 = 0;
    private static int emuiType;
    private static int emuiVersionCode;

    static {
        C0201.m83(EmuiUtil.class, 243);
        initEmuiType();
    }

    private static int getEMUIVersionCode() {
        int i;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(C0201.m82(26992), C0201.m82(26993));
        String r1 = C0201.m82(26994);
        if (staticFieldObj != null) {
            try {
                i = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e) {
                Logger.e(r1, C0201.m82(26995), e);
            }
            Logger.d(r1, C0201.m82(26996) + i);
            return i;
        }
        i = 0;
        Logger.d(r1, C0201.m82(26996) + i);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    private static void initEmuiType() {
        int i;
        emuiVersionCode = getEMUIVersionCode();
        String r1 = C0201.m82(26998);
        Logger.d(r1, C0201.m82(26997) + emuiVersionCode);
        int i2 = emuiVersionCode;
        if (i2 >= 17) {
            i = 90;
        } else if (i2 >= 15) {
            i = 81;
        } else if (i2 >= 14) {
            i = 60;
        } else if (i2 >= 11) {
            i = 50;
        } else if (i2 >= 10) {
            i = 41;
        } else if (i2 >= 9) {
            i = 40;
        } else if (i2 >= 8) {
            i = 31;
        } else {
            if (i2 >= 7) {
                i = 30;
            }
            if (emuiType != -1) {
                Logger.i(r1, C0201.m82(26999));
                return;
            }
            return;
        }
        emuiType = i;
        if (emuiType != -1) {
        }
    }

    public static boolean isEMUI() {
        return -1 != emuiType;
    }
}
