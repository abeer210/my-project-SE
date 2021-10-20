package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: nj  reason: default package */
/* compiled from: ByteArrayLoader */
public class nj<Data> implements zj<byte[], Data> {
    private final b<Data> a;

    /* renamed from: nj$a */
    /* compiled from: ByteArrayLoader */
    public static class a implements ak<byte[], ByteBuffer> {

        /* renamed from: nj$a$a  reason: collision with other inner class name */
        /* compiled from: ByteArrayLoader */
        class C0159a implements b<ByteBuffer> {
            public C0159a(a aVar) {
            }

            @Override // defpackage.nj.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<byte[], ByteBuffer> c(dk dkVar) {
            return new nj(new C0159a(this));
        }
    }

    /* renamed from: nj$b */
    /* compiled from: ByteArrayLoader */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: nj$c */
    /* compiled from: ByteArrayLoader */
    public static class c<Data> implements vg<Data> {
        private final byte[] a;
        private final b<Data> b;

        public c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.vg
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.vg
        public void b() {
        }

        @Override // defpackage.vg
        public void cancel() {
        }

        @Override // defpackage.vg
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // defpackage.vg
        public void e(g gVar, vg.a<? super Data> aVar) {
            aVar.f(this.b.b(this.a));
        }
    }

    /* renamed from: nj$d */
    /* compiled from: ByteArrayLoader */
    public static class d implements ak<byte[], InputStream> {

        /* renamed from: nj$d$a */
        /* compiled from: ByteArrayLoader */
        class a implements b<InputStream> {
            public a(d dVar) {
            }

            @Override // defpackage.nj.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<byte[], InputStream> c(dk dkVar) {
            return new nj(new a(this));
        }
    }

    public nj(b<Data> bVar) {
        this.a = bVar;
    }

    /* renamed from: c */
    public zj.a<Data> b(byte[] bArr, int i, int i2, i iVar) {
        return new zj.a<>(new uo(bArr), new c(bArr, this.a));
    }

    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
