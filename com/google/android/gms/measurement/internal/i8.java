package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import vigqyno.C0201;

public final class i8 extends n8 {
    private final AlarmManager d = ((AlarmManager) getContext().getSystemService(C0201.m82(20578)));
    private final b e;
    private Integer f;

    public i8(m8 m8Var) {
        super(m8Var);
        this.e = new l8(this, m8Var.g0(), m8Var);
    }

    private final int w() {
        if (this.f == null) {
            String r0 = C0201.m82(20579);
            String valueOf = String.valueOf(getContext().getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? r0.concat(valueOf) : new String(r0)).hashCode());
        }
        return this.f.intValue();
    }

    @TargetApi(24)
    private final void x() {
        int w = w();
        e().M().a(C0201.m82(20581), Integer.valueOf(w));
        ((JobScheduler) getContext().getSystemService(C0201.m82(20580))).cancel(w);
    }

    private final PendingIntent y() {
        Context context = getContext();
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, C0201.m82(20582)).setAction(C0201.m82(20583)), 0);
    }

    @Override // com.google.android.gms.measurement.internal.n8
    public final boolean u() {
        this.d.cancel(y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        x();
        return false;
    }

    public final void v() {
        t();
        this.d.cancel(y());
        this.e.a();
        if (Build.VERSION.SDK_INT >= 24) {
            x();
        }
    }

    public final void z(long j) {
        t();
        a();
        Context context = getContext();
        if (!e4.b(context)) {
            e().L().d(C0201.m82(20584));
        }
        if (!y8.V(context, false)) {
            e().L().d(C0201.m82(20585));
        }
        v();
        long b = b().b() + j;
        if (j < Math.max(0L, l.C.a(null).longValue()) && !this.e.e()) {
            e().M().d(C0201.m82(20586));
            this.e.f(j);
        }
        a();
        if (Build.VERSION.SDK_INT >= 24) {
            e().M().d(C0201.m82(20587));
            Context context2 = getContext();
            ComponentName componentName = new ComponentName(context2, C0201.m82(20588));
            int w = w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(C0201.m82(20589), C0201.m82(20590));
            JobInfo build = new JobInfo.Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            e().M().a(C0201.m82(20591), Integer.valueOf(w));
            pc1.b(context2, build, C0201.m82(20592), C0201.m82(20593));
            return;
        }
        e().M().d(C0201.m82(20594));
        this.d.setInexactRepeating(2, b, Math.max(l.x.a(null).longValue(), j), y());
    }
}
