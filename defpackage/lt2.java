package defpackage;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import vigqyno.C0201;

/* renamed from: lt2  reason: default package */
/* compiled from: PublicKeyDecryptionMaterial */
public class lt2 extends ft2 {
    private String a = null;
    private KeyStore b = null;
    private String c = null;

    public lt2(KeyStore keyStore, String str, String str2) {
        this.b = keyStore;
        this.c = str;
        this.a = str2;
    }

    public X509Certificate a() throws KeyStoreException {
        if (this.b.size() == 1) {
            return (X509Certificate) this.b.getCertificate(this.b.aliases().nextElement());
        } else if (this.b.containsAlias(this.c)) {
            return (X509Certificate) this.b.getCertificate(this.c);
        } else {
            throw new KeyStoreException(C0201.m82(5285));
        }
    }

    public Key b() throws KeyStoreException {
        try {
            if (this.b.size() == 1) {
                return this.b.getKey(this.b.aliases().nextElement(), this.a.toCharArray());
            } else if (this.b.containsAlias(this.c)) {
                return this.b.getKey(this.c, this.a.toCharArray());
            } else {
                throw new KeyStoreException(C0201.m82(5286));
            }
        } catch (UnrecoverableKeyException e) {
            throw new KeyStoreException(C0201.m82(5288), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyStoreException(C0201.m82(5287), e2);
        }
    }
}
