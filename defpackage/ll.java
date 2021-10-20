package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: ll  reason: default package */
/* compiled from: ImageReader */
public interface ll {

    /* renamed from: ll$a */
    /* compiled from: ImageReader */
    public static final class a implements ll {
        private final ch a;
        private final ni b;
        private final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, ni niVar) {
            ep.d(niVar);
            this.b = niVar;
            ep.d(list);
            this.c = list;
            this.a = new ch(inputStream, niVar);
        }

        @Override // defpackage.ll
        public int a() throws IOException {
            return f.b(this.c, this.a.a(), this.b);
        }

        @Override // defpackage.ll
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // defpackage.ll
        public void c() {
            this.a.c();
        }

        @Override // defpackage.ll
        public ImageHeaderParser.ImageType d() throws IOException {
            return f.e(this.c, this.a.a(), this.b);
        }
    }

    /* renamed from: ll$b */
    /* compiled from: ImageReader */
    public static final class b implements ll {
        private final ni a;
        private final List<ImageHeaderParser> b;
        private final eh c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ni niVar) {
            ep.d(niVar);
            this.a = niVar;
            ep.d(list);
            this.b = list;
            this.c = new eh(parcelFileDescriptor);
        }

        @Override // defpackage.ll
        public int a() throws IOException {
            return f.a(this.b, this.c, this.a);
        }

        @Override // defpackage.ll
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // defpackage.ll
        public void c() {
        }

        @Override // defpackage.ll
        public ImageHeaderParser.ImageType d() throws IOException {
            return f.d(this.b, this.c, this.a);
        }
    }

    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
