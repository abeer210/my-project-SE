package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;
import vigqyno.C0201;

public class BlobCollector {

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        public final /* synthetic */ ReactContext a;
        public final /* synthetic */ BlobModule b;

        public a(ReactContext reactContext, BlobModule blobModule) {
            this.a = reactContext;
            this.b = blobModule;
        }

        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.a.getJavaScriptContextHolder();
            if (javaScriptContextHolder.get() != 0) {
                BlobCollector.nativeInstall(this.b, javaScriptContextHolder.get());
            }
        }
    }

    static {
        SoLoader.j(C0201.m82(14053));
    }

    public static void b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j);
}
