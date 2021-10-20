package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
import vigqyno.C0201;

public class b {
    public e a;
    private String b;
    private a c;
    private int d;
    private Context e;
    private String f;
    private GrsBaseInfo g;

    /* access modifiers changed from: private */
    public enum a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public b(String str, int i, a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        this.b = str;
        this.c = aVar;
        this.d = i;
        this.e = context;
        this.f = str2;
        this.g = grsBaseInfo;
    }

    private String a(String str) {
        return Uri.parse(str).getPath();
    }

    private a g() {
        if (this.b.isEmpty()) {
            return a.GRSDEFAULT;
        }
        String a2 = a(this.b);
        return a2.contains(C0201.m82(21106)) ? a.GRSGET : a2.contains(C0201.m82(21107)) ? a.GRSPOST : a.GRSDEFAULT;
    }

    public a a() {
        return this.c;
    }

    public Context b() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public Callable<e> f() {
        if (a.GRSDEFAULT.equals(g())) {
            return null;
        }
        return a.GRSGET.equals(g()) ? new h(this.b, this.d, this.c, this.e, this.f, this.g) : new i(this.b, this.d, this.c, this.e, this.f, this.g);
    }
}
