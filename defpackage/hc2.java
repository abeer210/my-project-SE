package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import vigqyno.C0201;

/* renamed from: hc2  reason: default package */
public class hc2 implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        String r0 = C0201.m82(37772);
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            pc2.b(r0, C0201.m82(37773) + x509Certificate.getSubjectDN().getName());
            jc2.a(str, x509Certificate, true);
            return true;
        } catch (SSLException e) {
            pc2.e(r0, C0201.m82(37774) + e.getMessage());
            return false;
        }
    }
}
