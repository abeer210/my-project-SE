package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;

public final class t {
    private final Executor a;
    private final Map<Pair<String, String>, zs1<a>> b = new r0();

    public t(Executor executor) {
        this.a = executor;
    }

    public final /* synthetic */ zs1 a(Pair pair, zs1 zs1) throws Exception {
        synchronized (this) {
            this.b.remove(pair);
        }
        return zs1;
    }

    public final synchronized zs1<a> b(String str, String str2, u uVar) {
        Pair<String, String> pair = new Pair<>(str, str2);
        zs1<a> zs1 = this.b.get(pair);
        if (zs1 != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return zs1;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        zs1<TContinuationResult> j = uVar.D().j(this.a, new v(this, pair));
        this.b.put(pair, j);
        return j;
    }
}
