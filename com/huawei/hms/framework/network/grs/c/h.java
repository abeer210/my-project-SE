package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.d.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import vigqyno.C0201;

public class h extends b implements Callable<e> {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    private static final String h = null;

    static {
        C0201.m83(h.class, 61);
    }

    public h(String str, int i, a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        super(str, i, aVar, context, str2, grsBaseInfo);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.concurrent.Callable
    public e call() {
        long j;
        long j2;
        long j3;
        IOException e2;
        Logger.i(h, d);
        long j4 = 0;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                j2 = System.currentTimeMillis();
                HttpsURLConnection a = a.a(c(), b(), e());
                InputStream inputStream = null;
                if (a == null) {
                    Logger.w(h, c);
                    return null;
                }
                a.setRequestMethod(e);
                a.connect();
                int e3 = w30.e(a);
                if (e3 == 200) {
                    try {
                        inputStream = w30.a(a);
                        ?? byteArray = IoUtils.toByteArray(inputStream);
                        IoUtils.closeSecure(inputStream);
                        inputStream = byteArray;
                    } catch (Throwable th) {
                        IoUtils.closeSecure(inputStream);
                        throw th;
                    }
                }
                Map headerFields = a.getHeaderFields();
                a.disconnect();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                j = System.currentTimeMillis();
                this.a = new e(e3, headerFields, inputStream == null ? new byte[0] : inputStream, elapsedRealtime2 - elapsedRealtime);
                this.a.a(c());
                this.a.a(d());
                this.a.b(j2);
                this.a.a(j);
                if (a() != null) {
                    a().a(this.a);
                }
                return this.a;
            } catch (IOException e4) {
                e2 = e4;
                j4 = elapsedRealtime;
                j3 = 0;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                j = System.currentTimeMillis();
                Logger.w(h, b, e2);
                this.a = new e(e2, elapsedRealtime3 - j4);
                j2 = j3;
                this.a.a(c());
                this.a.a(d());
                this.a.b(j2);
                this.a.a(j);
                if (a() != null) {
                }
                return this.a;
            }
        } catch (IOException e5) {
            e2 = e5;
            j3 = 0;
            long elapsedRealtime32 = SystemClock.elapsedRealtime();
            j = System.currentTimeMillis();
            Logger.w(h, b, e2);
            this.a = new e(e2, elapsedRealtime32 - j4);
            j2 = j3;
            this.a.a(c());
            this.a.a(d());
            this.a.b(j2);
            this.a.a(j);
            if (a() != null) {
            }
            return this.a;
        }
    }
}
