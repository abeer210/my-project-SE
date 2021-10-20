package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import vigqyno.C0201;

/* compiled from: BroadcastReceiverConnectivityReceiver */
public class b extends c {
    private final C0122b i = new C0122b();

    /* renamed from: com.reactnativecommunity.netinfo.b$b  reason: collision with other inner class name */
    /* compiled from: BroadcastReceiverConnectivityReceiver */
    private class C0122b extends BroadcastReceiver {
        private boolean a;

        private C0122b() {
            this.a = false;
        }

        public boolean a() {
            return this.a;
        }

        public void b(boolean z) {
            this.a = z;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals(C0201.m82(11836))) {
                b.this.l();
            }
        }
    }

    public b(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @SuppressLint({"MissingPermission"})
    private void l() {
        dd2 dd2 = dd2.UNKNOWN;
        cd2 cd2 = null;
        boolean z = false;
        try {
            NetworkInfo activeNetworkInfo = c().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z = activeNetworkInfo.isConnected();
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            dd2 = dd2.WIFI;
                        } else if (type != 4) {
                            if (type == 9) {
                                dd2 = dd2.ETHERNET;
                            } else if (type == 17) {
                                dd2 = dd2.VPN;
                            } else if (type == 6) {
                                dd2 = dd2.WIMAX;
                            } else if (type == 7) {
                                dd2 = dd2.BLUETOOTH;
                            }
                        }
                        j(dd2, cd2, z);
                    }
                    dd2 = dd2.CELLULAR;
                    cd2 = cd2.b(activeNetworkInfo);
                    j(dd2, cd2, z);
                }
            }
            dd2 = dd2.NONE;
        } catch (SecurityException unused) {
            dd2 = dd2.UNKNOWN;
        }
        j(dd2, cd2, z);
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0201.m82(34146));
        e().registerReceiver(this.i, intentFilter);
        this.i.b(true);
        l();
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void i() {
        if (this.i.a()) {
            e().unregisterReceiver(this.i);
            this.i.b(false);
        }
    }
}
