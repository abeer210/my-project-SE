package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

/* renamed from: gc2  reason: default package */
public class gc2 implements X509TrustManager {
    private static final String b = gc2.class.getSimpleName();
    public List<X509TrustManager> a = new ArrayList();

    public gc2(InputStream inputStream, String str) throws IllegalArgumentException {
        a(inputStream, str);
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException(C0201.m82(1603));
        }
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(C0201.m82(1600));
            KeyStore instance2 = KeyStore.getInstance(C0201.m82(1601));
            instance2.load(inputStream, str.toCharArray());
            instance.init(instance2);
            TrustManager[] trustManagers = instance.getTrustManagers();
            for (int i = 0; i < trustManagers.length; i++) {
                if (trustManagers[i] instanceof X509TrustManager) {
                    this.a.add((X509TrustManager) trustManagers[i]);
                }
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            String str2 = b;
            pc2.e(str2, C0201.m82(1602) + e.getMessage());
        } catch (Throwable th) {
            oc2.c(inputStream);
            throw th;
        }
        oc2.c(inputStream);
    }

    public void b(X509Certificate[] x509CertificateArr) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        pc2.c(b, C0201.m82(1604));
        Iterator<X509TrustManager> it = this.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String r2 = C0201.m82(1605);
            if (hasNext) {
                try {
                    it.next().checkServerTrusted(x509CertificateArr, str);
                    return;
                } catch (CertificateException e) {
                    String str2 = b;
                    pc2.e(str2, r2 + e.getMessage());
                }
            } else {
                throw new CertificateException(r2);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        b(x509CertificateArr);
        pc2.c(b, C0201.m82(1606) + x509CertificateArr.length + C0201.m82(1607) + str);
        for (X509Certificate x509Certificate : x509CertificateArr) {
            pc2.b(b, C0201.m82(1608) + x509Certificate.getSubjectDN() + C0201.m82(1609) + x509Certificate.getIssuerDN());
            String str2 = b;
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(1610));
            sb.append(x509Certificate);
            pc2.b(str2, sb.toString());
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                pc2.c(b, C0201.m82(1611) + i);
                X509TrustManager x509TrustManager = this.a.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    pc2.c(b, C0201.m82(1612) + acceptedIssuers.length);
                    for (int i2 = 0; i2 < acceptedIssuers.length; i2++) {
                        pc2.b(b, C0201.m82(1613) + acceptedIssuers[i2].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                pc2.c(b, C0201.m82(1614) + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                pc2.e(b, C0201.m82(1615) + e.getMessage() + C0201.m82(1616) + i);
                if (i == size - 1) {
                    if (x509CertificateArr != null && x509CertificateArr.length > 0) {
                        pc2.e(b, C0201.m82(1617) + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.a) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            String str = b;
            pc2.e(str, C0201.m82(1618) + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
