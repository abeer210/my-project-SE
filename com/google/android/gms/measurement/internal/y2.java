package com.google.android.gms.measurement.internal;

import vigqyno.C0201;

public final class y2<V> {
    private static final Object h = new Object();
    private final String a;
    private final z2<V> b;
    private final V c;
    private final V d;
    private final Object e;
    private volatile V f;
    private volatile V g;

    private y2(String str, V v, V v2, z2<V> z2Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.c = v;
        this.d = v2;
        this.b = z2Var;
    }

    public final V a(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (l.a == null) {
            return this.c;
        }
        synchronized (h) {
            if (h9.a()) {
                return this.g == null ? this.c : this.g;
            } else if (!h9.a()) {
                h9 h9Var = l.a;
                try {
                    for (y2 y2Var : l.b) {
                        synchronized (h) {
                            if (!h9.a()) {
                                y2Var.g = y2Var.b != null ? y2Var.b.get() : null;
                            } else {
                                throw new IllegalStateException(C0201.m82(38719));
                            }
                        }
                    }
                } catch (SecurityException e2) {
                    l.e(e2);
                }
            } else {
                throw new IllegalStateException(C0201.m82(38720));
            }
        }
        z2<V> z2Var = this.b;
        if (z2Var == null) {
            h9 h9Var2 = l.a;
            return this.c;
        }
        try {
            return z2Var.get();
        } catch (SecurityException e3) {
            l.e(e3);
            h9 h9Var3 = l.a;
            return this.c;
        }
    }

    public final String b() {
        return this.a;
    }
}
