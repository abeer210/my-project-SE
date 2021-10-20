package defpackage;

import vigqyno.C0201;

/* renamed from: jz1  reason: default package */
public final class jz1 {
    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(C0201.m82(37236));
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        String r4 = C0201.m82(37237);
        sb.append(r4);
        sb.append(str2);
        sb.append(r4);
        sb.append(str3);
        return sb.toString();
    }
}
