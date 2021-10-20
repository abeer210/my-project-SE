package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: pw  reason: default package */
/* compiled from: Iso2022Converter */
public final class pw {
    public static String a(byte[] bArr) {
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 37 && bArr[2] == 71) {
            return C0201.m82(38886);
        }
        if (bArr.length > 3 && bArr[0] == 27 && ((bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16)) == 14844066 && bArr[4] == 65) {
            return C0201.m82(38887);
        }
        return null;
    }

    public static Charset b(byte[] bArr) {
        String[] strArr = {C0201.m82(38888), System.getProperty(C0201.m82(38889)), C0201.m82(38890)};
        for (int i = 0; i < 3; i++) {
            Charset forName = Charset.forName(strArr[i]);
            try {
                forName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return forName;
            } catch (CharacterCodingException unused) {
            }
        }
        return null;
    }
}
