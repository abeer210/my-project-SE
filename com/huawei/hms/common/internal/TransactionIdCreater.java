package com.huawei.hms.common.internal;

import com.huawei.hms.utils.StringUtil;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import vigqyno.C0201;

public class TransactionIdCreater {
    private static final int API_SIZE = 0;
    private static final int APPID_SIZE = 0;
    private static final char FILL_BYTE = '0';

    static {
        C0201.m83(TransactionIdCreater.class, 563);
    }

    public static String getId(String str, String str2) {
        return StringUtil.addByteForNum(str, 9, FILL_BYTE) + StringUtil.addByteForNum(str2, 6, FILL_BYTE) + new SimpleDateFormat(C0201.m82(31249), Locale.ENGLISH).format(new Date()) + String.format(Locale.ENGLISH, C0201.m82(31250), Integer.valueOf(new SecureRandom().nextInt(1000000)));
    }
}
