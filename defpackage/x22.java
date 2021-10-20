package defpackage;

import java.io.IOException;

/* renamed from: x22  reason: default package */
/* compiled from: TypeAdapter */
public abstract class x22<T> {

    /* access modifiers changed from: package-private */
    /* renamed from: x22$a */
    /* compiled from: TypeAdapter */
    public class a extends x22<T> {
        public a() {
        }

        @Override // defpackage.x22
        public void c(h42 h42, T t) throws IOException {
            if (t == null) {
                h42.x();
            } else {
                x22.this.c(h42, t);
            }
        }
    }

    public final x22<T> a() {
        return new a();
    }

    public final o22 b(T t) {
        try {
            u32 u32 = new u32();
            c(u32, t);
            return u32.T();
        } catch (IOException e) {
            throw new p22(e);
        }
    }

    public abstract void c(h42 h42, T t) throws IOException;
}
