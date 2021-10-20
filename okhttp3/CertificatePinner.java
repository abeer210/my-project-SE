package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import vigqyno.C0201;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public Builder add(String str, String... strArr) {
            if (str != null) {
                for (String str2 : strArr) {
                    this.pins.add(new Pin(str, str2));
                }
                return this;
            }
            throw new NullPointerException(C0201.m82(15491));
        }

        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Pin {
        private static final String WILDCARD = null;
        public final String canonicalHostname;
        public final dy2 hash;
        public final String hashAlgorithm;
        public final String pattern;

        static {
            C0201.m83(Pin.class, 455);
        }

        public Pin(String str, String str2) {
            String str3;
            this.pattern = str;
            boolean startsWith = str.startsWith(C0201.m82(11632));
            String r1 = C0201.m82(11633);
            if (startsWith) {
                str3 = HttpUrl.get(r1 + str.substring(2)).host();
            } else {
                str3 = HttpUrl.get(r1 + str).host();
            }
            this.canonicalHostname = str3;
            String r3 = C0201.m82(11634);
            if (str2.startsWith(r3)) {
                this.hashAlgorithm = r3;
                this.hash = dy2.f(str2.substring(5));
            } else {
                String r32 = C0201.m82(11635);
                if (str2.startsWith(r32)) {
                    this.hashAlgorithm = r32;
                    this.hash = dy2.f(str2.substring(7));
                } else {
                    throw new IllegalArgumentException(C0201.m82(11637) + str2);
                }
            }
            if (this.hash == null) {
                throw new IllegalArgumentException(C0201.m82(11636) + str2);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof Pin) {
                Pin pin = (Pin) obj;
                return this.pattern.equals(pin.pattern) && this.hashAlgorithm.equals(pin.hashAlgorithm) && this.hash.equals(pin.hash);
            }
        }

        public int hashCode() {
            return ((((527 + this.pattern.hashCode()) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public boolean matches(String str) {
            if (!this.pattern.startsWith(C0201.m82(11638))) {
                return str.equals(this.canonicalHostname);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.canonicalHostname.length()) {
                String str2 = this.canonicalHostname;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.hashAlgorithm + this.hash.b();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return C0201.m82(21001) + sha256((X509Certificate) certificate).b();
        }
        throw new IllegalArgumentException(C0201.m82(21002));
    }

    public static dy2 sha1(X509Certificate x509Certificate) {
        return dy2.q(x509Certificate.getPublicKey().getEncoded()).v();
    }

    public static dy2 sha256(X509Certificate x509Certificate) {
        return dy2.q(x509Certificate.getPublicKey().getEncoded()).x();
    }

    public void check(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String r5;
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
            if (certificateChainCleaner2 != null) {
                list = certificateChainCleaner2.clean(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = findMatchingPins.size();
                dy2 dy2 = null;
                dy2 dy22 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    Pin pin = findMatchingPins.get(i2);
                    if (pin.hashAlgorithm.equals(C0201.m82(21003))) {
                        if (dy2 == null) {
                            dy2 = sha256(x509Certificate);
                        }
                        if (pin.hash.equals(dy2)) {
                            return;
                        }
                    } else if (pin.hashAlgorithm.equals(C0201.m82(21004))) {
                        if (dy22 == null) {
                            dy22 = sha1(x509Certificate);
                        }
                        if (pin.hash.equals(dy22)) {
                            return;
                        }
                    } else {
                        throw new AssertionError(C0201.m82(21005) + pin.hashAlgorithm);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(21006));
            sb.append(C0201.m82(21007));
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                r5 = C0201.m82(21008);
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append(r5);
                sb.append(pin(x509Certificate2));
                sb.append(C0201.m82(21009));
                sb.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb.append(C0201.m82(21010));
            sb.append(str);
            sb.append(C0201.m82(21011));
            int size4 = findMatchingPins.size();
            for (int i4 = 0; i4 < size4; i4++) {
                sb.append(r5);
                sb.append(findMatchingPins.get(i4));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!Util.equal(this.certificateChainCleaner, certificatePinner.certificateChainCleaner) || !this.pins.equals(certificatePinner.pins)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    public int hashCode() {
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return ((certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0) * 31) + this.pins.hashCode();
    }

    public CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner2) {
        return Util.equal(this.certificateChainCleaner, certificateChainCleaner2) ? this : new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        check(str, Arrays.asList(certificateArr));
    }
}
