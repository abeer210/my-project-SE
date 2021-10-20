package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import vigqyno.C0201;

@DynamiteApi
public class FlagProviderImpl extends lr0 {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.kr0
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        return b.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // defpackage.kr0
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        return d.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    @Override // defpackage.kr0
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        return f.a(this.b, str, Long.valueOf(j)).longValue();
    }

    @Override // defpackage.kr0
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        return h.a(this.b, str, str2);
    }

    @Override // defpackage.kr0
    public void init(yq0 yq0) {
        Context context = (Context) ar0.V3(yq0);
        if (!this.a) {
            try {
                this.b = j.a(context.createPackageContext(C0201.m82(14358), 0));
                this.a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String r0 = C0201.m82(14359);
                String valueOf = String.valueOf(e.getMessage());
                Log.w(C0201.m82(14360), valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0));
            }
        }
    }
}
