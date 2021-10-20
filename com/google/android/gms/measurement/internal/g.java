package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import vigqyno.C0201;

public final class g {
    public final String a;
    public final String b;
    private final String c;
    public final long d;
    public final long e;
    public final i f;

    private g(o4 o4Var, String str, String str2, String str3, long j, long j2, i iVar) {
        u.g(str2);
        u.g(str3);
        u.k(iVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            o4Var.e().H().b(C0201.m82(33404), k3.B(str2), k3.B(str3));
        }
        this.f = iVar;
    }

    public final g a(o4 o4Var, long j) {
        return new g(o4Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append(C0201.m82(33405));
        sb.append(str);
        sb.append(C0201.m82(33406));
        sb.append(str2);
        sb.append(C0201.m82(33407));
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public g(o4 o4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        i iVar;
        u.g(str2);
        u.g(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            o4Var.e().H().a(C0201.m82(33401), k3.B(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            iVar = new i(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    o4Var.e().E().d(C0201.m82(33402));
                    it.remove();
                } else {
                    Object Q = o4Var.T().Q(next, bundle2.get(next));
                    if (Q == null) {
                        o4Var.e().H().a(C0201.m82(33403), o4Var.S().w(next));
                        it.remove();
                    } else {
                        o4Var.T().B(bundle2, next, Q);
                    }
                }
            }
            iVar = new i(bundle2);
        }
        this.f = iVar;
    }
}
