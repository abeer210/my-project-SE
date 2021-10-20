package com.huawei.hms.maps.common.util;

import android.content.Context;
import com.huawei.hms.maps.mac;
import com.huawei.hms.maps.mco;
import vigqyno.C0201;

public class VersionUtil {
    public static int isHmsMapAvailable(Context context) {
        String r0 = C0201.m82(38943);
        String r1 = C0201.m82(38944);
        String a = mac.a(r0, r1);
        String a2 = mac.a(C0201.m82(38945), r1);
        String r2 = C0201.m82(38946);
        boolean z = r2.equalsIgnoreCase(a) || r2.equalsIgnoreCase(a2);
        String r12 = C0201.m82(38947);
        if (z && !mac.a()) {
            mco.a(r12, C0201.m82(38948));
            return 2;
        } else if (mac.a(context) != 0) {
            mco.a(r12, C0201.m82(38949));
            return 1;
        } else {
            mco.a(r12, C0201.m82(38950));
            return 0;
        }
    }
}
