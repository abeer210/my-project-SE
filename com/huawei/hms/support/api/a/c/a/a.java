package com.huawei.hms.support.api.a.c.a;

import com.huawei.hms.common.api.CommonStatusCodes;
import vigqyno.C0201;

/* compiled from: LocationStatusCode */
public class a extends CommonStatusCodes {
    public static String a(int i) {
        if (i == 10000) {
            return C0201.m82(33393);
        }
        if (i == 10204) {
            return C0201.m82(33392);
        }
        if (i == 10205) {
            return C0201.m82(33391);
        }
        switch (i) {
            case 10200:
                return C0201.m82(33390);
            case 10201:
                return C0201.m82(33389);
            case 10202:
                return C0201.m82(33388);
            default:
                switch (i) {
                    case 10801:
                        return C0201.m82(33387);
                    case 10802:
                        return C0201.m82(33386);
                    case 10803:
                        return C0201.m82(33385);
                    case 10804:
                        return C0201.m82(33384);
                    case 10805:
                        return C0201.m82(33383);
                    case 10806:
                        return C0201.m82(33382);
                    default:
                        return CommonStatusCodes.getStatusCodeString(i);
                }
        }
    }
}
