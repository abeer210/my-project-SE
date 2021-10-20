package defpackage;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: i73  reason: default package */
/* compiled from: DefaultJcaJceHelper */
public class i73 implements j73 {
    @Override // defpackage.j73
    public Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(str);
    }

    @Override // defpackage.j73
    public AlgorithmParameters c(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }
}
