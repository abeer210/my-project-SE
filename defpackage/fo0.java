package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import vigqyno.C0201;

/* renamed from: fo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class fo0 extends e<a.d.C0056d> {
    private static final a.g<is0> j = new a.g<>();
    private static final a.AbstractC0054a<is0, a.d.C0056d> k;
    private static final a<a.d.C0056d> l;

    static {
        go0 go0 = new go0();
        k = go0;
        l = new a<>(C0201.m82(35707), go0, j);
    }

    public fo0(Context context) {
        super(context, l, (a.d) null, e.a.c);
    }

    public abstract zs1<Void> t(String str);
}
