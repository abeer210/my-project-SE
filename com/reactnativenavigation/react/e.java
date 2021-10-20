package com.reactnativenavigation.react;

import com.facebook.react.bridge.Promise;

/* compiled from: lambda */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ ve2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Promise e;

    public /* synthetic */ e(NavigationModule navigationModule, ve2 ve2, String str, String str2, Promise promise) {
        this.a = navigationModule;
        this.b = ve2;
        this.c = str;
        this.d = str2;
        this.e = promise;
    }

    public final void run() {
        this.a.i(this.b, this.c, this.d, this.e);
    }
}
