package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;

@TargetApi(24)
/* compiled from: NetworkCallbackConnectivityReceiver */
public class f extends c {
    private final b i = new b();
    public Network j = null;
    public NetworkCapabilities k = null;

    /* compiled from: NetworkCallbackConnectivityReceiver */
    private class b extends ConnectivityManager.NetworkCallback {
        private b() {
        }

        public void onAvailable(Network network) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = fVar.c().getNetworkCapabilities(network);
            f.this.k();
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = networkCapabilities;
            fVar.k();
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            f fVar = f.this;
            if (fVar.j != null) {
                fVar.j = network;
                fVar.k = fVar.c().getNetworkCapabilities(network);
            }
            f.this.k();
        }

        public void onLosing(Network network, int i) {
            f fVar = f.this;
            fVar.j = network;
            fVar.k = fVar.c().getNetworkCapabilities(network);
            f.this.k();
        }

        public void onLost(Network network) {
            f fVar = f.this;
            fVar.j = null;
            fVar.k = null;
            fVar.k();
        }

        public void onUnavailable() {
            f fVar = f.this;
            fVar.j = null;
            fVar.k = null;
            fVar.k();
        }
    }

    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.reactnativecommunity.netinfo.c
    @SuppressLint({"MissingPermission"})
    public void f() {
        try {
            c().registerDefaultNetworkCallback(this.i);
        } catch (SecurityException unused) {
        }
    }

    @Override // com.reactnativecommunity.netinfo.c
    public void i() {
        try {
            c().unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    public void k() {
        boolean z;
        dd2 dd2 = dd2.UNKNOWN;
        NetworkCapabilities networkCapabilities = this.k;
        cd2 cd2 = null;
        boolean z2 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                dd2 = dd2.BLUETOOTH;
            } else if (this.k.hasTransport(0)) {
                dd2 = dd2.CELLULAR;
            } else if (this.k.hasTransport(3)) {
                dd2 = dd2.ETHERNET;
            } else if (this.k.hasTransport(1)) {
                dd2 = dd2.WIFI;
            } else if (this.k.hasTransport(4)) {
                dd2 = dd2.VPN;
            }
            NetworkInfo networkInfo = this.j != null ? c().getNetworkInfo(this.j) : null;
            if (Build.VERSION.SDK_INT >= 28) {
                z = !this.k.hasCapability(21);
            } else {
                z = (this.j == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            if (this.k.hasCapability(12) && this.k.hasCapability(16) && !z) {
                z2 = true;
            }
            if (this.j != null && dd2 == dd2.CELLULAR && z2) {
                cd2 = cd2.b(networkInfo);
            }
        } else {
            dd2 = dd2.NONE;
        }
        j(dd2, cd2, z2);
    }
}
