package com.dynatrace.android.agent;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: BasicSegment */
public class f {
    private static final String g = (u.b + C0201.m82(2812));
    public String a;
    public int b;
    public q30 c = q30.e();
    public String d = C0201.m82(2813);
    public Long e = 0L;
    private boolean f;

    /* compiled from: BasicSegment */
    public static class a {
        public String a(long j, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(29210));
            sb.append(j);
            sb.append(C0201.m82(29211));
            sb.append(C0201.m82(29212));
            sb.append(C0201.m82(29213));
            if (i < 0) {
                i = 1;
            }
            sb.append(i);
            return sb.toString();
        }
    }

    public f(boolean z) {
        this.f = z;
        g();
    }

    public static boolean a(u10 u10) {
        for (String str : u10.b) {
            if (str.contains(C0201.m82(2814))) {
                u10.a += C0201.m82(2815) + C0201.m82(2816);
                return true;
            }
        }
        return false;
    }

    private String c(r20 r20) {
        if (!v20.b) {
            return C0201.m82(2817);
        }
        return r20.h() ? C0201.m82(2818) : C0201.m82(2819);
    }

    private String d(boolean z, r20 r20) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? C0201.m82(2820) : C0201.m82(2821));
        if (j20.a(r20)) {
            sb.append(C0201.m82(2822));
        }
        return sb.toString();
    }

    private void g() {
        this.b = 0;
        try {
            Context c2 = b.d().c();
            PackageInfo packageInfo = c2.getPackageManager().getPackageInfo(c2.getPackageName(), 0);
            if (packageInfo == null) {
                this.a = null;
                return;
            }
            this.a = s30.o(packageInfo.versionName, 50);
            this.b = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            this.a = null;
        }
    }

    public StringBuilder b(g30 g30, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(2823));
        sb.append(C0201.m82(2824));
        sb.append(C0201.m82(2825));
        sb.append(y.a());
        sb.append(C0201.m82(2826));
        sb.append(b.k);
        sb.append(C0201.m82(2827));
        sb.append(s30.q(b.l));
        sb.append(C0201.m82(2828));
        sb.append(s30.q(b.m));
        if (this.a != null) {
            sb.append(C0201.m82(2829));
            sb.append(s30.q(this.a));
        }
        sb.append(C0201.m82(2830));
        sb.append(this.b);
        sb.append(C0201.m82(2831));
        sb.append(g30.b);
        sb.append(C0201.m82(2832));
        sb.append(g30.c);
        if (g30.e == i30.V2_AGENT_SPLITTING) {
            sb.append(C0201.m82(2833));
            sb.append(g30.d);
        }
        sb.append(C0201.m82(2834));
        sb.append(this.c.a);
        sb.append(C0201.m82(2835));
        sb.append(s30.q(this.c.m));
        sb.append(C0201.m82(2836));
        sb.append(s30.q(this.c.l));
        sb.append(C0201.m82(2837));
        sb.append(s30.q(this.c.b));
        sb.append(C0201.m82(2838));
        sb.append(s30.q(this.c.p));
        sb.append(C0201.m82(2839));
        sb.append(this.c.d ? C0201.m82(2840) : C0201.m82(2841));
        sb.append(C0201.m82(2842));
        sb.append(this.c.c);
        sb.append(C0201.m82(2843));
        sb.append(this.c.g);
        sb.append(C0201.m82(2844));
        sb.append(this.c.h);
        sb.append(C0201.m82(2845));
        sb.append(this.c.i);
        sb.append(C0201.m82(2846));
        sb.append(C0201.m82(2847));
        String str = null;
        int i = this.c.k;
        if (i == 2) {
            str = C0201.m82(2848);
        } else if (i == 1) {
            str = C0201.m82(2849);
        }
        if (str != null) {
            sb.append(C0201.m82(2850));
            sb.append(str);
        }
        if (this.c.n >= 0) {
            sb.append(C0201.m82(2851));
            sb.append(this.c.n);
        }
        if (this.c.o != null) {
            sb.append(C0201.m82(2852));
            sb.append(this.c.o);
        }
        if (this.c.e != null) {
            sb.append(C0201.m82(2853));
            sb.append(s30.q(this.c.e));
        }
        if (this.c.f != r30.OTHER) {
            sb.append(C0201.m82(2854));
            sb.append(this.c.f.b());
            String str2 = this.c.j;
            if (str2 != null && str2.length() > 0) {
                sb.append(C0201.m82(2855));
                sb.append(s30.q(this.c.j));
            }
        }
        l20 c2 = g30.c();
        String str3 = this.d;
        if (str3 != null && str3.length() > 0 && c2.a()) {
            sb.append(C0201.m82(2856));
            sb.append(s30.q(this.d));
        }
        sb.append(C0201.m82(2857));
        sb.append(C0201.m82(2858));
        sb.append(C0201.m82(2859));
        sb.append(c2.c().f().ordinal());
        sb.append(C0201.m82(2860));
        sb.append(c(c2.c()));
        sb.append(C0201.m82(2861));
        sb.append(g30.e.d());
        if (this.f) {
            sb.append(C0201.m82(2862));
            sb.append(d(z, c2.c()));
        }
        return sb;
    }

    public void e(Location location) {
        if (location != null) {
            this.d = String.format(Locale.US, C0201.m82(2863), Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        } else {
            this.d = C0201.m82(2864);
        }
        if (u.c) {
            String str = g;
            s30.r(str, C0201.m82(2865) + this.d);
        }
    }

    public void f(boolean z) {
        if (z) {
            this.c.j();
        }
        if (Long.valueOf(x.a() - this.e.longValue()).longValue() > 5000) {
            this.e = Long.valueOf(x.a());
            this.c.m();
        }
    }
}
