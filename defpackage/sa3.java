package defpackage;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import vigqyno.C0201;

/* renamed from: sa3  reason: default package */
/* compiled from: XMSSKeyFactorySpi */
public class sa3 extends KeyFactorySpi implements g73 {
    public PrivateKey a(e43 e43) throws IOException {
        return new pa3(e43);
    }

    public PublicKey b(t43 t43) throws IOException {
        return new qa3(t43);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(e43.g(u03.k(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(34416) + keySpec.getClass() + C0201.m82(34417));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(t43.i(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(34418) + keySpec + C0201.m82(34419));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        boolean z = key instanceof pa3;
        String r1 = C0201.m82(34420);
        if (z) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof qa3)) {
            throw new InvalidKeySpecException(C0201.m82(34422) + key.getClass() + r1);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(C0201.m82(34421) + cls + r1);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof pa3) || (key instanceof qa3)) {
            return key;
        }
        throw new InvalidKeyException(C0201.m82(34423));
    }
}
