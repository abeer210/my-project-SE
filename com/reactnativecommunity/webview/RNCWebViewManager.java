package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.scroll.i;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0188;
import vigqyno.C0201;

@pj0(name = "RNCWebView")
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    public static final String BLANK_URL = null;
    public static final int COMMAND_CLEAR_CACHE = 0;
    public static final int COMMAND_CLEAR_FORM_DATA = 0;
    public static final int COMMAND_CLEAR_HISTORY = 0;
    public static final int COMMAND_FOCUS = 0;
    public static final int COMMAND_GO_BACK = 0;
    public static final int COMMAND_GO_FORWARD = 0;
    public static final int COMMAND_INJECT_JAVASCRIPT = 0;
    public static final int COMMAND_LOAD_URL = 0;
    public static final int COMMAND_POST_MESSAGE = 0;
    public static final int COMMAND_RELOAD = 0;
    public static final int COMMAND_STOP_LOADING = 0;
    public static final String HTML_ENCODING = null;
    public static final String HTML_MIME_TYPE = null;
    public static final String HTTP_METHOD_POST = null;
    public static final String JAVASCRIPT_INTERFACE = null;
    public static final String REACT_CLASS = null;
    public static String activeUrl;
    public boolean mAllowsFullscreenVideo;
    public String mUserAgent;
    public String mUserAgentWithApplicationName;
    public e mWebChromeClient;
    public b mWebViewConfig;

    class a implements b {
        public a(RNCWebViewManager rNCWebViewManager) {
        }

        @Override // com.reactnativecommunity.webview.b
        public void a(WebView webView) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements DownloadListener {
        public final /* synthetic */ k0 a;

        public b(RNCWebViewManager rNCWebViewManager, k0 k0Var) {
            this.a = k0Var;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            RNCWebViewModule module = RNCWebViewManager.getModule(this.a);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String guessFileName = URLUtil.guessFileName(str, str3, str4);
            String str5 = C0201.m82(27736) + guessFileName;
            try {
                URL url = new URL(str);
                request.addRequestHeader(C0201.m82(27738), CookieManager.getInstance().getCookie(url.getProtocol() + C0201.m82(27737) + url.getHost()));
            } catch (MalformedURLException e) {
                System.out.println(C0201.m82(27739) + e.toString());
                e.printStackTrace();
            }
            request.addRequestHeader(C0201.m82(27740), str2);
            request.setTitle(guessFileName);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
            module.setDownloadRequest(request);
            if (module.grantFileDownloaderPermissions()) {
                module.downloadFile();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends e {
        public final /* synthetic */ int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView, int i) {
            super(reactContext, webView);
            this.f = i;
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        public void onHideCustomView() {
            View view = this.c;
            if (view != null) {
                view.setVisibility(8);
                a().removeView(this.c);
                this.d.onCustomViewHidden();
                this.c = null;
                this.d = null;
                this.b.setVisibility(0);
                if (Build.VERSION.SDK_INT >= 19) {
                    this.a.getCurrentActivity().getWindow().clearFlags(512);
                }
                this.a.getCurrentActivity().setRequestedOrientation(this.f);
                this.a.removeLifecycleEventListener(this);
            }
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.c != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.c = view;
            this.d = customViewCallback;
            this.a.getCurrentActivity().setRequestedOrientation(-1);
            if (Build.VERSION.SDK_INT >= 19) {
                this.c.setSystemUiVisibility(7942);
                this.a.getCurrentActivity().getWindow().setFlags(512, 512);
            }
            this.c.setBackgroundColor(-16777216);
            a().addView(this.c, e.e);
            this.b.setVisibility(8);
            this.a.addLifecycleEventListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends e {
        public d(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* access modifiers changed from: protected */
    public static class e extends WebChromeClient implements LifecycleEventListener {
        public static final FrameLayout.LayoutParams e = new FrameLayout.LayoutParams(-1, -1, 17);
        public ReactContext a;
        public View b;
        public View c;
        public WebChromeClient.CustomViewCallback d;

        public e(ReactContext reactContext, WebView webView) {
            this.a = reactContext;
            this.b = webView;
        }

        public ViewGroup a() {
            return (ViewGroup) this.a.getCurrentActivity().findViewById(16908290);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT >= 19 && (view = this.c) != null && view.getSystemUiVisibility() != 7942) {
                this.c.setSystemUiVisibility(7942);
            }
        }

        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String r6;
            String r7;
            String r8;
            String r9;
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (true) {
                int length = resources.length;
                r6 = C0201.m82(27509);
                r7 = C0201.m82(27510);
                r8 = C0201.m82(27511);
                r9 = C0201.m82(27512);
                if (i >= length) {
                    break;
                }
                if (resources[i].equals(r9)) {
                    arrayList.add(r7);
                } else if (resources[i].equals(r8)) {
                    arrayList.add(r6);
                }
                i++;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (androidx.core.content.b.a(this.a, (String) arrayList.get(i2)) == 0) {
                    if (((String) arrayList.get(i2)).equals(r7)) {
                        arrayList2.add(r9);
                    } else if (((String) arrayList.get(i2)).equals(r6)) {
                        arrayList2.add(r8);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            String str;
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (url == null || (str = RNCWebViewManager.activeUrl) == null || url.equals(str)) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble(C0201.m82(27513), (double) webView.getId());
                createMap.putString(C0201.m82(27514), webView.getTitle());
                createMap.putString(C0201.m82(27515), url);
                createMap.putBoolean(C0201.m82(27516), webView.canGoBack());
                createMap.putBoolean(C0201.m82(27517), webView.canGoForward());
                createMap.putDouble(C0201.m82(27518), (double) (((float) i) / 100.0f));
                RNCWebViewManager.dispatchEvent(webView, new hd2(webView.getId(), createMap));
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.a).startPhotoPickerIntent(valueCallback, fileChooserParams.createIntent(), acceptTypes, z);
        }
    }

    /* access modifiers changed from: protected */
    public static class f extends WebView implements LifecycleEventListener {
        public String a;
        public boolean b = false;
        public g c;
        public boolean d = false;
        private com.facebook.react.views.scroll.b e;
        public boolean f = false;

        /* access modifiers changed from: package-private */
        public class a implements Runnable {
            public final /* synthetic */ WebView a;
            public final /* synthetic */ String b;

            public a(WebView webView, String str) {
                this.a = webView;
                this.b = str;
            }

            public void run() {
                g gVar = f.this.c;
                if (gVar != null) {
                    WebView webView = this.a;
                    WritableMap a2 = gVar.a(webView, webView.getUrl());
                    a2.putString(C0201.m82(1630), this.b);
                    RNCWebViewManager.dispatchEvent(this.a, new jd2(this.a.getId(), a2));
                }
            }
        }

        /* access modifiers changed from: protected */
        public class b {
            public f a;

            public b(f fVar) {
                this.a = fVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.a.e(str);
            }
        }

        public f(k0 k0Var) {
            super(k0Var);
        }

        public void a() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.a) != null && !TextUtils.isEmpty(str)) {
                d(C0201.m82(27496) + this.a + C0201.m82(27497));
            }
        }

        public void b() {
            setWebViewClient(null);
            destroy();
        }

        public b c(f fVar) {
            return new b(fVar);
        }

        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl(C0201.m82(27498) + URLEncoder.encode(str, C0201.m82(27499)));
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void e(String str) {
            if (this.c != null) {
                post(new a(this, str));
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(27500), str);
            RNCWebViewManager.dispatchEvent(this, new jd2(getId(), createMap));
        }

        public g getRNCWebViewClient() {
            return this.c;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            b();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (this.f) {
                if (this.e == null) {
                    this.e = new com.facebook.react.views.scroll.b();
                }
                if (this.e.c(i, i2)) {
                    RNCWebViewManager.dispatchEvent(this, h.n(getId(), i.SCROLL, i, i2, this.e.a(), this.e.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.d) {
                RNCWebViewManager.dispatchEvent(this, new com.facebook.react.uimanager.events.b(getId(), i, i2));
            }
        }

        public void setHasScrollEvent(boolean z) {
            this.f = z;
        }

        public void setInjectedJavaScript(String str) {
            this.a = str;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.b != z) {
                this.b = z;
                String r0 = C0201.m82(27501);
                if (z) {
                    addJavascriptInterface(c(this), r0);
                } else {
                    removeJavascriptInterface(r0);
                }
            }
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.d = z;
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof g) {
                this.c = (g) webViewClient;
            }
        }
    }

    static {
        C0201.m83(RNCWebViewManager.class, 270);
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new a(this);
    }

    public static void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.c cVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().v(cVar);
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    public f createRNCWebViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        e.b a2 = com.facebook.react.common.e.a();
        a2.b(C0201.m82(3677), 1);
        a2.b(C0201.m82(3678), 2);
        a2.b(C0201.m82(3679), 3);
        a2.b(C0201.m82(3680), 4);
        a2.b(C0201.m82(3681), 5);
        a2.b(C0201.m82(3682), 6);
        a2.b(C0201.m82(3683), 7);
        a2.b(C0201.m82(3684), 8);
        a2.b(C0201.m82(3685), Integer.valueOf((int) C0188.f18));
        a2.b(C0201.m82(3686), 1001);
        a2.b(C0201.m82(3687), 1002);
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = com.facebook.react.common.e.b();
        }
        String r1 = C0201.m82(3688);
        exportedCustomDirectEventTypeConstants.put(C0201.m82(3690), com.facebook.react.common.e.d(r1, C0201.m82(3689)));
        exportedCustomDirectEventTypeConstants.put(C0201.m82(3692), com.facebook.react.common.e.d(r1, C0201.m82(3691)));
        exportedCustomDirectEventTypeConstants.put(i.b(i.SCROLL), com.facebook.react.common.e.d(r1, C0201.m82(3693)));
        exportedCustomDirectEventTypeConstants.put(C0201.m82(3695), com.facebook.react.common.e.d(r1, C0201.m82(3694)));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(3696);
    }

    @xj0(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @xj0(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @xj0(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @xj0(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @xj0(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        if (str == null) {
            this.mUserAgentWithApplicationName = null;
        } else if (Build.VERSION.SDK_INT >= 17) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
            this.mUserAgentWithApplicationName = defaultUserAgent + C0201.m82(3701) + str;
        }
        setUserAgentString(webView);
    }

    @xj0(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        if (z) {
            Context context = webView.getContext();
            if (context != null) {
                webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
                webView.getSettings().setCacheMode(-1);
                webView.getSettings().setAppCacheEnabled(true);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(false);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @xj0(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        char c2;
        Integer num;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals(C0201.m82(3705))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1215135800:
                if (str.equals(C0201.m82(3704))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -873877826:
                if (str.equals(C0201.m82(3703))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1548620642:
                if (str.equals(C0201.m82(3702))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            num = 3;
        } else if (c2 == 1) {
            num = 1;
        } else if (c2 != 2) {
            num = -1;
        } else {
            num = 2;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @xj0(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @xj0(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @xj0(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @xj0(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z);
        webView.clearHistory();
        webView.clearCache(z);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z);
        webView.getSettings().setSaveFormData(!z);
    }

    @xj0(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((f) webView).setInjectedJavaScript(str);
    }

    @xj0(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @xj0(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @xj0(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((f) webView).setMessagingEnabled(z);
    }

    @xj0(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (str == null || C0201.m82(3706).equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if (C0201.m82(3707).equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if (C0201.m82(3708).equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @xj0(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((f) webView).setSendContentSizeChangeEvents(z);
    }

    @xj0(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((f) webView).setHasScrollEvent(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    @xj0(name = "overScrollMode")
    public void setOverScrollMode(WebView webView, String str) {
        char c2;
        Integer num;
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals(C0201.m82(3709))) {
                    c2 = 1;
                    if (c2 != 0) {
                        num = 2;
                    } else if (c2 != 1) {
                        num = 0;
                    } else {
                        num = 1;
                    }
                    webView.setOverScrollMode(num.intValue());
                }
            } else if (str.equals(C0201.m82(3710))) {
                c2 = 0;
                if (c2 != 0) {
                }
                webView.setOverScrollMode(num.intValue());
            }
        } else if (str.equals(C0201.m82(3711))) {
            c2 = 2;
            if (c2 != 0) {
            }
            webView.setOverScrollMode(num.intValue());
        }
        c2 = 65535;
        if (c2 != 0) {
        }
        webView.setOverScrollMode(num.intValue());
    }

    @xj0(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @xj0(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @xj0(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @xj0(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @xj0(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            String r0 = C0201.m82(3712);
            if (readableMap.hasKey(r0)) {
                String string = readableMap.getString(r0);
                String r02 = C0201.m82(3713);
                webView.loadDataWithBaseURL(readableMap.hasKey(r02) ? readableMap.getString(r02) : C0201.m82(3714), string, C0201.m82(3715), C0201.m82(3716), null);
                return;
            }
            String r03 = C0201.m82(3717);
            if (readableMap.hasKey(r03)) {
                String string2 = readableMap.getString(r03);
                String url = webView.getUrl();
                if (url == null || !url.equals(string2)) {
                    String r1 = C0201.m82(3718);
                    if (!readableMap.hasKey(r1) || !readableMap.getString(r1).equalsIgnoreCase(C0201.m82(3719))) {
                        HashMap hashMap = new HashMap();
                        String r2 = C0201.m82(3722);
                        if (readableMap.hasKey(r2)) {
                            ReadableMap map = readableMap.getMap(r2);
                            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                            while (keySetIterator.hasNextKey()) {
                                String nextKey = keySetIterator.nextKey();
                                if (!C0201.m82(3723).equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                    hashMap.put(nextKey, map.getString(nextKey));
                                } else if (webView.getSettings() != null) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            }
                        }
                        webView.loadUrl(string2, hashMap);
                        return;
                    }
                    byte[] bArr = null;
                    String r22 = C0201.m82(3720);
                    if (readableMap.hasKey(r22)) {
                        String string3 = readableMap.getString(r22);
                        try {
                            bArr = string3.getBytes(C0201.m82(3721));
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string3.getBytes();
                        }
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    webView.postUrl(string2, bArr);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(C0201.m82(3724));
    }

    @xj0(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @xj0(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @xj0(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        g rNCWebViewClient = ((f) webView).getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.c(readableArray);
        }
    }

    @xj0(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    public void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    public void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            c cVar = new c(this, reactContext, webView, reactContext.getCurrentActivity().getRequestedOrientation());
            this.mWebChromeClient = cVar;
            webView.setWebChromeClient(cVar);
            return;
        }
        e eVar = this.mWebChromeClient;
        if (eVar != null) {
            eVar.onHideCustomView();
        }
        d dVar = new d(this, reactContext, webView);
        this.mWebChromeClient = dVar;
        webView.setWebChromeClient(dVar);
    }

    public void addEventEmitters(k0 k0Var, WebView webView) {
        webView.setWebViewClient(new g());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(k0 k0Var) {
        f createRNCWebViewInstance = createRNCWebViewInstance(k0Var);
        setupWebChromeClient(k0Var, createRNCWebViewInstance);
        k0Var.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, C0201.m82(3676));
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new b(this, k0Var));
        return createRNCWebViewInstance;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((View) webView);
        f fVar = (f) webView;
        ((k0) webView.getContext()).removeLifecycleEventListener(fVar);
        fVar.b();
    }

    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        boolean z = false;
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0201.m82(3698), readableArray.getString(0));
                    ((f) webView).d(C0201.m82(3699) + jSONObject.toString() + C0201.m82(3700));
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                ((f) webView).d(readableArray.getString(0));
                return;
            case 7:
                if (readableArray != null) {
                    webView.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException(C0201.m82(3697));
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i) {
                    case C0188.f18 /*{ENCODED_INT: 1000}*/:
                        webView.clearFormData();
                        return;
                    case 1001:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        webView.clearCache(z);
                        return;
                    case 1002:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    /* access modifiers changed from: protected */
    public static class g extends WebViewClient {
        public boolean a = false;

        public WritableMap a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(C0201.m82(27454), (double) webView.getId());
            createMap.putString(C0201.m82(27455), str);
            createMap.putBoolean(C0201.m82(27456), !this.a && webView.getProgress() != 100);
            createMap.putString(C0201.m82(27457), webView.getTitle());
            createMap.putBoolean(C0201.m82(27458), webView.canGoBack());
            createMap.putBoolean(C0201.m82(27459), webView.canGoForward());
            return createMap;
        }

        public void b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new gd2(webView.getId(), a(webView, str)));
        }

        public void c(ReadableArray readableArray) {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.a) {
                ((f) webView).a();
                b(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.a = false;
            RNCWebViewManager.dispatchEvent(webView, new id2(webView.getId(), a(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.a = true;
            b(webView, str2);
            WritableMap a2 = a(webView, str2);
            a2.putDouble(C0201.m82(27460), (double) i);
            a2.putString(C0201.m82(27461), str);
            RNCWebViewManager.dispatchEvent(webView, new fd2(webView.getId(), a2));
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a2 = a(webView, webResourceRequest.getUrl().toString());
                a2.putInt(C0201.m82(27462), webResourceResponse.getStatusCode());
                a2.putString(C0201.m82(27463), webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new ed2(webView.getId(), a2));
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            RNCWebViewManager.activeUrl = str;
            RNCWebViewManager.dispatchEvent(webView, new kd2(webView.getId(), a(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    public RNCWebViewManager(b bVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = bVar;
    }
}
