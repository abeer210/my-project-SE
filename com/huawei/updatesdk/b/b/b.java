package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.huawei.updatesdk.a.a.b.a.a.a;
import vigqyno.C0201;

public class b {
    private SharedPreferences a;

    private b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static b a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                context = context.createDeviceProtectedStorageContext();
            }
            sharedPreferences = context.getSharedPreferences(str, 0);
        } catch (Exception unused) {
            a.b(C0201.m82(35709), C0201.m82(35710));
            sharedPreferences = null;
        }
        return new b(sharedPreferences);
    }

    public long a(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public String a(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void b(String str, long j) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong(str, j);
            edit.commit();
        } catch (Exception e) {
            a.a(C0201.m82(35712), C0201.m82(35711) + str, e);
        }
    }

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e) {
            a.a(C0201.m82(35714), C0201.m82(35713) + str, e);
        }
    }
}
