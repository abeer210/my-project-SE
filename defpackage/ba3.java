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

/* renamed from: ba3  reason: default package */
/* compiled from: McElieceKeyFactorySpi */
public class ba3 extends KeyFactorySpi implements g73 {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                e43 g = e43.g(u03.k(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (c83.c.equals(g.i().g())) {
                        a83 j = a83.j(g.j());
                        return new y93(new q83(j.l(), j.k(), j.g(), j.i(), j.o(), j.p(), j.q()));
                    }
                    throw new InvalidKeySpecException(C0201.m82(37100));
                } catch (IOException unused) {
                    throw new InvalidKeySpecException(C0201.m82(37101));
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException(C0201.m82(37102) + e);
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(37103) + keySpec.getClass() + C0201.m82(37104));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                t43 i = t43.i(u03.k(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (c83.c.equals(i.g().g())) {
                        b83 i2 = b83.i(i.k());
                        return new z93(new r83(i2.j(), i2.k(), i2.g()));
                    }
                    throw new InvalidKeySpecException(C0201.m82(37105));
                } catch (IOException e) {
                    throw new InvalidKeySpecException(C0201.m82(37106) + e.getMessage());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(37107) + keySpec.getClass() + C0201.m82(37108));
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
