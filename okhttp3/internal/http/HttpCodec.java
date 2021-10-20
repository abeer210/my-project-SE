package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import vigqyno.C0201;

public interface HttpCodec {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 0;

    static {
        C0201.m83(HttpCodec.class, 734);
    }

    void cancel();

    sy2 createRequestBody(Request request, long j);

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    ResponseBody openResponseBody(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
