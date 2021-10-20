package com.huawei.hms.utils;

import java.util.regex.Pattern;
import vigqyno.C0188;
import vigqyno.C0201;

public class StringUtil {
    private StringUtil() {
    }

    public static String addByteForNum(String str, int i, char c) {
        int length = str.length();
        if (length == i) {
            return str;
        }
        if (length > i) {
            return str.substring(length - i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (length < i) {
            stringBuffer.append(c);
            length++;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static boolean checkVersion(String str) {
        return Pattern.compile(C0201.m82(7655)).matcher(str).find();
    }

    public static int convertVersion2Integer(String str) {
        if (!checkVersion(str)) {
            return 0;
        }
        String[] split = str.split(C0201.m82(7656));
        if (split.length < 3) {
            return 0;
        }
        int parseInt = (Integer.parseInt(split[0]) * 10000000) + (Integer.parseInt(split[1]) * 100000) + (Integer.parseInt(split[2]) * C0188.f18);
        return split.length == 4 ? parseInt + Integer.parseInt(split[3]) : parseInt;
    }

    public static String objDesc(Object obj) {
        if (obj == null) {
            return C0201.m82(7657);
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }
}
