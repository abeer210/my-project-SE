package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import vigqyno.C0201;

/* compiled from: AmazonFireDeviceConnectivityPoller */
public class a {
    private final d a = new d();
    private final Context b;
    private final b c;
    private final Runnable d = new c();
    private Handler e;
    private boolean f = false;

    /* compiled from: AmazonFireDeviceConnectivityPoller */
    public interface b {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* compiled from: AmazonFireDeviceConnectivityPoller */
    private class c implements Runnable {
        private c() {
        }

        public void run() {
            if (a.this.f) {
                a.this.b.sendBroadcast(new Intent(C0201.m82(4271)));
                a.this.e.postDelayed(a.this.d, 10000);
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: AmazonFireDeviceConnectivityPoller */
    public class d extends BroadcastReceiver {
        public boolean a;
        private Boolean b;

        private d() {
            this.a = false;
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if (C0201.m82(4013).equals(action)) {
                z = false;
            } else if (C0201.m82(4014).equals(action)) {
                z = true;
            } else {
                return;
            }
            Boolean bool = this.b;
            if (bool == null || bool.booleanValue() != z) {
                this.b = Boolean.valueOf(z);
                a.this.c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    public a(Context context, b bVar) {
        this.b = context;
        this.c = bVar;
    }

    private boolean f() {
        return Build.MANUFACTURER.equals(C0201.m82(34239)) && (Build.MODEL.startsWith(C0201.m82(34240)) || Build.MODEL.startsWith(C0201.m82(34241)));
    }

    private void h() {
        if (!this.a.a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C0201.m82(34242));
            intentFilter.addAction(C0201.m82(34243));
            this.b.registerReceiver(this.a, intentFilter);
            this.a.a = true;
        }
    }

    private void i() {
        if (!this.f) {
            Handler handler = new Handler();
            this.e = handler;
            this.f = true;
            handler.post(this.d);
        }
    }

    private void j() {
        if (this.f) {
            this.f = false;
            this.e.removeCallbacksAndMessages(null);
            this.e = null;
        }
    }

    private void l() {
        d dVar = this.a;
        if (dVar.a) {
            this.b.unregisterReceiver(dVar);
            this.a.a = false;
        }
    }

    public void g() {
        if (f()) {
            h();
            i();
        }
    }

    public void k() {
        if (f()) {
            j();
            l();
        }
    }
}
