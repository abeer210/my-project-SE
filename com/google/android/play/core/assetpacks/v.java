package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.c;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import vigqyno.C0201;

public final class v extends zz1<AssetPackState> {
    private final l1 g;
    private final u0 h;
    private final fz1<i3> i;
    private final l0 j;
    private final x0 k;
    private final c l;
    private final fz1<Executor> m;
    private final fz1<Executor> n;
    private final Handler o = new Handler(Looper.getMainLooper());

    public v(Context context, l1 l1Var, u0 u0Var, fz1<i3> fz1, x0 x0Var, l0 l0Var, c cVar, fz1<Executor> fz12, fz1<Executor> fz13) {
        super(new gy1(C0201.m82(29504)), new IntentFilter(C0201.m82(29505)), context);
        this.g = l1Var;
        this.h = u0Var;
        this.i = fz1;
        this.k = x0Var;
        this.j = l0Var;
        this.l = cVar;
        this.m = fz12;
        this.n = fz13;
    }

    @Override // defpackage.zz1
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra(C0201.m82(29506));
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(C0201.m82(29507));
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.a.e(C0201.m82(29511), new Object[0]);
                return;
            }
            Bundle bundleExtra2 = intent.getBundleExtra(C0201.m82(29508));
            if (bundleExtra2 != null) {
                this.l.a(bundleExtra2);
            }
            AssetPackState a = AssetPackState.a(bundleExtra, stringArrayList.get(0), this.k, x.a);
            this.a.c(C0201.m82(29509), a);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable(C0201.m82(29510));
            if (pendingIntent != null) {
                this.j.a(pendingIntent);
            }
            this.n.a().execute(new t(this, bundleExtra, a));
            this.m.a().execute(new u(this, bundleExtra));
            return;
        }
        this.a.e(C0201.m82(29512), new Object[0]);
    }

    public final /* synthetic */ void f(Bundle bundle) {
        if (this.g.e(bundle)) {
            this.h.a();
        }
    }

    public final /* synthetic */ void g(Bundle bundle, AssetPackState assetPackState) {
        if (this.g.i(bundle)) {
            h(assetPackState);
            this.i.a().a();
        }
    }

    public final void h(AssetPackState assetPackState) {
        this.o.post(new s(this, assetPackState));
    }
}
