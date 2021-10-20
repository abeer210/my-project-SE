package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hr2  reason: default package */
/* compiled from: PDFDocEncoding */
public final class hr2 {
    private static final int[] a = new int[256];
    private static final Map<Character, Integer> b = new HashMap(256);

    static {
        for (int i = 0; i < 256; i++) {
            a(i, (char) i);
        }
        a(24, 728);
        a(25, 711);
        a(26, 710);
        a(27, 729);
        a(28, 733);
        a(29, 731);
        a(30, 730);
        a(31, 732);
        a(127, 65533);
        a(128, 8226);
        a(129, 8224);
        a(130, 8225);
        a(131, 8230);
        a(132, 8212);
        a(133, 8211);
        a(134, 402);
        a(135, 8260);
        a(136, 8249);
        a(137, 8250);
        a(138, 8722);
        a(139, 8240);
        a(140, 8222);
        a(141, 8220);
        a(142, 8221);
        a(143, 8216);
        a(144, 8217);
        a(145, 8218);
        a(146, 8482);
        a(147, 64257);
        a(148, 64258);
        a(149, 321);
        a(150, 338);
        a(151, 352);
        a(152, 376);
        a(153, 381);
        a(154, 305);
        a(155, 322);
        a(156, 339);
        a(157, 353);
        a(158, 382);
        a(159, 65533);
        a(160, 8364);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i, char c) {
        a[i] = c;
        b.put(Character.valueOf(c), Integer.valueOf(i));
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i = b2 & 255;
            int[] iArr = a;
            if (i >= iArr.length) {
                sb.append('?');
            } else {
                sb.append((char) iArr[i]);
            }
        }
        return sb.toString();
    }
}
