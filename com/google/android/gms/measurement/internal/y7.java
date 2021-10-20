package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.c8;
import vigqyno.C0201;

public final class y7<T extends Context & c8> {
    private final T a;

    public y7(T t) {
        u.k(t);
        this.a = t;
    }

    private final k3 j() {
        return o4.g(this.a, null).e();
    }

    private final void k(Runnable runnable) {
        m8 h0 = m8.h0(this.a);
        h0.c().y(new z7(this, h0, runnable));
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            j().E().d(C0201.m82(36785));
            return null;
        }
        String action = intent.getAction();
        if (C0201.m82(36786).equals(action)) {
            return new p4(m8.h0(this.a));
        }
        j().H().a(C0201.m82(36787), action);
        return null;
    }

    public final void b() {
        o4 g = o4.g(this.a, null);
        k3 e = g.e();
        g.a();
        e.M().d(C0201.m82(36788));
    }

    public final void c() {
        o4 g = o4.g(this.a, null);
        k3 e = g.e();
        g.a();
        e.M().d(C0201.m82(36789));
    }

    public final void d(Intent intent) {
        if (intent == null) {
            j().E().d(C0201.m82(36790));
            return;
        }
        j().M().a(C0201.m82(36791), intent.getAction());
    }

    public final int e(Intent intent, int i, int i2) {
        o4 g = o4.g(this.a, null);
        k3 e = g.e();
        if (intent == null) {
            e.H().d(C0201.m82(36792));
            return 2;
        }
        String action = intent.getAction();
        g.a();
        e.M().b(C0201.m82(36793), Integer.valueOf(i2), action);
        if (C0201.m82(36794).equals(action)) {
            k(new x7(this, i2, e, intent));
        }
        return 2;
    }

    @TargetApi(24)
    public final boolean f(JobParameters jobParameters) {
        o4 g = o4.g(this.a, null);
        k3 e = g.e();
        String string = jobParameters.getExtras().getString(C0201.m82(36795));
        g.a();
        e.M().a(C0201.m82(36796), string);
        if (!C0201.m82(36797).equals(string)) {
            return true;
        }
        k(new a8(this, e, jobParameters));
        return true;
    }

    public final boolean g(Intent intent) {
        if (intent == null) {
            j().E().d(C0201.m82(36798));
            return true;
        }
        j().M().a(C0201.m82(36799), intent.getAction());
        return true;
    }

    public final /* synthetic */ void h(int i, k3 k3Var, Intent intent) {
        if (this.a.C(i)) {
            k3Var.M().a(C0201.m82(36800), Integer.valueOf(i));
            j().M().d(C0201.m82(36801));
            this.a.a(intent);
        }
    }

    public final /* synthetic */ void i(k3 k3Var, JobParameters jobParameters) {
        k3Var.M().d(C0201.m82(36802));
        this.a.b(jobParameters, false);
    }
}
