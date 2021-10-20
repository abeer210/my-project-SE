package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i {

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class a<R extends m> extends BasePendingResult<R> {
        private final R q;

        public a(f fVar, R r) {
            super(fVar);
            this.q = r;
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R f(Status status) {
            return this.q;
        }
    }

    public static <R extends m> h<R> a(R r, f fVar) {
        u.l(r, C0201.m82(36302));
        u.b(!r.k().s(), C0201.m82(36303));
        a aVar = new a(fVar, r);
        aVar.j(r);
        return aVar;
    }

    public static h<Status> b(Status status, f fVar) {
        u.l(status, C0201.m82(36304));
        r rVar = new r(fVar);
        rVar.j(status);
        return rVar;
    }
}
