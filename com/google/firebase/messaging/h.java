package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

public final class h implements Closeable {
    private final URL a;
    private zs1<Bitmap> b;
    private volatile InputStream c;

    private h(URL url) {
        this.a = url;
    }

    private static /* synthetic */ void c(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                x01.a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    public static h m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new h(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public final zs1<Bitmap> a() {
        zs1<Bitmap> zs1 = this.b;
        u.k(zs1);
        return zs1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u01.a(this.c);
    }

    public final void h(Executor executor) {
        this.b = ct1.c(executor, new i(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        c(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        c(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        throw r3;
     */
    public final Bitmap k() throws IOException {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        try {
            URLConnection openConnection = this.a.openConnection();
            w30.E(openConnection);
            InputStream b2 = w30.b(openConnection);
            InputStream a2 = t01.a(b2, 1048576);
            this.c = b2;
            Bitmap decodeStream = BitmapFactory.decodeStream(a2);
            if (decodeStream != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf2 = String.valueOf(this.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb2.append("Successfully downloaded image: ");
                    sb2.append(valueOf2);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                c(null, a2);
                if (b2 != null) {
                    c(null, b2);
                }
                return decodeStream;
            }
            String valueOf3 = String.valueOf(this.a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb3.append("Failed to decode image: ");
            sb3.append(valueOf3);
            String sb4 = sb3.toString();
            Log.w("FirebaseMessaging", sb4);
            throw new IOException(sb4);
        } catch (IOException e) {
            String valueOf4 = String.valueOf(this.a);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 26);
            sb5.append("Failed to download image: ");
            sb5.append(valueOf4);
            Log.w("FirebaseMessaging", sb5.toString());
            throw e;
        }
    }
}
