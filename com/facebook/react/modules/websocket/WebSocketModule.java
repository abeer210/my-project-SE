package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import vigqyno.C0201;

@pj0(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final String NAME = null;
    public static final String TAG = null;
    private final Map<Integer, b> mContentHandlers = new ConcurrentHashMap();
    private c mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();

    public interface b {
        void a(dy2 dy2, WritableMap writableMap);

        void b(String str, WritableMap writableMap);
    }

    static {
        C0201.m83(WebSocketModule.class, 606);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieHandler = new c(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get(C0201.m82(36468));
            if (list == null) {
                return null;
            }
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException(C0201.m82(36469) + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    private static String getDefaultOrigin(String str) {
        char c;
        try {
            String r0 = C0201.m82(36470);
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            String r5 = C0201.m82(36471);
            String r6 = C0201.m82(36472);
            if (hashCode != 3804) {
                if (hashCode != 118039) {
                    if (hashCode != 3213448) {
                        if (hashCode == 99617003 && scheme.equals(r5)) {
                            c = 3;
                            if (c == 0) {
                                r0 = r0 + r5;
                            } else if (c == 1) {
                                r0 = r0 + r6;
                            } else if (c == 2 || c == 3) {
                                r0 = r0 + uri.getScheme();
                            }
                            if (uri.getPort() != -1) {
                                return String.format(C0201.m82(36475), r0, uri.getHost(), Integer.valueOf(uri.getPort()));
                            }
                            return String.format(C0201.m82(36476), r0, uri.getHost());
                        }
                    } else if (scheme.equals(r6)) {
                        c = 2;
                        if (c == 0) {
                        }
                        if (uri.getPort() != -1) {
                        }
                    }
                } else if (scheme.equals(C0201.m82(36473))) {
                    c = 0;
                    if (c == 0) {
                    }
                    if (uri.getPort() != -1) {
                    }
                }
            } else if (scheme.equals(C0201.m82(36474))) {
                c = 1;
                if (c == 0) {
                }
                if (uri.getPort() != -1) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
            if (uri.getPort() != -1) {
            }
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException(C0201.m82(36477) + str + C0201.m82(36478));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(C0201.m82(36479), i);
        createMap.putString(C0201.m82(36480), str);
        sendEvent(C0201.m82(36481), createMap);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d, String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.close((int) d, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i));
                this.mContentHandlers.remove(Integer.valueOf(i));
            } catch (Exception e) {
                f60.j(C0201.m82(36483), C0201.m82(36482) + i, e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010c  */
    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d) {
        boolean z;
        StringBuilder sb;
        int i = (int) d;
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader(C0201.m82(36484), cookie);
        }
        String r1 = C0201.m82(36485);
        if (readableMap != null) {
            String r4 = C0201.m82(36486);
            if (readableMap.hasKey(r4) && readableMap.getType(r4).equals(ReadableType.Map)) {
                ReadableMap map = readableMap.getMap(r4);
                ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                z = false;
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (ReadableType.String.equals(map.getType(nextKey))) {
                        if (nextKey.equalsIgnoreCase(r1)) {
                            z = true;
                        }
                        url.addHeader(nextKey, map.getString(nextKey));
                    } else {
                        f60.A(C0201.m82(36489), C0201.m82(36487) + nextKey + C0201.m82(36488));
                    }
                }
                if (!z) {
                    url.addHeader(r1, getDefaultOrigin(str));
                }
                if (readableArray != null && readableArray.size() > 0) {
                    String r12 = C0201.m82(36490);
                    sb = new StringBuilder(r12);
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        String trim = readableArray.getString(i2).trim();
                        if (!trim.isEmpty()) {
                            String r42 = C0201.m82(36491);
                            if (!trim.contains(r42)) {
                                sb.append(trim);
                                sb.append(r42);
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        sb.replace(sb.length() - 1, sb.length(), r12);
                        url.addHeader(C0201.m82(36492), sb.toString());
                    }
                }
                build.newWebSocket(url.build(), new a(i));
                build.dispatcher().executorService().shutdown();
            }
        }
        z = false;
        if (!z) {
        }
        String r122 = C0201.m82(36490);
        sb = new StringBuilder(r122);
        while (i2 < readableArray.size()) {
        }
        if (sb.length() > 0) {
        }
        build.newWebSocket(url.build(), new a(i));
        build.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36493);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String r0 = C0201.m82(36494);
            createMap.putInt(r0, i);
            String r1 = C0201.m82(36495);
            String r2 = C0201.m82(36496);
            createMap.putString(r1, r2);
            sendEvent(C0201.m82(36497), createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(r0, i);
            createMap2.putInt(C0201.m82(36498), 0);
            createMap2.putString(C0201.m82(36499), r2);
            sendEvent(C0201.m82(36500), createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(dy2.e);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String r6 = C0201.m82(36501);
            createMap.putInt(r6, i);
            String r0 = C0201.m82(36502);
            String r1 = C0201.m82(36503);
            createMap.putString(r0, r1);
            sendEvent(C0201.m82(36504), createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(r6, i);
            createMap2.putInt(C0201.m82(36505), 0);
            createMap2.putString(C0201.m82(36506), r1);
            sendEvent(C0201.m82(36507), createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String r6 = C0201.m82(36515);
            createMap.putInt(r6, i);
            String r0 = C0201.m82(36516);
            String r1 = C0201.m82(36517);
            createMap.putString(r0, r1);
            sendEvent(C0201.m82(36518), createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(r6, i);
            createMap2.putInt(C0201.m82(36519), 0);
            createMap2.putString(C0201.m82(36520), r1);
            sendEvent(C0201.m82(36521), createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(dy2.f(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void setContentHandler(int i, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    class a extends WebSocketListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(28801), this.a);
            createMap.putInt(C0201.m82(28802), i);
            createMap.putString(C0201.m82(28803), str);
            WebSocketModule.this.sendEvent(C0201.m82(28804), createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            webSocket.close(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            WebSocketModule.this.notifyWebSocketFailed(this.a, th.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(28810), this.a);
            createMap.putString(C0201.m82(28811), C0201.m82(28812));
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.a));
            if (bVar != null) {
                bVar.b(str, createMap);
            } else {
                createMap.putString(C0201.m82(28813), str);
            }
            WebSocketModule.this.sendEvent(C0201.m82(28814), createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.a), webSocket);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(28815), this.a);
            createMap.putString(C0201.m82(28818), response.header(C0201.m82(28816), C0201.m82(28817)));
            WebSocketModule.this.sendEvent(C0201.m82(28819), createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, dy2 dy2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(C0201.m82(28805), this.a);
            createMap.putString(C0201.m82(28806), C0201.m82(28807));
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.a));
            if (bVar != null) {
                bVar.a(dy2, createMap);
            } else {
                createMap.putString(C0201.m82(28808), dy2.b());
            }
            WebSocketModule.this.sendEvent(C0201.m82(28809), createMap);
        }
    }

    public void sendBinary(dy2 dy2, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String r0 = C0201.m82(36508);
            createMap.putInt(r0, i);
            String r1 = C0201.m82(36509);
            String r2 = C0201.m82(36510);
            createMap.putString(r1, r2);
            sendEvent(C0201.m82(36511), createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(r0, i);
            createMap2.putInt(C0201.m82(36512), 0);
            createMap2.putString(C0201.m82(36513), r2);
            sendEvent(C0201.m82(36514), createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(dy2);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }
}
