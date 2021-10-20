package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;
import vigqyno.C0201;

public class PLSharedPreferences {
    private static final String MOVE_TO_DE_RECORDS = null;
    private static final String TAG = null;
    private SharedPreferences sp;

    static {
        C0201.m83(PLSharedPreferences.class, 562);
    }

    public PLSharedPreferences(Context context, String str) {
        this.sp = getSharedPreferences(context, str);
    }

    private SharedPreferences getSharedPreferences(Context context, String str) {
        if (context == null) {
            Logger.e(C0201.m82(30868), C0201.m82(30869));
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(C0201.m82(30870), 0);
            if (!sharedPreferences.getBoolean(str, false)) {
                if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean(str, true);
                    edit.apply();
                }
            }
            context = createDeviceProtectedStorageContext;
        }
        return context.getSharedPreferences(str, 0);
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().apply();
        }
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getAll();
    }

    public long getLong(String str, long j) {
        SharedPreferences sharedPreferences = this.sp;
        return sharedPreferences == null ? j : sharedPreferences.getLong(str, j);
    }

    public String getString(String str) {
        return getString(str, C0201.m82(30871));
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.sp;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }

    public void putLong(String str, long j) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(str, j).apply();
        }
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.sp;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(str).apply();
        }
    }
}
