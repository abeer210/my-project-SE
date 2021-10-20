package defpackage;

import defpackage.w40;

/* renamed from: u40  reason: default package */
/* compiled from: DefaultEntryEvictionComparatorSupplier */
public class u40 implements a50 {

    /* renamed from: u40$a */
    /* compiled from: DefaultEntryEvictionComparatorSupplier */
    class a implements z40 {
        public a(u40 u40) {
        }

        /* renamed from: a */
        public int compare(w40.a aVar, w40.a aVar2) {
            long u = aVar.u();
            long u2 = aVar2.u();
            if (u < u2) {
                return -1;
            }
            return u2 == u ? 0 : 1;
        }
    }

    @Override // defpackage.a50
    public z40 get() {
        return new a(this);
    }
}
