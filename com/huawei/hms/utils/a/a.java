package com.huawei.hms.utils.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: X509CertUtil */
public class a {
    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        String r1 = C0201.m82(34549);
        if (x509Certificate == null) {
            HMSLog.e(r1, C0201.m82(34550));
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 == null) {
                return false;
            }
            try {
                x509Certificate2.verify(publicKey);
                publicKey = x509Certificate2.getPublicKey();
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                HMSLog.e(r1, C0201.m82(34551) + e.getMessage());
            }
        }
        return b(list);
    }

    public static List<X509Certificate> b(String str) {
        return a(c(str));
    }

    private static List<String> c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            HMSLog.e(C0201.m82(34559), C0201.m82(34558) + e.getMessage());
            return Collections.emptyList();
        }
    }

    public static boolean b(List<X509Certificate> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, C0201.m82(34554), str);
    }

    public static boolean b(X509Certificate x509Certificate, String str, String str2) {
        try {
            return a(x509Certificate, str.getBytes(C0201.m82(34555)), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            HMSLog.e(C0201.m82(34557), C0201.m82(34556) + e.getMessage());
            return false;
        }
    }

    public static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(Base64.decode(str));
        } catch (IllegalArgumentException e) {
            HMSLog.e(C0201.m82(34544), C0201.m82(34543) + e.getMessage());
            return null;
        }
    }

    public static X509Certificate a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance(C0201.m82(34545)).generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            HMSLog.e(C0201.m82(34547), C0201.m82(34546) + e.getMessage());
            return null;
        }
    }

    public static List<X509Certificate> a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(a(str));
        }
        return arrayList;
    }

    private static String a(String str, String str2) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        int indexOf = upperCase.indexOf(str2 + C0201.m82(34533));
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(C0201.m82(34534), indexOf);
        if (indexOf2 != -1) {
            return str.substring(indexOf + str2.length() + 1, indexOf2);
        }
        return str.substring(indexOf + str2.length() + 1);
    }

    public static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    public static boolean a(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean a(X509Certificate x509Certificate, String str) {
        return a(x509Certificate, C0201.m82(34548), str);
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        try {
            Signature instance = Signature.getInstance(x509Certificate.getSigAlgName());
            instance.initVerify(x509Certificate.getPublicKey());
            instance.update(bArr);
            return instance.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            HMSLog.e(C0201.m82(34553), C0201.m82(34552) + e.getMessage());
            return false;
        }
    }

    public static X509Certificate a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        Exception e;
        String r0 = C0201.m82(34536);
        InputStream inputStream2 = null;
        if (context == null || TextUtils.isEmpty(str)) {
            HMSLog.e(r0, C0201.m82(34542));
            return null;
        }
        try {
            KeyStore instance = KeyStore.getInstance(C0201.m82(34537));
            inputStream = context.getAssets().open(C0201.m82(34538));
            try {
                instance.load(inputStream, C0201.m82(34539).toCharArray());
                if (!instance.containsAlias(str)) {
                    HMSLog.e(r0, C0201.m82(34540) + str);
                    IOUtils.closeQuietly(inputStream);
                    return null;
                }
                Certificate certificate = instance.getCertificate(str);
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStream);
                    return x509Certificate;
                }
                IOUtils.closeQuietly(inputStream);
                return null;
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                e = e2;
                try {
                    HMSLog.e(r0, C0201.m82(34541) + e.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    IOUtils.closeQuietly(inputStream2);
                    throw th;
                }
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e3) {
            e = e3;
            inputStream = null;
            HMSLog.e(r0, C0201.m82(34541) + e.getMessage());
            IOUtils.closeQuietly(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(inputStream2);
            throw th;
        }
    }

    public static X509Certificate a(Context context) {
        return a(context, C0201.m82(34535));
    }
}
