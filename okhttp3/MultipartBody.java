package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE = MediaType.get(C0201.m82(177));
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};
    public static final MediaType DIGEST = MediaType.get(C0201.m82(178));
    public static final MediaType FORM = MediaType.get(C0201.m82(180));
    public static final MediaType MIXED = MediaType.get(C0201.m82(176));
    public static final MediaType PARALLEL = MediaType.get(C0201.m82(179));
    private final dy2 boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;

    public static final class Builder {
        private final dy2 boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException(C0201.m82(23931));
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException(C0201.m82(23934));
            } else if (mediaType.type().equals(C0201.m82(23932))) {
                this.type = mediaType;
                return this;
            } else {
                throw new IllegalArgumentException(C0201.m82(23933) + mediaType);
            }
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = dy2.k(str);
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException(C0201.m82(23930));
        }
    }

    public static final class Part {
        public final RequestBody body;
        public final Headers headers;

        private Part(Headers headers2, RequestBody requestBody) {
            this.headers = headers2;
            this.body = requestBody;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public RequestBody body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }

        public static Part create(Headers headers2, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException(C0201.m82(17733));
            } else if (headers2 != null && headers2.get(C0201.m82(17729)) != null) {
                throw new IllegalArgumentException(C0201.m82(17730));
            } else if (headers2 == null || headers2.get(C0201.m82(17731)) == null) {
                return new Part(headers2, requestBody);
            } else {
                throw new IllegalArgumentException(C0201.m82(17732));
            }
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(C0201.m82(17734));
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append(C0201.m82(17735));
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(Headers.of(C0201.m82(17736), sb.toString()), requestBody);
            }
            throw new NullPointerException(C0201.m82(17737));
        }
    }

    public MultipartBody(dy2 dy2, MediaType mediaType, List<Part> list) {
        this.boundary = dy2;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + C0201.m82(181) + dy2.J());
        this.parts = Util.immutableList(list);
    }

    public static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append(C0201.m82(184));
            } else if (charAt == '\r') {
                sb.append(C0201.m82(183));
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append(C0201.m82(182));
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ay2 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: ay2 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: ay2 */
    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(by2 by2, boolean z) throws IOException {
        ay2 ay2;
        if (z) {
            by2 = new ay2();
            ay2 = by2;
        } else {
            ay2 = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            by2.write(DASHDASH);
            by2.R0(this.boundary);
            by2.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    by2.l0(headers.name(i2)).write(COLONSPACE).l0(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType2 = requestBody.contentType();
            if (contentType2 != null) {
                by2.l0(C0201.m82(185)).l0(contentType2.toString()).write(CRLF);
            }
            long contentLength2 = requestBody.contentLength();
            if (contentLength2 != -1) {
                by2.l0(C0201.m82(186)).c1(contentLength2).write(CRLF);
            } else if (z) {
                ay2.a();
                return -1;
            }
            by2.write(CRLF);
            if (z) {
                j += contentLength2;
            } else {
                requestBody.writeTo(by2);
            }
            by2.write(CRLF);
        }
        by2.write(DASHDASH);
        by2.R0(this.boundary);
        by2.write(DASHDASH);
        by2.write(CRLF);
        if (!z) {
            return j;
        }
        long Q = j + ay2.Q();
        ay2.a();
        return Q;
    }

    public String boundary() {
        return this.boundary.J();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) throws IOException {
        writeOrCountBytes(by2, false);
    }
}
