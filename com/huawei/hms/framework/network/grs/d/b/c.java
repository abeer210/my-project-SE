package com.huawei.hms.framework.network.grs.d.b;

import android.content.Context;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

public class c extends SSLSocketFactory {
    public static final X509HostnameVerifier a = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier b = new StrictHostnameVerifier();
    private static volatile c c = null;
    private static String[] d = null;
    private SSLContext e = null;
    private Context f;

    private c(Context context, String str) {
        this.f = context;
        this.e = b.a();
        d dVar = new d(this.f, str);
        this.e.init(null, new X509TrustManager[]{dVar}, null);
    }

    public static c a(Context context, String str) {
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c(context, str);
                }
            }
        }
        return c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = this.e.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            b.d((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.e.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            b.d((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        String[] strArr = d;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
