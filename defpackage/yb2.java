package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import vigqyno.C0201;

/* renamed from: yb2  reason: default package */
public class yb2 {
    private static final String a = null;

    static {
        C0201.m83(yb2.class, 564);
    }

    public static String a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(33008);
        if (isEmpty || TextUtils.isEmpty(str2)) {
            bc2.b(a, C0201.m82(33011));
            return r1;
        }
        try {
            return new String(b(str, ac2.b(str2)), C0201.m82(33009));
        } catch (UnsupportedEncodingException e) {
            String str3 = a;
            bc2.b(str3, C0201.m82(33010) + e.getMessage());
            return r1;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            bc2.b(a, C0201.m82(33023));
            return bArr2;
        } else if (!f()) {
            bc2.b(a, C0201.m82(33012));
            return bArr2;
        } else if (bArr.length <= 12) {
            bc2.b(a, C0201.m82(33013));
            return bArr2;
        } else {
            SecretKey c = c(str);
            if (c == null) {
                bc2.b(a, C0201.m82(33014));
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher instance = Cipher.getInstance(C0201.m82(33015));
                instance.init(2, c, new GCMParameterSpec(128, copyOf));
                return instance.doFinal(bArr, 12, bArr.length - 12);
            } catch (NoSuchAlgorithmException e) {
                String str2 = a;
                bc2.b(str2, C0201.m82(33022) + e.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e2) {
                String str3 = a;
                bc2.b(str3, C0201.m82(33021) + e2.getMessage());
                return bArr2;
            } catch (InvalidKeyException e3) {
                String str4 = a;
                bc2.b(str4, C0201.m82(33020) + e3.getMessage());
                return bArr2;
            } catch (InvalidAlgorithmParameterException e4) {
                String str5 = a;
                bc2.b(str5, C0201.m82(33019) + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                String str6 = a;
                bc2.b(str6, C0201.m82(33018) + e5.getMessage());
                return bArr2;
            } catch (BadPaddingException e6) {
                String str7 = a;
                bc2.b(str7, C0201.m82(33017) + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                String str8 = a;
                bc2.b(str8, C0201.m82(33016) + e7.getMessage());
                return bArr2;
            }
        }
    }

    private static synchronized SecretKey c(String str) {
        SecretKey secretKey;
        synchronized (yb2.class) {
            secretKey = null;
            try {
                KeyStore instance = KeyStore.getInstance(C0201.m82(33024));
                instance.load(null);
                Key key = instance.getKey(str, null);
                if (key == null || !(key instanceof SecretKey)) {
                    KeyGenerator instance2 = KeyGenerator.getInstance(C0201.m82(33025), C0201.m82(33026));
                    instance2.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(C0201.m82(33027)).setEncryptionPaddings(C0201.m82(33028)).setKeySize(256).build());
                    secretKey = instance2.generateKey();
                } else {
                    secretKey = (SecretKey) key;
                }
            } catch (KeyStoreException e) {
                String str2 = a;
                bc2.b(str2, C0201.m82(33036) + e.getMessage());
            } catch (IOException e2) {
                String str3 = a;
                bc2.b(str3, C0201.m82(33035) + e2.getMessage());
            } catch (CertificateException e3) {
                String str4 = a;
                bc2.b(str4, C0201.m82(33034) + e3.getMessage());
            } catch (NoSuchAlgorithmException e4) {
                String str5 = a;
                bc2.b(str5, C0201.m82(33033) + e4.getMessage());
            } catch (UnrecoverableKeyException e5) {
                String str6 = a;
                bc2.b(str6, C0201.m82(33032) + e5.getMessage());
            } catch (InvalidAlgorithmParameterException e6) {
                String str7 = a;
                bc2.b(str7, C0201.m82(33031) + e6.getMessage());
            } catch (NoSuchProviderException e7) {
                String str8 = a;
                bc2.b(str8, C0201.m82(33030) + e7.getMessage());
            } catch (Exception e8) {
                String str9 = a;
                bc2.b(str9, C0201.m82(33029) + e8.getMessage());
            }
        }
        return secretKey;
    }

    public static String d(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(33037);
        if (isEmpty || TextUtils.isEmpty(str2)) {
            bc2.b(a, C0201.m82(33040));
            return r1;
        }
        try {
            return ac2.a(e(str, str2.getBytes(C0201.m82(33038))));
        } catch (UnsupportedEncodingException e) {
            String str3 = a;
            bc2.b(str3, C0201.m82(33039) + e.getMessage());
            return r1;
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            bc2.b(a, C0201.m82(33051));
            return bArr2;
        } else if (!f()) {
            bc2.b(a, C0201.m82(33041));
            return bArr2;
        } else {
            try {
                Cipher instance = Cipher.getInstance(C0201.m82(33042));
                SecretKey c = c(str);
                if (c == null) {
                    bc2.b(a, C0201.m82(33043));
                    return bArr2;
                }
                instance.init(1, c);
                byte[] doFinal = instance.doFinal(bArr);
                byte[] iv = instance.getIV();
                if (iv != null) {
                    if (iv.length == 12) {
                        byte[] copyOf = Arrays.copyOf(iv, iv.length + doFinal.length);
                        System.arraycopy(doFinal, 0, copyOf, iv.length, doFinal.length);
                        return copyOf;
                    }
                }
                bc2.b(a, C0201.m82(33044));
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                String str2 = a;
                bc2.b(str2, C0201.m82(33050) + e.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e2) {
                String str3 = a;
                bc2.b(str3, C0201.m82(33049) + e2.getMessage());
                return bArr2;
            } catch (BadPaddingException e3) {
                String str4 = a;
                bc2.b(str4, C0201.m82(33048) + e3.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e4) {
                String str5 = a;
                bc2.b(str5, C0201.m82(33047) + e4.getMessage());
                return bArr2;
            } catch (InvalidKeyException e5) {
                String str6 = a;
                bc2.b(str6, C0201.m82(33046) + e5.getMessage());
                return bArr2;
            } catch (Exception e6) {
                String str7 = a;
                bc2.b(str7, C0201.m82(33045) + e6.getMessage());
                return bArr2;
            }
        }
    }

    private static boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
