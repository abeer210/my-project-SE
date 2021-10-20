package okhttp3.internal.http2;

import java.io.IOException;
import vigqyno.C0201;

public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    public StreamResetException(ErrorCode errorCode2) {
        super(C0201.m82(39067) + errorCode2);
        this.errorCode = errorCode2;
    }
}
