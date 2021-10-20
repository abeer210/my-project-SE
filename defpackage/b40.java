package defpackage;

import com.dynatrace.android.agent.u;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: b40  reason: default package */
/* compiled from: ConnStateParms */
public class b40 extends f40 {
    private static final Map<String, Integer> j;
    private static final int k = 0;
    public HttpURLConnection i;

    static {
        C0201.m83(b40.class, 731);
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(C0201.m82(7695), Integer.valueOf(12 + x30.d().length()));
        j.put(C0201.m82(7696), 22);
        j.put(C0201.m82(7697), 21);
    }

    public b40(HttpURLConnection httpURLConnection, y30 y30, z30 z30, int i2) {
        super(y30, z30, i2);
        this.i = httpURLConnection;
    }

    private long f(Map<String, List<String>> map) {
        long parseLong;
        long j2 = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                if (entry.getValue().size() > 0) {
                    parseLong = (long) (entry.getValue().get(0).length() + 2);
                }
            } else if (!entry.getKey().startsWith(C0201.m82(7698))) {
                long length = (long) (entry.getKey().length() + 4);
                for (String str : entry.getValue()) {
                    j2 += ((long) str.length()) + length;
                }
                if (C0201.m82(7699).equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                    try {
                        parseLong = Long.parseLong(entry.getValue().get(0));
                    } catch (NumberFormatException e) {
                        if (u.c) {
                            s30.s(C0201.m82(7700), C0201.m82(7701), e);
                        }
                    }
                }
            }
            j2 += parseLong;
        }
        return j2;
    }

    private int h(String str, String str2) {
        int length = str.length() + 12;
        return (str2 == null || str2.length() < 1) ? length + 1 : length + str2.length();
    }

    @Override // defpackage.f40
    public String a() {
        return b(this.i);
    }

    @Override // defpackage.f40
    public String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        this.a = C0201.m82(7702);
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            this.a = s30.p(httpURLConnection.getURL().toString());
        }
        return this.a;
    }

    @Override // defpackage.f40
    public String d() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection != null ? httpURLConnection.getURL().getHost() : C0201.m82(7703);
    }

    @Override // defpackage.f40
    public String e() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection != null ? httpURLConnection.getRequestMethod() : C0201.m82(7704);
    }

    public void g(boolean z) {
        if (this.f < 0) {
            try {
                this.f = (long) h(this.i.getRequestMethod(), this.i.getURL().getFile());
                Map<String, List<String>> requestProperties = this.i.getRequestProperties();
                this.f += f(requestProperties) + 2;
                for (Map.Entry<String, Integer> entry : j.entrySet()) {
                    if (!requestProperties.containsKey(entry.getKey())) {
                        this.f += (long) (entry.getValue().intValue() + 2);
                    }
                }
                if (!requestProperties.containsKey(C0201.m82(7705))) {
                    this.f += (long) (this.i.getURL().toURI().getAuthority().length() + 4 + 4);
                }
                if (z && !requestProperties.containsKey(C0201.m82(7706))) {
                    this.f += (long) k;
                }
            } catch (Exception e) {
                if (u.c) {
                    s30.s(C0201.m82(7707), C0201.m82(7708), e);
                }
                this.f = -1;
            }
        }
    }

    public void i() {
        if (this.g < 0) {
            try {
                this.g = f(this.i.getHeaderFields()) + 2;
            } catch (Exception e) {
                if (u.c) {
                    s30.s(C0201.m82(7709), C0201.m82(7710), e);
                }
                this.g = -1;
            }
        }
    }
}
