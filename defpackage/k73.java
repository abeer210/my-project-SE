package defpackage;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: k73  reason: default package */
/* compiled from: NamedJcaJceHelper */
public class k73 implements j73 {
    public final String a;

    public k73(String str) {
        this.a = str;
    }

    @Override // defpackage.j73
    public Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
        return Cipher.getInstance(str, this.a);
    }

    @Override // defpackage.j73
    public AlgorithmParameters c(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return AlgorithmParameters.getInstance(str, this.a);
    }
}
