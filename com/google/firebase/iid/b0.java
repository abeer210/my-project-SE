package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class b0 {
    private static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;
    private final String b;
    private final long c;

    private b0(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String b(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var.a;
    }

    public static b0 c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new b0(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final boolean d(String str) {
        return System.currentTimeMillis() > this.c + d || !str.equals(this.b);
    }
}
