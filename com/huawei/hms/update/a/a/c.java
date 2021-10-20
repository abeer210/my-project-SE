package com.huawei.hms.update.a.a;

import vigqyno.C0201;

/* compiled from: UpdateInfo */
public class c {
    public int a = 0;
    public String b;
    public String c;
    public int d;
    public String e;

    public c() {
        String r1 = C0201.m82(17648);
        this.b = r1;
        this.c = r1;
        this.d = 0;
        this.e = r1;
    }

    public boolean a() {
        String str;
        return this.a > 0 && this.d > 0 && (str = this.c) != null && !str.isEmpty();
    }

    public c(String str, int i, String str2, int i2, String str3) {
        String r1 = C0201.m82(17649);
        this.b = r1;
        this.c = r1;
        this.d = 0;
        this.e = r1;
        this.b = str;
        this.a = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
    }
}
