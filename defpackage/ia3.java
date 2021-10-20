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

/* renamed from: ia3  reason: default package */
/* compiled from: RainbowKeyFactorySpi */
public class ia3 extends KeyFactorySpi implements g73 {
    public PrivateKey a(e43 e43) throws IOException {
        d83 j = d83.j(e43.j());
        return new ga3(j.k(), j.g(), j.l(), j.i(), j.p(), j.o());
    }

    public PublicKey b(t43 t43) throws IOException {
        e83 l = e83.l(t43.k());
        return new ha3(l.k(), l.g(), l.j(), l.i());
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ua3) {
            return new ga3((ua3) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(e43.g(u03.k(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(22261) + keySpec.getClass() + C0201.m82(22262));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof va3) {
            return new ha3((va3) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(t43.i(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(22263) + keySpec + C0201.m82(22264));
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        boolean z = key instanceof ga3;
        String r1 = C0201.m82(22265);
        if (z) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (ua3.class.isAssignableFrom(cls)) {
                ga3 ga3 = (ga3) key;
                return new ua3(ga3.c(), ga3.a(), ga3.d(), ga3.b(), ga3.f(), ga3.e());
            }
        } else if (!(key instanceof ha3)) {
            throw new InvalidKeySpecException(C0201.m82(22267) + key.getClass() + r1);
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (va3.class.isAssignableFrom(cls)) {
                ha3 ha3 = (ha3) key;
                return new va3(ha3.d(), ha3.a(), ha3.c(), ha3.b());
            }
        }
        throw new InvalidKeySpecException(C0201.m82(22266) + cls + r1);
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof ga3) || (key instanceof ha3)) {
            return key;
        }
        throw new InvalidKeyException(C0201.m82(22268));
    }
}
