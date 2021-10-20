package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ReadableMap c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Promise e;

    public /* synthetic */ c(NavigationModule navigationModule, String str, ReadableMap readableMap, String str2, Promise promise) {
        this.a = navigationModule;
        this.b = str;
        this.c = readableMap;
        this.d = str2;
        this.e = promise;
    }

    public final void run() {
        this.a.g(this.b, this.c, this.d, this.e);
    }
}
