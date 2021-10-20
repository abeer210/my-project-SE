package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import vigqyno.C0201;

/* renamed from: qb2  reason: default package */
public class qb2 extends pb2 {
    private final Map<String, String> c = new HashMap();
    private final Object d = new Object();
    private SecretKey e;

    public qb2(Context context, String str) {
        super(context, str);
        try {
            String b = b(C0201.m82(6147));
            String b2 = b(C0201.m82(6148));
            String b3 = b(C0201.m82(6149));
            String b4 = b(C0201.m82(6150));
            if (b != null && b2 != null && b3 != null && b4 != null) {
                this.e = ob2.a(mb2.b(b), mb2.b(b2), mb2.b(b3), mb2.b(b4));
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e(C0201.m82(6151), C0201.m82(6152));
            this.e = null;
        }
    }

    private String b(String str) {
        return super.a(str, null);
    }

    private static byte[] d(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException(C0201.m82(6154));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher instance = Cipher.getInstance(C0201.m82(6153));
        instance.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return instance.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    @Override // defpackage.pb2, defpackage.lb2
    public String a(String str, String str2) {
        if (this.e == null) {
            Log.e(C0201.m82(6155), C0201.m82(6156));
            return str2;
        }
        synchronized (this.d) {
            String str3 = this.c.get(str);
            if (str3 != null) {
                return str3;
            }
            String b = b(str);
            if (b == null) {
                return str2;
            }
            try {
                String str4 = new String(d(this.e, mb2.b(b)), C0201.m82(6157));
                this.c.put(str, str4);
                return str4;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                Log.e(C0201.m82(6158), C0201.m82(6159));
                return str2;
            }
        }
    }
}
