package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.e;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import vigqyno.C0201;

@pj0(name = "BlobModule")
public class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = null;
    private final Map<String, byte[]> mBlobs = new HashMap();
    private final NetworkingModule.f mNetworkingRequestBodyHandler = new c();
    private final NetworkingModule.g mNetworkingResponseHandler = new d();
    private final NetworkingModule.h mNetworkingUriHandler = new b();
    private final WebSocketModule.b mWebSocketContentHandler = new a();

    class a implements WebSocketModule.b {
        public a() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void a(dy2 dy2, WritableMap writableMap) {
            byte[] I = dy2.I();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(21775), BlobModule.this.store(I));
            createMap.putInt(C0201.m82(21776), 0);
            createMap.putInt(C0201.m82(21777), I.length);
            writableMap.putMap(C0201.m82(21778), createMap);
            writableMap.putString(C0201.m82(21779), C0201.m82(21780));
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void b(String str, WritableMap writableMap) {
            writableMap.putString(C0201.m82(21781), str);
        }
    }

    class b implements NetworkingModule.h {
        public b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public WritableMap a(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(22384), BlobModule.this.store(bytesFromUri));
            createMap.putInt(C0201.m82(22385), 0);
            createMap.putInt(C0201.m82(22386), bytesFromUri.length);
            createMap.putString(C0201.m82(22387), BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString(C0201.m82(22388), BlobModule.this.getNameFromUri(uri));
            createMap.putDouble(C0201.m82(22389), (double) BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public boolean b(Uri uri, String str) {
            String scheme = uri.getScheme();
            if ((C0201.m82(22390).equals(scheme) || C0201.m82(22391).equals(scheme)) || !C0201.m82(22392).equals(str)) {
                return false;
            }
            return true;
        }
    }

    class c implements NetworkingModule.f {
        public c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public boolean a(ReadableMap readableMap) {
            return readableMap.hasKey(C0201.m82(22284));
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public RequestBody b(ReadableMap readableMap, String str) {
            String r0 = C0201.m82(22285);
            if (readableMap.hasKey(r0) && !readableMap.getString(r0).isEmpty()) {
                str = readableMap.getString(r0);
            }
            if (str == null) {
                str = C0201.m82(22286);
            }
            ReadableMap map = readableMap.getMap(C0201.m82(22287));
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString(C0201.m82(22288)), map.getInt(C0201.m82(22289)), map.getInt(C0201.m82(22290))));
        }
    }

    class d implements NetworkingModule.g {
        public d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public WritableMap a(ResponseBody responseBody) throws IOException {
            byte[] bytes = responseBody.bytes();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(22271), BlobModule.this.store(bytes));
            createMap.putInt(C0201.m82(22272), 0);
            createMap.putInt(C0201.m82(22273), bytes.length);
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public boolean b(String str) {
            return C0201.m82(22274).equals(str);
        }
    }

    static {
        C0201.m83(BlobModule.class, 663);
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            throw new FileNotFoundException(C0201.m82(28740) + uri);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private long getLastModifiedFromUri(Uri uri) {
        if (C0201.m82(28741).equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? C0201.m82(28742) : type;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getNameFromUri(Uri uri) {
        if (C0201.m82(28743).equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{C0201.m82(28744)}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double d2) {
        int i = (int) d2;
        WebSocketModule webSocketModule = getWebSocketModule(C0201.m82(28745));
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, this.mWebSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String r5 = C0201.m82(28746);
            String string = map.getString(r5);
            char c2 = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -891985903) {
                if (hashCode == 3026845 && string.equals(C0201.m82(28747))) {
                    c2 = 0;
                }
            } else if (string.equals(C0201.m82(28748))) {
                c2 = 1;
            }
            String r6 = C0201.m82(28749);
            if (c2 == 0) {
                ReadableMap map2 = map.getMap(r6);
                i += map2.getInt(C0201.m82(28752));
                arrayList.add(i2, resolve(map2));
            } else if (c2 == 1) {
                byte[] bytes = map.getString(r6).getBytes(Charset.forName(C0201.m82(28750)));
                i += bytes.length;
                arrayList.add(i2, bytes);
            } else {
                throw new IllegalArgumentException(C0201.m82(28751) + map.getString(r5));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(28753);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier(C0201.m82(28754), C0201.m82(28755), getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return e.c();
        }
        return e.e(C0201.m82(28756), C0201.m82(28757), C0201.m82(28758), resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        BlobCollector.b(getReactApplicationContext(), this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String str) {
        remove(str);
    }

    @zh0
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double d2) {
        int i = (int) d2;
        WebSocketModule webSocketModule = getWebSocketModule(C0201.m82(28759));
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, null);
        }
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter(C0201.m82(28760));
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter(C0201.m82(28761));
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap readableMap, double d2) {
        int i = (int) d2;
        WebSocketModule webSocketModule = getWebSocketModule(C0201.m82(28765));
        if (webSocketModule != null) {
            byte[] resolve = resolve(readableMap.getString(C0201.m82(28766)), readableMap.getInt(C0201.m82(28767)), readableMap.getInt(C0201.m82(28768)));
            if (resolve != null) {
                webSocketModule.sendBinary(dy2.q(resolve), i);
            } else {
                webSocketModule.sendBinary((dy2) null, i);
            }
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    public byte[] resolve(String str, int i, int i2) {
        synchronized (this.mBlobs) {
            byte[] bArr = this.mBlobs.get(str);
            if (bArr == null) {
                return null;
            }
            if (i2 == -1) {
                i2 = bArr.length - i;
            }
            if (i > 0 || i2 != bArr.length) {
                bArr = Arrays.copyOfRange(bArr, i, i2 + i);
            }
            return bArr;
        }
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString(C0201.m82(28762)), readableMap.getInt(C0201.m82(28763)), readableMap.getInt(C0201.m82(28764)));
    }
}
