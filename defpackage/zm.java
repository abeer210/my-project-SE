package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import defpackage.xm;
import vigqyno.C0201;

/* renamed from: zm  reason: default package */
/* compiled from: DefaultConnectivityMonitor */
public final class zm implements xm {
    private final Context a;
    public final xm.a b;
    public boolean c;
    private boolean d;
    private final BroadcastReceiver e = new a();

    /* renamed from: zm$a */
    /* compiled from: DefaultConnectivityMonitor */
    class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            zm zmVar = zm.this;
            boolean z = zmVar.c;
            zmVar.c = zmVar.i(context);
            if (z != zm.this.c) {
                String r3 = C0201.m82(27166);
                if (Log.isLoggable(r3, 3)) {
                    Log.d(r3, C0201.m82(27167) + zm.this.c);
                }
                zm zmVar2 = zm.this;
                zmVar2.b.a(zmVar2.c);
            }
        }
    }

    public zm(Context context, xm.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    private void j() {
        if (!this.d) {
            this.c = i(this.a);
            try {
                this.a.registerReceiver(this.e, new IntentFilter(C0201.m82(22275)));
                this.d = true;
            } catch (SecurityException e2) {
                String r2 = C0201.m82(22276);
                if (Log.isLoggable(r2, 5)) {
                    Log.w(r2, C0201.m82(22277), e2);
                }
            }
        }
    }

    private void k() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C0201.m82(22278));
        ep.d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            String r2 = C0201.m82(22279);
            if (Log.isLoggable(r2, 5)) {
                Log.w(r2, C0201.m82(22280), e2);
            }
            return true;
        }
    }

    @Override // defpackage.dn
    public void onDestroy() {
    }

    @Override // defpackage.dn
    public void onStart() {
        j();
    }

    @Override // defpackage.dn
    public void onStop() {
        k();
    }
}
