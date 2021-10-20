package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.m;
import vigqyno.C0201;

public class i {
    private static final a.g<d21> a = new a.g<>();
    private static final a.AbstractC0054a<d21, a.d.C0056d> b;
    public static final com.google.android.gms.common.api.a<a.d.C0056d> c;
    @Deprecated
    public static final c d = new j11();
    @Deprecated
    public static final o e = new p21();

    public static abstract class a<R extends m> extends d<R, d21> {
        public a(f fVar) {
            super(i.c, fVar);
        }
    }

    static {
        t tVar = new t();
        b = tVar;
        c = new com.google.android.gms.common.api.a<>(C0201.m82(35487), tVar, a);
    }

    public static a a(Context context) {
        return new a(context);
    }

    public static d b(Context context) {
        return new d(context);
    }

    public static p c(Context context) {
        return new p(context);
    }
}
