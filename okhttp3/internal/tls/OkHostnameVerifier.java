package okhttp3.internal.tls;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;
import vigqyno.C0201;

public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 0;
    private static final int ALT_IPA_NAME = 0;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    static {
        C0201.m83(OkHostnameVerifier.class, 531);
    }

    private OkHostnameVerifier() {
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        List<String> subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(subjectAltNames.size() + subjectAltNames2.size());
        arrayList.addAll(subjectAltNames);
        arrayList.addAll(subjectAltNames2);
        return arrayList;
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) list.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str2 : getSubjectAltNames(x509Certificate, 2)) {
            if (verifyHostname(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(subjectAltNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
        if (Util.verifyAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostname(str, x509Certificate);
    }

    public boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String r1 = C0201.m82(30412);
            if (!str.startsWith(r1)) {
                String r2 = C0201.m82(30413);
                if (!str.endsWith(r2) && str2 != null && str2.length() != 0 && !str2.startsWith(r1) && !str2.endsWith(r2)) {
                    if (!str.endsWith(r1)) {
                        str = str + '.';
                    }
                    if (!str2.endsWith(r1)) {
                        str2 = str2 + '.';
                    }
                    String lowerCase = str2.toLowerCase(Locale.US);
                    if (!lowerCase.contains(C0201.m82(30414))) {
                        return str.equals(lowerCase);
                    }
                    String r12 = C0201.m82(30415);
                    if (!lowerCase.startsWith(r12) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || r12.equals(lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    if (!str.endsWith(substring)) {
                        return false;
                    }
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
