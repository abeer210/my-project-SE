package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;

/* compiled from: lambda */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Promise d;

    public /* synthetic */ l(NavigationModule navigationModule, String str, String str2, Promise promise) {
        this.a = navigationModule;
        this.b = str;
        this.c = str2;
        this.d = promise;
    }

    public final void run() {
        this.a.c(this.b, this.c, this.d);
    }
}
