package com.reactnativenavigation.react;

import com.facebook.react.bridge.ReadableMap;

/* compiled from: lambda */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ ReadableMap b;

    public /* synthetic */ g(NavigationModule navigationModule, ReadableMap readableMap) {
        this.a = navigationModule;
        this.b = readableMap;
    }

    public final void run() {
        this.a.j(this.b);
    }
}
