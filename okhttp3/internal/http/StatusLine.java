package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;
import vigqyno.C0201;

public final class StatusLine {
    public static final int HTTP_CONTINUE = 0;
    public static final int HTTP_PERM_REDIRECT = 0;
    public static final int HTTP_TEMP_REDIRECT = 0;
    public final int code;
    public final String message;
    public final Protocol protocol;

    static {
        C0201.m83(StatusLine.class, 413);
    }

    public StatusLine(Protocol protocol2, int i, String str) {
        this.protocol = protocol2;
        this.code = i;
        this.message = str;
    }

    public static StatusLine get(Response response) {
        return new StatusLine(response.protocol(), response.code(), response.message());
    }

    public static StatusLine parse(String str) throws IOException {
        Protocol protocol2;
        String str2;
        boolean startsWith = str.startsWith(C0201.m82(26612));
        int i = 9;
        String r4 = C0201.m82(26613);
        if (startsWith) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(r4 + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol2 = Protocol.HTTP_1_0;
            } else if (charAt == 1) {
                protocol2 = Protocol.HTTP_1_1;
            } else {
                throw new ProtocolException(r4 + str);
            }
        } else if (str.startsWith(C0201.m82(26614))) {
            protocol2 = Protocol.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(r4 + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = C0201.m82(26615);
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(r4 + str);
                }
                return new StatusLine(protocol2, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(r4 + str);
            }
        } else {
            throw new ProtocolException(r4 + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol == Protocol.HTTP_1_0 ? C0201.m82(26616) : C0201.m82(26617));
        sb.append(' ');
        sb.append(this.code);
        if (this.message != null) {
            sb.append(' ');
            sb.append(this.message);
        }
        return sb.toString();
    }
}
