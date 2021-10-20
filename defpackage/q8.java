package defpackage;

import com.RNFetchBlob.f;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import vigqyno.C0201;

/* renamed from: q8  reason: default package */
/* compiled from: RNFetchBlobDefaultResp */
public class q8 extends ResponseBody {
    public String a;
    public ReactApplicationContext b;
    public ResponseBody c;
    public boolean d = false;

    /* renamed from: q8$a */
    /* compiled from: RNFetchBlobDefaultResp */
    private class a implements ty2 {
        public cy2 a;
        public long b = 0;

        public a(cy2 cy2) {
            this.a = cy2;
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            long read = this.a.read(ay2, j);
            this.b += read > 0 ? read : 0;
            f i = g.i(q8.this.a);
            long contentLength = q8.this.contentLength();
            if (!(i == null || contentLength == 0 || !i.a((float) (this.b / q8.this.contentLength())))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(C0201.m82(38347), q8.this.a);
                createMap.putString(C0201.m82(38348), String.valueOf(this.b));
                createMap.putString(C0201.m82(38349), String.valueOf(q8.this.contentLength()));
                boolean z = q8.this.d;
                String r2 = C0201.m82(38350);
                if (z) {
                    createMap.putString(r2, ay2.p0(Charset.defaultCharset()));
                } else {
                    createMap.putString(r2, C0201.m82(38351));
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) q8.this.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(38352), createMap);
            }
            return read;
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return null;
        }
    }

    public q8(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z) {
        this.b = reactApplicationContext;
        this.a = str;
        this.c = responseBody;
        this.d = z;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.c.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.c.contentType();
    }

    @Override // okhttp3.ResponseBody
    public cy2 source() {
        return jy2.d(new a(this.c.source()));
    }
}
