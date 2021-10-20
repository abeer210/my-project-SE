package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import vigqyno.C0201;

/* renamed from: dc2  reason: default package */
public class dc2 extends SSLSocketFactory {
    private static final String f = dc2.class.getSimpleName();
    private SSLContext a = cc2.f();
    private SSLSocket b = null;
    private String[] c;
    private String[] d;
    private String[] e;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
    }

    public dc2(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        c(x509TrustManager);
        this.a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public static void a(X509TrustManager x509TrustManager) {
        pc2.c(f, C0201.m82(28301));
        try {
            new dc2(null, x509TrustManager);
        } catch (NoSuchAlgorithmException unused) {
            pc2.e(f, C0201.m82(28307));
        } catch (KeyManagementException unused2) {
            pc2.e(f, C0201.m82(28306));
        } catch (UnrecoverableKeyException unused3) {
            pc2.e(f, C0201.m82(28305));
        } catch (KeyStoreException unused4) {
            pc2.e(f, C0201.m82(28304));
        } catch (CertificateException unused5) {
            pc2.e(f, C0201.m82(28303));
        } catch (IOException unused6) {
            pc2.e(f, C0201.m82(28302));
        }
    }

    private void b(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!lc2.a(this.e)) {
            pc2.c(f, C0201.m82(28308));
            cc2.e((SSLSocket) socket, this.e);
            z = true;
        } else {
            z = false;
        }
        if (!lc2.a(this.d) || !lc2.a(this.c)) {
            pc2.c(f, C0201.m82(28309));
            SSLSocket sSLSocket = (SSLSocket) socket;
            cc2.d(sSLSocket);
            if (!lc2.a(this.d)) {
                cc2.h(sSLSocket, this.d);
            } else {
                cc2.b(sSLSocket, this.c);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            pc2.c(f, C0201.m82(28310));
            cc2.d((SSLSocket) socket);
        }
        if (!z2) {
            pc2.c(f, C0201.m82(28311));
            cc2.c((SSLSocket) socket);
        }
    }

    public void c(X509TrustManager x509TrustManager) {
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory, org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        pc2.c(f, C0201.m82(28313));
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            b(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            String[] strArr = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.ssl.SSLSocketFactory
    public Socket createSocket() throws IOException {
        pc2.c(f, C0201.m82(28312));
        Socket createSocket = this.a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            b(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            String[] strArr = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
