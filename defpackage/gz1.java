package defpackage;

/* renamed from: gz1  reason: default package */
public final class gz1<T> implements iz1<T> {
    private iz1<T> a;

    public static <T> void b(iz1<T> iz1, iz1<T> iz12) {
        ty1.c(iz12);
        gz1 gz1 = (gz1) iz1;
        if (gz1.a == null) {
            gz1.a = iz12;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.iz1
    public final T a() {
        iz1<T> iz1 = this.a;
        if (iz1 != null) {
            return iz1.a();
        }
        throw new IllegalStateException();
    }
}
