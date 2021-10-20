package okhttp3;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import vigqyno.C0201;

public final class Request {
    public final RequestBody body;
    private volatile CacheControl cacheControl;
    public final Headers headers;
    public final String method;
    public final Map<Class<?>, Object> tags;
    public final HttpUrl url;

    public static class Builder {
        public RequestBody body;
        public Headers.Builder headers;
        public String method;
        public Map<Class<?>, Object> tags;
        public HttpUrl url;

        public Builder() {
            this.tags = Collections.emptyMap();
            this.method = C0201.m82(38688);
            this.headers = new Headers.Builder();
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException(C0201.m82(38689));
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            boolean isEmpty = cacheControl2.isEmpty();
            String r1 = C0201.m82(38690);
            if (isEmpty) {
                return removeHeader(r1);
            }
            return header(r1, cacheControl2);
        }

        public Builder delete(RequestBody requestBody) {
            return method(C0201.m82(38691), requestBody);
        }

        public Builder get() {
            return method(C0201.m82(38692), null);
        }

        public Builder head() {
            return method(C0201.m82(38693), null);
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException(C0201.m82(38698));
            } else if (str.length() != 0) {
                String r0 = C0201.m82(38694);
                if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(r0 + str + C0201.m82(38695));
                } else if (requestBody != null || !HttpMethod.requiresRequestBody(str)) {
                    this.method = str;
                    this.body = requestBody;
                    return this;
                } else {
                    throw new IllegalArgumentException(r0 + str + C0201.m82(38696));
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(38697));
            }
        }

        public Builder patch(RequestBody requestBody) {
            return method(C0201.m82(38699), requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method(C0201.m82(38700), requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method(C0201.m82(38701), requestBody);
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.url = httpUrl;
                return this;
            }
            throw new NullPointerException(C0201.m82(38709));
        }

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.tags.remove(cls);
                } else {
                    if (this.tags.isEmpty()) {
                        this.tags = new LinkedHashMap();
                    }
                    this.tags.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException(C0201.m82(38702));
        }

        public Builder url(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, C0201.m82(38703), 0, 3)) {
                    str = C0201.m82(38704) + str.substring(3);
                } else if (str.regionMatches(true, 0, C0201.m82(38705), 0, 4)) {
                    str = C0201.m82(38706) + str.substring(4);
                }
                return url(HttpUrl.get(str));
            }
            throw new NullPointerException(C0201.m82(38707));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> map;
            this.tags = Collections.emptyMap();
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            if (request.tags.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(request.tags);
            }
            this.tags = map;
            this.headers = request.headers.newBuilder();
        }

        public Builder url(URL url2) {
            if (url2 != null) {
                return url(HttpUrl.get(url2.toString()));
            }
            throw new NullPointerException(C0201.m82(38708));
        }
    }

    public Request(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.tags = Util.immutableMap(builder.tags);
    }

    public RequestBody body() {
        return this.body;
    }

    public CacheControl cacheControl() {
        CacheControl cacheControl2 = this.cacheControl;
        if (cacheControl2 != null) {
            return cacheControl2;
        }
        CacheControl parse = CacheControl.parse(this.headers);
        this.cacheControl = parse;
        return parse;
    }

    public String header(String str) {
        return this.headers.get(str);
    }

    public Headers headers() {
        return this.headers;
    }

    public boolean isHttps() {
        return this.url.isHttps();
    }

    public String method() {
        return this.method;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        return C0201.m82(23420) + this.method + C0201.m82(23421) + this.url + C0201.m82(23422) + this.tags + '}';
    }

    public HttpUrl url() {
        return this.url;
    }

    public List<String> headers(String str) {
        return this.headers.values(str);
    }

    public <T> T tag(Class<? extends T> cls) {
        return (T) cls.cast(this.tags.get(cls));
    }
}
