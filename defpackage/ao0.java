package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: ao0  reason: default package */
public final class ao0 {
    private SharedPreferences a;

    public ao0(Context context) {
        try {
            Context d = dp0.d(context);
            this.a = d == null ? null : d.getSharedPreferences(C0201.m82(37066), 0);
        } catch (Throwable th) {
            Log.w(C0201.m82(37067), C0201.m82(37068), th);
            this.a = null;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.a == null) {
                return false;
            }
            return this.a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w(C0201.m82(37069), C0201.m82(37070), th);
            return false;
        }
    }

    public final float b(String str, float f) {
        try {
            if (this.a == null) {
                return 0.0f;
            }
            return this.a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w(C0201.m82(37071), C0201.m82(37072), th);
            return 0.0f;
        }
    }

    public final String c(String str, String str2) {
        try {
            return this.a == null ? str2 : this.a.getString(str, str2);
        } catch (Throwable th) {
            Log.w(C0201.m82(37073), C0201.m82(37074), th);
            return str2;
        }
    }
}
