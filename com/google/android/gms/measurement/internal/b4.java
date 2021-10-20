package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import vigqyno.C0201;

public final class b4 implements Runnable {
    private final /* synthetic */ n91 a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ c4 c;

    public b4(c4 c4Var, n91 n91, ServiceConnection serviceConnection) {
        this.c = c4Var;
        this.a = n91;
        this.b = serviceConnection;
    }

    public final void run() {
        c4 c4Var = this.c;
        z3 z3Var = c4Var.b;
        String str = c4Var.a;
        n91 n91 = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a2 = z3Var.a(str, n91);
        z3Var.a.c().j();
        if (a2 != null) {
            long j = a2.getLong(C0201.m82(3504), 0) * 1000;
            if (j == 0) {
                z3Var.a.e().E().d(C0201.m82(3505));
            } else {
                String string = a2.getString(C0201.m82(3506));
                if (string == null || string.isEmpty()) {
                    z3Var.a.e().E().d(C0201.m82(3522));
                } else {
                    z3Var.a.e().M().a(C0201.m82(3507), string);
                    y8 T = z3Var.a.T();
                    String r11 = C0201.m82(3508);
                    String valueOf = String.valueOf(string);
                    Bundle u = T.u(Uri.parse(valueOf.length() != 0 ? r11.concat(valueOf) : new String(r11)));
                    if (u == null) {
                        z3Var.a.e().E().d(C0201.m82(3509));
                    } else {
                        String string2 = u.getString(C0201.m82(3510));
                        if (string2 != null && !C0201.m82(3511).equalsIgnoreCase(string2) && !C0201.m82(3512).equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong(C0201.m82(3513), 0) * 1000;
                            if (j2 == 0) {
                                z3Var.a.e().E().d(C0201.m82(3514));
                            } else {
                                u.putLong(C0201.m82(3515), j2);
                            }
                        }
                        if (j == z3Var.a.q().k.a()) {
                            z3Var.a.a();
                            z3Var.a.e().M().d(C0201.m82(3516));
                        } else {
                            z3Var.a.q().k.b(j);
                            z3Var.a.a();
                            m3 M = z3Var.a.e().M();
                            String r4 = C0201.m82(3517);
                            String r5 = C0201.m82(3518);
                            M.a(r4, r5);
                            u.putString(C0201.m82(3519), r5);
                            z3Var.a.L().I(C0201.m82(3520), C0201.m82(3521), u);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            aq0.b().c(z3Var.a.getContext(), serviceConnection);
        }
    }
}
