package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import vigqyno.C0201;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    private static final int MAX_SIGNERS = 0;
    private final TrustRootIndex trustRootIndex;

    static {
        C0201.m83(BasicCertificateChainCleaner.class, 643);
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex2) {
        this.trustRootIndex = trustRootIndex2;
    }

    private boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate findByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate);
            if (findByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(findByIssuerAndSignature)) {
                    arrayList.add(findByIssuerAndSignature);
                }
                if (verifySignature(findByIssuerAndSignature, findByIssuerAndSignature)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (verifySignature(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(C0201.m82(24052) + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException(C0201.m82(24053) + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicCertificateChainCleaner) || !((BasicCertificateChainCleaner) obj).trustRootIndex.equals(this.trustRootIndex)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }
}
