package defpackage;

import defpackage.yy0;
import java.io.IOException;

/* renamed from: yy0  reason: default package */
public class yy0<M extends yy0<M>> extends dz0 {
    public az0 b;

    @Override // defpackage.dz0
    public void a(wy0 wy0) throws IOException {
        if (this.b != null) {
            for (int i = 0; i < this.b.b(); i++) {
                this.b.c(i).b(wy0);
            }
        }
    }

    @Override // defpackage.dz0
    public int d() {
        if (this.b != null) {
            for (int i = 0; i < this.b.b(); i++) {
                this.b.c(i).c();
            }
        }
        return 0;
    }

    @Override // defpackage.dz0
    public /* synthetic */ dz0 e() throws CloneNotSupportedException {
        return (yy0) clone();
    }

    /* renamed from: f */
    public M clone() throws CloneNotSupportedException {
        M m = (M) ((yy0) super.clone());
        cz0.h(this, m);
        return m;
    }
}
