package com.reactnativenavigation.react;

/* compiled from: lambda */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ NavigationModule a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ i(NavigationModule navigationModule, Runnable runnable) {
        this.a = navigationModule;
        this.b = runnable;
    }

    public final void run() {
        this.a.d(this.b);
    }
}
