package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final cy2 source;

    public RealResponseBody(String str, long j, cy2 cy2) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = cy2;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public cy2 source() {
        return this.source;
    }
}
