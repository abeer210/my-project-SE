package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

public final class a0 implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b;
    private final FirebaseInstanceId c;
    private final c0 d;

    public a0(FirebaseInstanceId firebaseInstanceId, q qVar, c0 c0Var, long j) {
        this.c = firebaseInstanceId;
        this.d = c0Var;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private final boolean b() {
        b0 z = this.c.z();
        if (!this.c.F() && !this.c.p(z)) {
            return true;
        }
        try {
            String A = this.c.A();
            if (A == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (z == null || (z != null && !A.equals(z.a))) {
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", A);
                Context a2 = a();
                Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a2.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    public final Context a() {
        return this.c.x().i();
    }

    public final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        try {
            if (z.a().e(a())) {
                this.b.acquire();
            }
            this.c.o(true);
            if (!this.c.D()) {
                this.c.o(false);
            } else if (!z.a().g(a()) || c()) {
                if (!b() || !this.d.e(this.c)) {
                    this.c.m(this.a);
                } else {
                    this.c.o(false);
                }
                if (z.a().e(a())) {
                    this.b.release();
                }
            } else {
                new e0(this).a();
                if (z.a().e(a())) {
                    this.b.release();
                }
            }
        } finally {
            if (z.a().e(a())) {
                this.b.release();
            }
        }
    }
}
