package defpackage;

import android.util.Base64;
import androidx.core.util.g;
import java.util.List;
import vigqyno.C0201;

/* renamed from: i2  reason: default package */
/* compiled from: FontRequest */
public final class i2 {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e = 0;
    private final String f;

    public i2(String str, String str2, String str3, List<List<byte[]>> list) {
        g.c(str);
        this.a = str;
        g.c(str2);
        this.b = str2;
        g.c(str3);
        this.c = str3;
        g.c(list);
        this.d = list;
        StringBuilder sb = new StringBuilder(this.a);
        String r2 = C0201.m82(17919);
        sb.append(r2);
        sb.append(this.b);
        sb.append(r2);
        sb.append(this.c);
        this.f = sb.toString();
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(17920) + this.a + C0201.m82(17921) + this.b + C0201.m82(17922) + this.c + C0201.m82(17923));
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(C0201.m82(17924));
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(C0201.m82(17925));
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append(C0201.m82(17926));
            }
            sb.append(C0201.m82(17927));
        }
        sb.append(C0201.m82(17928));
        sb.append(C0201.m82(17929) + this.e);
        return sb.toString();
    }
}
