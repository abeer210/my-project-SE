package defpackage;

import com.RNFetchBlob.f;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import vigqyno.C0201;

/* renamed from: r8  reason: default package */
/* compiled from: RNFetchBlobFileResp */
public class r8 extends ResponseBody {
    public String a;
    public ResponseBody b;
    public long c = 0;
    public ReactApplicationContext d;
    public FileOutputStream e;

    /* renamed from: r8$b */
    /* compiled from: RNFetchBlobFileResp */
    private class b implements ty2 {
        private b() {
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            r8.this.e.close();
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            int i = (int) j;
            try {
                byte[] bArr = new byte[i];
                long read = (long) r8.this.b.byteStream().read(bArr, 0, i);
                r8.this.c += read > 0 ? read : 0;
                if (read > 0) {
                    r8.this.e.write(bArr, 0, (int) read);
                }
                f i2 = g.i(r8.this.a);
                if (!(i2 == null || r8.this.contentLength() == 0 || !i2.a((float) (r8.this.c / r8.this.contentLength())))) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString(C0201.m82(4312), r8.this.a);
                    createMap.putString(C0201.m82(4313), String.valueOf(r8.this.c));
                    createMap.putString(C0201.m82(4314), String.valueOf(r8.this.contentLength()));
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) r8.this.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(4315), createMap);
                }
                return read;
            } catch (Exception unused) {
                return -1;
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return null;
        }
    }

    public r8(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z) throws IOException {
        this.d = reactApplicationContext;
        this.a = str;
        this.b = responseBody;
        if (str2 != null) {
            boolean z2 = !z;
            String replace = str2.replace(C0201.m82(38666), C0201.m82(38667));
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.e = new FileOutputStream(new File(replace), z2);
                return;
            }
            throw new IllegalStateException(C0201.m82(38668) + parentFile);
        }
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public cy2 source() {
        return jy2.d(new b());
    }
}
