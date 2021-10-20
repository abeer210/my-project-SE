package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.annotation.Packed;
import vigqyno.C0201;

public class JosGetNoticeReq extends JosBaseReq {
    public static final int NOTICE_TYPE_CONN = 0;
    public static final int NOTICE_TYPE_SIGN = 0;
    @Packed
    private int noticeType;

    static {
        C0201.m83(JosGetNoticeReq.class, 593);
    }

    private static <T> T get(T t) {
        return t;
    }

    public int getNoticeType() {
        return ((Integer) get(Integer.valueOf(this.noticeType))).intValue();
    }

    public void setNoticeType(int i) {
        this.noticeType = i;
    }
}
