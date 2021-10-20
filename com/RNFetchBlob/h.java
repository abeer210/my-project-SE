package com.RNFetchBlob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import vigqyno.C0201;

/* compiled from: RNFetchBlobUtils */
public class h {

    /* access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobUtils */
    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobUtils */
    public static class b implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(C0201.m82(1347), C0201.m82(1348));
        createMap.putString(C0201.m82(1349), str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C0201.m82(1350), createMap);
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(1351));
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(String.format(C0201.m82(1352), Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return null;
    }

    public static OkHttpClient.Builder c(OkHttpClient okHttpClient) {
        try {
            TrustManager[] trustManagerArr = {new a()};
            SSLContext instance = SSLContext.getInstance(C0201.m82(1353));
            instance.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.sslSocketFactory(socketFactory);
            newBuilder.hostnameVerifier(new b());
            return newBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
