package defpackage;

import java.io.IOException;

/* renamed from: w32  reason: default package */
/* compiled from: ObjectTypeAdapter */
public final class w32 extends x22<Object> {
    public static final y22 b = new a();
    private final k22 a;

    /* renamed from: w32$a */
    /* compiled from: ObjectTypeAdapter */
    static class a implements y22 {
        @Override // defpackage.y22
        public <T> x22<T> a(k22 k22, g42<T> g42) {
            if (g42.c() == Object.class) {
                return new w32(k22);
            }
            return null;
        }
    }

    public w32(k22 k22) {
        this.a = k22;
    }

    @Override // defpackage.x22
    public void c(h42 h42, Object obj) throws IOException {
        if (obj == null) {
            h42.x();
            return;
        }
        x22 g = this.a.g(obj.getClass());
        if (g instanceof w32) {
            h42.k();
            h42.o();
            return;
        }
        g.c(h42, obj);
    }
}
