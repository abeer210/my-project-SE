package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class j3 implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ k3 f;

    public j3(k3 k3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = k3Var;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final void run() {
        t3 q = this.f.a.q();
        if (q.o()) {
            if (this.f.c == 0) {
                if (this.f.g().t()) {
                    k3 k3Var = this.f;
                    k3Var.a();
                    k3Var.c = 'C';
                } else {
                    k3 k3Var2 = this.f;
                    k3Var2.a();
                    k3Var2.c = 'c';
                }
            }
            if (this.f.d < 0) {
                k3 k3Var3 = this.f;
                k3Var3.d = k3Var3.g().q();
            }
            char charAt = C0201.m82(25156).charAt(this.a);
            char c2 = this.f.c;
            long j = this.f.d;
            String y = k3.y(true, this.b, this.c, this.d, this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 24);
            sb.append(C0201.m82(25157));
            sb.append(charAt);
            sb.append(c2);
            sb.append(j);
            sb.append(C0201.m82(25158));
            sb.append(y);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.b.substring(0, 1024);
            }
            q.d.a(sb2, 1);
            return;
        }
        this.f.z(6, C0201.m82(25159));
    }
}
