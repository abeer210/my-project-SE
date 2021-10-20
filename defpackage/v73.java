package defpackage;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: v73  reason: default package */
/* compiled from: JceAsymmetricKeyUnwrapper */
public class v73 extends n73 {
    private x73 b = new x73(new i73());
    private Map c = new HashMap();
    private PrivateKey d;
    private boolean e;

    public v73(o43 o43, PrivateKey privateKey) {
        super(o43);
        this.d = privateKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r2.length == 0) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    public p73 b(o43 o43, byte[] bArr) throws t73 {
        try {
            Cipher b2 = this.b.b(a().g(), this.c);
            AlgorithmParameters a = this.b.a(a());
            Key key = null;
            if (a != null) {
                try {
                    b2.init(4, this.d, a);
                } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException unused) {
                }
            } else {
                b2.init(4, this.d);
            }
            Key unwrap = b2.unwrap(bArr, this.b.c(o43.g()), 3);
            try {
                if (this.e) {
                    byte[] encoded = unwrap.getEncoded();
                    if (encoded != null) {
                    }
                    if (key == null) {
                        b2.init(2, this.d);
                        key = new SecretKeySpec(b2.doFinal(bArr), o43.g().u());
                    }
                    return new w73(o43, key);
                }
            } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException unused2) {
            }
            key = unwrap;
            if (key == null) {
            }
            return new w73(o43, key);
        } catch (InvalidKeyException e2) {
            throw new t73(C0201.m82(33623) + e2.getMessage(), e2);
        } catch (IllegalBlockSizeException e3) {
            throw new t73(C0201.m82(33622) + e3.getMessage(), e3);
        } catch (BadPaddingException e4) {
            throw new t73(C0201.m82(33621) + e4.getMessage(), e4);
        }
    }

    public v73 c(p03 p03, String str) {
        this.c.put(p03, str);
        return this;
    }

    public v73 d(boolean z) {
        this.e = z;
        return this;
    }

    public v73 e(String str) {
        this.b = new x73(new k73(str));
        return this;
    }
}
