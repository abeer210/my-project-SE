package com.huawei.hms.framework.network.grs.c;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class e {
    private static final String a = null;
    private Map<String, List<String>> b;
    private byte[] c;
    private int d = 0;
    private long e;
    private long f;
    private long g;
    private String h;
    private int i = 2;
    private int j = 9001;
    private String k;
    private String l;
    private String m;
    private long n;
    private Exception o;
    private String p;
    private int q;

    static {
        C0201.m83(e.class, 716);
    }

    public e(int i2, Map<String, List<String>> map, byte[] bArr, long j2) {
        String r0 = C0201.m82(19725);
        this.k = r0;
        this.l = r0;
        this.m = r0;
        this.n = 0;
        this.d = i2;
        this.b = map;
        this.c = ByteBuffer.wrap(bArr).array();
        this.e = j2;
        q();
    }

    public e(Exception exc, long j2) {
        String r0 = C0201.m82(19726);
        this.k = r0;
        this.l = r0;
        this.m = r0;
        this.n = 0;
        this.o = exc;
        this.e = j2;
    }

    private void a(Map<String, String> map) {
        long j2;
        NumberFormatException e2;
        if (map == null || map.size() <= 0) {
            Logger.w(a, C0201.m82(19738));
            return;
        }
        String r0 = C0201.m82(19727);
        if (map.containsKey(r0)) {
            String str = map.get(r0);
            if (!TextUtils.isEmpty(str)) {
                String r02 = C0201.m82(19728);
                if (str.contains(r02)) {
                    try {
                        j2 = Long.parseLong(str.substring(str.indexOf(r02) + 8));
                        try {
                            Logger.v(a, C0201.m82(19729), Long.valueOf(j2));
                        } catch (NumberFormatException e3) {
                            e2 = e3;
                            Logger.w(a, C0201.m82(19730), e2);
                            j2 = 86400;
                            long j3 = j2 * 1000;
                            Logger.v(a, C0201.m82(19737), Long.valueOf(j3));
                            b(String.valueOf(j3 + System.currentTimeMillis()));
                        }
                    } catch (NumberFormatException e4) {
                        e2 = e4;
                        j2 = 0;
                        Logger.w(a, C0201.m82(19730), e2);
                        j2 = 86400;
                        long j32 = j2 * 1000;
                        Logger.v(a, C0201.m82(19737), Long.valueOf(j32));
                        b(String.valueOf(j32 + System.currentTimeMillis()));
                    }
                    if (j2 <= 0 || j2 > 2592000) {
                        j2 = 86400;
                    }
                    long j322 = j2 * 1000;
                    Logger.v(a, C0201.m82(19737), Long.valueOf(j322));
                    b(String.valueOf(j322 + System.currentTimeMillis()));
                }
            }
        } else {
            String r03 = C0201.m82(19731);
            if (map.containsKey(r03)) {
                String str2 = map.get(r03);
                Logger.v(a, C0201.m82(19732), str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0201.m82(19733), Locale.ROOT);
                String str3 = null;
                String r9 = C0201.m82(19734);
                if (map.containsKey(r9)) {
                    str3 = map.get(r9);
                }
                try {
                    j2 = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e5) {
                    Logger.w(a, C0201.m82(19735), e5);
                }
                j2 = 86400;
                long j3222 = j2 * 1000;
                Logger.v(a, C0201.m82(19737), Long.valueOf(j3222));
                b(String.valueOf(j3222 + System.currentTimeMillis()));
            }
            Logger.i(a, C0201.m82(19736));
        }
        j2 = 0;
        j2 = 86400;
        long j32222 = j2 * 1000;
        Logger.v(a, C0201.m82(19737), Long.valueOf(j32222));
        b(String.valueOf(j32222 + System.currentTimeMillis()));
    }

    private void b(int i2) {
        this.j = i2;
    }

    private void b(String str) {
        this.m = str;
    }

    private void b(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            Logger.w(a, C0201.m82(19742));
            return;
        }
        long j2 = 0;
        String r2 = C0201.m82(19739);
        if (map.containsKey(r2)) {
            String str = map.get(r2);
            if (!TextUtils.isEmpty(str)) {
                try {
                    j2 = Long.parseLong(str);
                } catch (NumberFormatException e2) {
                    Logger.w(a, C0201.m82(19740), e2);
                }
            }
        }
        long j3 = j2 * 1000;
        Logger.v(a, C0201.m82(19741), Long.valueOf(j3));
        c(j3);
    }

    private void c(int i2) {
        this.i = i2;
    }

    private void c(long j2) {
        this.n = j2;
    }

    private void c(String str) {
        this.k = str;
    }

    private void d(String str) {
        this.l = str;
    }

    private void e(String str) {
        this.h = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    private void n() {
        String r8;
        boolean z;
        String r0 = C0201.m82(19743);
        String r1 = C0201.m82(19744);
        String r2 = C0201.m82(19745);
        String r3 = C0201.m82(19746);
        if (!m()) {
            Logger.i(a, C0201.m82(19747));
            c(2);
            return;
        }
        try {
            String byte2Str = StringUtils.byte2Str(this.c);
            JSONObject jSONObject = new JSONObject(byte2Str);
            int i2 = -1;
            boolean has = jSONObject.has(r3);
            String r9 = C0201.m82(19748);
            if (!has) {
                if (jSONObject.has(r9)) {
                    r3 = r9;
                } else {
                    Logger.e(a, C0201.m82(19749));
                    c(i2);
                    r8 = C0201.m82(19750);
                    z = i2 != 0 && byte2Str.contains(r8);
                    String r92 = C0201.m82(19751);
                    if (i2 != 1 || z) {
                        e(jSONObject.getJSONObject(r8).toString());
                        if (!z) {
                            if (jSONObject.has(r1)) {
                                r92 = jSONObject.getString(r1);
                            }
                            d(r92);
                            return;
                        }
                        return;
                    }
                    c(2);
                    b(jSONObject.has(r2) ? jSONObject.getInt(r2) : 9001);
                    if (jSONObject.has(r0)) {
                        r92 = jSONObject.getString(r0);
                    }
                    c(r92);
                    return;
                }
            }
            i2 = jSONObject.getInt(r3);
            c(i2);
            r8 = C0201.m82(19750);
            if (i2 != 0) {
            }
            String r922 = C0201.m82(19751);
            if (i2 != 1) {
            }
            e(jSONObject.getJSONObject(r8).toString());
            if (!z) {
            }
        } catch (JSONException e2) {
            Logger.w(a, C0201.m82(19752), e2);
            c(2);
        }
    }

    private void o() {
        if (m() || l()) {
            Map<String, String> p2 = p();
            try {
                if (m()) {
                    a(p2);
                }
                if (l()) {
                    b(p2);
                }
            } catch (JSONException e2) {
                Logger.w(a, C0201.m82(19753), e2);
            }
        }
    }

    private Map<String, String> p() {
        HashMap hashMap = new HashMap(16);
        Map<String, List<String>> map = this.b;
        if (map == null || map.size() <= 0) {
            Logger.v(a, C0201.m82(19754));
            return hashMap;
        }
        for (Map.Entry<String, List<String>> entry : this.b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().get(0));
        }
        return hashMap;
    }

    private void q() {
        o();
        n();
    }

    public String a() {
        return this.m;
    }

    public void a(int i2) {
        this.q = i2;
    }

    public void a(long j2) {
        this.g = j2;
    }

    public void a(String str) {
        this.p = str;
    }

    public int b() {
        return this.d;
    }

    public void b(long j2) {
        this.f = j2;
    }

    public int c() {
        return this.j;
    }

    public Exception d() {
        return this.o;
    }

    public int e() {
        return this.i;
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public String i() {
        return this.h;
    }

    public long j() {
        return this.n;
    }

    public String k() {
        return this.p;
    }

    public boolean l() {
        return this.d == 503;
    }

    public boolean m() {
        return this.d == 200;
    }
}
