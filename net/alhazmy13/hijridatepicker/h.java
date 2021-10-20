package net.alhazmy13.hijridatepicker;

import android.os.Bundle;
import vigqyno.C0201;

/* compiled from: RNDate */
public class h {
    private in0 a;
    private long b;
    private long c;
    private long d;
    private String e;

    public h(Bundle bundle) {
        if (bundle != null) {
            String r0 = C0201.m82(27741);
            if (bundle.containsKey(r0)) {
                this.b = bundle.getLong(r0);
            }
        }
        if (bundle != null) {
            String r02 = C0201.m82(27742);
            if (bundle.containsKey(r02)) {
                this.c = bundle.getLong(r02);
            }
        }
        if (bundle != null) {
            String r03 = C0201.m82(27743);
            if (bundle.containsKey(r03)) {
                this.d = bundle.getLong(r03);
            }
        }
        if (bundle != null) {
            String r04 = C0201.m82(27744);
            if (bundle.containsKey(r04)) {
                this.e = bundle.getString(r04);
            }
        }
    }

    public int a() {
        return this.a.get(5);
    }

    public String b() {
        return this.e;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.c;
    }

    public in0 e() {
        return this.a;
    }

    public long f() {
        return this.b;
    }

    public int g() {
        return this.a.get(2);
    }

    public void h(long j) {
        in0 in0 = new in0();
        this.a = in0;
        in0.setTimeInMillis(j);
    }

    public int i() {
        return this.a.get(1);
    }
}
