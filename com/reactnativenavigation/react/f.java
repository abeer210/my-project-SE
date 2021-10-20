package com.reactnativenavigation.react;

import com.facebook.react.bridge.ReadableMap;

/* compiled from: lambda */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ReadableMap c;

    public /* synthetic */ f(NavigationModule navigationModule, String str, ReadableMap readableMap) {
        this.a = navigationModule;
        this.b = str;
        this.c = readableMap;
    }

    public final void run() {
        this.a.e(this.b, this.c);
    }
}
