package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.b;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public final class d extends k5 {
    private long c;
    private String d;
    private Boolean e;
    private AccountManager f;
    private Boolean g;
    private long h;

    public d(o4 o4Var) {
        super(o4Var);
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append(C0201.m82(32850));
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }

    public final long t() {
        p();
        return this.c;
    }

    public final String u() {
        p();
        return this.d;
    }

    public final long v() {
        j();
        return this.h;
    }

    public final void w() {
        j();
        this.g = null;
        this.h = 0;
    }

    public final boolean x() {
        String r0 = C0201.m82(32851);
        j();
        long a = b().a();
        if (a - this.h > 86400000) {
            this.g = null;
        }
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b.a(getContext(), C0201.m82(32852)) != 0) {
            e().I().d(C0201.m82(32853));
            this.h = a;
            this.g = Boolean.FALSE;
            return false;
        }
        if (this.f == null) {
            this.f = AccountManager.get(getContext());
        }
        try {
            Account[] result = this.f.getAccountsByTypeAndFeatures(r0, new String[]{C0201.m82(32854)}, null, null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f.getAccountsByTypeAndFeatures(r0, new String[]{C0201.m82(32855)}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.g = Boolean.TRUE;
                    this.h = a;
                    return true;
                }
                this.h = a;
                this.g = Boolean.FALSE;
                return false;
            }
            this.g = Boolean.TRUE;
            this.h = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            e().F().a(C0201.m82(32856), e2);
        }
    }

    public final boolean y(Context context) {
        if (this.e == null) {
            a();
            this.e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo(C0201.m82(32857), 128);
                    this.e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }
}
