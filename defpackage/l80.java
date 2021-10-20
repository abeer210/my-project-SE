package defpackage;

import vigqyno.C0201;

/* renamed from: l80  reason: default package */
/* compiled from: ImageOriginUtils */
public class l80 {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1917159454:
                if (str.equals(C0201.m82(29228))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1914072202:
                if (str.equals(C0201.m82(29227))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1683996557:
                if (str.equals(C0201.m82(29226))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1579985851:
                if (str.equals(C0201.m82(29225))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1307634203:
                if (str.equals(C0201.m82(29224))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1224383234:
                if (str.equals(C0201.m82(29223))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 473552259:
                if (str.equals(C0201.m82(29222))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 656304759:
                if (str.equals(C0201.m82(29221))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 957714404:
                if (str.equals(C0201.m82(29220))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1019542023:
                if (str.equals(C0201.m82(29219))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1023071510:
                if (str.equals(C0201.m82(29218))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1721672898:
                if (str.equals(C0201.m82(29217))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1793127518:
                if (str.equals(C0201.m82(29216))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2109593398:
                if (str.equals(C0201.m82(29215))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2113652014:
                if (str.equals(C0201.m82(29214))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return 6;
            default:
                return 1;
        }
    }

    public static String b(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? C0201.m82(29229) : C0201.m82(29230) : C0201.m82(29231) : C0201.m82(29232) : C0201.m82(29233) : C0201.m82(29234);
    }
}
