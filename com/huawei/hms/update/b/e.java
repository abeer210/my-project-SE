package com.huawei.hms.update.b;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

/* compiled from: SecureX509TrustManager */
public class e implements X509TrustManager {
    public List<X509TrustManager> a = new ArrayList();

    public e(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        String r0 = C0201.m82(7224);
        String r1 = C0201.m82(7225);
        if (context != null) {
            InputStream inputStream = null;
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(C0201.m82(7226));
                KeyStore instance2 = KeyStore.getInstance(C0201.m82(7227));
                inputStream = context.getAssets().open(C0201.m82(7228));
                inputStream.reset();
                instance2.load(inputStream, C0201.m82(7229).toCharArray());
                instance.init(instance2);
                TrustManager[] trustManagers = instance.getTrustManagers();
                for (int i = 0; i < trustManagers.length; i++) {
                    if (trustManagers[i] instanceof X509TrustManager) {
                        this.a.add((X509TrustManager) trustManagers[i]);
                    }
                }
                if (this.a.isEmpty()) {
                    throw new CertificateException(C0201.m82(7230));
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        Log.e(r1, r0);
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(7231));
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.a.isEmpty()) {
            this.a.get(0).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException(C0201.m82(7232));
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.a.isEmpty()) {
            this.a.get(0).checkServerTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException(C0201.m82(7233));
    }

    public X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : this.a) {
            arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }
}
