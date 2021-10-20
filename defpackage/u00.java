package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: u00  reason: default package */
/* compiled from: PhotoshopReader */
public class u00 implements wp {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;

    static {
        C0201.m83(u00.class, 75);
    }

    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 14) {
                if (C0201.m82(25002).equals(new String(bArr, 0, 13))) {
                    c(new nr(bArr, 14), (bArr.length - 13) - 1, wrVar);
                }
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APPD);
    }

    public void c(or orVar, int i, wr wrVar) {
        int i2;
        int i3;
        t00 t00 = new t00();
        wrVar.a(t00);
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5 = i3) {
            try {
                String m = orVar.m(4);
                int p = orVar.p();
                short r = orVar.r();
                int i6 = i5 + 4 + 2 + 1;
                if (r < 0 || (i2 = r + i6) > i) {
                    throw new mp(c);
                }
                StringBuilder sb = new StringBuilder();
                short s = (short) i2;
                while (i6 < s) {
                    sb.append((char) orVar.r());
                    i6++;
                }
                if (i6 % 2 != 0) {
                    orVar.t(1);
                    i6++;
                }
                int f = orVar.f();
                byte[] d2 = orVar.d(f);
                i3 = i6 + 4 + f;
                if (i3 % 2 != 0) {
                    orVar.t(1);
                    i3++;
                }
                if (m.equals(b)) {
                    if (p == 1028) {
                        new ow().d(new nr(d2), wrVar, (long) d2.length, t00);
                    } else if (p == 1039) {
                        new iw().d(new br(d2), wrVar, t00);
                    } else {
                        if (p != 1058) {
                            if (p != 1059) {
                                if (p == 1060) {
                                    new m10().g(d2, wrVar, t00);
                                } else if (p < 2000 || p > 2998) {
                                    t00.C(p, d2);
                                } else {
                                    i4++;
                                    byte[] copyOf = Arrays.copyOf(d2, d2.length + sb.length() + 1);
                                    for (int length = (copyOf.length - sb.length()) - 1; length < copyOf.length; length++) {
                                        if (length % (((copyOf.length - sb.length()) - 1) + sb.length()) == 0) {
                                            copyOf[length] = (byte) sb.length();
                                        } else {
                                            copyOf[length] = (byte) sb.charAt(length - ((copyOf.length - sb.length()) - 1));
                                        }
                                    }
                                    HashMap<Integer, String> hashMap = t00.e;
                                    int i7 = i4 + 1999;
                                    Integer valueOf = Integer.valueOf(i7);
                                    hashMap.put(valueOf, d + i4);
                                    t00.C(i7, copyOf);
                                }
                            }
                        }
                        new vs().e(new br(d2), wrVar, 0, t00);
                    }
                    if (p >= 4000 && p <= 4999) {
                        t00.e.put(Integer.valueOf(p), String.format(a, Integer.valueOf((p - 4000) + 1)));
                    }
                }
            } catch (Exception e) {
                t00.a(e.getMessage());
                return;
            }
        }
    }
}
