package defpackage;

import vigqyno.C0201;

/* renamed from: xn1  reason: default package */
public final class xn1 {
    public static String a(bk1 bk1) {
        yn1 yn1 = new yn1(bk1);
        StringBuilder sb = new StringBuilder(yn1.size());
        for (int i = 0; i < yn1.size(); i++) {
            byte a = yn1.a(i);
            if (a == 34) {
                sb.append(C0201.m82(28713));
            } else if (a == 39) {
                sb.append(C0201.m82(28712));
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append(C0201.m82(28710));
                        continue;
                    case 8:
                        sb.append(C0201.m82(28709));
                        continue;
                    case 9:
                        sb.append(C0201.m82(28708));
                        continue;
                    case 10:
                        sb.append(C0201.m82(28707));
                        continue;
                    case 11:
                        sb.append(C0201.m82(28706));
                        continue;
                    case 12:
                        sb.append(C0201.m82(28705));
                        continue;
                    case 13:
                        sb.append(C0201.m82(28704));
                        continue;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            continue;
                        }
                }
            } else {
                sb.append(C0201.m82(28711));
            }
        }
        return sb.toString();
    }
}
