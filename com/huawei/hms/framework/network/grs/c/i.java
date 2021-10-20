package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.b.b;
import com.huawei.hms.framework.network.grs.local.model.a;
import com.huawei.hms.framework.network.grs.local.model.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class i extends b implements Callable<e> {
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    private static final String h = null;
    public static final String j = null;
    private GrsBaseInfo i;

    static {
        C0201.m83(i.class, 59);
    }

    public i(String str, int i2, a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        super(str, i2, aVar, context, str2, grsBaseInfo);
        this.i = grsBaseInfo;
    }

    private String h() {
        HashSet<String> hashSet = new HashSet();
        a a = b.a(b().getPackageName(), this.i).a();
        String r2 = C0201.m82(19363);
        if (a == null) {
            Logger.w(h, C0201.m82(19364));
            return r2;
        }
        Map<String, c> b2 = a.b();
        if (b2 != null && !b2.isEmpty()) {
            for (Map.Entry<String, c> entry : b2.entrySet()) {
                hashSet.add(entry.getValue().b());
            }
            if (hashSet.isEmpty()) {
                return r2;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : hashSet) {
                jSONArray.put(str);
            }
            try {
                jSONObject.put(C0201.m82(19365), jSONArray);
                Logger.v(h, C0201.m82(19366), jSONObject.toString(), a.a());
                return jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return r2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r7v7, types: [byte[]] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.concurrent.Callable
    public e call() {
        long j2;
        long j3;
        long j4;
        IOException e2;
        Logger.i(h, e);
        long j5 = 0;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                j3 = System.currentTimeMillis();
                HttpsURLConnection a = com.huawei.hms.framework.network.grs.d.a.a.a(c(), b(), e());
                InputStream inputStream = null;
                if (a == null) {
                    Logger.w(h, f);
                    return null;
                }
                a.setRequestProperty(j, d);
                a.setRequestMethod(c);
                a.setDoOutput(true);
                a.setDoInput(true);
                a.connect();
                OutputStream c2 = w30.c(a);
                c2.write(h().getBytes(b));
                c2.close();
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
                j2 = System.currentTimeMillis();
                this.a = new e(e3, headerFields, inputStream == null ? new byte[0] : inputStream, elapsedRealtime2 - elapsedRealtime);
                this.a.a(c());
                this.a.a(d());
                this.a.b(j3);
                this.a.a(j2);
                if (a() != null) {
                    a().a(this.a);
                }
                return this.a;
            } catch (IOException e4) {
                e2 = e4;
                j5 = elapsedRealtime;
                j4 = 0;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                j2 = System.currentTimeMillis();
                Logger.w(h, g, e2);
                this.a = new e(e2, elapsedRealtime3 - j5);
                j3 = j4;
                this.a.a(c());
                this.a.a(d());
                this.a.b(j3);
                this.a.a(j2);
                if (a() != null) {
                }
                return this.a;
            }
        } catch (IOException e5) {
            e2 = e5;
            j4 = 0;
            long elapsedRealtime32 = SystemClock.elapsedRealtime();
            j2 = System.currentTimeMillis();
            Logger.w(h, g, e2);
            this.a = new e(e2, elapsedRealtime32 - j5);
            j3 = j4;
            this.a.a(c());
            this.a.a(d());
            this.a.b(j3);
            this.a.a(j2);
            if (a() != null) {
            }
            return this.a;
        }
    }
}
