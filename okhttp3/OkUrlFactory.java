package okhttp3;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.internal.URLFilter;
import okhttp3.internal.annotations.EverythingIsNonNull;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.huc.OkHttpsURLConnection;
import vigqyno.C0201;

@EverythingIsNonNull
public final class OkUrlFactory implements URLStreamHandlerFactory, Cloneable {
    private OkHttpClient client;
    private URLFilter urlFilter;

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public OkHttpClient client() {
        return this.client;
    }

    public URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals(C0201.m82(13900)) || str.equals(C0201.m82(13901))) {
            return new URLStreamHandler() {
                /* class okhttp3.OkUrlFactory.AnonymousClass1 */

                public int getDefaultPort() {
                    if (str.equals(C0201.m82(38884))) {
                        return 80;
                    }
                    if (str.equals(C0201.m82(38885))) {
                        return 443;
                    }
                    throw new AssertionError();
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.open(url, proxy);
                }
            };
        }
        return null;
    }

    public HttpURLConnection open(URL url) {
        return open(url, this.client.proxy());
    }

    public OkUrlFactory setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        return this;
    }

    public void setUrlFilter(URLFilter uRLFilter) {
        this.urlFilter = uRLFilter;
    }

    @Override // java.lang.Object
    public OkUrlFactory clone() {
        return new OkUrlFactory(this.client);
    }

    public HttpURLConnection open(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient build = this.client.newBuilder().proxy(proxy).build();
        if (protocol.equals(C0201.m82(13902))) {
            OkHttpURLConnection okHttpURLConnection = new OkHttpURLConnection(url, build, this.urlFilter);
            w30.f(okHttpURLConnection);
            return okHttpURLConnection;
        } else if (protocol.equals(C0201.m82(13903))) {
            OkHttpsURLConnection okHttpsURLConnection = new OkHttpsURLConnection(url, build, this.urlFilter);
            w30.f(okHttpsURLConnection);
            return okHttpsURLConnection;
        } else {
            throw new IllegalArgumentException(C0201.m82(13904) + protocol);
        }
    }
}
