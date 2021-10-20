package okhttp3.internal.ws;

import defpackage.ay2;
import vigqyno.C0201;

public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = null;
    public static final int B0_FLAG_FIN = 0;
    public static final int B0_FLAG_RSV1 = 0;
    public static final int B0_FLAG_RSV2 = 0;
    public static final int B0_FLAG_RSV3 = 0;
    public static final int B0_MASK_OPCODE = 0;
    public static final int B1_FLAG_MASK = 0;
    public static final int B1_MASK_LENGTH = 0;
    public static final int CLOSE_CLIENT_GOING_AWAY = 0;
    public static final long CLOSE_MESSAGE_MAX = 0;
    public static final int CLOSE_NO_STATUS_CODE = 0;
    public static final int OPCODE_BINARY = 0;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 0;
    public static final int OPCODE_CONTROL_PING = 0;
    public static final int OPCODE_CONTROL_PONG = 0;
    public static final int OPCODE_FLAG_CONTROL = 0;
    public static final int OPCODE_TEXT = 0;
    public static final long PAYLOAD_BYTE_MAX = 0;
    public static final int PAYLOAD_LONG = 0;
    public static final int PAYLOAD_SHORT = 0;
    public static final long PAYLOAD_SHORT_MAX = 0;

    static {
        C0201.m83(WebSocketProtocol.class, 299);
    }

    private WebSocketProtocol() {
        throw new AssertionError(C0201.m82(16686));
    }

    public static String acceptHeader(String str) {
        return dy2.k(str + C0201.m82(16687)).v().b();
    }

    public static String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return C0201.m82(16690) + i;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            return C0201.m82(16688) + i + C0201.m82(16689);
        }
    }

    public static void toggleMask(ay2.c cVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.e;
            int i2 = cVar.f;
            int i3 = cVar.g;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (cVar.a() != -1);
    }

    public static void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }
}
