package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class y {
    private final SharedPreferences a;
    private final Context b;
    private final c1 c;
    private final Map<String, b1> d;

    public y(Context context) {
        this(context, new c1());
    }

    private final synchronized boolean a() {
        return this.a.getAll().isEmpty();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void c(String str, String str2, String str3, String str4, String str5) {
        String a2 = b0.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    public final synchronized String d() {
        return this.a.getString("topic_operation_queue", "");
    }

    public final synchronized void e() {
        this.d.clear();
        c1.e(this.b);
        this.a.edit().clear().commit();
    }

    public final synchronized b0 f(String str, String str2, String str3) {
        return b0.c(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized void g(String str, String str2, String str3) {
        String b2 = b(str, str2, str3);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(b2);
        edit.commit();
    }

    public final synchronized void i(String str) {
        this.a.edit().putString("topic_operation_queue", str).apply();
    }

    public final synchronized b1 j(String str) {
        b1 b1Var;
        b1 b1Var2 = this.d.get(str);
        if (b1Var2 != null) {
            return b1Var2;
        }
        try {
            b1Var = this.c.k(this.b, str);
        } catch (d unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.d().C();
            b1Var = this.c.m(this.b, str);
        }
        this.d.put(str, b1Var);
        return b1Var;
    }

    public final synchronized void k(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    private y(Context context, c1 c1Var) {
        this.d = new r0();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = c1Var;
        File file = new File(b.i(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !a()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    e();
                    FirebaseInstanceId.d().C();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }
}
