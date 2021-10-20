package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import vigqyno.C0201;

public final class f implements Runnable {
    private static final zp0 c = new zp0(C0201.m82(2347), new String[0]);
    private final String a;
    private final r b = new r(null);

    private f(String str) {
        u.g(str);
        this.a = str;
    }

    public static h<Status> a(String str) {
        if (str == null) {
            return i.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.b;
    }

    public final void run() {
        Status status = Status.g;
        try {
            String r3 = C0201.m82(2348);
            String valueOf = String.valueOf(this.a);
            URLConnection openConnection = new URL(valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3)).openConnection();
            w30.E(openConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty(C0201.m82(2349), C0201.m82(2350));
            int e = w30.e(httpURLConnection);
            if (e == 200) {
                status = Status.e;
            } else {
                c.b(C0201.m82(2351), new Object[0]);
            }
            zp0 zp0 = c;
            StringBuilder sb = new StringBuilder(26);
            sb.append(C0201.m82(2352));
            sb.append(e);
            zp0.a(sb.toString(), new Object[0]);
        } catch (IOException e2) {
            zp0 zp02 = c;
            String r4 = C0201.m82(2354);
            String valueOf2 = String.valueOf(e2.toString());
            zp02.b(valueOf2.length() != 0 ? r4.concat(valueOf2) : new String(r4), new Object[0]);
        } catch (Exception e3) {
            zp0 zp03 = c;
            String r42 = C0201.m82(2353);
            String valueOf3 = String.valueOf(e3.toString());
            zp03.b(valueOf3.length() != 0 ? r42.concat(valueOf3) : new String(r42), new Object[0]);
        }
        this.b.j(status);
    }
}
