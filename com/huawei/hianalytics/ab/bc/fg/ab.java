package com.huawei.hianalytics.ab.bc.fg;

import android.text.TextUtils;
import com.huawei.hianalytics.ab.ab.bc;
import com.huawei.hianalytics.ab.bc.kl.de;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import vigqyno.C0201;

public abstract class ab {

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hianalytics.ab.bc.fg.ab$ab  reason: collision with other inner class name */
    public static class C0080ab extends Exception {
        public C0080ab(String str) {
            super(str);
        }
    }

    public static bc ab(String str, byte[] bArr, Map<String, String> map) {
        return ab(str, bArr, map, C0201.m82(13446));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: ab (unused com.huawei.hianalytics.ab.bc.fg.ab$ab), SYNTHETIC, Splitter:B:17:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00f5  */
    public static bc ab(String str, byte[] bArr, Map<String, String> map, String str2) {
        OutputStream outputStream;
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        int e;
        String r0 = C0201.m82(13447);
        boolean isEmpty = TextUtils.isEmpty(str);
        String r2 = C0201.m82(13448);
        if (isEmpty) {
            return new bc(-100, r2);
        }
        int i = -102;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            httpURLConnection = ab(str, bArr.length, map, str2);
            if (httpURLConnection == null) {
                try {
                    bc bcVar = new bc(-101, r2);
                    de.ab((Closeable) null);
                    de.ab((Closeable) null);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar;
                } catch (C0080ab unused) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13455));
                    bc bcVar2 = new bc(-101, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar2;
                } catch (SecurityException unused2) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13454));
                    bc bcVar3 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar3;
                } catch (SSLPeerUnverifiedException unused3) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13453));
                    bc bcVar4 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar4;
                } catch (SSLHandshakeException unused4) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13452));
                    bc bcVar5 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar5;
                } catch (ConnectException unused5) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13451));
                    bc bcVar6 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar6;
                } catch (UnknownHostException unused6) {
                    outputStream = null;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13450));
                    bc bcVar7 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar7;
                } catch (IOException unused7) {
                    outputStream = null;
                    try {
                        com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13449));
                        bc bcVar8 = new bc(i, r2);
                        de.ab((Closeable) bufferedOutputStream2);
                        de.ab((Closeable) outputStream);
                        if (httpURLConnection != null) {
                            de.ab(httpURLConnection);
                        }
                        return bcVar8;
                    } catch (Throwable th2) {
                        th = th2;
                        de.ab((Closeable) bufferedOutputStream2);
                        de.ab((Closeable) outputStream);
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    throw th;
                }
            } else {
                outputStream = w30.c(httpURLConnection);
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                } catch (C0080ab unused8) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13455));
                    bc bcVar22 = new bc(-101, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar22;
                } catch (SecurityException unused9) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13454));
                    bc bcVar32 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar32;
                } catch (SSLPeerUnverifiedException unused10) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13453));
                    bc bcVar42 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar42;
                } catch (SSLHandshakeException unused11) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13452));
                    bc bcVar52 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar52;
                } catch (ConnectException unused12) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13451));
                    bc bcVar62 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar62;
                } catch (UnknownHostException unused13) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13450));
                    bc bcVar72 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar72;
                } catch (IOException unused14) {
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13449));
                    bc bcVar82 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar82;
                }
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.flush();
                    e = w30.e(httpURLConnection);
                    bc bcVar9 = new bc(e, bc(httpURLConnection));
                    de.ab((Closeable) bufferedOutputStream);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                        de.ab(httpURLConnection);
                    }
                    return bcVar9;
                } catch (C0080ab unused15) {
                } catch (SecurityException unused16) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13454));
                    bc bcVar322 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar322;
                } catch (SSLPeerUnverifiedException unused17) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13453));
                    bc bcVar422 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar422;
                } catch (SSLHandshakeException unused18) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13452));
                    bc bcVar522 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar522;
                } catch (ConnectException unused19) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13451));
                    bc bcVar622 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar622;
                } catch (UnknownHostException unused20) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13450));
                    bc bcVar722 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar722;
                } catch (IOException unused21) {
                    i = e;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13449));
                    bc bcVar822 = new bc(i, r2);
                    de.ab((Closeable) bufferedOutputStream2);
                    de.ab((Closeable) outputStream);
                    if (httpURLConnection != null) {
                    }
                    return bcVar822;
                } catch (Throwable th4) {
                }
            }
        } catch (C0080ab unused22) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13455));
            bc bcVar222 = new bc(-101, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar222;
        } catch (SecurityException unused23) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13454));
            bc bcVar3222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar3222;
        } catch (SSLPeerUnverifiedException unused24) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13453));
            bc bcVar4222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar4222;
        } catch (SSLHandshakeException unused25) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13452));
            bc bcVar5222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar5222;
        } catch (ConnectException unused26) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13451));
            bc bcVar6222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar6222;
        } catch (UnknownHostException unused27) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13450));
            bc bcVar7222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar7222;
        } catch (IOException unused28) {
            httpURLConnection = null;
            outputStream = null;
            com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, C0201.m82(13449));
            bc bcVar8222 = new bc(i, r2);
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            return bcVar8222;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            outputStream = null;
            de.ab((Closeable) bufferedOutputStream2);
            de.ab((Closeable) outputStream);
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    private static HttpURLConnection ab(String str, int i, Map<String, String> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hianalytics.ab.bc.ef.ab.bc(C0201.m82(13456), C0201.m82(13457));
            return null;
        }
        URLConnection openConnection = new URL(str).openConnection();
        w30.E(openConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        ab(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(C0201.m82(13458), C0201.m82(13459));
        httpURLConnection.setRequestProperty(C0201.m82(13460), String.valueOf(i));
        httpURLConnection.setRequestProperty(C0201.m82(13461), C0201.m82(13462));
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    private static void ab(HttpURLConnection httpURLConnection) {
        ec2 ec2;
        String str;
        String r0 = C0201.m82(13463);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            ec2 = null;
            try {
                ec2 = ec2.c(bc.fg());
            } catch (NoSuchAlgorithmException unused) {
                str = C0201.m82(13468);
            } catch (KeyStoreException unused2) {
                str = C0201.m82(13467);
            } catch (GeneralSecurityException unused3) {
                str = C0201.m82(13466);
            } catch (IOException unused4) {
                str = C0201.m82(13465);
            } catch (IllegalAccessException unused5) {
                str = C0201.m82(13464);
            }
            if (ec2 == null) {
                httpsURLConnection.setSSLSocketFactory(ec2);
                httpsURLConnection.setHostnameVerifier(new hc2());
                return;
            }
            throw new C0080ab(C0201.m82(13469));
        }
        return;
        com.huawei.hianalytics.ab.bc.ef.ab.fg(r0, str);
        if (ec2 == null) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        com.huawei.hianalytics.ab.bc.kl.de.ab((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r5 = defpackage.w30.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r1 = vigqyno.C0201.m82(13470);
        com.huawei.hianalytics.ab.bc.ef.ab.fg(r1, vigqyno.C0201.m82(13471) + r5);
        com.huawei.hianalytics.ab.bc.kl.de.ab((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return vigqyno.C0201.m82(13472);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    private static String bc(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        inputStream = w30.a(httpURLConnection);
        httpURLConnection = de.ab(inputStream);
        de.ab((Closeable) inputStream);
        return httpURLConnection;
    }
}
