package com.huawei.hianalytics.ab.bc.ef;

public class ab {
    private static bc ab = new bc();

    public static void ab(int i) {
        ab.ab(i);
    }

    public static void ab(String str, String str2) {
        if (ab() && str != null && str2 != null) {
            ab.bc(3, str, str2);
        }
    }

    public static void ab(String str, String str2, Object... objArr) {
        if (cd() && str != null && str2 != null) {
            ab.bc(4, str, String.format(str2, objArr));
        }
    }

    private static boolean ab() {
        return ab.bc(3);
    }

    public static void bc(String str, String str2) {
        if (bc() && str != null && str2 != null) {
            ab.bc(6, str, str2);
        }
    }

    public static void bc(String str, String str2, Object... objArr) {
        de(str, String.format(str2, objArr));
    }

    private static boolean bc() {
        return ab.bc(6);
    }

    public static void cd(String str, String str2) {
        if (cd() && str != null && str2 != null) {
            ab.bc(4, str, str2);
        }
    }

    private static boolean cd() {
        return ab.bc(4);
    }

    public static void de(String str, String str2) {
        if (str != null && str2 != null) {
            ab.bc(4, str, str2);
        }
    }

    private static boolean de() {
        return ab.bc(5);
    }

    public static void ef(String str, String str2) {
        if (str != null && str2 != null) {
            ab.bc(5, str, str2);
        }
    }

    public static void fg(String str, String str2) {
        if (de() && str != null && str2 != null) {
            ab.bc(5, str, str2);
        }
    }
}
