package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ua2  reason: default package */
/* compiled from: DecodedBitStreamParser */
public final class ua2 {
    private static final char[] a = C0201.m82(15165).toCharArray();

    /* access modifiers changed from: package-private */
    /* renamed from: ua2$a */
    /* compiled from: DecodedBitStreamParser */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[ya2.values().length];
            a = iArr;
            iArr[ya2.NUMERIC.ordinal()] = 1;
            a[ya2.ALPHANUMERIC.ordinal()] = 2;
            a[ya2.BYTE.ordinal()] = 3;
            a[ya2.KANJI.ordinal()] = 4;
            a[ya2.TERMINATOR.ordinal()] = 5;
            a[ya2.FNC1_FIRST_POSITION.ordinal()] = 6;
            a[ya2.FNC1_SECOND_POSITION.ordinal()] = 7;
            a[ya2.STRUCTURED_APPEND.ordinal()] = 8;
            a[ya2.ECI.ordinal()] = 9;
            try {
                a[ya2.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static f72 a(byte[] bArr, ab2 ab2, wa2 wa2, Map<j62, ?> map) throws k62 {
        ya2 b;
        ya2 ya2;
        String str;
        d72 d72 = new d72(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        e72 e72 = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                if (d72.a() < 4) {
                    b = ya2.TERMINATOR;
                } else {
                    b = ya2.b(d72.d(4));
                }
                switch (a.a[b.ordinal()]) {
                    case 5:
                        ya2 = b;
                        break;
                    case 6:
                    case 7:
                        ya2 = b;
                        z = true;
                        break;
                    case 8:
                        if (d72.a() >= 16) {
                            int d = d72.d(8);
                            i3 = d72.d(8);
                            i2 = d;
                            ya2 = b;
                            break;
                        } else {
                            throw k62.a();
                        }
                    case 9:
                        e72 = e72.b(g(d72));
                        if (e72 == null) {
                            throw k62.a();
                        }
                        ya2 = b;
                        break;
                    case 10:
                        int d2 = d72.d(4);
                        int d3 = d72.d(b.d(ab2));
                        if (d2 == i) {
                            d(d72, sb, d3);
                        }
                        ya2 = b;
                        break;
                    default:
                        int d4 = d72.d(b.d(ab2));
                        int i4 = a.a[b.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    ya2 = b;
                                    c(d72, sb, d4, e72, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    e(d72, sb, d4);
                                    ya2 = b;
                                    break;
                                } else {
                                    throw k62.a();
                                }
                            } else {
                                ya2 = b;
                                b(d72, sb, d4, z);
                                break;
                            }
                        } else {
                            ya2 = b;
                            f(d72, sb, d4);
                            break;
                        }
                }
                if (ya2 == ya2.TERMINATOR) {
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                    if (wa2 == null) {
                        str = null;
                    } else {
                        str = wa2.toString();
                    }
                    return new f72(bArr, sb2, arrayList2, str, i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw k62.a();
            }
        }
    }

    private static void b(d72 d72, StringBuilder sb, int i, boolean z) throws k62 {
        while (i > 1) {
            if (d72.a() >= 11) {
                int d = d72.d(11);
                sb.append(h(d / 45));
                sb.append(h(d % 45));
                i -= 2;
            } else {
                throw k62.a();
            }
        }
        if (i == 1) {
            if (d72.a() >= 6) {
                sb.append(h(d72.d(6)));
            } else {
                throw k62.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    private static void c(d72 d72, StringBuilder sb, int i, e72 e72, Collection<byte[]> collection, Map<j62, ?> map) throws k62 {
        String str;
        if ((i << 3) <= d72.a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) d72.d(8);
            }
            if (e72 == null) {
                str = m72.a(bArr, map);
            } else {
                str = e72.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw k62.a();
            }
        } else {
            throw k62.a();
        }
    }

    private static void d(d72 d72, StringBuilder sb, int i) throws k62 {
        if (i * 13 <= d72.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = d72.d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C0201.m82(15166)));
            } catch (UnsupportedEncodingException unused) {
                throw k62.a();
            }
        } else {
            throw k62.a();
        }
    }

    private static void e(d72 d72, StringBuilder sb, int i) throws k62 {
        if (i * 13 <= d72.a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = d72.d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, C0201.m82(15167)));
            } catch (UnsupportedEncodingException unused) {
                throw k62.a();
            }
        } else {
            throw k62.a();
        }
    }

    private static void f(d72 d72, StringBuilder sb, int i) throws k62 {
        while (i >= 3) {
            if (d72.a() >= 10) {
                int d = d72.d(10);
                if (d < 1000) {
                    sb.append(h(d / 100));
                    sb.append(h((d / 10) % 10));
                    sb.append(h(d % 10));
                    i -= 3;
                } else {
                    throw k62.a();
                }
            } else {
                throw k62.a();
            }
        }
        if (i == 2) {
            if (d72.a() >= 7) {
                int d2 = d72.d(7);
                if (d2 < 100) {
                    sb.append(h(d2 / 10));
                    sb.append(h(d2 % 10));
                    return;
                }
                throw k62.a();
            }
            throw k62.a();
        } else if (i != 1) {
        } else {
            if (d72.a() >= 4) {
                int d3 = d72.d(4);
                if (d3 < 10) {
                    sb.append(h(d3));
                    return;
                }
                throw k62.a();
            }
            throw k62.a();
        }
    }

    private static int g(d72 d72) throws k62 {
        int d = d72.d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return d72.d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return d72.d(16) | ((d & 31) << 16);
        }
        throw k62.a();
    }

    private static char h(int i) throws k62 {
        char[] cArr = a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw k62.a();
    }
}
