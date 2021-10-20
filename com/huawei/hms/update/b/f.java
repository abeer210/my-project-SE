package com.huawei.hms.update.b;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import vigqyno.C0201;

/* compiled from: HttpsUtils */
public final class f extends SSLSocketFactory {
    private static final String[] a = {C0201.m82(6189), C0201.m82(6190), C0201.m82(6191), C0201.m82(6192), C0201.m82(6193), C0201.m82(6194), C0201.m82(6195), C0201.m82(6196)};
    private static final String[] b = {C0201.m82(6197), C0201.m82(6198), C0201.m82(6199), C0201.m82(6200), C0201.m82(6201), C0201.m82(6202), C0201.m82(6203), C0201.m82(6204)};
    private static final String[] c = {C0201.m82(6205), C0201.m82(6206), C0201.m82(6207), C0201.m82(6208), C0201.m82(6209), C0201.m82(6210), C0201.m82(6211), C0201.m82(6212), C0201.m82(6213), C0201.m82(6214), C0201.m82(6215), C0201.m82(6216), C0201.m82(6217), C0201.m82(6218), C0201.m82(6219), C0201.m82(6220)};
    private static final Object d = new Object();
    private static SocketFactory e;
    private final SSLContext f = SSLContext.getInstance(C0201.m82(6221));
    private Context g;

    private f(Context context) throws NoSuchAlgorithmException, KeyManagementException, CertificateException, KeyStoreException, IOException {
        this.g = context;
        e eVar = new e(this.g);
        this.f.init(null, new X509TrustManager[]{eVar}, null);
    }

    public static SocketFactory a(Context context) {
        Exception e2;
        synchronized (d) {
            try {
                if (e == null) {
                    e = new f(context);
                }
                return e;
            } catch (KeyManagementException e3) {
                e2 = e3;
                String r1 = C0201.m82(6222);
                HMSLog.e(r1, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (NoSuchAlgorithmException e4) {
                e2 = e4;
                String r12 = C0201.m82(6222);
                HMSLog.e(r12, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (IOException e5) {
                e2 = e5;
                String r122 = C0201.m82(6222);
                HMSLog.e(r122, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (CertificateException e6) {
                e2 = e6;
                String r1222 = C0201.m82(6222);
                HMSLog.e(r1222, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (KeyStoreException e7) {
                e2 = e7;
                String r12222 = C0201.m82(6222);
                HMSLog.e(r12222, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (IllegalArgumentException e8) {
                e2 = e8;
                String r122222 = C0201.m82(6222);
                HMSLog.e(r122222, C0201.m82(6223) + e2.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void b(SSLSocket sSLSocket) {
        if (sSLSocket != null && !a(sSLSocket)) {
            a(sSLSocket, c);
        }
    }

    private void c(SSLSocket sSLSocket) {
        sSLSocket.setEnabledProtocols(new String[]{C0201.m82(6224)});
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f.getSocketFactory().createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    private static boolean b(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f.getSocketFactory().createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f.getSocketFactory().createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f.getSocketFactory().createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    private static boolean a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 19) {
            return b(sSLSocket, b);
        }
        return b(sSLSocket, a);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    private static void a(SSLSocket sSLSocket, String[] strArr) {
        boolean z;
        if (!(sSLSocket == null || strArr == null)) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (upperCase.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    private void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            c(sSLSocket);
            b(sSLSocket);
        }
    }
}
