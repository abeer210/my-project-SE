package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

/* renamed from: x10  reason: default package */
/* compiled from: LocalX509TrustManager */
public class x10 implements X509TrustManager {
    private X509TrustManager a = null;
    private X509TrustManager b = null;
    private X509Certificate[] c;
    private boolean d;

    public x10(KeyStore keyStore, boolean z) throws NoSuchAlgorithmException, KeyStoreException {
        this.d = false;
        this.d = z;
        ArrayList arrayList = new ArrayList();
        y10 y10 = new y10(null);
        this.b = y10;
        if (y10 != null) {
            for (X509Certificate x509Certificate : y10.getAcceptedIssuers()) {
                arrayList.add(x509Certificate);
            }
            if (keyStore != null) {
                y10 y102 = new y10(keyStore);
                this.a = y102;
                if (y102 != null) {
                    for (X509Certificate x509Certificate2 : y102.getAcceptedIssuers()) {
                        arrayList.add(x509Certificate2);
                    }
                } else {
                    throw new NoSuchAlgorithmException(C0201.m82(302));
                }
            }
            this.c = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            return;
        }
        throw new NoSuchAlgorithmException(C0201.m82(303));
    }

    private void a(X509Certificate[] x509CertificateArr, String str, boolean z) throws CertificateException {
        if (!this.d) {
            if (z) {
                try {
                    this.b.checkServerTrusted(x509CertificateArr, str);
                } catch (CertificateException e) {
                    X509TrustManager x509TrustManager = this.a;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        return;
                    }
                    throw e;
                }
            } else {
                try {
                    this.b.checkClientTrusted(x509CertificateArr, str);
                } catch (CertificateException e2) {
                    X509TrustManager x509TrustManager2 = this.a;
                    if (x509TrustManager2 != null) {
                        x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
                        return;
                    }
                    throw e2;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, true);
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.c;
    }
}
