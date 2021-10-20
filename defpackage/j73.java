package defpackage;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: j73  reason: default package */
/* compiled from: JcaJceHelper */
public interface j73 {
    Cipher a(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    AlgorithmParameters c(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
