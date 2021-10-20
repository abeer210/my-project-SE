package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: ProgressResponseBody */
public class j extends ResponseBody {
    private final ResponseBody a;
    private final h b;
    private cy2 c;
    private long d = 0;

    /* access modifiers changed from: package-private */
    /* compiled from: ProgressResponseBody */
    public class a extends fy2 {
        public a(ty2 ty2) {
            super(ty2);
        }

        @Override // defpackage.ty2, defpackage.fy2
        public long read(ay2 ay2, long j) throws IOException {
            long read = super.read(ay2, j);
            j.this.d += read != -1 ? read : 0;
            j.this.b.a(j.this.d, j.this.a.contentLength(), read == -1);
            return read;
        }
    }

    public j(ResponseBody responseBody, h hVar) {
        this.a = responseBody;
        this.b = hVar;
    }

    private ty2 m(ty2 ty2) {
        return new a(ty2);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.a.contentType();
    }

    public long n() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    public cy2 source() {
        if (this.c == null) {
            this.c = jy2.d(m(this.a.source()));
        }
        return this.c;
    }
}
