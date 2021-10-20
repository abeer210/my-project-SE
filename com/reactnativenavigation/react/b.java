package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ ve2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Promise d;

    public /* synthetic */ b(NavigationModule navigationModule, ve2 ve2, String str, Promise promise) {
        this.a = navigationModule;
        this.b = ve2;
        this.c = str;
        this.d = promise;
    }

    public final void run() {
        this.a.n(this.b, this.c, this.d);
    }
}
