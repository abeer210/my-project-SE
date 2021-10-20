package defpackage;

import com.dynatrace.android.agent.u;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import vigqyno.C0201;

/* renamed from: e40  reason: default package */
/* compiled from: OkRequestStateParms */
public class e40 extends f40 {
    public Request i;

    public e40(Request request, y30 y30, z30 z30, int i2) {
        super(y30, z30, i2);
        this.i = request;
    }

    private long f(Map<String, List<String>> map) {
        long j = 0;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            long length = (long) (entry.getKey().length() + 4);
            for (String str : entry.getValue()) {
                j += ((long) str.length()) + length;
            }
            if (C0201.m82(26754).equalsIgnoreCase(entry.getKey()) && entry.getValue().size() > 0) {
                try {
                    j += Long.parseLong(entry.getValue().get(0));
                } catch (NumberFormatException e) {
                    if (u.c) {
                        s30.s(C0201.m82(26755), C0201.m82(26756), e);
                    }
                }
            }
        }
        return j;
    }

    @Override // defpackage.f40
    public String a() {
        return b(this.i);
    }

    @Override // defpackage.f40
    public String c() {
        return s30.p(this.i.url().toString());
    }

    @Override // defpackage.f40
    public String d() {
        return this.i.url().host();
    }

    @Override // defpackage.f40
    public String e() {
        return this.i.method();
    }

    public void g(Response response) {
        Response networkResponse = response.networkResponse();
        if (networkResponse != null) {
            try {
                Request request = networkResponse.request();
                long length = (long) networkResponse.protocol().toString().length();
                this.f = ((long) (request.method().length() + request.url().url().getFile().length())) + length + 4 + f(request.headers().toMultimap()) + 2;
                this.g = length + ((long) String.valueOf(networkResponse.code()).length()) + ((long) networkResponse.message().length()) + 4 + f(networkResponse.headers().toMultimap()) + 2;
            } catch (Exception e) {
                if (u.c) {
                    s30.s(C0201.m82(26757), e.getMessage(), e);
                }
                this.f = -1;
                this.g = -1;
            }
        }
    }
}
