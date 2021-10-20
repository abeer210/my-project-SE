package com.huawei.hms.update.a;

import android.content.Context;
import android.content.SharedPreferences;
import vigqyno.C0201;

/* compiled from: DownloadRecord */
public class a {
    private String a;
    private int b;
    private String c;
    private int d;

    private void b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C0201.m82(14223) + str, 0).edit();
        edit.putString(C0201.m82(14224), this.a);
        edit.putInt(C0201.m82(14225), this.b);
        edit.putString(C0201.m82(14226), this.c);
        edit.putInt(C0201.m82(14227), this.d);
        edit.commit();
    }

    public void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(C0201.m82(14228) + str, 0);
        String r4 = C0201.m82(14229);
        String r1 = C0201.m82(14230);
        this.a = sharedPreferences.getString(r4, r1);
        this.b = sharedPreferences.getInt(C0201.m82(14231), 0);
        this.c = sharedPreferences.getString(C0201.m82(14232), r1);
        this.d = sharedPreferences.getInt(C0201.m82(14233), 0);
    }

    public void a(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = 0;
    }

    public int b() {
        return this.d;
    }

    public boolean b(String str, int i, String str2) {
        String str3;
        String str4;
        return str != null && str2 != null && (str3 = this.a) != null && str3.equals(str) && this.b == i && (str4 = this.c) != null && str4.equals(str2) && this.d <= this.b;
    }

    public void a(Context context, int i, String str) {
        this.d = i;
        b(context, str);
    }

    public int a() {
        return this.b;
    }
}
