package com.huawei.hianalytics.ab.bc.gh;

import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.kl.de;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

public class ab {
    private String ab = bc.fg().getFilesDir().getPath();

    private String ab(String str) {
        return this.ab + C0201.m82(24944).replace(C0201.m82(24945), str);
    }

    private void ab(String str, String str2) {
        File file = new File(ab(str));
        String ab2 = ab(str);
        File file2 = new File(ab2, C0201.m82(24946) + str);
        boolean exists = file.exists();
        String r2 = C0201.m82(24947);
        if (!exists && file.mkdirs()) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(r2, C0201.m82(24948));
        }
        if (ab(file2)) {
            de.ab(file2, str2);
        } else {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r2, C0201.m82(24949));
        }
    }

    private boolean ab(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            com.huawei.hianalytics.ab.bc.ef.ab.fg(C0201.m82(24950), C0201.m82(24951));
            return false;
        }
    }

    private char[] ab(String str, String str2, String str3, String str4) {
        byte[] b = ac2.b(str);
        byte[] b2 = ac2.b(str2);
        byte[] b3 = ac2.b(str3);
        byte[] b4 = ac2.b(str4);
        int length = b.length;
        if (length > b2.length) {
            length = b2.length;
        }
        if (length > b3.length) {
            length = b3.length;
        }
        if (length > b4.length) {
            length = b4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((b[i] ^ b2[i]) ^ b3[i]) ^ b4[i]);
        }
        return cArr;
    }

    private String bc(String str) {
        String ab2 = ab(str);
        File file = new File(ab2, C0201.m82(24952) + str);
        if (ab(file)) {
            return de.ab(file);
        }
        String e = zb2.e(128);
        de.ab(file, e);
        return e;
    }

    private boolean bc() {
        long ab2 = com.huawei.hianalytics.ab.bc.ij.ab.ab(bc.fg(), C0201.m82(24953), C0201.m82(24954), -1);
        if (-1 != ab2) {
            return System.currentTimeMillis() - ab2 > 31536000000L;
        }
        com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(24955), C0201.m82(24956));
        return true;
    }

    private static boolean bc(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(24958), C0201.m82(24957) + file2.getName());
                }
            } else if (file2.isDirectory()) {
                bc(file2);
            }
        }
        return file.delete();
    }

    public static boolean cd() {
        return bc(new File(bc.fg().getFilesDir().getPath() + C0201.m82(24959) + C0201.m82(24960)));
    }

    private String de() {
        return C0201.m82(24961);
    }

    public String ab() {
        String str;
        String str2;
        String str3;
        String str4;
        String de = de();
        boolean bc = bc();
        String r2 = C0201.m82(24962);
        String r3 = C0201.m82(24963);
        String r4 = C0201.m82(24964);
        String r5 = C0201.m82(24965);
        if (bc) {
            com.huawei.hianalytics.ab.bc.ef.ab.cd(C0201.m82(24966), C0201.m82(24967));
            str = zb2.e(128);
            ab(r5, str);
            str2 = zb2.e(128);
            ab(r4, str2);
            str3 = zb2.e(128);
            ab(r3, str3);
            str4 = zb2.e(128);
            ab(r2, str4);
            com.huawei.hianalytics.ab.bc.ij.ab.bc(bc.fg(), C0201.m82(24968), C0201.m82(24969), System.currentTimeMillis());
        } else {
            str = bc(r5);
            str2 = bc(r4);
            str3 = bc(r3);
            str4 = bc(r2);
        }
        return ac2.a(wb2.b(ab(str, str2, str3, de), ac2.b(str4), 10000, 16));
    }
}
