package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;

/* renamed from: cx0  reason: default package */
public final class cx0 extends e<a.d.C0056d> implements po0 {
    private cx0(Context context) {
        super(context, no0.o, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    public static po0 t(Context context) {
        return new cx0(context);
    }

    @Override // defpackage.po0
    public final h<Status> a(so0 so0) {
        rz0 rz0 = new rz0(so0, c());
        e(rz0);
        return rz0;
    }
}
