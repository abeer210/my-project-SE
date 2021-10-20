package okhttp3.internal.huc;

import java.io.IOException;
import okhttp3.Request;
import vigqyno.C0201;

public final class BufferedRequestBody extends OutputStreamRequestBody {
    public final ay2 buffer;
    public long contentLength = -1;

    public BufferedRequestBody(long j) {
        ay2 ay2 = new ay2();
        this.buffer = ay2;
        initOutputStream(ay2, j);
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody, okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.contentLength;
    }

    @Override // okhttp3.internal.huc.OutputStreamRequestBody
    public Request prepareToSendRequest(Request request) throws IOException {
        String r0 = C0201.m82(18437);
        if (request.header(r0) != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.Q();
        return request.newBuilder().removeHeader(C0201.m82(18438)).header(r0, Long.toString(this.buffer.Q())).build();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) throws IOException {
        this.buffer.n(by2.d(), 0, this.buffer.Q());
    }
}
