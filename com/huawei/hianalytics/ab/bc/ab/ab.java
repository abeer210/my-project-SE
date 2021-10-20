package com.huawei.hianalytics.ab.bc.ab;

import android.util.Pair;
import java.nio.charset.Charset;
import vigqyno.C0201;

public class ab {
    public static final Charset ab = Charset.forName(C0201.m82(7736));

    public static Pair<byte[], String> ab(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(ac2.b(substring), str.substring(32));
    }

    public static String ab(String str, String str2) {
        Pair<byte[], String> ab2 = ab(str);
        return new String(vb2.b(ac2.b((String) ab2.second), ac2.b(str2), (byte[]) ab2.first), ab);
    }

    public static String bc(String str, String str2) {
        return ac2.a(vb2.c(str.getBytes(ab), ac2.b(str2)));
    }
}
