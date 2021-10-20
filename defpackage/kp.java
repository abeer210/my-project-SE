package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: kp  reason: default package */
/* compiled from: FileTypeDetector */
public class kp {
    private static final dr<jp> a;
    private static final HashMap<String, jp> b;

    static {
        dr<jp> drVar = new dr<>();
        a = drVar;
        drVar.d(jp.Unknown);
        a.a(jp.Jpeg, new byte[]{-1, -40});
        dr<jp> drVar2 = a;
        jp jpVar = jp.Tiff;
        String r3 = C0201.m82(27658);
        drVar2.a(jpVar, r3.getBytes(), new byte[]{42, 0});
        a.a(jp.Tiff, C0201.m82(27659).getBytes(), new byte[]{0, 42});
        a.a(jp.Psd, C0201.m82(27660).getBytes());
        a.a(jp.Png, new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        a.a(jp.Bmp, C0201.m82(27661).getBytes());
        a.a(jp.Bmp, C0201.m82(27662).getBytes());
        a.a(jp.Bmp, C0201.m82(27663).getBytes());
        a.a(jp.Bmp, C0201.m82(27664).getBytes());
        a.a(jp.Bmp, C0201.m82(27665).getBytes());
        a.a(jp.Bmp, C0201.m82(27666).getBytes());
        a.a(jp.Gif, C0201.m82(27667).getBytes());
        a.a(jp.Gif, C0201.m82(27668).getBytes());
        a.a(jp.Ico, new byte[]{0, 0, 1, 0});
        a.a(jp.Pcx, new byte[]{10, 0, 1});
        a.a(jp.Pcx, new byte[]{10, 2, 1});
        a.a(jp.Pcx, new byte[]{10, 3, 1});
        a.a(jp.Pcx, new byte[]{10, 5, 1});
        a.a(jp.Riff, C0201.m82(27669).getBytes());
        a.a(jp.Arw, r3.getBytes(), new byte[]{42, 0, 8, 0});
        a.a(jp.Crw, r3.getBytes(), new byte[]{26, 0, 0, 0}, C0201.m82(27670).getBytes());
        a.a(jp.Cr2, r3.getBytes(), new byte[]{42, 0, 16, 0, 0, 0, 67, 82});
        a.a(jp.Orf, C0201.m82(27671).getBytes(), new byte[]{8, 0});
        a.a(jp.Orf, C0201.m82(27672).getBytes(), new byte[]{0, 0});
        a.a(jp.Orf, C0201.m82(27673).getBytes(), new byte[]{8, 0});
        a.a(jp.Raf, C0201.m82(27674).getBytes());
        a.a(jp.Rw2, r3.getBytes(), new byte[]{85, 0});
        a.a(jp.Eps, C0201.m82(27675).getBytes());
        a.a(jp.Eps, new byte[]{-59, -48, -45, -58});
        HashMap<String, jp> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(C0201.m82(27676), jp.Mov);
        b.put(C0201.m82(27677), jp.Mov);
        b.put(C0201.m82(27678), jp.Mov);
        b.put(C0201.m82(27679), jp.Mov);
        b.put(C0201.m82(27680), jp.Mov);
        b.put(C0201.m82(27681), jp.Mp4);
        b.put(C0201.m82(27682), jp.Mp4);
        b.put(C0201.m82(27683), jp.Mp4);
        b.put(C0201.m82(27684), jp.Mp4);
        b.put(C0201.m82(27685), jp.Mp4);
        b.put(C0201.m82(27686), jp.Mp4);
        b.put(C0201.m82(27687), jp.Mp4);
        b.put(C0201.m82(27688), jp.Mp4);
        b.put(C0201.m82(27689), jp.Mp4);
        b.put(C0201.m82(27690), jp.Mp4);
        b.put(C0201.m82(27691), jp.Mp4);
        b.put(C0201.m82(27692), jp.Mp4);
        b.put(C0201.m82(27693), jp.Mp4);
        b.put(C0201.m82(27694), jp.Mp4);
        b.put(C0201.m82(27695), jp.Mp4);
        b.put(C0201.m82(27696), jp.Mp4);
        b.put(C0201.m82(27697), jp.Mp4);
        b.put(C0201.m82(27698), jp.Mp4);
        b.put(C0201.m82(27699), jp.Mp4);
        b.put(C0201.m82(27700), jp.Mp4);
        b.put(C0201.m82(27701), jp.Mp4);
        b.put(C0201.m82(27702), jp.Mp4);
        b.put(C0201.m82(27703), jp.Mp4);
        b.put(C0201.m82(27704), jp.Mp4);
        b.put(C0201.m82(27705), jp.Mp4);
        b.put(C0201.m82(27706), jp.Heif);
        b.put(C0201.m82(27707), jp.Heif);
        b.put(C0201.m82(27708), jp.Heif);
        b.put(C0201.m82(27709), jp.Heif);
        b.put(C0201.m82(27710), jp.Heif);
        b.put(C0201.m82(27711), jp.Heif);
        a.a(jp.Aac, new byte[]{-1, -15});
        a.a(jp.Aac, new byte[]{-1, -7});
        a.a(jp.Asf, new byte[]{48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108});
        a.a(jp.Cfbf, new byte[]{-48, -49, 17, -32, -95, -79, 26, -31, 0});
        a.a(jp.Flv, new byte[]{70, 76, 86});
        a.a(jp.Indd, new byte[]{6, 6, -19, -11, -40, 29, 70, -27, -67, 49, -17, -25, -2, 116, -73, 29});
        a.a(jp.Mxf, new byte[]{6, 14, 43, 52, 2, 5, 1, 1, 13, 1, 2, 1, 1, 2});
        a.a(jp.Qxp, new byte[]{0, 0, 73, 73, 88, 80, 82, 51});
        a.a(jp.Qxp, new byte[]{0, 0, 77, 77, 88, 80, 82, 51});
        a.a(jp.Ram, new byte[]{114, 116, 115, 112, 58, 47, 47});
        a.a(jp.Rtf, new byte[]{123, 92, 114, 116, 102, 49});
        a.a(jp.Sit, new byte[]{83, 73, 84, 33, 0});
        a.a(jp.Sit, new byte[]{83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 41, 49, 57, 57, 55, 45});
        a.a(jp.Sitx, new byte[]{83, 116, 117, 102, 102, 73, 116, 33});
        a.a(jp.Swf, C0201.m82(27712).getBytes());
        a.a(jp.Swf, C0201.m82(27713).getBytes());
        a.a(jp.Swf, C0201.m82(27714).getBytes());
        a.a(jp.Vob, new byte[]{0, 0, 1, -70});
        a.a(jp.Zip, C0201.m82(27715).getBytes());
    }

    public static jp a(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.markSupported()) {
            int max = Math.max(16, a.c());
            bufferedInputStream.mark(max);
            byte[] bArr = new byte[max];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                jp b2 = a.b(bArr);
                if (b2 == jp.Unknown) {
                    jp jpVar = b.get(new String(bArr, 4, 8));
                    if (jpVar != null) {
                        return jpVar;
                    }
                    return b2;
                } else if (b2 != jp.Riff) {
                    return b2;
                } else {
                    String str = new String(bArr, 8, 4);
                    if (str.equals(C0201.m82(27716))) {
                        return jp.Wav;
                    }
                    if (str.equals(C0201.m82(27717))) {
                        return jp.Avi;
                    }
                    return str.equals(C0201.m82(27718)) ? jp.WebP : b2;
                }
            } else {
                throw new IOException(C0201.m82(27719));
            }
        } else {
            throw new IOException(C0201.m82(27720));
        }
    }
}
