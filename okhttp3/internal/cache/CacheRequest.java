package okhttp3.internal.cache;

import java.io.IOException;

public interface CacheRequest {
    void abort();

    sy2 body() throws IOException;
}
