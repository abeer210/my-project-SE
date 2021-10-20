package com.taluttasgiran.rnsecurestorage;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import vigqyno.C0201;

/* compiled from: RNKeyStore */
public class a {
    private byte[] a(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException, IOException {
        Cipher instance = Cipher.getInstance(C0201.m82(14152));
        instance.init(2, secretKey);
        return b(instance, bArr);
    }

    private byte[] b(Cipher cipher, byte[] bArr) throws IOException {
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), cipher);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[256];
        for (int read = cipherInputStream.read(bArr2); read != -1; read = cipherInputStream.read(bArr2)) {
            byteArrayOutputStream.write(bArr2, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] c(PrivateKey privateKey, byte[] bArr) throws GeneralSecurityException, IOException {
        Cipher instance = Cipher.getInstance(C0201.m82(14153));
        instance.init(2, privateKey);
        return b(instance, bArr);
    }

    private byte[] d(SecretKey secretKey, String str) throws GeneralSecurityException, IOException {
        Cipher instance = Cipher.getInstance(C0201.m82(14154));
        instance.init(1, secretKey);
        return e(instance, str);
    }

    private byte[] e(Cipher cipher, String str) throws GeneralSecurityException, IOException {
        return f(cipher, str.getBytes(C0201.m82(14155)));
    }

    private byte[] f(Cipher cipher, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
        cipherOutputStream.write(bArr);
        cipherOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] g(PublicKey publicKey, byte[] bArr) throws GeneralSecurityException, IOException {
        Cipher instance = Cipher.getInstance(C0201.m82(14156));
        instance.init(1, publicKey);
        return f(instance, bArr);
    }

    private KeyStore i() throws KeyStoreException {
        try {
            return KeyStore.getInstance(C0201.m82(14157));
        } catch (Exception unused) {
            try {
                return KeyStore.getInstance(C0201.m82(14158));
            } catch (Exception unused2) {
                return KeyStore.getInstance(C0201.m82(14159));
            }
        }
    }

    private PublicKey j(Context context, String str) throws GeneralSecurityException, IOException {
        KeyStore i = i();
        i.load(null);
        if (!i.containsAlias(str) || i.getCertificate(str) == null) {
            String r1 = C0201.m82(14160);
            Log.i(r1, C0201.m82(14161));
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 50);
            KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
            KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(C0201.m82(14162) + str)).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance(C0201.m82(14163), i.getProvider());
            instance3.initialize(build);
            instance3.generateKeyPair();
            Log.i(r1, C0201.m82(14164));
        }
        return i.getCertificate(str).getPublicKey();
    }

    private SecretKey k(Context context, String str) throws GeneralSecurityException, IOException {
        try {
            return n(context, str);
        } catch (FileNotFoundException unused) {
            String r0 = C0201.m82(14165);
            Log.i(r0, C0201.m82(14166));
            KeyGenerator instance = KeyGenerator.getInstance(C0201.m82(14167));
            instance.init(256);
            SecretKey generateKey = instance.generateKey();
            PublicKey j = j(context, str);
            c.c(context, C0201.m82(14168) + str, g(j, generateKey.getEncoded()));
            Log.i(r0, C0201.m82(14169));
            return generateKey;
        }
    }

    private PrivateKey m(String str) throws GeneralSecurityException, IOException {
        KeyStore i = i();
        i.load(null);
        return (PrivateKey) i.getKey(str, null);
    }

    private SecretKey n(Context context, String str) throws GeneralSecurityException, IOException {
        return new SecretKeySpec(c(m(str), c.b(context, C0201.m82(14170) + str)), C0201.m82(14171));
    }

    public boolean h(Context context, String str) throws IOException {
        return c.a(context, C0201.m82(14172) + str);
    }

    public String l(Context context, String str) throws GeneralSecurityException, IOException {
        SecretKey n = n(context, str);
        return new String(a(n, c.b(context, C0201.m82(14173) + str)), C0201.m82(14174));
    }

    public void o(Context context, String str, String str2) throws GeneralSecurityException, IOException {
        c.c(context, C0201.m82(14175) + str, d(k(context, str), str2));
    }
}
