package com.huawei.updatesdk.a.a.a;

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
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

public class e implements X509TrustManager {
    public List<X509TrustManager> a = new ArrayList();

    public e(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        String r0 = C0201.m82(37420);
        String r1 = C0201.m82(37421);
        if (context != null) {
            InputStream inputStream = null;
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(C0201.m82(37422));
                KeyStore instance2 = KeyStore.getInstance(C0201.m82(37423));
                inputStream = context.getAssets().open(C0201.m82(37424));
                inputStream.reset();
                instance2.load(inputStream, C0201.m82(37425).toCharArray());
                instance.init(instance2);
                TrustManager[] trustManagers = instance.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.a.add((X509TrustManager) trustManager);
                    }
                }
                if (this.a.isEmpty()) {
                    throw new CertificateException(C0201.m82(37426));
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
            throw new IllegalArgumentException(C0201.m82(37427));
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String r0 = C0201.m82(37428);
        Log.i(r0, C0201.m82(37429));
        Iterator<X509TrustManager> it = this.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String r3 = C0201.m82(37430);
            if (hasNext) {
                try {
                    it.next().checkServerTrusted(x509CertificateArr, str);
                    return;
                } catch (CertificateException e) {
                    Log.e(r0, r3 + e.getMessage());
                }
            } else {
                throw new CertificateException(r3);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String r0 = C0201.m82(37431);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                Log.i(r0, C0201.m82(37432) + i);
                this.a.get(i).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                Log.e(r0, C0201.m82(37433) + e.getMessage() + C0201.m82(37434) + i);
                if (i == size - 1) {
                    if (x509CertificateArr != null && x509CertificateArr.length > 0) {
                        Log.e(r0, C0201.m82(37435) + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
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
            Log.e(C0201.m82(37437), C0201.m82(37436) + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
