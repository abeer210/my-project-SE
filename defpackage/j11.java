package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.b0;
import com.google.android.gms.location.c;
import java.util.List;

/* renamed from: j11  reason: default package */
public final class j11 implements c {
    private final h<Status> d(f fVar, b0 b0Var) {
        return fVar.j(new l11(this, fVar, b0Var));
    }

    @Override // com.google.android.gms.location.c
    public final h<Status> a(f fVar, PendingIntent pendingIntent) {
        return d(fVar, b0.o(pendingIntent));
    }

    @Override // com.google.android.gms.location.c
    public final h<Status> b(f fVar, com.google.android.gms.location.f fVar2, PendingIntent pendingIntent) {
        return fVar.j(new k11(this, fVar, fVar2, pendingIntent));
    }

    @Override // com.google.android.gms.location.c
    public final h<Status> c(f fVar, List<String> list) {
        return d(fVar, b0.p(list));
    }
}
