package com.huawei.updatesdk.a.b.a;

import android.content.Context;
import vigqyno.C0201;

public class a {
    private static final Object b = new Object();
    private static a c;
    private Context a;

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    public static void a(Context context) {
        synchronized (b) {
            if (c == null) {
                c = new a(context);
            }
        }
    }

    public static a c() {
        a aVar;
        synchronized (b) {
            aVar = c;
        }
        return aVar;
    }

    public Context a() {
        return this.a;
    }

    public String b() {
        Context context = this.a;
        return (context == null || context.getFilesDir() == null) ? C0201.m82(15051) : this.a.getFilesDir().getAbsolutePath();
    }
}
