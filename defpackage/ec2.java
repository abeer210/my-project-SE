package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import vigqyno.C0201;

/* renamed from: ec2  reason: default package */
public class ec2 extends SSLSocketFactory {
    private static final String i = ec2.class.getSimpleName();
    private static volatile ec2 j = null;
    private SSLContext a;
    private SSLSocket b;
    private Context c;
    private String[] d;
    private X509TrustManager e;
    private String[] f;
    private String[] g;
    private String[] h;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
    }

    private ec2(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.a = null;
        this.b = null;
        if (context == null) {
            pc2.e(i, C0201.m82(16089));
            return;
        }
        d(context);
        e(cc2.f());
        gc2 a2 = fc2.a(context);
        this.e = a2;
        this.a.init(null, new X509TrustManager[]{a2}, null);
    }

    public static void a(X509TrustManager x509TrustManager) {
        pc2.c(i, C0201.m82(16090));
        try {
            j = new ec2(x509TrustManager);
        } catch (NoSuchAlgorithmException unused) {
            pc2.e(i, C0201.m82(16092));
        } catch (KeyManagementException unused2) {
            pc2.e(i, C0201.m82(16091));
        }
    }

    private void b(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!lc2.a(this.h)) {
            pc2.c(i, C0201.m82(16093));
            cc2.e((SSLSocket) socket, this.h);
            z = true;
        } else {
            z = false;
        }
        if (!lc2.a(this.g) || !lc2.a(this.f)) {
            pc2.c(i, C0201.m82(16094));
            SSLSocket sSLSocket = (SSLSocket) socket;
            cc2.d(sSLSocket);
            if (!lc2.a(this.g)) {
                cc2.h(sSLSocket, this.g);
            } else {
                cc2.b(sSLSocket, this.f);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            pc2.c(i, C0201.m82(16095));
            cc2.d((SSLSocket) socket);
        }
        if (!z2) {
            pc2.c(i, C0201.m82(16096));
            cc2.c((SSLSocket) socket);
        }
    }

    public static ec2 c(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        mc2.b(context);
        if (j == null) {
            synchronized (ec2.class) {
                if (j == null) {
                    j = new ec2(context);
                }
            }
        }
        if (j.c == null && context != null) {
            j.d(context);
        }
        return j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) throws IOException {
        pc2.c(i, C0201.m82(16097));
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i2);
        if (createSocket instanceof SSLSocket) {
            b(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public void d(Context context) {
        this.c = context.getApplicationContext();
    }

    public void e(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    public void f(X509TrustManager x509TrustManager) {
        this.e = x509TrustManager;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = this.d;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException, UnknownHostException {
        return createSocket(str, i2);
    }

    public ec2(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.a = null;
        this.b = null;
        this.a = cc2.f();
        f(x509TrustManager);
        this.a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        pc2.c(i, C0201.m82(16098));
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i2, z);
        if (createSocket instanceof SSLSocket) {
            b(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
