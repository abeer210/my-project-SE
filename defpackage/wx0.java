package defpackage;

import vigqyno.C0201;

/* renamed from: wx0  reason: default package */
public final class wx0 {
    public static String a(fu0 fu0) {
        String r2;
        xx0 xx0 = new xx0(fu0);
        StringBuilder sb = new StringBuilder(xx0.size());
        for (int i = 0; i < xx0.size(); i++) {
            int a = xx0.a(i);
            if (a == 34) {
                r2 = C0201.m82(19534);
            } else if (a == 39) {
                r2 = C0201.m82(19533);
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        r2 = C0201.m82(19531);
                        break;
                    case 8:
                        r2 = C0201.m82(19530);
                        break;
                    case 9:
                        r2 = C0201.m82(19529);
                        break;
                    case 10:
                        r2 = C0201.m82(19528);
                        break;
                    case 11:
                        r2 = C0201.m82(19527);
                        break;
                    case 12:
                        r2 = C0201.m82(19526);
                        break;
                    case 13:
                        r2 = C0201.m82(19525);
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
                        continue;
                }
            } else {
                r2 = C0201.m82(19532);
            }
            sb.append(r2);
        }
        return sb.toString();
    }
}
