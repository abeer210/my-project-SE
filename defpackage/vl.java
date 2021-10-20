package defpackage;

import defpackage.wg;
import java.nio.ByteBuffer;

/* renamed from: vl  reason: default package */
/* compiled from: ByteBufferRewinder */
public class vl implements wg<ByteBuffer> {
    private final ByteBuffer a;

    /* renamed from: vl$a */
    /* compiled from: ByteBufferRewinder */
    public static class a implements wg.a<ByteBuffer> {
        @Override // defpackage.wg.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        /* renamed from: c */
        public wg<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new vl(byteBuffer);
        }
    }

    public vl(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.wg
    public void b() {
    }

    /* renamed from: c */
    public ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }
}
