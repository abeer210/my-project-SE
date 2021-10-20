package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.vg;
import defpackage.zj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: rj  reason: default package */
/* compiled from: FileLoader */
public class rj<Data> implements zj<File, Data> {
    private final d<Data> a;

    /* renamed from: rj$a */
    /* compiled from: FileLoader */
    public static class a<Data> implements ak<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.ak
        public final void a() {
        }

        @Override // defpackage.ak
        public final zj<File, Data> c(dk dkVar) {
            return new rj(this.a);
        }
    }

    /* renamed from: rj$b */
    /* compiled from: FileLoader */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: rj$b$a */
        /* compiled from: FileLoader */
        class a implements d<ParcelFileDescriptor> {
            @Override // defpackage.rj.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rj$c */
    /* compiled from: FileLoader */
    public static final class c<Data> implements vg<Data> {
        private final File a;
        private final d<Data> b;
        private Data c;

        public c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // defpackage.vg
        public Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.vg
        public void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.b.b(data);
                } catch (IOException unused) {
                }
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
            } catch (FileNotFoundException e) {
                String r1 = C0201.m82(1334);
                if (Log.isLoggable(r1, 3)) {
                    Log.d(r1, C0201.m82(1335), e);
                }
                aVar.c(e);
            }
        }
    }

    /* renamed from: rj$d */
    /* compiled from: FileLoader */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* renamed from: rj$e */
    /* compiled from: FileLoader */
    public static class e extends a<InputStream> {

        /* renamed from: rj$e$a */
        /* compiled from: FileLoader */
        class a implements d<InputStream> {
            @Override // defpackage.rj.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public rj(d<Data> dVar) {
        this.a = dVar;
    }

    /* renamed from: c */
    public zj.a<Data> b(File file, int i, int i2, i iVar) {
        return new zj.a<>(new uo(file), new c(file, this.a));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
