package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import vigqyno.C0201;

public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar2) {
        this.cookieJar = cookieJar2;
    }

    private String cookieHeader(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(C0201.m82(4598));
            }
            Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        String r3 = C0201.m82(4599);
        String r6 = C0201.m82(4600);
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header(r3, contentType.toString());
            }
            long contentLength = body.contentLength();
            String r2 = C0201.m82(4601);
            if (contentLength != -1) {
                newBuilder.header(r6, Long.toString(contentLength));
                newBuilder.removeHeader(r2);
            } else {
                newBuilder.header(r2, C0201.m82(4602));
                newBuilder.removeHeader(r6);
            }
        }
        String r22 = C0201.m82(4603);
        boolean z = false;
        if (request.header(r22) == null) {
            newBuilder.header(r22, Util.hostHeader(request.url(), false));
        }
        String r23 = C0201.m82(4604);
        if (request.header(r23) == null) {
            newBuilder.header(r23, C0201.m82(4605));
        }
        String r24 = C0201.m82(4606);
        String header = request.header(r24);
        String r9 = C0201.m82(4607);
        if (header == null && request.header(C0201.m82(4608)) == null) {
            z = true;
            newBuilder.header(r24, r9);
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header(C0201.m82(4609), cookieHeader(loadForRequest));
        }
        String r25 = C0201.m82(4610);
        if (request.header(r25) == null) {
            newBuilder.header(r25, Version.userAgent());
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z) {
            String r1 = C0201.m82(4611);
            if (r9.equalsIgnoreCase(proceed.header(r1)) && HttpHeaders.hasBody(proceed)) {
                hy2 hy2 = new hy2(proceed.body().source());
                request2.headers(proceed.headers().newBuilder().removeAll(r1).removeAll(r6).build());
                request2.body(new RealResponseBody(proceed.header(r3), -1, jy2.d(hy2)));
            }
        }
        return request2.build();
    }
}
