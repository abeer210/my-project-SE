package com.facebook.react.modules.network;

import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: ProgressRequestBody */
public class i extends RequestBody {
    private final RequestBody a;
    private final h b;
    private long c = 0;

    public i(RequestBody requestBody, h hVar) {
        this.a = requestBody;
        this.b = hVar;
    }

    private sy2 b(by2 by2) {
        return jy2.g(new a(by2.e1()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.c == 0) {
            this.c = this.a.contentLength();
        }
        return this.c;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(by2 by2) throws IOException {
        by2 c2 = jy2.c(b(by2));
        contentLength();
        this.a.writeTo(c2);
        c2.flush();
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ProgressRequestBody */
    public class a extends b {
        public a(OutputStream outputStream) {
            super(outputStream);
        }

        private void c() throws IOException {
            long a = a();
            long contentLength = i.this.contentLength();
            i.this.b.a(a, contentLength, a == contentLength);
        }

        @Override // java.io.OutputStream, com.facebook.react.modules.network.b, java.io.FilterOutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            c();
        }

        @Override // java.io.OutputStream, com.facebook.react.modules.network.b, java.io.FilterOutputStream
        public void write(int i) throws IOException {
            super.write(i);
            c();
        }
    }
}
