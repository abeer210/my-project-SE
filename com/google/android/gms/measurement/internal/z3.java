package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.List;
import vigqyno.C0201;

public final class z3 {
    public final o4 a;

    public z3(o4 o4Var) {
        this.a = o4Var;
    }

    private final boolean c() {
        try {
            gq0 a2 = hq0.a(this.a.getContext());
            if (a2 == null) {
                this.a.e().K().d(C0201.m82(22313));
                return false;
            } else if (a2.d(C0201.m82(22314), 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.a.e().K().a(C0201.m82(22315), e);
            return false;
        }
    }

    public final Bundle a(String str, n91 n91) {
        this.a.c().j();
        if (n91 == null) {
            this.a.e().H().d(C0201.m82(22316));
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(C0201.m82(22317), str);
        try {
            Bundle S2 = n91.S2(bundle);
            if (S2 != null) {
                return S2;
            }
            this.a.e().E().d(C0201.m82(22318));
            return null;
        } catch (Exception e) {
            this.a.e().E().a(C0201.m82(22319), e.getMessage());
            return null;
        }
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.a.e().K().d(C0201.m82(22332));
            return;
        }
        this.a.c().j();
        if (!c()) {
            this.a.e().K().d(C0201.m82(22320));
            return;
        }
        this.a.e().K().d(C0201.m82(22321));
        c4 c4Var = new c4(this, str);
        this.a.c().j();
        Intent intent = new Intent(C0201.m82(22322));
        String r2 = C0201.m82(22323);
        intent.setComponent(new ComponentName(r2, C0201.m82(22324)));
        PackageManager packageManager = this.a.getContext().getPackageManager();
        if (packageManager == null) {
            this.a.e().H().d(C0201.m82(22325));
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.e().K().d(C0201.m82(22331));
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !r2.equals(str2) || !c()) {
                this.a.e().K().d(C0201.m82(22330));
                return;
            }
            try {
                this.a.e().K().a(C0201.m82(22326), aq0.b().a(this.a.getContext(), new Intent(intent), c4Var, 1) ? C0201.m82(22327) : C0201.m82(22328));
            } catch (Exception e) {
                this.a.e().E().a(C0201.m82(22329), e.getMessage());
            }
        }
    }
}
