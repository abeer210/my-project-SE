package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import vigqyno.C0201;

public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 0;
    private static final int ENTRY_COUNT = 0;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 0;
    public final DiskLruCache cache;
    private int hitCount;
    public final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    public int writeAbortCount;
    public int writeSuccessCount;

    /* access modifiers changed from: private */
    public final class CacheRequestImpl implements CacheRequest {
        private sy2 body;
        private sy2 cacheOut;
        public boolean done;
        private final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor2) {
            this.editor = editor2;
            sy2 newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new ey2(newSink, Cache.this) {
                /* class okhttp3.Cache.CacheRequestImpl.AnonymousClass1 */

                @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable, defpackage.ey2
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        if (!CacheRequestImpl.this.done) {
                            CacheRequestImpl.this.done = true;
                            Cache.this.writeSuccessCount++;
                            super.close();
                            editor2.commit();
                        }
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (!this.done) {
                    this.done = true;
                    Cache.this.writeAbortCount++;
                    Util.closeQuietly(this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public sy2 body() {
            return this.body;
        }
    }

    /* access modifiers changed from: private */
    public static class CacheResponseBody extends ResponseBody {
        private final cy2 bodySource;
        private final String contentLength;
        private final String contentType;
        public final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = jy2.d(new fy2(snapshot2.getSource(1)) {
                /* class okhttp3.Cache.CacheResponseBody.AnonymousClass1 */

                @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable, defpackage.fy2
                public void close() throws IOException {
                    snapshot2.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                if (this.contentLength != null) {
                    return Long.parseLong(this.contentLength);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public cy2 source() {
            return this.bodySource;
        }
    }

    static {
        C0201.m83(Cache.class, 566);
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return dy2.k(httpUrl.toString()).p().m();
    }

    public static int readInt(cy2 cy2) throws IOException {
        try {
            long Y = cy2.Y();
            String J0 = cy2.J0();
            if (Y >= 0 && Y <= 2147483647L && J0.isEmpty()) {
                return (int) Y;
            }
            throw new IOException(C0201.m82(35490) + Y + J0 + C0201.m82(35491));
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public void delete() throws IOException {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() throws IOException {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    public CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals(C0201.m82(35492)) || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public void remove(Request request) throws IOException {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() throws IOException {
        return this.cache.size();
    }

    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    public void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            abortQuietly(editor);
        }
    }

    public Iterator<String> urls() throws IOException {
        return new Iterator<String>() {
            /* class okhttp3.Cache.AnonymousClass2 */
            public boolean canRemove;
            public final Iterator<DiskLruCache.Snapshot> delegate = Cache.this.cache.snapshots();
            public String nextUrl;

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = jy2.d(next.getSource(0)).J0();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException(C0201.m82(35501));
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            /* class okhttp3.Cache.AnonymousClass1 */

            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) throws IOException {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) throws IOException {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, 201105, 2, j);
    }

    /* access modifiers changed from: private */
    public static final class Entry {
        private static final String RECEIVED_MILLIS = (Platform.get().getPrefix() + C0201.m82(35236));
        private static final String SENT_MILLIS = (Platform.get().getPrefix() + C0201.m82(35235));
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        public Entry(ty2 ty2) throws IOException {
            TlsVersion tlsVersion;
            try {
                cy2 d = jy2.d(ty2);
                this.url = d.J0();
                this.requestMethod = d.J0();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(d);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(d.J0());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(d.J0());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(d);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(d.J0());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String J0 = d.J0();
                    if (J0.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(d.J0());
                        List<Certificate> readCertificateList = readCertificateList(d);
                        List<Certificate> readCertificateList2 = readCertificateList(d);
                        if (!d.M()) {
                            tlsVersion = TlsVersion.forJavaName(d.J0());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException(C0201.m82(35237) + J0 + C0201.m82(35238));
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                ty2.close();
            }
        }

        private boolean isHttps() {
            return this.url.startsWith(C0201.m82(35239));
        }

        private List<Certificate> readCertificateList(cy2 cy2) throws IOException {
            int readInt = Cache.readInt(cy2);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance(C0201.m82(35240));
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String J0 = cy2.J0();
                    ay2 ay2 = new ay2();
                    ay2.V(dy2.f(J0));
                    arrayList.add(instance.generateCertificate(ay2.j1()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(by2 by2, List<Certificate> list) throws IOException {
            try {
                by2.c1((long) list.size()).O(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    by2.l0(dy2.q(list.get(i).getEncoded()).b()).O(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get(C0201.m82(35241));
            String str2 = this.responseHeaders.get(C0201.m82(35242));
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(DiskLruCache.Editor editor) throws IOException {
            String r4;
            by2 c = jy2.c(editor.newSink(0));
            c.l0(this.url).O(10);
            c.l0(this.requestMethod).O(10);
            c.c1((long) this.varyHeaders.size()).O(10);
            int size = this.varyHeaders.size();
            int i = 0;
            while (true) {
                r4 = C0201.m82(35243);
                if (i >= size) {
                    break;
                }
                c.l0(this.varyHeaders.name(i)).l0(r4).l0(this.varyHeaders.value(i)).O(10);
                i++;
            }
            c.l0(new StatusLine(this.protocol, this.code, this.message).toString()).O(10);
            c.c1((long) (this.responseHeaders.size() + 2)).O(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c.l0(this.responseHeaders.name(i2)).l0(r4).l0(this.responseHeaders.value(i2)).O(10);
            }
            c.l0(SENT_MILLIS).l0(r4).c1(this.sentRequestMillis).O(10);
            c.l0(RECEIVED_MILLIS).l0(r4).c1(this.receivedResponseMillis).O(10);
            if (isHttps()) {
                c.O(10);
                c.l0(this.handshake.cipherSuite().javaName()).O(10);
                writeCertList(c, this.handshake.peerCertificates());
                writeCertList(c, this.handshake.localCertificates());
                c.l0(this.handshake.tlsVersion().javaName()).O(10);
            }
            c.close();
        }

        public Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
