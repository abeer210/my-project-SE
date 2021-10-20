package okhttp3.internal.huc;

import java.io.IOException;
import okhttp3.internal.http.UnrepeatableRequestBody;

public final class StreamedRequestBody extends OutputStreamRequestBody implements UnrepeatableRequestBody {
    private final ly2 pipe;

    public StreamedRequestBody(long j) {
        ly2 ly2 = new ly2(8192);
        this.pipe = ly2;
        initOutputStream(jy2.c(ly2.b()), j);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) throws IOException {
        ay2 ay2 = new ay2();
        while (this.pipe.c().read(ay2, 8192) != -1) {
            by2.write(ay2, ay2.Q());
        }
    }
}
