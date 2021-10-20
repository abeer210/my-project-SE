package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: zn0  reason: default package */
public final class zn0 extends Thread {
    private final /* synthetic */ Map a;

    public zn0(yn0 yn0, Map map) {
        this.a = map;
    }

    public final void run() {
        String message;
        StringBuilder sb;
        String r5;
        Exception exc;
        String r0 = C0201.m82(14079);
        String r1 = C0201.m82(14080);
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse(C0201.m82(14081)).buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            URLConnection openConnection = new URL(uri).openConnection();
            w30.E(openConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            try {
                int e = w30.e(httpURLConnection);
                if (e < 200 || e >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb2.append(C0201.m82(14082));
                    sb2.append(e);
                    sb2.append(C0201.m82(14083));
                    sb2.append(uri);
                    Log.w(r1, sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            r5 = C0201.m82(14085);
            exc = e2;
            sb.append(r5);
            sb.append(uri);
            sb.append(r0);
            sb.append(message);
            Log.w(r1, sb.toString(), exc);
        } catch (IOException | RuntimeException e3) {
            message = e3.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            r5 = C0201.m82(14084);
            exc = e3;
            sb.append(r5);
            sb.append(uri);
            sb.append(r0);
            sb.append(message);
            Log.w(r1, sb.toString(), exc);
        }
    }
}
