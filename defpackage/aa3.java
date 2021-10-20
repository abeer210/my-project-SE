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

/* renamed from: aa3  reason: default package */
/* compiled from: McElieceCCA2KeyFactorySpi */
public class aa3 extends KeyFactorySpi implements g73 {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                e43 g = e43.g(u03.k(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (c83.d.equals(g.i().g())) {
                        y73 k = y73.k(g.j());
                        return new w93(new m83(k.o(), k.l(), k.i(), k.j(), k.p(), ca3.b(k.g()).d()));
                    }
                    throw new InvalidKeySpecException(C0201.m82(147));
                } catch (IOException unused) {
                    throw new InvalidKeySpecException(C0201.m82(148));
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException(C0201.m82(149) + e);
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(150) + keySpec.getClass() + C0201.m82(151));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                t43 i = t43.i(u03.k(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (c83.d.equals(i.g().g())) {
                        z73 j = z73.j(i.k());
                        return new x93(new n83(j.k(), j.l(), j.i(), ca3.b(j.g()).d()));
                    }
                    throw new InvalidKeySpecException(C0201.m82(152));
                } catch (IOException e) {
                    throw new InvalidKeySpecException(C0201.m82(153) + e.getMessage());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            throw new InvalidKeySpecException(C0201.m82(154) + keySpec.getClass() + C0201.m82(155));
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
