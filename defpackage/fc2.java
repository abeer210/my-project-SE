package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import vigqyno.C0201;

/* renamed from: fc2  reason: default package */
public class fc2 {
    private static final String a = null;
    private static volatile gc2 b;

    static {
        C0201.m83(fc2.class, 312);
    }

    private fc2() {
    }

    @SuppressLint({"NewApi"})
    public static gc2 a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        if (context != null) {
            mc2.b(context);
            if (b == null) {
                synchronized (fc2.class) {
                    if (b == null) {
                        InputStream n = kc2.n(context);
                        if (n == null) {
                            pc2.c(a, C0201.m82(13852));
                            n = context.getAssets().open(C0201.m82(13853));
                        } else {
                            pc2.c(a, C0201.m82(13854));
                        }
                        b = new gc2(n, C0201.m82(13855));
                        new nc2().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            return b;
        }
        throw new NullPointerException(C0201.m82(13856));
    }

    public static void b(InputStream inputStream) {
        pc2.c(a, C0201.m82(13857));
        if (inputStream != null && b != null) {
            b = new gc2(inputStream, C0201.m82(13858));
            ec2.a(b);
            dc2.a(b);
            if (b != null && b.getAcceptedIssuers() != null) {
                String str = a;
                pc2.b(str, C0201.m82(13859) + b.getAcceptedIssuers().length);
            }
        }
    }
}
