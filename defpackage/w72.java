package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import vigqyno.C0201;

/* renamed from: w72  reason: default package */
/* compiled from: DecodedBitStreamParser */
public final class w72 {
    private static final char[] a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] b;
    private static final char[] c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] d;
    private static final char[] e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* access modifiers changed from: package-private */
    /* renamed from: w72$a */
    /* compiled from: DecodedBitStreamParser */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.C40_ENCODE.ordinal()] = 1;
            a[b.TEXT_ENCODE.ordinal()] = 2;
            a[b.ANSIX12_ENCODE.ordinal()] = 3;
            a[b.EDIFACT_ENCODE.ordinal()] = 4;
            a[b.BASE256_ENCODE.ordinal()] = 5;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w72$b */
    /* compiled from: DecodedBitStreamParser */
    public enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        b = cArr;
        d = cArr;
    }

    public static f72 a(byte[] bArr) throws k62 {
        d72 d72 = new d72(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        b bVar = b.ASCII_ENCODE;
        do {
            if (bVar == b.ASCII_ENCODE) {
                bVar = c(d72, sb, sb2);
            } else {
                int i = a.a[bVar.ordinal()];
                if (i == 1) {
                    e(d72, sb);
                } else if (i == 2) {
                    g(d72, sb);
                } else if (i == 3) {
                    b(d72, sb);
                } else if (i == 4) {
                    f(d72, sb);
                } else if (i == 5) {
                    d(d72, sb, arrayList);
                } else {
                    throw k62.a();
                }
                bVar = b.ASCII_ENCODE;
            }
            if (bVar == b.PAD_ENCODE) {
                break;
            }
        } while (d72.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String sb3 = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new f72(bArr, sb3, arrayList, null);
    }

    private static void b(d72 d72, StringBuilder sb) throws k62 {
        int d2;
        int[] iArr = new int[3];
        while (d72.a() != 8 && (d2 = d72.d(8)) != 254) {
            h(d2, d72.d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append('\r');
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('>');
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw k62.a();
                }
            }
            if (d72.a() <= 0) {
                return;
            }
        }
    }

    private static b c(d72 d72, StringBuilder sb, StringBuilder sb2) throws k62 {
        boolean z = false;
        do {
            int d2 = d72.d(8);
            if (d2 == 0) {
                throw k62.a();
            } else if (d2 <= 128) {
                if (z) {
                    d2 += 128;
                }
                sb.append((char) (d2 - 1));
                return b.ASCII_ENCODE;
            } else if (d2 == 129) {
                return b.PAD_ENCODE;
            } else {
                if (d2 <= 229) {
                    int i = d2 - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else {
                    String r4 = C0201.m82(21952);
                    switch (d2) {
                        case 230:
                            return b.C40_ENCODE;
                        case 231:
                            return b.BASE256_ENCODE;
                        case 232:
                            sb.append((char) 29);
                            break;
                        case 233:
                        case 234:
                        case 241:
                            break;
                        case 235:
                            z = true;
                            break;
                        case 236:
                            sb.append(C0201.m82(21954));
                            sb2.insert(0, r4);
                            break;
                        case 237:
                            sb.append(C0201.m82(21953));
                            sb2.insert(0, r4);
                            break;
                        case 238:
                            return b.ANSIX12_ENCODE;
                        case 239:
                            return b.TEXT_ENCODE;
                        case 240:
                            return b.EDIFACT_ENCODE;
                        default:
                            if (!(d2 == 254 && d72.a() == 0)) {
                                throw k62.a();
                            }
                    }
                }
            }
        } while (d72.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(d72 d72, StringBuilder sb, Collection<byte[]> collection) throws k62 {
        int c2 = d72.c() + 1;
        int i = c2 + 1;
        int i2 = i(d72.d(8), c2);
        if (i2 == 0) {
            i2 = d72.a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + i(d72.d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (d72.a() >= 8) {
                    bArr[i3] = (byte) i(d72.d(8), i);
                    i3++;
                    i++;
                } else {
                    throw k62.a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, C0201.m82(21955)));
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalStateException(C0201.m82(21956).concat(String.valueOf(e2)));
            }
        } else {
            throw k62.a();
        }
    }

    private static void e(d72 d72, StringBuilder sb) throws k62 {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (d72.a() != 8 && (d2 = d72.d(8)) != 254) {
            h(d2, d72.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = b;
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw k62.a();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw k62.a();
                        } else if (z) {
                            sb.append((char) (i3 + 224));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = a;
                    if (i3 < cArr2.length) {
                        char c3 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw k62.a();
                    }
                }
            }
            if (d72.a() <= 0) {
                return;
            }
        }
    }

    private static void f(d72 d72, StringBuilder sb) {
        while (d72.a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d2 = d72.d(6);
                if (d2 == 31) {
                    int b2 = 8 - d72.b();
                    if (b2 != 8) {
                        d72.d(b2);
                        return;
                    }
                    return;
                }
                if ((d2 & 32) == 0) {
                    d2 |= 64;
                }
                sb.append((char) d2);
            }
            if (d72.a() <= 0) {
                return;
            }
        }
    }

    private static void g(d72 d72, StringBuilder sb) throws k62 {
        int d2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (d72.a() != 8 && (d2 = d72.d(8)) != 254) {
            h(d2, d72.d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = d;
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                }
                            } else if (i3 == 27) {
                                sb.append((char) 29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw k62.a();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = e;
                            if (i3 < cArr2.length) {
                                char c3 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c3 + 128));
                                } else {
                                    sb.append(c3);
                                    i = 0;
                                }
                            } else {
                                throw k62.a();
                            }
                        } else {
                            throw k62.a();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = c;
                    if (i3 < cArr3.length) {
                        char c4 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c4 + 128));
                            z = false;
                        } else {
                            sb.append(c4);
                        }
                    } else {
                        throw k62.a();
                    }
                }
            }
            if (d72.a() <= 0) {
                return;
            }
        }
    }

    private static void h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static int i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
