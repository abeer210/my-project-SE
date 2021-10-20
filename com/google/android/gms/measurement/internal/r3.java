package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public class r3 extends BroadcastReceiver {
    private final m8 a;
    private boolean b;
    private boolean c;

    public r3(m8 m8Var) {
        u.k(m8Var);
        this.a = m8Var;
    }

    public final void a() {
        this.a.W();
        this.a.c().j();
        this.a.c().j();
        if (this.b) {
            this.a.e().M().d(C0201.m82(1479));
            this.b = false;
            this.c = false;
            try {
                this.a.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.e().E().a(C0201.m82(1480), e);
            }
        }
    }

    public final void c() {
        this.a.W();
        this.a.c().j();
        if (!this.b) {
            this.a.getContext().registerReceiver(this, new IntentFilter(C0201.m82(1481)));
            this.c = this.a.S().y();
            this.a.e().M().a(C0201.m82(1482), Boolean.valueOf(this.c));
            this.b = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.a.W();
        String action = intent.getAction();
        this.a.e().M().a(C0201.m82(1483), action);
        if (C0201.m82(1484).equals(action)) {
            boolean y = this.a.S().y();
            if (this.c != y) {
                this.c = y;
                this.a.c().y(new u3(this, y));
                return;
            }
            return;
        }
        this.a.e().H().a(C0201.m82(1485), action);
    }
}
