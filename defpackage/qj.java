package defpackage;

import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: qj  reason: default package */
/* compiled from: DataUrlLoader */
public final class qj<Model, Data> implements zj<Model, Data> {
    private final a<Data> a;

    /* renamed from: qj$a */
    /* compiled from: DataUrlLoader */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* renamed from: qj$b */
    /* compiled from: DataUrlLoader */
    private static final class b<Data> implements vg<Data> {
        private final String a;
        private final a<Data> b;
        private Data c;

        public b(String str, a<Data> aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // defpackage.vg
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.vg
        public void b() {
            try {
                this.b.b(this.c);
            } catch (IOException unused) {
            }
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
            try {
                Data c2 = this.b.c(this.a);
                this.c = c2;
                aVar.f(c2);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }
    }

    /* renamed from: qj$c */
    /* compiled from: DataUrlLoader */
    public static final class c<Model> implements ak<Model, InputStream> {
        private final a<InputStream> a = new a(this);

        /* renamed from: qj$c$a */
        /* compiled from: DataUrlLoader */
        class a implements a<InputStream> {
            public a(c cVar) {
            }

            @Override // defpackage.qj.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith(C0201.m82(27013))) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException(C0201.m82(27016));
                    } else if (str.substring(0, indexOf).endsWith(C0201.m82(27014))) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException(C0201.m82(27015));
                    }
                } else {
                    throw new IllegalArgumentException(C0201.m82(27017));
                }
            }
        }

        @Override // defpackage.ak
        public void a() {
        }

        @Override // defpackage.ak
        public zj<Model, InputStream> c(dk dkVar) {
            return new qj(this.a);
        }
    }

    public qj(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // defpackage.zj
    public boolean a(Model model) {
        return model.toString().startsWith(C0201.m82(1200));
    }

    @Override // defpackage.zj
    public zj.a<Data> b(Model model, int i, int i2, i iVar) {
        return new zj.a<>(new uo(model), new b(model.toString(), this.a));
    }
}
