package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: ur2  reason: default package */
/* compiled from: Predictor */
public final class ur2 {
    public static void a(int i, int i2, int i3, int i4, InputStream inputStream, OutputStream outputStream) throws IOException {
        if (i == 1) {
            bs2.b(inputStream, outputStream);
            return;
        }
        int i5 = i2 * i3;
        int i6 = (i5 + 7) / 8;
        int i7 = ((i5 * i4) + 7) / 8;
        byte[] bArr = new byte[i7];
        byte[] bArr2 = new byte[i7];
        int i8 = i;
        while (inputStream.available() > 0) {
            if (i >= 10) {
                int read = inputStream.read();
                if (read != -1) {
                    i8 = read + 10;
                } else {
                    return;
                }
            }
            int i9 = 0;
            while (true) {
                if (i9 < i7) {
                    int read2 = inputStream.read(bArr, i9, i7 - i9);
                    if (read2 != -1) {
                        i9 += read2;
                    }
                }
            }
            if (i8 != 2) {
                switch (i8) {
                    case 11:
                        for (int i10 = 0; i10 < i7; i10++) {
                            int i11 = i10 - i6;
                            bArr[i10] = (byte) (bArr[i10] + (i11 >= 0 ? bArr[i11] : 0));
                        }
                        break;
                    case 12:
                        for (int i12 = 0; i12 < i7; i12++) {
                            bArr[i12] = (byte) (((bArr[i12] & 255) + (bArr2[i12] & 255)) & 255);
                        }
                        break;
                    case 13:
                        for (int i13 = 0; i13 < i7; i13++) {
                            int i14 = i13 - i6;
                            bArr[i13] = (byte) (((bArr[i13] & 255) + (((i14 >= 0 ? bArr[i14] & 255 : 0) + (bArr2[i13] & 255)) / 2)) & 255);
                        }
                        break;
                    case 14:
                        for (int i15 = 0; i15 < i7; i15++) {
                            int i16 = bArr[i15] & 255;
                            int i17 = i15 - i6;
                            int i18 = i17 >= 0 ? bArr[i17] & 255 : 0;
                            int i19 = bArr2[i15] & 255;
                            int i20 = i17 >= 0 ? bArr2[i17] & 255 : 0;
                            int i21 = (i18 + i19) - i20;
                            int abs = Math.abs(i21 - i18);
                            int abs2 = Math.abs(i21 - i19);
                            int abs3 = Math.abs(i21 - i20);
                            if (abs <= abs2 && abs <= abs3) {
                                bArr[i15] = (byte) ((i16 + i18) & 255);
                            } else if (abs2 <= abs3) {
                                bArr[i15] = (byte) ((i16 + i19) & 255);
                            } else {
                                bArr[i15] = (byte) ((i16 + i20) & 255);
                            }
                        }
                        break;
                }
            } else if (i3 == 16) {
                for (int i22 = 0; i22 < i7; i22 += 2) {
                    int i23 = i22 + 1;
                    int i24 = i22 - i6;
                    int i25 = ((bArr[i22] & 255) << 8) + (bArr[i23] & 255) + (i24 >= 0 ? ((bArr[i24] & 255) << 8) + (bArr[i24 + 1] & 255) : 0);
                    bArr[i22] = (byte) ((i25 >> 8) & 255);
                    bArr[i23] = (byte) (i25 & 255);
                }
            } else if (i3 >= 8) {
                for (int i26 = 0; i26 < i7; i26++) {
                    int i27 = i26 - i6;
                    bArr[i26] = (byte) ((bArr[i26] & 255) + (i27 >= 0 ? bArr[i27] & 255 : 0));
                }
            } else {
                throw new IOException(C0201.m82(19990) + i3 + C0201.m82(19991));
            }
            System.arraycopy(bArr, 0, bArr2, 0, i7);
            outputStream.write(bArr);
        }
    }
}
