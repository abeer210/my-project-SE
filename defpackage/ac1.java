package defpackage;

import vigqyno.C0201;

/* renamed from: ac1  reason: default package */
public final class ac1 {
    public static String a(c81 c81) {
        dc1 dc1 = new dc1(c81);
        StringBuilder sb = new StringBuilder(dc1.size());
        for (int i = 0; i < dc1.size(); i++) {
            byte a = dc1.a(i);
            if (a == 34) {
                sb.append(C0201.m82(5018));
            } else if (a == 39) {
                sb.append(C0201.m82(5017));
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append(C0201.m82(5015));
                        continue;
                    case 8:
                        sb.append(C0201.m82(5014));
                        continue;
                    case 9:
                        sb.append(C0201.m82(5013));
                        continue;
                    case 10:
                        sb.append(C0201.m82(5012));
                        continue;
                    case 11:
                        sb.append(C0201.m82(5011));
                        continue;
                    case 12:
                        sb.append(C0201.m82(5010));
                        continue;
                    case 13:
                        sb.append(C0201.m82(5009));
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
                sb.append(C0201.m82(5016));
            }
        }
        return sb.toString();
    }
}
