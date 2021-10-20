package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.t;
import java.util.List;

public class d extends e<a.d.C0056d> {
    public d(Context context) {
        super(context, i.c, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    public zs1<Void> t(f fVar, PendingIntent pendingIntent) {
        return t.c(i.d.b(c(), fVar, pendingIntent));
    }

    public zs1<Void> u(PendingIntent pendingIntent) {
        return t.c(i.d.a(c(), pendingIntent));
    }

    public zs1<Void> v(List<String> list) {
        return t.c(i.d.c(c(), list));
    }
}
