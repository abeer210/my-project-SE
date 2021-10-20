package com.reactnativenavigation.react;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import vigqyno.C0201;

/* compiled from: JsDevReloadHandler */
public class s extends t {
    private final BroadcastReceiver a = new a();
    private final gj0 b;
    private long c = 0;
    private b d = a.a;

    /* compiled from: JsDevReloadHandler */
    class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            s.this.g();
        }
    }

    /* compiled from: JsDevReloadHandler */
    public interface b {
        void d();
    }

    public s(gj0 gj0) {
        this.b = gj0;
    }

    public static /* synthetic */ void b() {
    }

    private boolean c() {
        return this.c != 0 && System.currentTimeMillis() - this.c < 1000;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g() {
        this.d.d();
        this.b.f();
    }

    public void d(Activity activity) {
        activity.unregisterReceiver(this.a);
    }

    public void e(Activity activity) {
        activity.registerReceiver(this.a, new IntentFilter(C0201.m82(17915)));
    }

    public boolean f(int i) {
        if (!this.b.b()) {
            return false;
        }
        if (i == 82) {
            this.b.p();
            return true;
        }
        if (i == 46) {
            if (c()) {
                g();
                return true;
            }
            this.c = System.currentTimeMillis();
        }
        return false;
    }

    public void h(b bVar) {
        if (this.d == bVar) {
            this.d = null;
        }
    }

    public void i(b bVar) {
        this.d = bVar;
    }
}
