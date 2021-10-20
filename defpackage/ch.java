package defpackage;

import defpackage.wg;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ch  reason: default package */
/* compiled from: InputStreamRewinder */
public final class ch implements wg<InputStream> {
    private final pl a;

    /* renamed from: ch$a */
    /* compiled from: InputStreamRewinder */
    public static final class a implements wg.a<InputStream> {
        private final ni a;

        public a(ni niVar) {
            this.a = niVar;
        }

        @Override // defpackage.wg.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public wg<InputStream> b(InputStream inputStream) {
            return new ch(inputStream, this.a);
        }
    }

    public ch(InputStream inputStream, ni niVar) {
        pl plVar = new pl(inputStream, niVar);
        this.a = plVar;
        plVar.mark(5242880);
    }

    @Override // defpackage.wg
    public void b() {
        this.a.h();
    }

    public void c() {
        this.a.c();
    }

    /* renamed from: d */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}
