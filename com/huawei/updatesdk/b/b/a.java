package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.text.TextUtils;
import vigqyno.C0201;

public final class a {
    private static final Object c = new Object();
    private static a d;
    private b a;
    private String b;

    private a(Context context) {
        this.a = b.a(C0201.m82(35718), context);
    }

    public static a c() {
        a aVar;
        synchronized (c) {
            if (d == null) {
                d = new a(com.huawei.updatesdk.a.b.a.a.c().a());
            }
            aVar = d;
        }
        return aVar;
    }

    public String a() {
        return this.b;
    }

    public String a(String str) {
        b bVar = this.a;
        return bVar.a(C0201.m82(35719) + str, C0201.m82(35720));
    }

    public void a(long j) {
        this.a.b(C0201.m82(35721), j);
    }

    public void a(String str, long j) {
        b bVar = this.a;
        bVar.b(C0201.m82(35722) + str, j);
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.a.b(str, str2);
        }
    }

    public long b() {
        return this.a.a(C0201.m82(35723), 0);
    }

    public long b(String str) {
        b bVar = this.a;
        return bVar.a(C0201.m82(35724) + str, 0);
    }

    public void b(String str, String str2) {
        b bVar = this.a;
        bVar.b(C0201.m82(35725) + str, str2);
    }

    public String c(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String r1 = C0201.m82(35726);
        return isEmpty ? r1 : this.a.a(str, r1);
    }

    public void d(String str) {
        this.b = str;
    }
}
