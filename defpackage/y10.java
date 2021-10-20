package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

/* renamed from: y10  reason: default package */
/* compiled from: SimpleX509TrustManager */
public class y10 implements X509TrustManager {
    private X509TrustManager a = null;
    private X509Certificate[] b = null;

    public y10(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        X509TrustManager a2 = a(instance);
        this.a = a2;
        if (a2 != null) {
            this.b = a2.getAcceptedIssuers();
            return;
        }
        throw new NoSuchAlgorithmException(C0201.m82(36994));
    }

    private X509TrustManager a(TrustManagerFactory trustManagerFactory) {
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        for (int i = 0; i < trustManagers.length; i++) {
            if (trustManagers[i] instanceof X509TrustManager) {
                return (X509TrustManager) trustManagers[i];
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!(x509CertificateArr == null || x509CertificateArr.length != 1 || x509CertificateArr[0] == null)) {
            x509CertificateArr[0].checkValidity();
            X509Certificate[] acceptedIssuers = getAcceptedIssuers();
            if (acceptedIssuers != null) {
                for (X509Certificate x509Certificate : acceptedIssuers) {
                    if (x509CertificateArr[0].equals(x509Certificate)) {
                        return;
                    }
                }
            }
        }
        this.a.checkServerTrusted(x509CertificateArr, str);
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.b;
    }
}
