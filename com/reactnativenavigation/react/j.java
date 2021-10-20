package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: lambda */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ ReadableMap b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Promise d;

    public /* synthetic */ j(NavigationModule navigationModule, ReadableMap readableMap, String str, Promise promise) {
        this.a = navigationModule;
        this.b = readableMap;
        this.c = str;
        this.d = promise;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
