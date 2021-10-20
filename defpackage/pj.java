package defpackage;

import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: pj  reason: default package */
/* compiled from: ByteBufferFileLoader */
public class pj implements zj<File, ByteBuffer> {

    /* access modifiers changed from: private */
    /* renamed from: pj$a */
    /* compiled from: ByteBufferFileLoader */
    public static final class a implements vg<ByteBuffer> {
        private final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // defpackage.vg
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void e(g gVar, vg.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(vo.a(this.a));
            } catch (IOException e) {
                String r1 = C0201.m82(10962);
                if (Log.isLoggable(r1, 3)) {
                    Log.d(r1, C0201.m82(10963), e);
                }
                aVar.c(e);
            }
        }
    }

    /* renamed from: pj$b */
    /* compiled from: ByteBufferFileLoader */
    public static class b implements ak<File, ByteBuffer> {
        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<File, ByteBuffer> c(dk dkVar) {
            return new pj();
        }
    }

    /* renamed from: c */
    public zj.a<ByteBuffer> b(File file, int i, int i2, i iVar) {
        return new zj.a<>(new uo(file), new a(file));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
