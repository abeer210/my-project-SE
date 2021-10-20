package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.u;
import vigqyno.C0201;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        boolean equals = C0201.m82(17989).equals(intent.getAction());
        String r1 = C0201.m82(17990);
        if (!equals) {
            if (!C0201.m82(17991).equals(intent.getAction())) {
                String r0 = C0201.m82(17992);
                String valueOf = String.valueOf(intent.getAction());
                Log.w(r1, valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
                return null;
            }
        }
        if (Log.isLoggable(r1, 2)) {
            String r02 = C0201.m82(17993);
            String valueOf2 = String.valueOf(intent.getAction());
            Log.v(r1, valueOf2.length() != 0 ? r02.concat(valueOf2) : new String(r02));
        }
        return new u(this);
    }
}
