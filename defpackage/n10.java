package defpackage;

import android.os.Build;
import com.dynatrace.android.agent.u;
import com.dynatrace.android.agent.x;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.TrustManager;
import vigqyno.C0201;

/* renamed from: n10  reason: default package */
/* compiled from: CommHandler */
public class n10 {
    private static final String a = (u.b + C0201.m82(37140));
    private static int b = 10000;
    private static int c = 30000;

    private static byte[] a(byte[] bArr) throws IOException {
        return s30.m(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    private static boolean c(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    private HttpURLConnection d(URL url) throws IOException, GeneralSecurityException {
        if (!q10.b) {
            return (HttpURLConnection) url.openConnection();
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        if (Build.VERSION.SDK_INT < 24 || q10.d != null || q10.c) {
            x10 x10 = new x10(q10.d, q10.c);
            httpsURLConnection.setSSLSocketFactory(new w10(q10.e, new TrustManager[]{x10}));
        }
        return httpsURLConnection;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|(3:6|(2:9|7)|73)|10|(3:12|(1:14)|15)(2:16|(1:18))|19|20|21|22|23|26|27|(8:37|(3:39|(1:41)|42)|43|(1:45)|46|(1:48)|(2:50|51)|56)(11:31|32|33|34|(0)|43|(0)|46|(0)|(0)|56)) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016a, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0173, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        if (com.dynatrace.android.agent.u.c != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0178, code lost:
        defpackage.s30.u(defpackage.n10.a, r0, r14);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00f5 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0151 A[SYNTHETIC, Splitter:B:50:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016f A[SYNTHETIC, Splitter:B:66:0x016f] */
    public r10 b(String str, String str2) throws Exception {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        InputStream errorStream;
        String r0 = C0201.m82(37141);
        HttpURLConnection httpURLConnection = null;
        String str3 = null;
        try {
            HttpURLConnection d = d(new URL(str));
            try {
                d.setConnectTimeout(b);
                d.setReadTimeout(c);
                Map<String, String> map = q10.a;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        d.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                d.addRequestProperty(C0201.m82(37142), C0201.m82(37143));
                if (str2 != null) {
                    d.setRequestProperty(C0201.m82(37144), C0201.m82(37145));
                    d.setRequestProperty(C0201.m82(37146), C0201.m82(37147));
                    d.setDoOutput(true);
                    if (u.c) {
                        s30.r(a, String.format(C0201.m82(37148), str, str2));
                    }
                    String replace = str2.replace(C0201.m82(37149), String.valueOf(x.a()));
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(d.getOutputStream());
                    gZIPOutputStream.write(replace.getBytes(C0201.m82(37150)));
                    gZIPOutputStream.close();
                } else if (u.c) {
                    s30.r(a, String.format(C0201.m82(37151), str));
                }
                int responseCode = d.getResponseCode();
                String responseMessage = d.getResponseMessage();
                try {
                    bufferedInputStream = new BufferedInputStream(d.getInputStream());
                    bArr = s30.m(bufferedInputStream);
                } catch (IOException unused) {
                    bufferedInputStream = null;
                }
                if (u.c || (errorStream = d.getErrorStream()) == null) {
                    bArr = null;
                    if (bArr != null) {
                        if (c(bArr)) {
                            bArr = a(bArr);
                        }
                        str3 = new String(bArr);
                    }
                    if (u.c) {
                        s30.r(a, String.format(C0201.m82(37152), Integer.valueOf(responseCode), responseMessage, str3));
                    }
                    r10 r10 = new r10(responseCode, responseMessage, str3, d.getHeaderFields());
                    if (d != null) {
                        d.disconnect();
                    }
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e) {
                            if (u.c) {
                                s30.u(a, r0, e);
                            }
                        }
                    }
                    return r10;
                }
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(errorStream);
                try {
                    bArr = s30.m(bufferedInputStream2);
                    bufferedInputStream = bufferedInputStream2;
                    if (bArr != null) {
                    }
                    if (u.c) {
                    }
                    r10 r102 = new r10(responseCode, responseMessage, str3, d.getHeaderFields());
                    if (d != null) {
                    }
                    if (bufferedInputStream != null) {
                    }
                    return r102;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = d;
                    bufferedInputStream = bufferedInputStream2;
                    if (httpURLConnection != null) {
                    }
                    if (bufferedInputStream != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                httpURLConnection = d;
                if (httpURLConnection != null) {
                }
                if (bufferedInputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            if (httpURLConnection != null) {
            }
            if (bufferedInputStream != null) {
            }
            throw th;
        }
    }
}
