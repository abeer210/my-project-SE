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

/* renamed from: la3  reason: default package */
/* compiled from: Sphincs256KeyFactorySpi */
public class la3 extends KeyFactorySpi implements g73 {
    public PrivateKey a(e43 e43) throws IOException {
        return new ja3(e43);
    }

    public PublicKey b(t43 t43) throws IOException {
        return new ka3(t43);
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
            throw new InvalidKeySpecException(C0201.m82(156) + keySpec.getClass() + C0201.m82(157));
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
            throw new InvalidKeySpecException(C0201.m82(158) + keySpec + C0201.m82(159));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        boolean z = key instanceof ja3;
        String r1 = C0201.m82(160);
        if (z) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof ka3)) {
            throw new InvalidKeySpecException(C0201.m82(162) + key.getClass() + r1);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(C0201.m82(161) + cls + r1);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof ja3) || (key instanceof ka3)) {
            return key;
        }
        throw new InvalidKeyException(C0201.m82(163));
    }
}
