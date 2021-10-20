package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: lp  reason: default package */
/* compiled from: ImageMetadataReader */
public class lp {

    /* access modifiers changed from: package-private */
    /* renamed from: lp$a */
    /* compiled from: ImageMetadataReader */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[jp.values().length];
            a = iArr;
            iArr[jp.Jpeg.ordinal()] = 1;
            a[jp.Tiff.ordinal()] = 2;
            a[jp.Arw.ordinal()] = 3;
            a[jp.Cr2.ordinal()] = 4;
            a[jp.Nef.ordinal()] = 5;
            a[jp.Orf.ordinal()] = 6;
            a[jp.Rw2.ordinal()] = 7;
            a[jp.Psd.ordinal()] = 8;
            a[jp.Png.ordinal()] = 9;
            a[jp.Bmp.ordinal()] = 10;
            a[jp.Gif.ordinal()] = 11;
            a[jp.Ico.ordinal()] = 12;
            a[jp.Pcx.ordinal()] = 13;
            a[jp.WebP.ordinal()] = 14;
            a[jp.Raf.ordinal()] = 15;
            a[jp.Avi.ordinal()] = 16;
            a[jp.Wav.ordinal()] = 17;
            a[jp.Mov.ordinal()] = 18;
            a[jp.Mp4.ordinal()] = 19;
            a[jp.Eps.ordinal()] = 20;
            try {
                a[jp.Unknown.ordinal()] = 21;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static wr a(InputStream inputStream, long j) throws mp, IOException {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
        jp a2 = kp.a(bufferedInputStream);
        wr b = b(bufferedInputStream, j, a2);
        b.a(new uv(a2));
        return b;
    }

    public static wr b(InputStream inputStream, long j, jp jpVar) throws IOException, mp {
        switch (a.a[jpVar.ordinal()]) {
            case 1:
                return tp.c(inputStream);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return vq.a(new lr(inputStream, 2048, j));
            case 8:
                return lq.a(inputStream);
            case 9:
                return jq.b(inputStream);
            case 10:
                return pp.a(inputStream);
            case 11:
                return rp.a(inputStream);
            case 12:
                return sp.a(inputStream);
            case 13:
                return cq.a(inputStream);
            case 14:
                return zq.a(inputStream);
            case 15:
                return pq.a(inputStream);
            case 16:
                return op.a(inputStream);
            case 17:
                return yq.a(inputStream);
            case 18:
                return nq.a(inputStream);
            case 19:
                return aq.a(inputStream);
            case 20:
                return qp.a(inputStream);
            case 21:
                throw new mp(C0201.m82(29378));
            default:
                return new wr();
        }
    }
}
