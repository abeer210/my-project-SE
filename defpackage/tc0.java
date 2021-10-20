package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import vigqyno.C0201;

/* renamed from: tc0  reason: default package */
/* compiled from: BitmapMemoryCacheKey */
public class tc0 implements m40 {
    private final String a;
    private final rd0 b;
    private final sd0 c;
    private final od0 d;
    private final m40 e;
    private final String f;
    private final int g;
    private final Object h;

    public tc0(String str, rd0 rd0, sd0 sd0, od0 od0, m40 m40, String str2, Object obj) {
        z50.g(str);
        this.a = str;
        this.b = rd0;
        this.c = sd0;
        this.d = od0;
        this.e = m40;
        this.f = str2;
        this.g = d70.d(Integer.valueOf(str.hashCode()), Integer.valueOf(rd0 != null ? rd0.hashCode() : 0), Integer.valueOf(sd0.hashCode()), this.d, this.e, str2);
        this.h = obj;
        RealtimeSinceBootClock.get().now();
    }

    @Override // defpackage.m40
    public boolean a(Uri uri) {
        return b().contains(uri.toString());
    }

    @Override // defpackage.m40
    public String b() {
        return this.a;
    }

    @Override // defpackage.m40
    public boolean equals(Object obj) {
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0 = (tc0) obj;
        if (this.g != tc0.g || !this.a.equals(tc0.a) || !y50.a(this.b, tc0.b) || !y50.a(this.c, tc0.c) || !y50.a(this.d, tc0.d) || !y50.a(this.e, tc0.e) || !y50.a(this.f, tc0.f)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.m40
    public int hashCode() {
        return this.g;
    }

    public String toString() {
        return String.format(null, C0201.m82(27577), this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }
}
