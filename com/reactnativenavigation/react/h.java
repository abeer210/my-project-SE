package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;

/* compiled from: lambda */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ ReadableArray b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Promise e;

    public /* synthetic */ h(NavigationModule navigationModule, ReadableArray readableArray, String str, String str2, Promise promise) {
        this.a = navigationModule;
        this.b = readableArray;
        this.c = str;
        this.d = str2;
        this.e = promise;
    }

    public final void run() {
        this.a.l(this.b, this.c, this.d, this.e);
    }
}
