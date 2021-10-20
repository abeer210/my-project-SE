package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import java.util.Arrays;
import java.util.HashSet;
import vigqyno.C0201;

/* compiled from: ViewProps */
public class c1 {
    public static final int[] a = {8, 4, 5, 1, 3, 0, 2};
    public static final int[] b = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    private static final HashSet<String> c = new HashSet<>(Arrays.asList(C0201.m82(11847), C0201.m82(11848), C0201.m82(11849), C0201.m82(11850), C0201.m82(11851), C0201.m82(11852), C0201.m82(11853), C0201.m82(11854), C0201.m82(11855), C0201.m82(11856), C0201.m82(11857), C0201.m82(11858), C0201.m82(11859), C0201.m82(11860), C0201.m82(11861), C0201.m82(11862), C0201.m82(11863), C0201.m82(11864), C0201.m82(11865), C0201.m82(11866), C0201.m82(11867), C0201.m82(11868), C0201.m82(11869), C0201.m82(11870), C0201.m82(11871), C0201.m82(11872), C0201.m82(11873), C0201.m82(11874), C0201.m82(11875), C0201.m82(11876), C0201.m82(11877), C0201.m82(11878), C0201.m82(11879), C0201.m82(11880), C0201.m82(11881), C0201.m82(11882), C0201.m82(11883), C0201.m82(11884), C0201.m82(11885), C0201.m82(11886), C0201.m82(11887), C0201.m82(11888), C0201.m82(11889)));

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(ReadableMap readableMap, String str) {
        char c2;
        if (c.contains(str)) {
            return true;
        }
        if (C0201.m82(11890).equals(str)) {
            String string = readableMap.getString(str);
            if (C0201.m82(11891).equals(string) || C0201.m82(11892).equals(string)) {
                return true;
            }
            return false;
        }
        int hashCode = str.hashCode();
        String r6 = C0201.m82(11893);
        String r7 = C0201.m82(11894);
        String r8 = C0201.m82(11895);
        String r9 = C0201.m82(11896);
        String r10 = C0201.m82(11897);
        String r11 = C0201.m82(11898);
        String r12 = C0201.m82(11899);
        String r13 = C0201.m82(11900);
        String r14 = C0201.m82(11901);
        String r15 = C0201.m82(11902);
        String r2 = C0201.m82(11903);
        switch (hashCode) {
            case -1989576717:
                if (str.equals(r15)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1971292586:
                if (str.equals(r14)) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1470826662:
                if (str.equals(r13)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1452542531:
                if (str.equals(r12)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1308858324:
                if (str.equals(r11)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1290574193:
                if (str.equals(r10)) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1267206133:
                if (str.equals(r9)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -242276144:
                if (str.equals(r8)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -223992013:
                if (str.equals(r7)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 529642498:
                if (str.equals(r6)) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 741115130:
                if (str.equals(r2)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals(C0201.m82(11904))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                if (readableMap.isNull(r9) || readableMap.getDouble(r9) == 1.0d) {
                    return true;
                }
                return false;
            case 1:
                String r1 = C0201.m82(11906);
                if (readableMap.hasKey(r1) && readableMap.getInt(r1) != 0) {
                    return false;
                }
                if (!readableMap.hasKey(r2) || readableMap.isNull(r2) || readableMap.getDouble(r2) == 0.0d) {
                    return true;
                }
                return false;
            case 2:
                if (readableMap.isNull(r8) || readableMap.getInt(r8) != 0) {
                    return false;
                }
                return true;
            case 3:
                if (readableMap.isNull(r15) || readableMap.getInt(r15) != 0) {
                    return false;
                }
                return true;
            case 4:
                if (readableMap.isNull(r13) || readableMap.getInt(r13) != 0) {
                    return false;
                }
                return true;
            case 5:
                if (readableMap.isNull(r11) || readableMap.getInt(r11) != 0) {
                    return false;
                }
                return true;
            case 6:
                if (readableMap.isNull(r2) || readableMap.getDouble(r2) == 0.0d) {
                    return true;
                }
                return false;
            case 7:
                if (readableMap.isNull(r7) || readableMap.getDouble(r7) == 0.0d) {
                    return true;
                }
                return false;
            case '\b':
                if (readableMap.isNull(r12) || readableMap.getDouble(r12) == 0.0d) {
                    return true;
                }
                return false;
            case '\t':
                if (readableMap.isNull(r14) || readableMap.getDouble(r14) == 0.0d) {
                    return true;
                }
                return false;
            case '\n':
                if (readableMap.isNull(r10) || readableMap.getDouble(r10) == 0.0d) {
                    return true;
                }
                return false;
            case 11:
                if (readableMap.isNull(r6)) {
                    return true;
                }
                if (C0201.m82(11905).equals(readableMap.getString(r6))) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
