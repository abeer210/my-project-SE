package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class g3 implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ f3 c;

    public g3(f3 f3Var, LifecycleCallback lifecycleCallback, String str) {
        this.c = f3Var;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        if (this.c.b > 0) {
            this.a.f(this.c.c != null ? this.c.c.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.j();
        }
        if (this.c.b >= 3) {
            this.a.h();
        }
        if (this.c.b >= 4) {
            this.a.k();
        }
        if (this.c.b >= 5) {
            this.a.g();
        }
    }
}
