package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;

/* renamed from: os1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class os1 extends a.AbstractC0054a<cs1, bs1> {
    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.e, java.lang.Object, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC0054a
    public final /* synthetic */ cs1 c(Context context, Looper looper, e eVar, bs1 bs1, f.b bVar, f.c cVar) {
        bs1 bs12 = bs1;
        if (bs12 == null) {
            bs12 = bs1.j;
        }
        return new cs1(context, looper, true, eVar, bs12, bVar, cVar);
    }
}
