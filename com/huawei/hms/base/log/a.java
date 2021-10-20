package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: LogAdaptor */
public class a {
    private static final b a = new d();
    private int b = 4;
    private String c;

    private c b(int i, String str, String str2, Throwable th) {
        c cVar = new c(8, this.c, i, str);
        cVar.a(str2);
        cVar.a(th);
        return cVar;
    }

    public void a(Context context, int i, String str) {
        this.b = i;
        this.c = str;
        a.a(context, C0201.m82(33438));
    }

    public boolean a(int i) {
        return i >= this.b;
    }

    public void a(int i, String str, String str2, Throwable th) {
        if (a(i)) {
            c b2 = b(i, str, str2, th);
            b bVar = a;
            bVar.a(b2.a() + b2.b(), i, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    public void a(int i, String str, String str2) {
        if (a(i)) {
            c b2 = b(i, str, str2, null);
            a.a(b2.a() + b2.b(), i, str, str2);
        }
    }

    public void a(String str, String str2) {
        c b2 = b(4, str, str2, null);
        a.a(b2.a() + '\n' + b2.b(), 4, str, str2);
    }
}
