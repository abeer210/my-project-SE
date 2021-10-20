package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class Http2 {
    public static final String[] BINARY = new String[256];
    public static final dy2 CONNECTION_PREFACE = dy2.k(C0201.m82(39078));
    public static final String[] FLAGS = new String[64];
    public static final byte FLAG_ACK = 0;
    public static final byte FLAG_COMPRESSED = 0;
    public static final byte FLAG_END_HEADERS = 0;
    public static final byte FLAG_END_PUSH_PROMISE = 0;
    public static final byte FLAG_END_STREAM = 0;
    public static final byte FLAG_NONE = 0;
    public static final byte FLAG_PADDED = 0;
    public static final byte FLAG_PRIORITY = 0;
    private static final String[] FRAME_NAMES = {C0201.m82(39079), C0201.m82(39080), C0201.m82(39081), C0201.m82(39082), C0201.m82(39083), C0201.m82(39084), C0201.m82(39085), C0201.m82(39086), C0201.m82(39087), C0201.m82(39088)};
    public static final int INITIAL_MAX_FRAME_SIZE = 0;
    public static final byte TYPE_CONTINUATION = 0;
    public static final byte TYPE_DATA = 0;
    public static final byte TYPE_GOAWAY = 0;
    public static final byte TYPE_HEADERS = 0;
    public static final byte TYPE_PING = 0;
    public static final byte TYPE_PRIORITY = 0;
    public static final byte TYPE_PUSH_PROMISE = 0;
    public static final byte TYPE_RST_STREAM = 0;
    public static final byte TYPE_SETTINGS = 0;
    public static final byte TYPE_WINDOW_UPDATE = 0;

    static {
        String r3;
        C0201.m83(Http2.class, 261);
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = Util.format(C0201.m82(39089), Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = C0201.m82(39090);
        strArr2[1] = C0201.m82(39091);
        int[] iArr = {1};
        strArr2[8] = C0201.m82(39092);
        int i3 = 0;
        while (true) {
            r3 = C0201.m82(39093);
            if (i3 >= 1) {
                break;
            }
            int i4 = iArr[i3];
            FLAGS[i4 | 8] = FLAGS[i4] + r3;
            i3++;
        }
        String[] strArr3 = FLAGS;
        strArr3[4] = C0201.m82(39094);
        strArr3[32] = C0201.m82(39095);
        strArr3[36] = C0201.m82(39096);
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = FLAGS;
                int i9 = i8 | i6;
                strArr4[i9] = FLAGS[i8] + '|' + FLAGS[i6];
                FLAGS[i9 | 8] = FLAGS[i8] + '|' + FLAGS[i6] + r3;
            }
        }
        while (true) {
            String[] strArr5 = FLAGS;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = BINARY[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    public static String formatFlags(byte b, byte b2) {
        if (b2 == 0) {
            return C0201.m82(39097);
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    return C0201.m82(39102);
                }
                return BINARY[b2];
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = FLAGS;
                String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace(C0201.m82(39100), C0201.m82(39101));
                }
                return str.replace(C0201.m82(39098), C0201.m82(39099));
            }
        }
        return BINARY[b2];
    }

    public static String frameLog(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = FRAME_NAMES;
        String format = b < strArr.length ? strArr[b] : Util.format(C0201.m82(39103), Byte.valueOf(b));
        String formatFlags = formatFlags(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? C0201.m82(39104) : C0201.m82(39105);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = formatFlags;
        return Util.format(C0201.m82(39106), objArr);
    }

    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }
}
