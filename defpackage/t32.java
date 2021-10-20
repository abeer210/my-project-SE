package defpackage;

import vigqyno.C0201;

/* renamed from: t32  reason: default package */
/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
public final class t32 implements y22 {
    private final g32 a;

    public t32(g32 g32) {
        this.a = g32;
    }

    @Override // defpackage.y22
    public <T> x22<T> a(k22 k22, g42<T> g42) {
        a32 a32 = (a32) g42.c().getAnnotation(a32.class);
        if (a32 == null) {
            return null;
        }
        return (x22<T>) b(this.a, k22, g42, a32);
    }

    public x22<?> b(g32 g32, k22 k22, g42<?> g42, a32 a32) {
        x22<?> x22;
        Object a2 = g32.a(g42.a(a32.value())).a();
        if (a2 instanceof x22) {
            x22 = (x22) a2;
        } else if (a2 instanceof y22) {
            x22 = ((y22) a2).a(k22, g42);
        } else {
            boolean z = a2 instanceof v22;
            if (z || (a2 instanceof n22)) {
                n22 n22 = null;
                v22 v22 = z ? (v22) a2 : null;
                if (a2 instanceof n22) {
                    n22 = (n22) a2;
                }
                x22 = new a42<>(v22, n22, k22, g42, null);
            } else {
                throw new IllegalArgumentException(C0201.m82(38920) + a2.getClass().getName() + C0201.m82(38921) + g42.toString() + C0201.m82(38922));
            }
        }
        return (x22 == null || !a32.nullSafe()) ? x22 : x22.a();
    }
}
